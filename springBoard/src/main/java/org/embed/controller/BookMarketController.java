package org.embed.controller;

import java.io.File;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.embed.dto.BookDTO;
import org.embed.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/bookmarket")
public class BookMarketController {
	
	@Autowired
	private BookService bookService;
	
	// ========================================
	// 권한 체크 메서드
	// ========================================
	private String checkLogin(HttpSession session) {
		return (String) session.getAttribute("sessionId");
	}
	
	private boolean isAdmin(HttpSession session) {
		String sessionId = checkLogin(session);
		return "admin".equals(sessionId);
	}
	
	private String checkAdminAccess(HttpSession session, String actionName) {
		String sessionId = checkLogin(session);
		if (sessionId == null) {
			log.warn("=====> 미인증 사용자의 {} 접근 시도", actionName);
			return "redirect:/bookmarket/member/loginMember.do?error=login_required";
		}
		if (!isAdmin(session)) {
			log.warn("=====> 권한 없는 사용자의 {} 시도: {}", actionName, sessionId);
			return "redirect:/bookmarket/books.do?error=access_denied";
		}
		return null;
	}
	
	// ========================================
	// 공통 페이지
	// ========================================
	@RequestMapping("/menu.do")
	public String menu() { return "menu"; }

	@RequestMapping("/footer.do")
	public String footer() { return "footer"; }

	@RequestMapping("/welcome.do")
	public String welcome() { return "welcome"; }

	// ========================================
	// 도서 목록 및 상세
	// ========================================
	@GetMapping("/books.do")
	public String bookList(Model model) throws Exception {
		log.info("=====> 도서 목록 조회");
		List<BookDTO> books = bookService.selectAllBooks();
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping("/book.do")
	public String bookDetail(@RequestParam String id, Model model) throws Exception {
		log.info("=====> 도서 상세 조회: {}", id);
		model.addAttribute("book", bookService.selectBookById(id));
		return "book";
	}

	// ========================================
	// 도서 등록 (관리자 전용)
	// ========================================
	@RequestMapping("/addBook.do")
	public String addBookPage(HttpSession session) {
		String redirect = checkAdminAccess(session, "도서 등록 페이지");
		if (redirect != null) return redirect;
		return "addBook";
	}

	@PostMapping("/processAddBook.do")
	public String processAddBook(BookDTO book, MultipartHttpServletRequest req, HttpSession session) throws Exception {
		String redirect = checkAdminAccess(session, "도서 등록");
		if (redirect != null) return redirect;
		
		log.info("=====> 도서 등록: {} (관리자: {})", book.getBookId(), checkLogin(session));
		bookService.insertBook(book, req);
		return "redirect:/bookmarket/books.do";
	}
	
	private String uploadFile(MultipartHttpServletRequest req) throws Exception {
	    MultipartFile file = req.getFile("bookImage");
	    if (file != null && !file.isEmpty()) {
	        // ✅ Spring Boot 정적 리소스 폴더 (이미 서빙됨)
	        String uploadPath = new File("src/main/resources/static/images").getAbsolutePath();

	        File dir = new File(uploadPath);
	        if (!dir.exists()) dir.mkdirs();

	        String originalFilename = file.getOriginalFilename();
	        String ext = "";
	        int dot = originalFilename.lastIndexOf('.');
	        if (dot > 0) ext = originalFilename.substring(dot);

	        String saveName = System.currentTimeMillis() + ext;
	        File saveFile = new File(uploadPath, saveName);
	        file.transferTo(saveFile);

	        return saveName;
	    }
	    return null;
	}


	// ========================================
	// 도서 수정 / 삭제 (관리자 전용)
	// ========================================
	@RequestMapping("/editBook.do")
	public String editBookPage(@RequestParam(required = false) String edit, Model model, HttpSession session) throws Exception {
		String redirect = checkAdminAccess(session, "도서 편집 페이지");
		if (redirect != null) return redirect;
		
		List<BookDTO> books = bookService.selectAllBooks();
		model.addAttribute("books", books);
		model.addAttribute("edit", edit);
		return "editBook";
	}

	@GetMapping("/updateBook.do")
	public String updateBookPage(@RequestParam String id, Model model, HttpSession session) throws Exception {
		String redirect = checkAdminAccess(session, "도서 수정 페이지");
		if (redirect != null) return redirect;
		
		model.addAttribute("book", bookService.selectBookById(id));
		return "updateBook";
	}

	@PostMapping("/processUpdateBook.do")
	public String processUpdateBook(BookDTO book, MultipartHttpServletRequest req, HttpSession session) throws Exception {
		String redirect = checkAdminAccess(session, "도서 수정");
		if (redirect != null) return redirect;
		
		bookService.updateBook(book, req);
		return "redirect:/bookmarket/editBook.do?edit=update";
	}

	@GetMapping("/deleteBook.do")
	public String deleteBook(@RequestParam String id, HttpSession session) throws Exception {
		log.info("=====> deleteBook() 호출됨, id = {}", id);  // ✅ 추가
	    String redirect = checkAdminAccess(session, "도서 삭제");
	    if (redirect != null) return redirect;

	    bookService.deleteBook(id);
	    log.info("=====> bookService.deleteBook() 호출 완료");
	    return "redirect:/bookmarket/editBook.do?edit=delete";
	}

	// ========================================
	// 장바구니 + 주문
	// ========================================
	@PostMapping("/addCart.do")
	public String addCart(@RequestParam("id") String id,
	                      @RequestParam(value = "quantity", required = false, defaultValue = "1") int quantity,
	                      HttpSession session) throws Exception {
	    BookDTO book = bookService.selectBookById(id);
	    if (book == null) return "redirect:/bookmarket/books.do";

	    @SuppressWarnings("unchecked")
	    List<BookDTO> cartList = (List<BookDTO>) session.getAttribute("cartlist");
	    if (cartList == null) cartList = new ArrayList<>();

	    boolean found = false;
	    for (BookDTO item : cartList) {
	        if (item.getBookId().equals(id)) {
	            item.setQuantity(item.getQuantity() + quantity); // ✅ 수량 증가
	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        book.setQuantity(quantity);
	        cartList.add(book);
	    }

	    session.setAttribute("cartlist", cartList);
	    return "redirect:/bookmarket/cart.do";
	}



	@GetMapping("/cart.do")
	public String cartView(HttpSession session, Model model) {
		@SuppressWarnings("unchecked")
		List<BookDTO> cartList = (List<BookDTO>) session.getAttribute("cartlist");
		if (cartList == null) cartList = new ArrayList<>();

		model.addAttribute("cartlist", cartList);
		model.addAttribute("cartId", session.getId());
		return "cart";
	}

	@PostMapping("/removeCart.do")
	public String removeCart(@RequestParam("id") String id, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<BookDTO> cartList = (List<BookDTO>) session.getAttribute("cartlist");
		if (cartList != null) cartList.removeIf(b -> b.getBookId().equals(id));

		return "redirect:/bookmarket/cart.do";
	}

	@GetMapping("/deleteCart.do")
	public String deleteCart(HttpSession session) {
		session.removeAttribute("cartlist");
		return "redirect:/bookmarket/cart.do";
	}

	@GetMapping("/shippingInfo.do")
	public String shippingInfo(@RequestParam("cartId") String cartId, Model model) {
		model.addAttribute("cartId", cartId);
		return "shippingInfo";
	}

	@PostMapping("/processShippingInfo.do")
	public String processShippingInfo(
			@RequestParam String cartId,
			@RequestParam String name,
			@RequestParam String shippingDate,
			@RequestParam String country,
			@RequestParam String zipCode,
			@RequestParam String addressName,
			HttpServletResponse resp) throws Exception {

		String[] names = {
				"Shipping_cartId", "Shipping_name", "Shipping_shippingDate",
				"Shipping_country", "Shipping_zipCode", "Shipping_addressName"
		};
		String[] vals = {cartId, name, shippingDate, country, zipCode, addressName};

		for (int i = 0; i < names.length; i++) {
			Cookie c = new Cookie(names[i],
					URLEncoder.encode(vals[i], StandardCharsets.UTF_8));
			c.setMaxAge(24 * 60 * 60);
			c.setPath("/");
			resp.addCookie(c);
		}
		return "redirect:/bookmarket/orderConfirmation.do";
	}

	@GetMapping("/orderConfirmation.do")
	public String orderConfirmation() {
		return "orderConfirmation";
	}

	@GetMapping("/checkOutCancelled.do")
	public String checkoutCancelled() {
		return "checkOutCancelled";
	}

	@GetMapping("/thankCustomer.do")
	public String thankCustomer() {
		return "thankCustomer";
	}
	
	// ========================================
	// 예외 및 기타
	// ========================================
	@RequestMapping("/exceptionNoBookId.do")
	public String exceptionNoBookId() { return "exceptionNoBookId"; }

	@RequestMapping("/exceptionNoPage.do")
	public String exceptionNoPage() { return "exceptionNoPage"; }

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
	    log.info("=====> 로그아웃: {}", checkLogin(session));
	    session.invalidate();
	    return "redirect:/bookmarket/welcome.do";
	}
}

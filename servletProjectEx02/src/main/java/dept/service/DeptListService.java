package dept.service;

import java.util.ArrayList;
import dept.dao.DeptDAO;
import dept.dto.DeptDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeptListService implements DeptService {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> list = dao.list();
		request.setAttribute("list", list);
	}
}

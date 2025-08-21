package embed.service;

import embed.dao.EmpDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmpDeleteService implements EmpService {
		@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String empno = req.getParameter("empno");
			
		EmpDAO dao = new EmpDAO();
		dao.delete(empno);
		
	}

}

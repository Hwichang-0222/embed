package embed.service;

import embed.dao.DeptDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeptDeleteService implements DeptService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String deptno = request.getParameter("deptno");
				
		DeptDAO dao = new DeptDAO();
		dao.delete(deptno);
	}

}

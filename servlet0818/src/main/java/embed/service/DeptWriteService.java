package embed.service;

import embed.dao.DeptDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeptWriteService implements DeptService {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		DeptDAO dao = new DeptDAO();
		dao.write(deptno, dname, loc);
		
	}
}

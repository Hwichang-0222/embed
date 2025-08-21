package embed.service;

import java.util.ArrayList;

import embed.dao.EmpDAO;
import embed.entity.EmpDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmpListService implements EmpService {
		@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpDTO> empList = dao.empList();
		req.setAttribute("empList", empList);
	}
}

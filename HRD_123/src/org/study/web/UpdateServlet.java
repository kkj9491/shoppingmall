package org.study.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.study.dao.HRDShopDao;
import org.study.model.Member;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HRDShopDao dao = new HRDShopDao();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		try {
			Member member = dao.getMemberInfor(id);
			request.setAttribute("member", member);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("WEB-INF/views/updateForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = new Member();		
		member.setMember_num(Integer.parseInt(request.getParameter("member_num")));
	}

}

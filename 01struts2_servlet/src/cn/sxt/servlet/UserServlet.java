package cn.sxt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		String name = httpServletRequest.getParameter("name");
		String pwd = httpServletRequest.getParameter("pwd");
		String sex = httpServletRequest.getParameter("sex");
		String age = httpServletRequest.getParameter("age");
		String email = httpServletRequest.getParameter("email");
	}

}

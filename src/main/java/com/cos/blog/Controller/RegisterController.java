package com.cos.blog.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.bind.annotation.RestController;


@WebServlet(name = "servlet", urlPatterns = {"/servletTest"})
public class RegisterController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("doGet 메소드 호출");
		resp.setCharacterEncoding("uft-8");
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.println("<html>");
		writer.println("<head>hello doGet</head>");
		writer.println("<body>do get request</body>");
		writer.println("</html>");
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("==========doPost==========");
		super.doPost(req, resp);
	}

}

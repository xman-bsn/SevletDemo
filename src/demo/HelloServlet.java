package demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 最简单的Servlet
 * @author Winter Lau
 */
public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.getWriter().println("<h2 style='color:red;'>Hello World??!</h2>");
		res.getWriter().println("<iframe src='http://tieba.baidu.com/f?kw=%B0%B6%B2%BF%D5%E6%C3%F7' draggable='true'></iframe>");
	}

}

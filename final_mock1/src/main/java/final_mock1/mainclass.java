package final_mock1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/main")
public class mainclass  extends HttpServlet{
public static void main(String[] args) {
	
}

@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int num3=Integer.parseInt(req.getParameter("frist"));
		res.getWriter().print(num3);
	
		req.setAttribute("number", num3);
		req.getRequestDispatcher("task1.jsp").forward(req, res);;
	}
}

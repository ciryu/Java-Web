package smallToBig;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 聊天信息处理类
 * @author liyb
 *
 */

@WebServlet("/changeWord")
public class SmallToBig extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		String text=req.getParameter("text");
		String result=changeWord(text);
		resp.getWriter().print(result);
	}
	/**
	 * 
	 * @param text
	 * @return
	 */
	public static String changeWord(String text){
		return text.toUpperCase().replace(".", "_").trim();
	}
	
}

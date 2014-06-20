package libsys.actions;
import common.*;
import pack.libsys;
import pack.Book;
import java.util.*;
import java.io.PrintWriter;
import java.util.Vector;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * @version 	1.0
 * @author
 */
public class ActionLogin extends HttpServlet {


	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			doAction(req,resp);
	}


	public void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
			doAction(req,resp);
	}
	
	public void doAction(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {	
	PrintWriter out=resp.getWriter();			
	//req.getParameter("u");req.getParameter("p");		
	//out.println("u:"+req.getParameter("u") +"p:"+req.getParameter("p"));
	HttpSession session=req.getSession(true);
	ServiceLocator s=new ServiceLocator();
	libsys sRemote=s.setLibsys();
	if(sRemote.isUser(req.getParameter("u"),req.getParameter("p")))
	{
		session.setAttribute("log",req.getParameter("u"));
		out.println("logout"+req.getParameter("u"));	
	}
	
	}
}

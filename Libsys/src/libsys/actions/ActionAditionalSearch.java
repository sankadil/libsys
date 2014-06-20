package libsys.actions;
import common.*;
import pack.libsys;
import pack.Book;
import java.util.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import libsys.forms.FormAditionalSearch;

/**
 * @version 	1.0
 * @author
 */
public class ActionAditionalSearch extends Action {

	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		FormAditionalSearch formAditionalSearch = (FormAditionalSearch) form;

		try {
				// Advance searching code
				String movie=request.getParameter("movie");
				String movie_id=request.getParameter("movie_id");
				String status=request.getParameter("status");
				String f=request.getParameter("f");
				String a=request.getParameter("k");
				HttpSession session=request.getSession(true);
				ServiceLocator s=new ServiceLocator();
				libsys sRemote=s.setLibsys();							
				Vector books_vector=sRemote.getAdvanceSearch(request.getParameter("f1"),request.getParameter("f2"),request.getParameter("f3"),request.getParameter("c1"),request.getParameter("c2"),request.getParameter("c3"),MyString.split(request.getParameter("k1"),' '),MyString.split(request.getParameter("k2"),' '),MyString.split(request.getParameter("k3"),' '),request.getParameter("c11"),request.getParameter("c22"));
				session.setAttribute("books",books_vector);
				System.out.println(books_vector);

		} catch (Exception e) {

			// Report the error using the appropriate name and ID.
			errors.add("name", new ActionError("id"));

		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);
		}
		// Write logic determining how the user should be forwarded.
		forward = mapping.findForward("ActionAditionalSearch");

		// Finish with
		return (forward);

	}
}

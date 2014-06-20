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

import libsys.forms.FormISBN;

/**
 * @version 	1.0
 * @author
 */
public class ActionISBN extends Action {

	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		FormISBN formISBN = (FormISBN) form;

		try {

			String a=request.getParameter("k");
			HttpSession session=request.getSession(true);
			ServiceLocator s=new ServiceLocator();
			libsys sRemote=s.setLibsys();			
			Vector books_vector=sRemote.getISBN(a);
			
			//String a[]=formSimpleSearch.getKeyword().
			//Vector books_vector=sRemote.getBrowsing(formSimpleSearch.getField(),formSimpleSearch.getKeyword());
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
		forward = mapping.findForward("ActionISBN");

		// Finish with
		return (forward);

	}
}

package libsys.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * Users may access 1 field on this form:
 * <ul>
 * <li>keyword - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class FormISBN extends ActionForm {

	private String keyword = null;

	/**
	 * Get keyword
	 * @return String
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * Set keyword
	 * @param <code>String</code>
	 */
	public void setKeyword(String k) {
		this.keyword = k;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		keyword = null;

	}

	public ActionErrors validate(
		ActionMapping mapping,
		HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new org.apache.struts.action.ActionError("error.field.required"));
		// }
		return errors;

	}
}

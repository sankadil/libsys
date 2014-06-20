package libsys.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * Users may access 3 fields on this form:
 * <ul>
 * <li>connector - [your comment here]
 * <li>keyword - [your comment here]
 * <li>field - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class FormSearch extends ActionForm {

	private String connector = null;
	private String keyword = null;
	private String field = null;

	/**
	 * Get connector
	 * @return String
	 */
	public String getConnector() {
		return connector;
	}

	/**
	 * Set connector
	 * @param <code>String</code>
	 */
	public void setConnector(String c) {
		this.connector = c;
	}

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

	/**
	 * Get field
	 * @return String
	 */
	public String getField() {
		return field;
	}

	/**
	 * Set field
	 * @param <code>String</code>
	 */
	public void setField(String f) {
		this.field = f;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		connector = null;
		keyword = null;
		field = null;

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

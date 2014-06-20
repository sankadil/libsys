package libsys.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * Users may access 11 fields on this form:
 * <ul>
 * <li>connector1 - [your comment here]
 * <li>connector11 - [your comment here]
 * <li>keyword3 - [your comment here]
 * <li>field3 - [your comment here]
 * <li>keyword2 - [your comment here]
 * <li>field2 - [your comment here]
 * <li>keyword1 - [your comment here]
 * <li>field1 - [your comment here]
 * <li>connector22 - [your comment here]
 * <li>connector3 - [your comment here]
 * <li>connector2 - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class FormAditionalSearch extends ActionForm {

	private String connector1 = null;
	private String connector11 = null;
	private String keyword3 = null;
	private String field3 = null;
	private String keyword2 = null;
	private String field2 = null;
	private String keyword1 = null;
	private String field1 = null;
	private String connector22 = null;
	private String connector3 = null;
	private String connector2 = null;

	/**
	 * Get connector1
	 * @return String
	 */
	public String getConnector1() {
		return connector1;
	}

	/**
	 * Set connector1
	 * @param <code>String</code>
	 */
	public void setConnector1(String c) {
		this.connector1 = c;
	}

	/**
	 * Get connector11
	 * @return String
	 */
	public String getConnector11() {
		return connector11;
	}

	/**
	 * Set connector11
	 * @param <code>String</code>
	 */
	public void setConnector11(String c) {
		this.connector11 = c;
	}

	/**
	 * Get keyword3
	 * @return String
	 */
	public String getKeyword3() {
		return keyword3;
	}

	/**
	 * Set keyword3
	 * @param <code>String</code>
	 */
	public void setKeyword3(String k) {
		this.keyword3 = k;
	}

	/**
	 * Get field3
	 * @return String
	 */
	public String getField3() {
		return field3;
	}

	/**
	 * Set field3
	 * @param <code>String</code>
	 */
	public void setField3(String f) {
		this.field3 = f;
	}

	/**
	 * Get keyword2
	 * @return String
	 */
	public String getKeyword2() {
		return keyword2;
	}

	/**
	 * Set keyword2
	 * @param <code>String</code>
	 */
	public void setKeyword2(String k) {
		this.keyword2 = k;
	}

	/**
	 * Get field2
	 * @return String
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * Set field2
	 * @param <code>String</code>
	 */
	public void setField2(String f) {
		this.field2 = f;
	}

	/**
	 * Get keyword1
	 * @return String
	 */
	public String getKeyword1() {
		return keyword1;
	}

	/**
	 * Set keyword1
	 * @param <code>String</code>
	 */
	public void setKeyword1(String k) {
		this.keyword1 = k;
	}

	/**
	 * Get field1
	 * @return String
	 */
	public String getField1() {
		return field1;
	}

	/**
	 * Set field1
	 * @param <code>String</code>
	 */
	public void setField1(String f) {
		this.field1 = f;
	}

	/**
	 * Get connector22
	 * @return String
	 */
	public String getConnector22() {
		return connector22;
	}

	/**
	 * Set connector22
	 * @param <code>String</code>
	 */
	public void setConnector22(String c) {
		this.connector22 = c;
	}

	/**
	 * Get connector3
	 * @return String
	 */
	public String getConnector3() {
		return connector3;
	}

	/**
	 * Set connector3
	 * @param <code>String</code>
	 */
	public void setConnector3(String c) {
		this.connector3 = c;
	}

	/**
	 * Get connector2
	 * @return String
	 */
	public String getConnector2() {
		return connector2;
	}

	/**
	 * Set connector2
	 * @param <code>String</code>
	 */
	public void setConnector2(String c) {
		this.connector2 = c;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		connector1 = null;
		connector11 = null;
		keyword3 = null;
		field3 = null;
		keyword2 = null;
		field2 = null;
		keyword1 = null;
		field1 = null;
		connector22 = null;
		connector3 = null;
		connector2 = null;

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

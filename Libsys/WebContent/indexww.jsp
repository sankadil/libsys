
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<html:html>
<HEAD>
<%@ page 
language="java"
contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="theme/Master.css" rel="stylesheet" type="text/css">
<TITLE></TITLE>
<SCRIPT language="JavaScript" src="ajax.js"></SCRIPT>
</HEAD>

<BODY>
<P>
<html:form action="ActionSimpleSearch.do">
Field:
    <html:select styleId="field" property="field">
	    <html:option value="author">author</html:option>
	    <html:option value="title">title</html:option>
	    <html:option value="subject">subject</html:option>
	    <html:option value="ISBN">ISBN</html:option>
	    <html:option value="series">series</html:option>
	    <html:option value="place">place</html:option>
	    <html:option value="publisher">publisher</html:option>
	    <html:option value="any field">any field</html:option>
    </html:select>
	Keyword:<html:text property="keyword" onkeyup="getBookList(field.value,this.value)" ></html:text>	
	<html:submit value="Browse"></html:submit><br/>
	<div id="txtHint"></div>
</html:form>

</P>
</BODY>
</html:html>

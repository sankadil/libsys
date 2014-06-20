
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
<TITLE>Book Details</TITLE>
<SCRIPT language="JavaScript" src="ajax.js"></SCRIPT>
<script language="JavaScript" type="text/JavaScript" src="images/myfreetemplates.js"></script>
<link href="images/myfreetemplates.css" rel="stylesheet" type="text/css">
</HEAD>

<BODY>

      <table width="100%" border="0" cellspacing="0" cellpadding="5">
	  <tr>
	  <th width="145" align="center" valign="top"><p class="producthdr">Author</p></th>
	  <th width="145" align="center" valign="top"><p class="producthdr">Title</p></th>
	  <th width="145" align="center" valign="top"><p class="producthdr">Subject</p></th>
	  <th width="145" align="center" valign="top"><p class="producthdr">Class No</p></th>
	  <th width="145" align="center" valign="top"><p class="producthdr">ISBN No</p></th>
	  </tr>
	  <logic:iterate id="options" name="books">
        <tr> 
          <td width="145" align="center" valign="top"><bean:write name="options" property="author"/></td>
		  <td width="145" align="center" valign="top"><bean:write name="options" property="title"/></td>
		  <td width="145" align="center" valign="top"><bean:write name="options" property="subject"/></td>
		  <td width="145" align="center" valign="top"><bean:write name="options" property="classno"/></td>
		  <td width="145" align="center" valign="top"><bean:write name="options" property="isbn"/></td>			                     </tr>
        <tr> 
        </logic:iterate>
          <td width="145" align="center">&nbsp;</td>
          <td>&nbsp;</td>
        </tr>

      </table>



</BODY>
</html:html>

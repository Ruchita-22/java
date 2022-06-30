<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%= 1+2%>
 --%>
<%
ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add(30);
out.println(al);


%>




</body>
</html>



<!--  C:\tools\apache-tomcat-8.0.49\work\Catalina\localhost\JspExample\org\apache\jsp   
-->
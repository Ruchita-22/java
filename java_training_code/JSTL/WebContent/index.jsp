<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="welcome to jsp using jstl core tag"></c:out>
	<c:set var="a" value="10"></c:set>
	<c:set var="b" value="20"></c:set>
	<c:out value="${a}"></c:out><br>
	<c:out value="${b}"></c:out><br>
	Sum of two number:<c:out value="${a}+${b}"></c:out><br>
	
	<c:if test="${a<b}">
		<c:out value="a is less than b"></c:out><br>
	</c:if>
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${a}"></c:out><br>
	
	</c:forEach>
	<c:set var="s" value="Hadoop|is|meant|for|Storage|and|process"></c:set>
	<c:out value="${s}"></c:out><br> 
	<c:forTokens var="t" items="${s}" delims="|">
		<c:out value="${t}"></c:out><br>
	</c:forTokens>
	
	<c:import url="http://localhost:8000/JspExample/two.jsp"></c:import>
	
	

</body>
</html>
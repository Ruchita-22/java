<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>
</head>
<body>

<form:form action="login" method="post" commandName="ui">
	Enter name:<form:input path="name"/><form:errors path="name" class="error"/><br/><br/>
	Enter password:<form:input path="password"/><form:errors path="password" class="error"/><br/>
	<input type="submit"/>
</form:form>

</body>
</html>
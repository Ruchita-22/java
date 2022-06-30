<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>

<sql:setDataSource  var="ds" driver="com.mysql.jdbc.Driver" 
url="jdbc:mysql://localhost:3306/ibm"
user="root"
password="root"
/>

Enployee Details : <br>

<sql:query var="rs" dataSource="${ds}" sql="select * from emp"></sql:query>

<c:forEach items="${rs.rows}"  var="row">

<c:out value="${row.eno}"></c:out>
<c:out value="${row.ename}"></c:out>
<c:out value="${row.sal}"></c:out><br>

</c:forEach>


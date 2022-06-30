<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql"%>

<sql:setDataSource var="es" driver="oracle.jdbc.driver.OracleDriver" 
url="jdbc:oracle:thin:@localhost:1521:xe" user="ibm" password="ibm"></sql:setDataSource>

<sql:update dataSource="${es}" var="count" 
sql="insert into employee values('sasa','rakesh','sassa','sas')"></sql:update>
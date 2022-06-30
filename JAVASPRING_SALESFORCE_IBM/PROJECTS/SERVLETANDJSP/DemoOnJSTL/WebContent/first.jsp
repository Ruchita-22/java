<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>


<c:set var="j" value="4,3,2,1"/>

<c:forEach items="${j}" var="item" varStatus="status">
<c:if test="${status.first}">
<c:out value="${status.index}" default="abc"/>
</c:if>
</c:forEach>
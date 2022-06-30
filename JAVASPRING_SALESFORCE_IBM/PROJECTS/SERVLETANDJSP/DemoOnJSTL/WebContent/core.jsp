<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>


<c:out value="welcome to jsp using jstl core tag"></c:out><br>


<c:set var="a" value="10"></c:set>
<c:set  var="b" value="20"></c:set>


<c:out value="${a}"></c:out>
<c:out value="${b}"></c:out><br>

sum of two numbers : <c:out value="${a+b}"></c:out><br>

<c:if test="${a<b}">

<c:out value="a is less than b"></c:out>

</c:if><br>

<c:forEach var="a" begin="1" end="10" step="2"> 

<c:out value="${a}"></c:out><br>

</c:forEach>

<c:set var="s" value="Hadoop|is|meant|for|Storage|and|process"></c:set>

<!-- 
     1)#,:,;,
      by dfault the delimiter is space


  -->
  
 


<c:forTokens var="t" items="${s}" delims="|">

<c:out value="${t}"></c:out><br>

</c:forTokens>

<c:import url="http://localhost:8000/DemoOnJSp/two.jsp"></c:import>















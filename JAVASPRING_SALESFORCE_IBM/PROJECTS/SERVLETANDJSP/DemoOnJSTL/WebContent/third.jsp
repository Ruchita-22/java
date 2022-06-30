<% 

String ln =(String)session.getAttribute("lname");


out.println("last name is "+ln);



%>

<!-- last name value using EL Expression from session object      -->
   
<br>Last name is :    ${sessionScope.lname}





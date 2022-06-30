<% 

String fn = request.getParameter("fn");

String ln = request.getParameter("ln");


request.setAttribute("fname",fn);

session.setAttribute("lname",ln);

%>

<% 

out.println(fn);
out.println(ln);

%><br>
<!-- FirstrName and last using EL -->

 FirstName:${param.fn}
 LastName is :${param.ln}


<jsp:useBean id="e"  class="com.ibm.model.Employee" scope="session"></jsp:useBean>



Employee Details:<br>
=================

EMployeeNo :<jsp:getProperty property="empno" name="e"/><br>
EMployeeName :<jsp:getProperty property="ename" name="e"/><br> 
EMployee Salary : <jsp:getProperty property="salary" name="e"/><br>

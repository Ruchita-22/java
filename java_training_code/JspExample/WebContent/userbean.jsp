


<jsp:useBean id="e" class="com.ibm.POJO.Employee" ></jsp:useBean>
<jsp:setProperty property= "empno" name="e" value="1001"/>
<jsp:setProperty property= "ename" name="e" value="paglaaa"/>
<jsp:setProperty property= "salary" name="e" value="30000"/>


Employee Details:

EMployeeNo :<jsp:getProperty property ="empno" name="e"/><br>
EMployeeName :<jsp:getProperty property ="ename" name="e"/><br>
EMployeeSalary :<jsp:getProperty property ="salary" name="e"/><br> 


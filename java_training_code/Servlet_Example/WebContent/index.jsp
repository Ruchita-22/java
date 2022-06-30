<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style type="text/css">
  body{background-color:#bef9fb;}
  h1{color:#0d120b;text-align: center;}
  img{width:800px; height: 200px;}
  #myCarousel{width: 800px;height: 600px; margin-left: 150px; margin-right: 250px;}
  #form1{margin-left: 360px; }
 
  </style>
</head>
<body>
	
	<h1>Welcome To IBM</h1>
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="IBM1.jpg" alt="IBM1">
    </div>

    <div class="item">
      <img src="IBM2.jpg" alt="IBM2">
    </div>

    <div class="item">
      <img src="IBM3.jpg" alt="IBM3">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
	<br>
	<br>
	<div class="col-xs-4" id="form1">
		<form action="rd" method="post">
				UserName:<input type="text" name="username" class="form-control" class="col-xs-2"><br>
				Password:<input type="password" name="password" class="form-control" class="col-xs-2"><br>
				<input type="submit" value="LOGIN"class="btn btn-success">
				
		</form>
	</div>
</body>
</html>
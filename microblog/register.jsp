<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>


    <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
	
    <base href="<%=basePath%>">
    
    <title> 注册页面 </title>
 
	<script src="bootstrap.min.js"></script> 	
    
  </head>
  
	<body style="background-position: 0px 0px; background: url('1.png'); background-repeat: repeat; background-attachment: scroll;">
		<div>
			<img src="xidian.png" height=100px width=500px alt="西电" />
		</div>
		<div class="container">

      <form class="form-signin" action="${pageContext.request.contextPath }/servlet/RegisterAction" method="post">
        <div class="loginpage">
			<div class="UserName" >
				<input type="text" name="username" id="username" class="form-control" placeholder="用户名">
			</div>
			<br>
			<div class="password" >
				<input type="password" name="password" id="password" class="form-control" placeholder="密码">
			</div>
			<br>
			<div class="niceName" >
				<input type="text" name="nicename" id="nicename" class="form-control" placeholder="昵称">
			</div>
			
			<br>
			<input class="btn btn-lg btn-primary btn-block" type="submit" value="注册" class="regist"/>
		</div>
      </form>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	</body>
</html>
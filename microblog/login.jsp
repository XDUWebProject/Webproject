<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
    
	<link href="bootstrap.min.css" rel="stylesheet">
	<script src="bootstrap.min.js"></script>
  </head>
  
<body >
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<form class="navbar-form navbar-right" role="search" action="${pageContext.request.contextPath }/servlet/LoginAction?method=login" method="post">
					<div class="form-group">
						<input type="text" id="username" name="username" class="form-control" placeholder="Email">
					</div>
					<div class="form-group">
						<input type="password" id="password" name="password" class="form-control" placeholder="Password">
					</div>
					<input type="submit" value="登录" class="btn btn-success" class="login"/>
					<button type="submit" class="btn btn-success" formaction="register.jsp">没有账号？注册</button>
				</form>
			</div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>
<div class="jumbotron">
    <div class="container">
        <h1>Hello, world!</h1>

        <p>This is a template for a simple marketing or informational website. It includes a large callout called a
            jumbotron and three supporting pieces of content. Use it as a starting point to create something more
            unique.</p>

        <p><a class="btn btn-primary btn-lg" role="button">Learn more &raquo;</a></p>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-4">
            <h2>Heading</h2>

            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis
                euismod. Donec sed odio dui.</p>

            <p><a class="btn btn-default btn-lg" role="button">View details &raquo;</a></p>
        </div>

        <div class="col-md-4">
            <h2>Heading</h2>

            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis
                euismod. Donec sed odio dui.</p>

            <p><a class="btn btn-default btn-lg" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
            <h2>Heading</h2>

            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris
                condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis
                euismod. Donec sed odio dui.</p>

            <p><a class="btn btn-default btn-lg" role="button">View details &raquo;</a></p>
        </div>
    </div>
    <hr/>
    <footer>
        <p>&copy;Company 2017</p>
    </footer>
</div>
</body>
</html>

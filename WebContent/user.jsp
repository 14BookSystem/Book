<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="common/Styles/base.css" />
		<link rel="stylesheet" type="text/css"
			href="common/Styles/admin-all.css" />
		<link rel="stylesheet" type="text/css"
			href="common/Styles/bootstrap.min.css" />
		<script type="text/javascript" src="common/Scripts/jquery-1.7.2.js"></script>
		<!--<script type="text/javascript"
			src="common/Scripts/jquery.spritely-0.6.js"></script>
		<script type="text/javascript" src="common/Scripts/chur.min.js"></script>
		--><link rel="stylesheet" type="text/css" href="common/Styles/login.css" />
		<script type="text/javascript">
        $(function () {
            $('#clouds').pan({ fps: 20, speed: 0.7, dir: 'right', depth: 10 });
            $('.teds').click(function () {
                if ($('#uid').val() == "" || $('#pwd').val() == "" || $('#code').val() == "") { $('.tip').html('用户名或密码不可为空！') }
                else {
                    location.href = 'index.jsp';
                }
            })
        })
	
  		function flushCode(){
  			document.getElementById("codeimg").src = "imageServlet?random=" + Math.random();
  		}

        function toRegister(){
        	location.href = 'register.jsp';
        }
        
		</script>
	</head>
	<body>
		<div id="clouds" class="stage"></div>
		<div class="loginmain">
		</div>
		<form action="user_login.action" method="post">
			<div class="row-fluid">
				<h1>
			用户登录
				</h1>
				<p>
					<label>
					 <font color="#FF00FF">${message}</font>
					</label>
				</p>
				<p>
					<label>
						帐&nbsp;&nbsp;&nbsp;&nbsp;号：
						<input name="user.username" type="text" id="uid" />
					</label>
				</p>
				<p>
					<label>
						密&nbsp;&nbsp;&nbsp;&nbsp;码：
						<input name="user.password" type="password" id="pwd" />
					</label>
				</p>


				<hr />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" value=" 登 录 "
					class="btn btn-primary btn-large login" id="teds" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="button" value=" 注册 " class="btn btn-large" onclick="toRegister()"/>
			</div>

		</form>
	</body>
</html>
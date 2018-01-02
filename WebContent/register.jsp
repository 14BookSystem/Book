<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		<script type="text/javascript"
			src="common/Scripts/jquery.spritely-0.6.js"></script>
		<script type="text/javascript" src="common/Scripts/chur.min.js"></script>
		<link rel="stylesheet" type="text/css" href="common/Styles/login.css" />
		<script type="text/javascript">
  		function flushCode(){
  			document.getElementById("codeimg").src = "imageServlet?random=" + Math.random();
  		}
  		
  		function check() {
  			var name = document.form1.username.value;
			var password = document.form1.password.value;
			var phone = document.form1.phone.value;
			var qq = document.form1.qq.value;
			var reg_tel = /\D/;
	 		if (name == "") {
				alert("用户名不能为空");
				document.form1.username.focus();
				return false;
			}
			if (password == "") {
				alert("密码不能为空");
				document.form1.password.focus();
				return false;
			}
			if (phone == "") {
				alert("电话不能为空");
				document.form1.phone.focus();
				return false;
			}
			if (reg_tel.test(phone) || phone.length != 11) {
				alert("电话号码格式错误 ");
				document.form1.phone.value = "";
				document.form1.phone.focus();
				return false;
			}
			if (qq == "") {
				alert("qq不能为空");
				document.form1.qq.focus();
				return false;
			}
			return true;
		}

  		function toLogin(){
  			location.href = 'user.jsp';
  		}
		</script>
	</head>
	<body>
		<div id="clouds" class="stage"></div>
		<div class="loginmain">
		</div>
		<form id="form1" name="form1" action="user_reg.action" method="post" OnSubmit="return check()">
			<input name="util.t" type="hidden" value="user" />
			<div class="row-fluid">
				<h1>
					用户注册
				</h1>
				<p>
					<label>
					 <font color="#FF00FF">${message}</font>
					</label>
				</p>
				<p>
					<label>
						帐&nbsp;&nbsp;&nbsp;&nbsp;号：
						<input name="user.username" type="text" id="username" />
					</label>
				</p>
				<p>
					<label>
						密&nbsp;&nbsp;&nbsp;&nbsp;码：
						<input name="user.password" type="password" id="password" />
					</label>
				</p>

				<p>
					<label>
						电&nbsp;&nbsp;&nbsp;&nbsp;话：
						<input name="user.phone" type="text" id="phone"  />
					</label>
				</p>

					<p>
					<label>
						Q&nbsp;&nbsp;&nbsp;&nbsp;Q：
						<input name="user.qqnum" type="text"  id="qq" />
					</label>
				</p>

				<hr />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" value=" 注册  "
					class="btn btn-primary btn-large login" id="teds" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="button" value=" 返回登录 " class="btn btn-large" onclick="toLogin()"/>
			</div>

		</form>
	</body>
</html>
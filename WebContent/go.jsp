<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

		</script>
	</head>
	<body>
		<div id="clouds" class="stage"></div>
		<div class="loginmain">
		</div>
		<form action="login.jsp" method="post">
			<div class="row-fluid">
				<h1>
					云存储系统毕业设计
				</h1>
				<p>
					<label>
						1、不得转载、分享暴力色情文件;；
					</label>
				</p>
				<p>
					<label>
						2、未经许可，不能盗用本系统界面;
					</label>
				</p>

				<p>
					<label>
						3、严格遵守《精神文明建设》需求;
					</label>
				</p>


				<hr />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" value=" 同 意  "
					class="btn btn-primary btn-large login" id="teds" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

				<a class="btn btn-large" onclick="javascript:window.close();">取
					消</a>
			</div>

		</form>
	</body>
</html>
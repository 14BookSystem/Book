<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="GBK"%>
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
		<%@ include file="common.jsp"%>
	</head>
	<body>
		<div class="warp">
			<!--头部开始-->
			<div class="top_c">
			
				<div class="top-nav">
				
					欢迎您，${user.username }！&nbsp;&nbsp;
				 |
					<a href="${pageContext.request.contextPath}/user.jsp">退出</a>
					
					
					<br>
					
				</div>
				
				
			</div>
			
			<!--头部结束-->

			<!--左边菜单开始-->
			<div class="left_c left">
				<h1>
				管理菜单
					
				</h1>
				<div class="acc">
					
						<div>
						<a class="one">图书预约</a>
						<ul class="kid">
				
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetroom_listjson.action">添加预约信息</a>
							</li>
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetbook_jsonlist.action">预约信息</a>
							</li>
							
						</ul>
					</div>
						<div>
						<a class="one">图书借阅</a>
						<ul class="kid">
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetbook_borrow.action">图书借阅</a>
							</li>
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetborrow_list.action">图书借阅信息</a>
							</li>
							
						</ul>
					</div>
						<div>
						<a class="one">图书归还</a>
						<ul class="kid">
				
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetborrow_listborrow.action">图书归还</a>
							</li>
							
						</ul>
					</div>
		<%--
			
					
						
					
					
				
					--%><div id="datepicker"></div>
				</div>

			</div>
			<!--左边菜单结束-->

			<!--右边框架开始-->
			<div class="Conframe">
				<iframe name="Conframe" id="Conframe">
				
				</iframe>
			</div>
			<!--右边框架结束-->

			<!--底部开始-->
			<div class="bottom_c">
				Copyright &copy; 版权所有
			</div>
			<!--底部结束-->
		</div>
	</body>
</html>
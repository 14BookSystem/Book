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
			<!--ͷ����ʼ-->
			<div class="top_c">
			
				<div class="top-nav">
				
					��ӭ����${user.username }��&nbsp;&nbsp;
				 |
					<a href="${pageContext.request.contextPath}/user.jsp">�˳�</a>
					
					
					<br>
					
				</div>
				
				
			</div>
			
			<!--ͷ������-->

			<!--��߲˵���ʼ-->
			<div class="left_c left">
				<h1>
				����˵�
					
				</h1>
				<div class="acc">
					
						<div>
						<a class="one">ͼ��ԤԼ</a>
						<ul class="kid">
				
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetroom_listjson.action">���ԤԼ��Ϣ</a>
							</li>
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetbook_jsonlist.action">ԤԼ��Ϣ</a>
							</li>
							
						</ul>
					</div>
						<div>
						<a class="one">ͼ�����</a>
						<ul class="kid">
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetbook_borrow.action">ͼ�����</a>
							</li>
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetborrow_list.action">ͼ�������Ϣ</a>
							</li>
							
						</ul>
					</div>
						<div>
						<a class="one">ͼ��黹</a>
						<ul class="kid">
				
							<li>
								<b class="tip"></b><a target="Conframe"
									href="${pageContext.request.contextPath}/meetborrow_listborrow.action">ͼ��黹</a>
							</li>
							
						</ul>
					</div>
		<%--
			
					
						
					
					
				
					--%><div id="datepicker"></div>
				</div>

			</div>
			<!--��߲˵�����-->

			<!--�ұ߿�ܿ�ʼ-->
			<div class="Conframe">
				<iframe name="Conframe" id="Conframe">
				
				</iframe>
			</div>
			<!--�ұ߿�ܽ���-->

			<!--�ײ���ʼ-->
			<div class="bottom_c">
				Copyright &copy; ��Ȩ����
			</div>
			<!--�ײ�����-->
		</div>
	</body>
</html>
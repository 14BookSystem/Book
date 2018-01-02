<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="GBK"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<%@ include file="../com.jsp"%>
		<script type="text/javascript">
$(function() {
	$(".datepicker").datepicker();
})
</script>
	</head>
	<body>
		<div class="alert alert-info">
			当前位置
			<b class="tip"></b>图书管理
			<b class="tip"></b>图书列表
		</div>
		<c:if test="${list != 'null'}">
			<table class="table table-striped table-bordered table-condensed">
				<thead>
					<tr class="tr_detail">
						<td>
							编号
						</td>
						<td>
							书名
						</td>
						<td>
							作者
						</td>
						<td>
							版本号
						</td>
						<td>
							出版社
						</td>
						<td>
							状态
						</td>


						<td>
							操作
						</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tmp" items="${list}">
						<tr>
							<td>
								${tmp.id }
							</td>
							<td>
								${tmp.name }
							</td>
							<td>
								${tmp.description }
							</td>
							<td>
								${tmp.device }
							</td>

							<td>
								${tmp.capability }
							</td>


							<td>
								<c:if test="${tmp.status == 0}">
									<font color="#20B2AA">正常</font>
								</c:if>
								<c:if test="${tmp.status == 1}">
									<font color="#8B4513">借阅状态</font>
								</c:if>
								<c:if test="${tmp.status == 2}">
									<font color="#DC143C">挂失状态</font>
								</c:if>
							</td>

							<td>
								<a target="Conframe"
									href="${pageContext.request.contextPath}/meetroom_edit.action?meetroom.id=${tmp.id }">修改
								</a>
								<a target="Conframe"
									href="${pageContext.request.contextPath}/meetroom_del.action?meetroom.id=${tmp.id }">删除
								</a>
								<c:if test="${tmp.status == 2}">
									<a target="Conframe"
										href="${pageContext.request.contextPath}/meetroom_guihuan2.action?meetroom.id=${tmp.id }">解挂
									</a>
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</body>
</html>

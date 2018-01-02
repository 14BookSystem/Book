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
			$(function () {
				$(".datepicker").datepicker();
			})
		</script>
	</head>
	<body>
		<div class="alert alert-info">
			当前位置
			<b class="tip"></b>职工信息管理
			<b class="tip"></b>职工信息列表
		</div>
		<c:if test="${list != 'null'}">
			<table class="table table-striped table-bordered table-condensed">
				<thead>
					<tr class="tr_detail">
						<td>
							编号
						</td>
						<td>
							姓名
						</td>
						<td>
							电话
						</td>
						<td>
							邮件
						</td>
					<td>
						岗位
						</td>
					<td>
							年龄
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
									${tmp.tel }
							</td>
							<td>
								${tmp.mail }
							</td>
							
								<td>
								${tmp.job }
							</td>
								<td>
								${tmp.dept }
							</td>
					
						
							<td>
									<a target="Conframe"
										href="${pageContext.request.contextPath}/employee_edit.action?employee.id=${tmp.id }">修改
									</a>
									<a target="Conframe"
										href="${pageContext.request.contextPath}/employee_del.action?employee.id=${tmp.id }">删除
									</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</c:if>
	</body>
</html>

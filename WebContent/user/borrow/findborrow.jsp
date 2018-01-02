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
			��ǰλ��
			<b class="tip"></b>ͼ�����
			<b class="tip"></b>ͼ�����
		</div>
		<c:if test="${list != 'null'}">
			<table class="table table-striped table-bordered table-condensed">
				<thead>
					<tr class="tr_detail">
						<td>
							���
						</td>
						<td>
							����
						</td>
						<td>
							��ʼʱ��
						</td>
						<td>
							����ʱ��
						</td>
						<td>
							״̬
						</td>
						<td>
							����
						</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tmp" items="${list2}">
						<tr>
							<td>
								${tmp.id }
							</td>
							<td>
								${tmp.roomname }
							</td>
							<td>
								${tmp.starttimestr }
							</td>
							<td>
								${tmp.endtimestr }
							</td>

							<td>
								<c:if test="${tmp.status == 0}">
									<font color="#20B2AA">������</font>
								</c:if>
								<c:if test="${tmp.status == 1}">
									<font color="#8B4513">�ѽ���</font>
								</c:if>
							</td>
							<td>
								<c:if test="${tmp.status == 0}">
									<a target="Conframe"
										href="${pageContext.request.contextPath}/meetborrow_confirm.action?meetbook.id=${tmp.id }">����
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

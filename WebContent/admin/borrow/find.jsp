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
			��ǰλ��
			<b class="tip"></b>ͼ�������Ϣ����
			<b class="tip"></b>ͼ�������Ϣ�б�
		</div>
		<c:if test="${list3 != 'null'}">
			<table class="table table-striped table-bordered table-condensed">
				<thead>
					<tr class="tr_detail">
						<td>
							���
						</td>
						<td>
							ͼ������
						</td>
						<td>
							�汾��
						</td>
					<td>
							������
						</td>
					<td>
							���Ŀ�ʼʱ��
						</td>
					<td>
							���Ľ���ʱ��
						</td>
						
				
						<td>
							����
						</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tmp" items="${list3}">
						<tr>
							<td>
								${tmp.id }
							</td>
							<td>
								${tmp.roomname }
							</td>
							<td>
								${tmp.keshi }
							</td>
							
								<td>
								${tmp.username }
							</td>
								<td>
								${tmp.starttimestr }
							</td>
								<td>
								${tmp.endtimestr }
							</td>
					
						
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</c:if>
	</body>
</html>

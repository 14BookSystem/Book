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
		<%@ include file="../com.jsp"%>
		<script type="text/javascript">
			$(function () {
				$('.modal').show();
				$(".datepicker").datepicker();
				$('#list').hide();
				$('#find').click(function () {
					$('#list').show();
				})
			})
		</script>
	</head>
	<body>
		<div class="alert alert-info">
			��ǰλ��
			<b class="tip"></b>ͼ�����
			<b class="tip"></b>���ͼ��
		</div>
		<form action="meetroom_save.action" method="post"
			enctype="multipart/form-data">
			<input name="meetroom.id" value="${meetroom.id }" type="hidden" />
			<table
				class="table table-striped table-bordered table-condensed">
				<thead>
					<tr>
						<td colspan="4">
							<b>ͼ����� </b>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							����
						</td>
						<td colspan="3">
							<input name="meetroom.name" value="${meetroom.name }" type="text" />
						</td>
					</tr>
					<tr>
						<td>
							����
						</td>
						<td colspan="3">
							<input name="meetroom.description" value="${meetroom.description }" type="text" />
						</td>
					</tr>
					<tr>
						<td>
							�汾��
						</td>
						<td colspan="3">
							<input name="meetroom.device" value="${meetroom.device }" type="text" />
						</td>
					</tr>
					<tr>
						<td>
							������
						</td>
						<td colspan="3">
							<input name="meetroom.capability" value="${meetroom.capability }" type="text" />
						</td>
					</tr>
				
					
					
				</tbody>
				<tfoot>
					<tr>
						<td colspan="4">
								<input class="btn btn-inverse" id="find" type="submit"
									value="����" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input class="btn btn-inverse" type="reset" value="ȡ��" />
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</body>
</html>
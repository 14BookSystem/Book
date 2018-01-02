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
			当前位置
			<b class="tip"></b>图书管理
			<b class="tip"></b>添加图书
		</div>
		<form action="meetroom_save.action" method="post"
			enctype="multipart/form-data">
			<input name="meetroom.id" value="${meetroom.id }" type="hidden" />
			<table
				class="table table-striped table-bordered table-condensed">
				<thead>
					<tr>
						<td colspan="4">
							<b>图书添加 </b>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							书名
						</td>
						<td colspan="3">
							<input name="meetroom.name" value="${meetroom.name }" type="text" />
						</td>
					</tr>
					<tr>
						<td>
							作者
						</td>
						<td colspan="3">
							<input name="meetroom.description" value="${meetroom.description }" type="text" />
						</td>
					</tr>
					<tr>
						<td>
							版本号
						</td>
						<td colspan="3">
							<input name="meetroom.device" value="${meetroom.device }" type="text" />
						</td>
					</tr>
					<tr>
						<td>
							出版社
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
									value="保存" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input class="btn btn-inverse" type="reset" value="取消" />
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</body>
</html>
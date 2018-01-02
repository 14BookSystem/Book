<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="GBK"%>
	
		
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<script type="text/javascript" src="<%=basePath%>/common/WdatePicker.js"></script>
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
			<b class="tip"></b>图书预约
			<b class="tip"></b>添加预约信息
		</div>
		<form action="meetbook_add.action" method="post"
			enctype="multipart/form-data">
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
							<select id="roomid" name="meetbook.roomid">
							<c:forEach var="tmp" items="${list}">
								<option value="${tmp.id }">${tmp.name }</option>
							</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td>
							预约时间
						</td>
						<td colspan="3">
							<input name="meetbook.starttime" type="text" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})"/>
						</td>
					</tr>
					<tr>
						<td>
							结束时间
						</td>
						<td colspan="3">
							<input name="meetbook.endtime" type="text" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd HH:mm:ss'})"/>
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
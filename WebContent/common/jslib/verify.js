function check() {
	alert(123);
	var name = document.form1.username.value;
	var password = document.form1.password.value;
	var repassword = document.form1.repassword.value;
	var code = document.form1.code.value;
	var tel = document.form1.tel.value;
	var email = document.form1.email.value;
	var reg_tel = /\D/;
	if (name == "") {
		alert("\u7528\u6237\u540d\u4e0d\u80fd\u4e3a\u7a7a");
		document.form1.username.focus();
		return false;
	}
	if (password == "") {
		alert("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");
		document.form1.password.focus();
		return false;
	}
	if (password != repassword) {
		alert("\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u76f8\u540c");
		document.form1.password.value = "";
		document.form1.repassword.value = "";
		document.form1.password.focus();
		return false;
	}
	if (tel == "") {
		alert("\u7535\u8bdd\u53f7\u7801\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		document.form1.tel.focus();
		return false;
	}
	if (reg_tel.test(tel) || tel.length != 11) {
		alert("\u7535\u8bdd\u53f7\u7801\u8f93\u5165\u9519\u8bef\uff01");
		document.form1.tel.value = "";
		document.form1.tel.focus();
		return false;
	}
	if (email == "") {
		alert("Email\u4e0d\u80fd\u4e3a\u7a7a\uff01");
		document.form1.email.focus();
		return false;
	}
	if (email.indexOf("@", 0) == -1) {
		alert("Email\u8f93\u5165\u9519\u8bef\uff01");
		document.form1.email.value = "";
		document.form1.email.focus();
		return false;
	}
	if (code == "") {
		alert("\u9a8c\u8bc1\u7801\u4e0d\u4e0d\u80fd\u4e3a\u7a7a");
		document.form1.code.focus();
		return false;
	} else {
		return true;
	}
}
function flushCode() {
	document.getElementById("codeimg").src = "${pageContext.request.contextPath}/imageServlet?random=" + Math.random();
}


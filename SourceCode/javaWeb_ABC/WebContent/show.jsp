<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String uname=request.getParameter("uname");
	String pwd=request.getParameter("pwd");
	String prov=request.getParameter("prov");
	String[] hobby=request.getParameterValues("hobby");
	out.print("姓名："+uname+"\t");
	out.print("密码："+pwd+"\t");
	out.print("城市："+prov+"\t");
	out.print("爱好：");
	for(int i=0;i<hobby.length;i++){
		out.print(hobby[i]+" ");
	}
%>
</body>
</html>
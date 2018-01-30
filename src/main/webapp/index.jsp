<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.net.InetAddress"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% 
String env = "local";
if (System.getenv("ENV") != null){
	env = System.getenv("ENV");
}
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HelloWorld from OpenShift</title>
<h1>HelloWorld from Openshift on host <%= InetAddress.getLocalHost().getHostAddress() %></h1>
<p><b>This JavaEE application is running in <u><%= env %></u> environment</b></p>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>
	<pre>
		<h5>Written by :: ${authorName}</h5>
		<h5>Pre-Handler Message :: ${preHandlerMsg}</h5>
		<h5>Post-Handler Message :: ${afterHandling }</h5>
		<h5>Request URL :: ${request.getRequestUrl() }</h5>
	</pre>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>파일 업로드 예제</h1>
<form method="post" action="upload" enctype="multipart/form-data">

	<label>email:</label>
	<input type="text" name="e" value="kickscar@gmail.com">
	<br><br>
	
	<label>파일:</label>
	<input type="file" name="f">
	<br><br>
	
	<!--
	<label>파일2:</label>
	<input type="file" name="f">
	<br><br>
	-->

	<br>
	<input type="submit" value="upload">
</form>
</body>
</html>
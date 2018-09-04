<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HRD쇼핑몰</title>
<link rel="stylesheet" href="hrd_shop.css">
</head>
<body>
	<header>
		<h1>쇼핑몰 회원관리 ver 1.0</h1>
	</header>
	<nav>
		<a href="${pageContext.request.contextPath }/register">회원등록</a>
		<a href="${pageContext.request.contextPath }/list">회원목록조회/수정</a>
		<a href="${pageContext.request.contextPath }/salelist">회원매출조회</a>
		<a href="${pageContext.request.contextPath }/">홈으로</a>		
	</nav>
	</body>
	</html>
	
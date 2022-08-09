<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Output Page</title>
	</head>
	<body>
		<h2>出力画面画面</h2>
		<div>入力したテキストは・・・</div>
		<div>「<c:out value="${echoForm.inputText}" />」</div>
		<div>です。</div>
		<div><a href="<c:url value='/view/echo' />">入力画面へ戻る</a></div>
	</body>
</html>
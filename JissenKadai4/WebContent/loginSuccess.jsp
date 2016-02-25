<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>おっけーだぉ</h1>
<s:property value="#session.name_key"/>っち<br>

<s:form action="HistoryAction">

</s:form>

<INPUT type="button" value="戻る" onClick="history.back()">

<img src="success.jpg" width="600" height="500" />
</body>
</html>
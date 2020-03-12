<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>考勤信息记录</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<script type="text/javascript" src="../../jquery-1.12.4.js"></script>
<script type="text/javascript">

</script>
<body>
<div align="center">
<h2 align="center">在线问答</h2>
<a href="Toadd.html">我要提问</a>
</div>
	<table border="1" width="500" align="center">
		<tr>
			<th>序号</th>
			<th>问题</th>
			<th>问题次数</th>
			<th>最后修改</th>
			
		</tr>
		<c:forEach items="${list}" var="list" step="1">
			<tr>
				<td>${list.id}</td>
				<td><a href="xiangqing.html?id=${list.id}">${list.title }</a></td>
				<td>${list.answerCount }</td>
				<td><fmt:formatDate  value="${list.lastModified }" type='both' pattern='yyyy-MM-dd HH:mm:ss'/></td>
			</tr>
		</c:forEach>
		
	</table>
	
</body>
</html>

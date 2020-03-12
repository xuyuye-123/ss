<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>游戏管理查询页面</title>
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
	<form action="Addanswers.html">
	<input type="hidden" value="${questions.id}"  name="qid"><br/>
	问题:<input type="text"  id="names" value="${questions.title}"><br>
	问题描述:<input type="text"  id="types" value="${questions.detailDesc }"><br>
	<c:forEach items="${answers}" var="answers">
			时间:<input type="text"   value="<fmt:formatDate  value="${answers.ansDate}" type='both' pattern='yyyy-MM-dd HH:mm:ss'/>"><br>
			网友回答:<input type="text"  value="${answers.ansContent}"><br>
			</c:forEach>
	我来回答:<input type="text"  id="years" name="ansContent"><br>
	<input type="submit" value="提交" ><a href="list.html">返回首页</a>
	</form> 
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: deepin
  Date: 17-7-16
  Time: 上午7:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<p>${userName},您好，欢迎您进入本系统！</p>
<a href="<%= request.getContextPath()%>/logout">注销</a>

<h1>这是主页面</h1>
<ul>
    <li>公司首页</li>
    <li>主要业务</li>
    <li>联系我们</li>
    <li>诚聘英才</li>
    <li>关于我们</li>

</ul>

</body>
</html>

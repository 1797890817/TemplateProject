<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
</head>
<body>

<form action="<%= request.getContextPath()%>/login" method="post">
    <span>${errMsgList}</span>
    <table align="center" bgcolor="#faebd7">
        <tr>
            <td><span>用户名:</span></td>
            <td><input id="username" type="text" name="username"/></td>
        </tr>
        <tr>
            <td><span>密&nbsp;&nbsp;&nbsp;&nbsp;码：</span></td>
            <td><input id="password" type="password" name="password"/></td>
        </tr>
        <tr align="right">
            <td colspan="2"><input type="submit" value="登录"><input type="reset" value="取消"></td>
        </tr>

    </table>
</form>

</body>
</html>
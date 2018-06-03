<%--
  Created by IntelliJ IDEA.
  User: zzyy
  Date: 2018/6/3
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/relation/addUser" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td>
                <input id="username" name="username" type="text" value="">
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input id="password" name="password" type="text" value="">
            </td>
        </tr>
        <tr>
            <td>昵称</td>
            <td>
                <input id="actualName" name="actualName" type="text" value="">
            </td>
        </tr>
    </table>

    </form>
</body>
</html>

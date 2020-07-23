<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<%--<div style="position:absolute;left:200px;top:100px">--%>
<%--  <!-- ${pageContext.request.contextPath}： -->--%>
<%--  <a href="/login/user/showRegUser">用户注册</a>--%>
<%--  <br>--%>
<%--  <a href="/login/user/showLogin">用户登录</a>--%>

<%--</div>--%>

<%--<body>--%>
<%--&lt;%&ndash;未注册的用户，请<a href="${pageContext.request.contextPath }/register"> 注册</a>！--%>
<%--<br/>--%>
<%--已注册的用户，去<a href="${pageContext.request.contextPath }/login"> 登录</a>！&ndash;%&gt;--%>
<h2>用户登录</h2>
<%--表单--%>
<form action="/login" method="post">
  <%--用户名称--%>
  用户名： <input type="text" name="username"/><br/>
  <%--用户密码--%>
  密码： <input type="password" name="password"/><br/>
  <input type="submit" value="提交"/>
  <%--登陆出错信息--%>
  <h2>${requestScope.msg}</h2>
</form>

</body>
</html>
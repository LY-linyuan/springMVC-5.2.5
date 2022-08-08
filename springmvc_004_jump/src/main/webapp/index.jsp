<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br><br><br>
    index.jsp

    <a href="${pageContext.request.contextPath}/one.action">1请求转发页面</a><br>
    <a href="${pageContext.request.contextPath}/two.action">2请求转发action</a><br>
    <a href="${pageContext.request.contextPath}/three.action">3重定向页面</a><br>
    <a href="${pageContext.request.contextPath}/four.action">4重定向action</a><br>

<br><br><br>
<a href="${pageContext.request.contextPath}/data.action?name=xian">访问服务器, 进行数据携带跳转</a>



<form action="${pageContext.request.contextPath}/mydate.action" >
    日期: <input type="date" name="mydate">  <br>
    <input type="submit" value="提交">

    <br>


    <a href="${pageContext.request.contextPath}/list.action">显示集合中对象的日期成员</a>
</form>
</body>
</html>

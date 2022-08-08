<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br><br><br>
    index.jsp

    <form action="${pageContext.request.contextPath}/req.action" method="get" >
        <input type="submit" value="get提交">
    </form>

    <br>
    <form action="${pageContext.request.contextPath}/req.action" method="post" >
        <input type="submit" value="post提交">
    </form>
    <br>
    <h1>单个数据提交</h1>
    <form action="${pageContext.request.contextPath}/one.action">
        姓名 : <input name="name"> <br>
        年龄 : <input name="age"> <br>
        <input type="submit" value="单个数据提交"> <br>
    </form>

    <h1>封装对象提交</h1>
    <form action="${pageContext.request.contextPath}/two.action">
        姓名 : <input name="name"> <br>
        年龄 : <input name="age"> <br>
        <input type="submit" value="封装对象提交"> <br>
    </form>

    <h1>动态占位符提交</h1>
    <a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>

    <br>
    <form action="${pageContext.request.contextPath}/four.action">
        姓名 : <input name="uname"> <br>
        年龄 : <input name="uage"> <br>
        <input type="submit" value="提交"> <br>
    </form>

<br>
<form action="${pageContext.request.contextPath}/five.action" method="post">
    姓名 : <input name="name"> <br>
    年龄 : <input name="age"> <br>
    <input type="submit" value="提交"> <br>
</form>

</body>
</html>

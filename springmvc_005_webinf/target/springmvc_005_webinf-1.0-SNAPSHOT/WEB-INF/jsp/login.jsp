<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br><br><br><br>
    <form action="${pageContext.request.contextPath}/login">
        姓名: <input type="text" name="name" > <br>
        密码: <input type="password" name="password"> <br>
        <input type="submit" value="登录">
    </form>

${msg}
</body>
</html>

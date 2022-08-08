<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    show.jsp
    单个日期显示 : ${mydate}

    <br><br><br>
    <h2>学生集合</h2>
    <table width="500px" border="1">
        <tr>
            <th>姓名</th>
            <th>生日</th>
        </tr>
        <s:forEach items="${list}" var="stu">
            <tr>
                <td>${stu.name}</td>
                <td>${stu.birthday} ------------ <fmt:formatDate value="${stu.birthday}" pattern="yyyy-MM-dd" />  </td>
            </tr>
        </s:forEach>
    </table>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    main.................jsp

    <%--request.setAttribute("requestUsers", user);
    session.setAttribute("sessionUsers", user);
    model.addAttribute("modelUser", user);
    map.put("mapUser", user);
    modelMap.addAttribute("modelMapUser", user);--%>
    requestUsers:${requestUsers} <br>
    sessionUsers:${sessionUsers} <br>
    modelUser: ${modelUser} <br>
    mapUser: ${mapUser} <br>
    modelMapUser: ${modelMapUser} <br>

        jsp携带来的 ${param.name} <br>
</body>
</html>

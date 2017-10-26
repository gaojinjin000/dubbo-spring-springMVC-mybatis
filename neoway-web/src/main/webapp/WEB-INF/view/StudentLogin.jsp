<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
查询所有：<br>
<a href="/user/list.do">List All</a><br><br>

新增：<br><form action="/user/add.do" method="post">
    ID:<input type="text" name="id"><br>
    NAME:<input type="text" name="name"><br>
    SAL:<input type="text" name="sal"><br>
    <input type="submit" value="提交">
</form><br>

删除：<br><form action="/user/delete.do" method="post">
    输入要删除的ID：<input type="text" name="id"><input type="submit" value="提交"><br>
</form><br>

查询：<br><form action="/user/get.do" method="post">
    输入要查询的ID：<input type="text" name="id"><input type="submit" value="提交"><br>
</form><br>

修改：<br><form action="/user/update.do" method="post">
    根据ID来改，不支持修改ID，输入的名字，工作为修改值：<br>
    ID:<input type="text" name="id"><br>
    NAME:<input type="text" name="name"><br>
    SAL:<input type="text" name="sal"><br>
    <input type="submit" value="提交">
</form><br>
</body>
</html>


































<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div >--%>
    <%--&lt;%&ndash;"${pageContext.request.contextPath}/user/add.action"&ndash;%&gt;--%>
    <%--<form  action="/StudentBack.do" method="post">--%>
        <%--<h2 >用户登录</h2>--%>
        <%--<div >--%>
           <%--用户名--%>
            <%--<input type="text" id="name" name="name"/>--%>
            <%--&lt;%&ndash;<span >${student}</span>&ndash;%&gt;--%>
        <%--</div>--%>
        <%--<div>--%>
            <%--<button type="submit">登录</button>--%>
        <%--</div>--%>

    <%--</form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page import="logic.Cart" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 14.01.2022
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Basket</title>
</head>
<body>
    <h2>Корзина</h2>
    <%
        Cart cart = (Cart) session.getAttribute("cart");
    %>

    <p>
        <%
            String name = request.getParameter("name");
            String surname = request.getParameter("quality");
        %>
    </p>
<%--    <p> Наименование товара: <%= cart.getName() %> </p>--%>
<%--    <p> Количество <%= cart.getQuantity() %> </p>--%>
</body>
</html>

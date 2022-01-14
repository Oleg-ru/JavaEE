<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="logic.TestClass" %>
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
    <title>Market</title>
</head>
<body>
    <h2>Горячии товары!</h2>
    <h2>
            Только для тебя мой дорогой
            <%
                String name = request.getParameter("name");
                String surname = request.getParameter("surname");
            %>
            <%=
                name + " " + surname
            %>
    </h2>
    <p>
        <%= "Скидка на все товары линейки Honor!" %>
        <br>
        <%= "C данного момента (см. дату ниже)"%>
        <br>
        <%
            Date dateNow = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        %>
        <%=dateFormat.format(dateNow)%>
        <br>
        <%="и целые 24 часа!!!"%>
        <%--
            Так же можно выводить с помощью предопределенной переменной "out" в html код
        --%>
        <br>
        <%
            DateFormat dateFormatNew = new SimpleDateFormat("mm-ss");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //для решения проблемы ошибки с println заимпортить томкат в Modules-Dependencies
                out.println("<p>" + "test переменной" + dateFormatNew.format(dateNow) + "</p>");
            }

        %>
        <%
            TestClass testClass = new TestClass();
        %>
        <br>
        <%=
            testClass.getInfo()
        %>
    </p>
</body>
</html>

<%@page import = "java.util.List"%>
<%@page import = "com.User"%>

<!DOCTYPE html>

<head>


    <title>Document</title>

</head>
<body>
<h1>hi</h1>
<%

out.print("fuck ultimate edition");
%>
<br/>
<%=request.getRequestURI()%>
<br>
<hr/>
<%
        List<User> users = (List) request.getAttribute("users");
        User anUser = users.get(0);
        %>
        <%=anUser.getName()%>
        <%=anUser.getCountre()%>
        <%=anUser.getAge()%>
        <table>
        <% for(User user : users) {%>
          <tr>
            <td><%=user.getName()%></td>
            <td><%=user.getCountre()%></td>
            <td><%=user.getAge()%></td>
        </tr>
        <% } %>
    </table>
</body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome!!!</title>
    </head>
    <body>
        <h1>Personalized Greeting Web Application</h1>

        <p>
            <%
                String nameSurname = (String) request.getAttribute("nameSurname");
                String gender = (String) request.getAttribute("gender");

                String nameAndSurname = (String) request.getAttribute("nameAndSurname");
                String title = (String) request.getAttribute("title");


            %>
        </p>

       

        Hello <%=title%> <br>
        <%=nameAndSurname%> Welcome to the world of Web Applications Development.
    </body>
</html>

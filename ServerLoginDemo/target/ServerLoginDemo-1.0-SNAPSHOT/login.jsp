<%-- 
    Document   : login
    Created on : 18 giu 2021, 13:34:23
    Author     : Utente
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form /action="${pageContext.request.contextPath}/login"  method="POST">      
            <input type="text"  name="username"/>
            <input type="password"  name="password"/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>

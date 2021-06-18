<%-- 
    Document   : success.jsp
    Created on : 18 giu 2021, 15:00:57
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
        
        
        <%
            String user = null;
            if(session.getAttribute("user") == null)
              response.sendRedirect("login.jsp");
            else 
              user = (String)session.getAttribute("user");

        %>
            
            
            
         <h3> Hi, ${user}</h3>
         <a href="${pageContext.request.contextPath}/logout ">logout<a
                 
                 
                 
    </body>
</html>

<%-- 
    Document   : viewnote
    Created on : Jun 12, 2021, 8:12:02 AM
    Author     : 840979
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>View Note</h2>
        <h4 display="inline">Title: </h4>
        <p dislpay="inline">${mynote.title}</p>
        <h4>Contents: </h4><br>
        <p>${mynote.contents}</p>
        
        <a href="note?edit" name="edit">Edit</a>
    </body>
</html>

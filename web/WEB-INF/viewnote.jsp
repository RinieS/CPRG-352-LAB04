<%-- 
    Document   : viewnote
    Created on : Jun 12, 2021, 8:12:02 AM
    Author     : 840979
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <form  method="post" action="note">
        <h2>View Note</h2>
        <label> <h4>Title: </h4></label>
        <p >${mynote.title}</p>
        <label><h4>Contents: </h4></label>
        <p>${mynote.contents}</p>
        
        <a href="note?edit=true" >Edit</a>
        </form>
    </body>
</html>

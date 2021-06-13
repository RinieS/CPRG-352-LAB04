<%-- 
    Document   : editnote
    Created on : Jun 12, 2021, 8:12:25 AM
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
         <form  method="post" action="note">
        <h2>Edit Note</h2>
        <label> <h4>Title: </h4></label>
        <input type="text" name="editedTitle" value="${editedNote.newTitle}">
        <label><h4>Contents: </h4></label>
        <input type="text" name="editedContents" value="${editedNote.newContents}"><br>
        <input type="submit" value="Save">
        
         </form>
    </body>
</html>

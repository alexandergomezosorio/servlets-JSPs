<%-- 
    Document   : index
    Created on : 4/09/2022, 10:39:07 p. m.
    Author     : Alexa
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola mundo JSPs</title>
    </head>
    <body>
        <h1>Hola mundo JSPs</h1>
        <ul>
            <li> <% out.print("HolaMundo con scriplets");%> </li>
            <li> ${"HolaMundo con expresion Language ()EL"} </li>
            <li> <%= "Hola mundo con Expresiones" %></li>
            <li> <c:out value="HolaMundo conJSTL"/> </li>
        </ul>

    </body>
</html>

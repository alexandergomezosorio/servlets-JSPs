
<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="javax.swing.text.AbstractDocument.Content"%>
<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition","inline;filename="+nombreArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de JAVA</td>
                <td>Aprendemos la sintaxis basica de JAVA</td>
                <td><%= Conversiones.format(new Date())%></td>
                <%-- <td><%= Conversiones.format("500")%></td> para que saque error para mirar manejo errores que se creo--%>
            </tr>
             <tr>
                <td>2. Programacion con JAVA</td>
                <td>Pondremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%= Conversiones.format(new Date())%></td>
            </tr>
            
        </table>
    </body>
</html>

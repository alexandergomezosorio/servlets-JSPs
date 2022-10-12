package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();

        //Recuperamos la lista de articulos agregados previamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos si la lista de articulos existe
        if (articulos == null) {
            //inicializamos la lista articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        //Procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        //Revisar y agregar el articulo nuevo
        if (articuloNuevo != null && articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        //Imprimir la lista de ariculos
        PrintWriter out = response.getWriter();
        out.print("<h1>Lista de articulos</h1>");
        out.print("<br>");
        
        //Iteramos todos los articulos
        for(String articulo:articulos){
            out.print("<li>"+articulo+"</li>");
        }
        out.print("<br>");
        out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        out.close();
    }
}

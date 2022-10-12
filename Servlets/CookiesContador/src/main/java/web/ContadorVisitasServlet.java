package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Declaramos la variable contador
        int contador = 0;

        //Revisar si existe la cookie contador visitas
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("contadorVisitas"));
                contador = Integer.parseInt(c.getValue());
            }
        }
        //Incrementamos el contador en uno
        contador++;
        //Agregamos la respuesta al navegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        //La cookie se almacenara en cliente por 1 hora(3600 segundos)
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        response.setContentType("text/html;crarset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente"+contador);
    }
}

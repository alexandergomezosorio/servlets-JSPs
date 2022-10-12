package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Suponemos que el usuario esta por primera vez en el sitio 
        boolean nuevoUsuario = true;

        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();

        //buscamos si ya existe una cookie creada con anterioridad
        //Llamada visitante recurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //si ya existe la cookie no es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitanteCokkie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCokkie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        } else {
            mensaje = "Gracias por visitar NUEVAMENTE uestro sitio";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje"+mensaje);
        out.close();
    }
}

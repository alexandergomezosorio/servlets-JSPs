<%! 
    //Declaramos una variable con su metodo get
    private String usuario = "alexander";

    public String getUsuario(){
    return this.usuario;
}
    //Declaramos un contador de visitas
    private int contadorVIsitas = 1;
    
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones con JSPs</title>
    </head>
    <body>
        <h1>Uso de Declaraciones con JSPs</h1>
        Valor de usuario por medio del atributo: <%=this.usuario%>
        <br>
        Valor de usuario por medio del metodo: <%= this.getUsuario()%>
        <br>
        Contador visitas: <%= this.contadorVIsitas++%>
        
    </body>
</html>

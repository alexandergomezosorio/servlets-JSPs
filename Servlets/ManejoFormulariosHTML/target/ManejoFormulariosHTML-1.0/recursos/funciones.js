/* global tecnologias, genero */

function ValidarForma(forma) {
    const usuario = forma.usuario;

    if (usuario.value === "" || usuario.value === "Escribir usuario") {

        alert("Debe escribir nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    const password = forma.password;
    if (password.value === "" || password.value.length < 3) {

        alert("Debe escribir password de al menos  3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado) {
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    var generos = forma.genero;
    var radioSeleccionado = false;

    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    if (!radioSeleccionado) {
        alert("Debe seleccionar un tipo de sexo");
        return false;
    }
    var ocupacion = forma.ocupacion;

    if (ocupacion.value === "") {
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    //Formulario valido
    alert("Formulario valido, enviado datos al servidor");
    return true;

}

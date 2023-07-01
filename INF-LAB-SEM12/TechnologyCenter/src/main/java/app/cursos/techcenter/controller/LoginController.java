package app.cursos.techcenter.controller;

import app.cursos.techcenter.model.Empleado;
import app.cursos.techcenter.service.LoginService;
import app.cursos.techcenter.util.Session;

public class LoginController {
    public void validarUsuario(String Usuario, String clave){
        LoginService service =new LoginService();
        Empleado empleado = service.validarUsuario(Usuario, clave);
        Session.put("usuario", empleado);
    }
}

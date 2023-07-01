package app.cursos.techcenter.model;

public class Empleado {
    private int idEmpleado;
    private String apellido;
    private String nombre;
    private String direccion;
    private String email;
    private String usuario;
    private String contraseña;
    
    public Empleado(){
    }
    
    public Empleado(int idEmpleado, String apellido, String nombre, String direccion, String email, String usuario, String contraseña) {
        this.idEmpleado = idEmpleado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contrasena) {
        this.contraseña = contrasena;
    }
}

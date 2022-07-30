package retojava5;

public class Clientes {
    private String alias_cliente;
    private String nombres_cliente;
    private String apellidos_cliente;
    private String email_cliente;
    private String celular_cliente;
    private String contraseña_cliente;

    public Clientes(String alias_cliente, String nombre_cliente, String apellido_cliente, String email_cliente, String celular_cliente, String contraseña_cliente) {
        this.alias_cliente = alias_cliente;
        this.nombres_cliente = nombre_cliente;
        this.apellidos_cliente = apellido_cliente;
        this.email_cliente = email_cliente;
        this.celular_cliente = celular_cliente;
        this.contraseña_cliente = contraseña_cliente;
    }

    public String getAlias_cliente() {
        return alias_cliente;
    }

    public void setAlias_cliente(String alias_cliente) {
        this.alias_cliente = alias_cliente;
    }

    public String getNombre_cliente() {
        return nombres_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombres_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellidos_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellidos_cliente = apellido_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

    public String getContraseña_cliente() {
        return contraseña_cliente;
    }

    public void setContraseña_cliente(String contraseña_cliente) {
        this.contraseña_cliente = contraseña_cliente;
    }

    @Override
    public String toString() {
        return "Clientes{" + "alias_cliente=" + alias_cliente + ", nombre_cliente=" + nombres_cliente + ", apellido_cliente=" + apellidos_cliente + ", email_cliente=" + email_cliente + ", celular_cliente=" + celular_cliente + ", contrase\u00f1a_cliente=" + contraseña_cliente + '}';
    }
       
}

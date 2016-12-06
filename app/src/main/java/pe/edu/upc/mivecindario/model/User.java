package pe.edu.upc.mivecindario.model;

/**
 * Created by AlfredoRegis on 12/5/16.
 */

public class User {
    private String codigoTipoDocumento;
    private String numeroDocumento;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String usuario;
    private String email;
    private String direccion;

    public User() {
    }

    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    public User setCodigoTipoDocumento(String codigoTipoDocumento) {
        this.codigoTipoDocumento = codigoTipoDocumento;
        return this;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public User setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public User setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public User setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
        return this;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public User setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
        return this;
    }

    public String getUsuario() {
        return usuario;
    }

    public User setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public User setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
}

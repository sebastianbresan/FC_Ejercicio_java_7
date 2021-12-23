package FC;

public class Candidato {

    private String ciudad;
    private Boolean tipoTraslado;
    private String email;
    private String telefono;
    private Presencialidad Presencialidad;

    public Candidato() {
    }

    public Candidato(String ciudad, Boolean tipoTraslado, String email, String telefono, FC.Presencialidad presencialidad) {
        this.ciudad = ciudad;
        this.tipoTraslado = tipoTraslado;
        this.email = email;
        this.telefono = telefono;
        Presencialidad = presencialidad;
    }


    public String getCiudad() {
        return ciudad;
    }

    public Boolean getTipoTraslado() {
        return tipoTraslado;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public FC.Presencialidad getPresencialidad() {
        return Presencialidad;
    }


    @Override
    public String toString() {
        return "Candidato{" +
                "ciudad='" + ciudad + '\'' +
                ", tipoTraslado=" + tipoTraslado +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", Presencialidad=" + Presencialidad +
                '}';
    }
}

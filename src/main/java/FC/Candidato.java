package FC;

import java.util.ArrayList;
import java.util.Objects;

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

    ArrayList<Candidato> candidatosList = new ArrayList<>();

    public ArrayList<Candidato> getCandidatosList() {
        return candidatosList;
    }

    public void setCandidatosList(ArrayList<Candidato> candidatosList) {
        this.candidatosList = candidatosList;
    }
//--------------------------------------------------//

    public ArrayList<Candidato> filtrar(String ciudad) {

        ArrayList<Candidato> candidatosCiudad = new ArrayList<>();
        for (Candidato candidato : candidatosList) {
            if (Objects.equals(ciudad, candidato.getCiudad())) {
                candidatosCiudad.add(candidato);
            }
        }
        return candidatosCiudad;
    }

    //--------------------------------------------------//

    public ArrayList<Candidato> filtrar(boolean tipoTraslado) {

        ArrayList<Candidato> candidatosTraslado = new ArrayList<>();

        for (Candidato candidato : candidatosList) {
            if (tipoTraslado == candidato.getTipoTraslado()) {
                candidatosTraslado.add(candidato);
            }
        }
        return candidatosTraslado;
    }

    //--------------------------------------------------//


    public ArrayList<Candidato> filtrar(Presencialidad tipoPresencialidad) {

        ArrayList<Candidato> candidatosPresencialidad = new ArrayList<>();

        for (Candidato candidato : candidatosList) {
            if (tipoPresencialidad == candidato.getPresencialidad()) {
                candidatosPresencialidad.add(candidato);
            }
        }
        return candidatosPresencialidad;
    }

    //--------------------------------------------------//

    public Candidato buscarEmail(String email) {

        Candidato candidatoEmail = new Candidato();

        for (Candidato candidato : candidatosList) {
            if (Objects.equals(email, candidato.getEmail())) {
                candidatoEmail = candidato;
            }
        }
        return candidatoEmail;

    }

    //--------------------------------------------------//

    public Candidato buscarTelefono(String telefono) {

        Candidato candidatoTelefono = new Candidato();

        for (Candidato candidato : candidatosList) {
            if (Objects.equals(telefono, candidato.getTelefono())) {
                candidatoTelefono = candidato;
            }
        }
        return candidatoTelefono;
    }

    //--------------------------------------------------//

    public ArrayList<Candidato> filtrar(String ciudad, Presencialidad tipoPresencialidad, boolean tipoTraslado) {

        ArrayList<Candidato> candidatosCPT = new ArrayList<>();

        for (Candidato candidato : candidatosList) {
            if (
                    Objects.equals(ciudad, candidato.getCiudad())
                            && tipoPresencialidad == candidato.getPresencialidad()
                            && tipoTraslado == candidato.getTipoTraslado()) {

                candidatosCPT.add(candidato);
            }
        }
        return candidatosCPT;
    }

    //--------------------------------------------------//

    public void eliminar(int candidato) {
        candidatosList.remove(candidato);
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

package FC;

import java.util.ArrayList;
import java.util.Objects;

public class CandidatosList {

    private ArrayList<Candidato> candidatosList = new ArrayList<>();

    public ArrayList<Candidato> getCandidatosList() {
        return candidatosList;
    }

    public void setCandidatosList(ArrayList<Candidato> candidatosList) {
        this.candidatosList = candidatosList;
    }

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

}


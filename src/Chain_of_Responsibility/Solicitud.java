package Chain_of_Responsibility;

public class Solicitud{
    private String tipoSolicitud;
    private int nivel; // 1 = Asistente, 2 = Profesor, 3 = Coordinador

    public Solicitud(String tipoSolicitud, int nivel) {
        this.tipoSolicitud = tipoSolicitud;
        this.nivel = nivel;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public int getNivel() {
        return nivel;
    }
}

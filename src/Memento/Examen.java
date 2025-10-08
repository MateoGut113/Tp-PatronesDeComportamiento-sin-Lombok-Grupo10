package Memento;

public class Examen {
    private String respuestas = "";
    private Historial historial;

    public Examen(Historial historial){
        this.historial=historial;
    }
    public void responderExamen(String respuesta) {
        respuestas += respuesta + " | ";
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void save() {
        this.historial.guardar(new Memento(respuestas));
    }

    public void restore() {
        Memento mementoresp =this.historial.deshacer();
        if (mementoresp!=null){
            this.respuestas = mementoresp.getRespuestas();
        }



    }
}
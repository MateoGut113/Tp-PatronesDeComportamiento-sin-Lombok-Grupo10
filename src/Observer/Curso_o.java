package Observer;

import java.util.ArrayList;
import java.util.List;

public class Curso_o {
    private Curso_o curso;  // usamos la clase Curso del paquete entidades
    private List<Observer> observadores = new ArrayList<>();

    public Curso_o(Curso_o curso) {
        this.curso = curso;
    }

    // Agregar un alumno (Observer)
    public void agregarObservador(Observer obs) {
        observadores.add(obs);
    }

    // Eliminar un alumno (Observer)
    public void eliminarObservador(Observer obs) {
        observadores.remove(obs);
    }

    // Notificar a todos los observadores
    public void notificar(String mensaje) {
        for (Observer obs : observadores) {
            obs.update("Curso " + curso.getNombre() + " - " + mensaje);
        }
    }

    public String getNombre() {
        return curso.getNombre();
    }

    public Curso_o getCurso() {
        return curso;
    }
}

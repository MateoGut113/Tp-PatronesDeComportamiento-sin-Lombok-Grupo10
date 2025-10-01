package Observer;

import entidades.Curso;   // <-- importar la clase de entidades
import java.util.ArrayList;
import java.util.List;

public class Curso_o {
    private Curso curso;  // ahora sí es un Curso real de entidades
    private List<Observer> observadores = new ArrayList<>();

    public Curso_o(Curso curso) {   // recibe un entidades.Curso
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

    public Curso getCurso() {
        return curso;
    }
}

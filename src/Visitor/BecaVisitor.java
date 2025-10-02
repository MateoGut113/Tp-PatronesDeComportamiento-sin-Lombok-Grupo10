package Visitor;

import entidades.Alumno;
import entidades.Curso;

// Visitor concreto: determina si un alumno recibe una beca
public class BecaVisitor implements Visitor {
    @Override
    public void visit(Alumno alumno) {
        if (alumno.getDni() % 2 == 0) { // ejemplo simple: DNI par tiene beca
            System.out.println("Alumno " + alumno.getNombre() + " " + alumno.getApellido() +
                    " obtiene una beca del 20%.");
        } else {
            System.out.println("Alumno " + alumno.getNombre() + " " + alumno.getApellido() +
                    " no aplica a la beca.");
        }
    }

    @Override
    public void visit(Curso curso) {
        System.out.println("Curso " + curso.getNombre() +
                " revisado por BecaVisitor (no aplica descuento).");
    }
}

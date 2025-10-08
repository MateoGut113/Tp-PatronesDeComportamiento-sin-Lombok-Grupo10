package Visitor;

import entidades.Alumno;
import entidades.Curso;

// Visitor concreto: genera reportes de alumnos y cursos
public class ReporteVisitor implements Visitor {
    @Override
    public void visit(Alumno alumno) {
        System.out.println("Reporte Alumno -> Nombre: " + alumno.getNombre() +
                " " + alumno.getApellido() + ", DNI: " + alumno.getDni() +
                ", Legajo: " + alumno.getLegajo());
    }

    @Override
    public void visit(Curso curso) {
        System.out.println("Reporte Curso -> Nombre: " + curso.getNombre());
    }
}

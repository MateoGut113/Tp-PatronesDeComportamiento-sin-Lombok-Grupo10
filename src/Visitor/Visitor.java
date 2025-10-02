package Visitor;

import entidades.Alumno;
import entidades.Curso;

// Interface Visitor: define las operaciones para cada tipo de Elemento
public interface Visitor {
    void visit(Alumno alumno);
    void visit(Curso curso);
}

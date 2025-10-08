package Command.implementacion;

import entidades.Alumno;
import Command.Command;
public class InscribirseCursoCommand implements Command {
    private final Alumno alumno;
    private final String curso;

    public InscribirseCursoCommand(Alumno alumno, String curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute() {
        alumno.inscribirseCurso(curso);
    }
}
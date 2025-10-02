package Command.implementacion;


import entidades.Alumno;
import Command.Command;
public class AbandonarCursoCommand implements Command {
    private final Alumno alumno;
    private final String curso;

    public AbandonarCursoCommand(Alumno alumno, String curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute() {
        alumno.abandonarCurso(curso);
    }
}
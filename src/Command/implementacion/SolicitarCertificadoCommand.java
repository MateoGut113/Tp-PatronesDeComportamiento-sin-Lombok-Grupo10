package Command.implementacion;

import entidades.Alumno;
import Command.Command;

public class SolicitarCertificadoCommand implements Command {
    private final Alumno alumno;
    private final String curso;

    public SolicitarCertificadoCommand(Alumno alumno, String curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute() {
        alumno.solicitarCertificado(curso);
    }
}

package State;

public class EnEspera implements EstadoInscripcion{
    @Override
    public void cambiarEstado(Inscripcion i) {
        System.out.println("esperando a que me inscriban");

        i.setEstadoInscripcion( new Inscripto());

    }
}
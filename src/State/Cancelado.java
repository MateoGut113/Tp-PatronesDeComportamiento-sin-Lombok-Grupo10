package State;

public class Cancelado implements EstadoInscripcion{
    @Override
    public void cambiarEstado(Inscripcion i) {
        System.out.println("cancele mi inscripcion");
        i.setEstadoInscripcion(new EnEspera());
    }
}

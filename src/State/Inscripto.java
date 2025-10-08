package State;

public class Inscripto implements EstadoInscripcion{
    @Override
    public void cambiarEstado(Inscripcion i) {
        System.out.println("inscripto al curso");
        i.setEstadoInscripcion(new Cancelado());

    }

}
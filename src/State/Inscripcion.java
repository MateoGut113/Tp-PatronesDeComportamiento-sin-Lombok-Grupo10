package State;

public class Inscripcion {

    private EstadoInscripcion estadoInscripcion;
    //referencia a la interface EstadoINscripcion, si se puede hacer


    public Inscripcion() {
        estadoInscripcion = new Inscripto();
    }

    public void setEstadoInscripcion(EstadoInscripcion estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }

    public void cambiarEstado(){
        estadoInscripcion.cambiarEstado(this);
    }
}

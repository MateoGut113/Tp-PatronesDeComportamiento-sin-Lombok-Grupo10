package Mediator;

public abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombre;

    public Usuario(String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}
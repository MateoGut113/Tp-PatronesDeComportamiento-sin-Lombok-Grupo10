package Mediator;

public abstract class Usuario {
    protected ChatMediator mediator;
    protected String nombreUsuario;

    public Usuario(ChatMediator mediator, String nombreUsuario) {
        this.mediator = mediator;
        this.nombreUsuario = nombreUsuario;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}
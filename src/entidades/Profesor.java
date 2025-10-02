package entidades;

import Chain_of_Responsibility.Handler;
import Chain_of_Responsibility.Solicitud;
import Mediator.ChatMediator;
import Mediator.Usuario;

public class Profesor extends Usuario implements Handler{
    private Handler next; // Patron Chain of Responsibility

    public Profesor(ChatMediator mediator, String nombre) {
        super(nombre);
    }

    //Patron Mediator
    @Override
    public void enviar(String mensaje) {
        System.out.println("\n" + nombre + " envía: " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("\n" + nombre + " recibe: " + mensaje);
    }

    //Patron Chain of Responsability
    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud s) {
        if (s.getNivel() == 2) {
            System.out.println("\nProfesor atiende la solicitud: " + s.getTipoSolicitud());

        } else if (next != null){
            next.handle(s);
        }
    }
}

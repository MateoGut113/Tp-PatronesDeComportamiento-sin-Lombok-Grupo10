package Chain_of_Responsibility;

public class Asistente implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud s) {
        if (s.getNivel() == 1) {
            System.out.println("\nAsistente atiende la solicitud: " + s.getTipoSolicitud());

        } else if (next != null){
            next.handle(s);
        }
    }

}

package Chain_of_Responsibility;

public class Coordinador implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud s) {
        if (s.getNivel() == 3) {
            System.out.println("\nCoordinador atiende la solicitud: " + s.getTipoSolicitud());

        } else if (next != null){
            next.handle(s);
        }else{
            System.out.println("\nNivel no contemplado: intente nuevamente.");
        }
    }
}

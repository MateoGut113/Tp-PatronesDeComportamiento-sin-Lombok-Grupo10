package Chain_of_Responsibility;

public interface Handler {
    //Metodos que se usarán para pasar al siguiente caso en caso de que no pueda el anterior
    void setNext(Handler next);
    void handle(Solicitud s);

}

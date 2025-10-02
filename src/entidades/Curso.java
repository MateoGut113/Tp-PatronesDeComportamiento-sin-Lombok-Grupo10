package entidades;

public class Curso {

    private String nombre;
    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }



    public void accept(Visitor.Visitor visitor) {
        visitor.visit(this);
    }



}

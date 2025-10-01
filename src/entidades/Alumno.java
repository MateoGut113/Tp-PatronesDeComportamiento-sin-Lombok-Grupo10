package entidades;

import Mediator.ChatMediator;
import Mediator.Usuario;
import iterador.CursoIterator;
import strategy.CalcularNota;

import java.util.ArrayList;
import java.util.List;


//ESTE LO HIZO CON CHATGPT (Mateo , Alee)
public class Alumno extends Usuario {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer legajo;

    private List<Integer> notas = new ArrayList<>();
    private List<Curso> cursosInscriptos = new ArrayList<>();
    private CalcularNota estrategiaCalculoNot;


    public Alumno(ChatMediator mediator, String nombre, String apellido, Integer dni, Integer legajo) {
        super(mediator, nombre); //Patron Mediator
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
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

    // Fin Patron Mediator

    // Patron Iterator y Patron Strategy
    public void inscribirCurso(Curso curso) {
        if (!cursosInscriptos.contains(curso)){
        cursosInscriptos.add(curso);
            System.out.println("Se a inscripto en el curso: " +curso.getNombre());}
    }

    public void agregarNota(Integer nota){
        notas.add(nota);
    }

    public void setEstrategiaCalculoNot(CalcularNota estrategiaCalculoNot) {
        this.estrategiaCalculoNot = estrategiaCalculoNot;
    }
    public double calcularNotaFinal() {
        if (estrategiaCalculoNot == null) throw new IllegalStateException("Estrategia de calculo de nota no establecda");
        return estrategiaCalculoNot.calcularNota(notas);
    }

    public CursoIterator iterator() {
        return new ClCursoIterator(cursosInscriptos);
    }

    public void mostrarDatos() {
        System.out.println("---Alumno---\n");
        System.out.println("Nombre: "+nombre+"Apellido: "+apellido + "Dni: "+dni+"Legajo: "+legajo);
    }

    // implementación del iterador de cursos
    private static class ClCursoIterator implements CursoIterator {
        private List<Curso> cursosInscr;
        private int posicion = 0;

        public ClCursoIterator(List<Curso> cursosInscr) {
            this.cursosInscr = cursosInscr;
        }

        public boolean hasNext() {
            return posicion < cursosInscr.size();
        }

        public Curso next() {
            return cursosInscr.get(posicion++);
        }
    }
    // Fin Patron Iterator - Strategy

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }
    public Integer getLegajo() {
        return legajo;
    }


}


import Chain_of_Responsibility.*;
import Mediator.*;
import entidades.*;
import iterador.*;
import strategy.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //-----PATRON CHAIN OF RESPONSIBILITY -----
        System.out.println("\n--> PROBAMOS PATRON CHAIN OF RESPONSIBILITY:");
        Handler basico = new Asistente();
        Handler intermedio = new Profesor(null, "Profesor de prueba");
        Handler experto = new Coordinador();

        //Determinamos quien es el siguiente en la fila que atenderá a la solicitud.
        basico.setNext(intermedio);
        intermedio.setNext(experto);

        Solicitud solicitud1 = new Solicitud("Problema con un libro.", 1);
        Solicitud solicitud2 = new Solicitud("Problema con un tema de una clase.", 2);
        Solicitud solicitud3 = new Solicitud("Problema con un programa.", 3);
        //Excede el nivel, por lo tanto no se puede atender dicha solicitud.
        Solicitud solicitud4 = new Solicitud("Problema con un libro.", 5);

        basico.handle(solicitud1);
        basico.handle(solicitud2);
        basico.handle(solicitud3);
        basico.handle(solicitud4);

        //-----PATRON COMMAND-----

        //-----PATRON ITERATOR and PATRON STRATEGY-----
        System.out.println("\n--> PROBAMOS PATRON ITERATOR and PATRON STRATEGY:");
        // creacion de alumno e incorporamos notas obtenidas
        Alumno alumno = new Alumno(null,"Juan ","Lopez",123464,3469);
        alumno.mostrarDatos();
        alumno.agregarNota(80);
        alumno.agregarNota(90);
        alumno.agregarNota(70);

        // inscribimos al alumno a cursos
        alumno.inscribirCurso(new Curso("Desarrollo"));
        alumno.inscribirCurso(new Curso("Paradigmas"));
        alumno.inscribirCurso(new Curso("Bases de Datos"));

        // Recorrido de cursos con Iterator
        System.out.println("\nCursos inscritos:");
        CursoIterator iterator = alumno.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next().getNombre());
        }

        // Aplicamos estrategias de calculo de notas -> Promedio simple
        alumno.setEstrategiaCalculoNot(new PromedioSimple());
        System.out.println("Promedio simple: " + alumno.calcularNotaFinal());
        //Aplicamos estrategias de calculo de notas ->  Promedio ponderado
        alumno.setEstrategiaCalculoNot(new PromedioPonderado(Arrays.asList(0.3, 0.4, 0.3)));
        System.out.println("Promedio ponderado: " + alumno.calcularNotaFinal());

        // Aplicamos estrategias de calculo de notas -> Promedio con examen extra
        alumno.setEstrategiaCalculoNot(new ExamenExtra(85));
        System.out.println("Promedio con examen extra: " + alumno.calcularNotaFinal());



        //-----PATRON MEDIATOR-----
        System.out.println("\n--> PROBAMOS PATRON MEDIATOR:");
        ChatMediator sala = new ChatRoom();
        Profesor profesorMediator = new Profesor(sala, "Profesor Pablo");
        Alumno alumnoMediator1 = new Alumno(sala, "Pepe", "Gonzales",11111, 123);
        Alumno alumnoMediator2 = new Alumno(sala,"Rosa", "Lopez", 22222, 456);

        sala.agregarUsuario(profesorMediator);
        sala.agregarUsuario(alumnoMediator1);
        sala.agregarUsuario(alumnoMediator2);

        profesorMediator.enviar("Buen dia chicos.");
        alumnoMediator1.enviar("¡Hola a todos!");
        alumnoMediator2.enviar("Hola Profe y Pepe, ¿cómo han estado?");
        alumnoMediator1.enviar("Bien, ¿y tu Rosa?");
        alumnoMediator2.enviar("Muy bien, gracias.");

        //-----PATRON MEMENTO-----

        //-----PATRON OBSERVER-----

        //-----PATRON STATE-----


        //-----PATRON TEMPLATE METHOD-----

        //-----PATRON VISITOR-----

    }
}
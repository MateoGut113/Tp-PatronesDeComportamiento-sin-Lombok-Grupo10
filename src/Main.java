import Chain_of_Responsibility.*;
import Mediator.*;
import State.Inscripcion;
import Template_Method.ReporteAcademico;
import Template_Method.ReporteAlumno;
import Template_Method.ReporteCurso;
import entidades.*;
import iterador.*;
import strategy.*;
import Observer.*;
import Observer.Curso_o;



import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        //-----PATRON CHAIN OF RESPONSIBILITY -----
//        System.out.println("\n--> PROBAMOS PATRON CHAIN OF RESPONSIBILITY:");
//        Handler basico = new Asistente();
//        Handler intermedio = new Profesor(null, "Profesor de prueba");
//        Handler experto = new Coordinador();
//
//        //Determinamos quien es el siguiente en la fila que atenderá a la solicitud.
//        basico.setNext(intermedio);
//        intermedio.setNext(experto);
//
//        Solicitud solicitud1 = new Solicitud("Problema con un libro.", 1);
//        Solicitud solicitud2 = new Solicitud("Problema con un tema de una clase.", 2);
//        Solicitud solicitud3 = new Solicitud("Problema con un programa.", 3);
//        //Excede el nivel, por lo tanto no se puede atender dicha solicitud.
//        Solicitud solicitud4 = new Solicitud("Problema con un libro.", 5);
//
//        basico.handle(solicitud1);
//        basico.handle(solicitud2);
//        basico.handle(solicitud3);
//        basico.handle(solicitud4);
//
//        //-----PATRON COMMAND-----
//
//        //-----PATRON ITERATOR and PATRON STRATEGY-----
//        System.out.println("\n--> PROBAMOS PATRON ITERATOR and PATRON STRATEGY:");
//        // creacion de alumno e incorporamos notas obtenidas
//        Alumno alumno = new Alumno(null,"Juan ","Lopez",123464,3469);
//        alumno.mostrarDatos();
//        alumno.agregarNota(80);
//        alumno.agregarNota(90);
//        alumno.agregarNota(70);
//
//        // inscribimos al alumno a cursos
//        alumno.inscribirCurso(new Curso("Desarrollo"));
//        alumno.inscribirCurso(new Curso("Paradigmas"));
//        alumno.inscribirCurso(new Curso("Bases de Datos"));
//
//        // Recorrido de cursos con Iterator
//        System.out.println("\nCursos inscritos:");
//        CursoIterator iterator = alumno.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("- " + iterator.next().getNombre());
//        }
//
//        // Aplicamos estrategias de calculo de notas -> Promedio simple
//        alumno.setEstrategiaCalculoNot(new PromedioSimple());
//        System.out.println("Promedio simple: " + alumno.calcularNotaFinal());
//        //Aplicamos estrategias de calculo de notas ->  Promedio ponderado
//        alumno.setEstrategiaCalculoNot(new PromedioPonderado(Arrays.asList(0.3, 0.4, 0.3)));
//        System.out.println("Promedio ponderado: " + alumno.calcularNotaFinal());
//
//        // Aplicamos estrategias de calculo de notas -> Promedio con examen extra
//        alumno.setEstrategiaCalculoNot(new ExamenExtra(85));
//        System.out.println("Promedio con examen extra: " + alumno.calcularNotaFinal());
//
//
//
//        //-----PATRON MEDIATOR-----
//        System.out.println("\n--> PROBAMOS PATRON MEDIATOR:");
//        ChatMediator sala = new ChatRoom();
//        Profesor profesorMediator = new Profesor(sala, "Profesor Pablo");
//        Alumno alumnoMediator1 = new Alumno(sala, "Pepe", "Gonzales",11111, 123);
//        Alumno alumnoMediator2 = new Alumno(sala,"Rosa", "Lopez", 22222, 456);
//
//        sala.agregarUsuario(profesorMediator);
//        sala.agregarUsuario(alumnoMediator1);
//        sala.agregarUsuario(alumnoMediator2);
//
//        profesorMediator.enviar("Buen dia chicos.");
//        alumnoMediator1.enviar("¡Hola a todos!");
//        alumnoMediator2.enviar("Hola Profe y Pepe, ¿cómo han estado?");
//        alumnoMediator1.enviar("Bien, ¿y tu Rosa?");
//        alumnoMediator2.enviar("Muy bien, gracias.");

        //-----PATRON MEMENTO-----

//-----PATRON OBSERVER-----
        System.out.println("\n--> PROBAMOS PATRON OBSERVER:");

// Creamos curso real (entidad)
        entidades.Curso cursoPOO = new entidades.Curso("Programación Orientada a Objetos");

// Creamos Subject (Curso_o) asociado a ese curso
        Observer.Curso_o cursoObservable = new Curso_o(cursoPOO);

// Creamos alumnos de entidades
        entidades.Alumno alumno1Ent = new entidades.Alumno(null, "Mario", "Gomez", 12345, 1001);
        entidades.Alumno alumno2Ent = new entidades.Alumno(null, "Lucas", "Perez", 67890, 1002);

// Creamos observadores que envuelven a los alumnos de entidades
        Observer.Alumno obs1 = new Observer.Alumno(alumno1Ent);
        Observer.Alumno obs2 = new Observer.Alumno(alumno2Ent);

// Suscribimos los observadores (no los alumnos de entidades directamente)
        cursoObservable.agregarObservador(obs1);
        cursoObservable.agregarObservador(obs2);


// Disparamos notificaciones
        cursoObservable.notificar("Se cambió el horario a las 10:00 AM.");
        cursoObservable.notificar("Nuevo aviso: examen parcial la próxima semana.");



        //-----PATRON STATE-----

        Inscripcion ins = new Inscripcion();

        System.out.println("ESTADO ACTUAL");
        ins.cambiarEstado();//estado actual de la inscripcion
        System.out.println("CAMBIO ESTADO");
        ins.cambiarEstado();
        System.out.println("CAMBIO ESTADO");
        ins.cambiarEstado();

        


        //-----PATRON TEMPLATE METHOD-----

            ReporteAcademico rAlumno= new ReporteAlumno();
            ReporteAcademico rCurso = new ReporteCurso();

        System.out.println("\nHaciendo reporte para Alumno");
        rAlumno.generarReporte();

        System.out.println("\nHaciendo reporte de Curso");
        rCurso.generarReporte();

            //-----PATRON VISITOR-----

    }
}
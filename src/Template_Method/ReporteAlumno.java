package Template_Method;

public class ReporteAlumno extends ReporteAcademico{

    @Override
    protected void escribirContenido() {
        System.out.println("Escribiendo contenido para reporte de desempeño del  Alumno");
    }
}

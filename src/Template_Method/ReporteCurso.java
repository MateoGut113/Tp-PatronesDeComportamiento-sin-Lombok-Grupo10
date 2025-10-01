package Template_Method;

public class ReporteCurso extends ReporteAcademico{

    @Override
    protected void escribirContenido() {
        System.out.println("Escribiendo contenido para reporte de desempeño del Curso");
    }
}

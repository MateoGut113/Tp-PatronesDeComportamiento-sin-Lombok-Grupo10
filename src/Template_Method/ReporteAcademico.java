package Template_Method;

public abstract class ReporteAcademico {

    public final void generarReporte(){
        armarEncabezado();
        escribirContenido();
        escribirPie();

    }

    protected void  armarEncabezado(){
        System.out.println("Escribiendo encabezado");

    }
    protected void escribirContenido(){
    }

    protected void escribirPie(){
        System.out.println("Escribiendo pie");
    }




}

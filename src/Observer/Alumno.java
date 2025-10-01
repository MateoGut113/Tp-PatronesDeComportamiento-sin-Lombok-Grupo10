package Observer;

public class Alumno implements Observer {
    private entidades.Alumno alumno; // referencia al Alumno de entidades

    public Alumno(entidades.Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public void update(String mensaje) {
        System.out.println("Notificación para el alumno "
                + alumno.getNombre() + " " + alumno.getApellido()
                + " (DNI: " + alumno.getDni() + ", Legajo: " + alumno.getLegajo() + "): "
                + mensaje);
    }

    public entidades.Alumno getAlumno() {
        return alumno;
    }
}

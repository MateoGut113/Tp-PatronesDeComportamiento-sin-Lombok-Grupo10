package Memento;

public class Historial {
    private final java.util.Stack<Memento> historial = new java.util.Stack<>();

    public void guardar(Memento m) {
        this.historial.push(m);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}


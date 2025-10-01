package strategy;

import java.util.List;

public class PromedioPonderado implements CalcularNota {
    private List<Double> pesos;

    public PromedioPonderado(List<Double> pesos) {
        this.pesos = pesos;
    }


    @Override
    public double calcularNota(List<Integer> notas) {
        if (notas == null || notas.isEmpty()) return 0;
        if (pesos == null || notas.size() != pesos.size()) {
            throw new IllegalArgumentException("Notas y pesos deben tener el mismo tamaño");
        }

        double total= 0;
        int i=0;
        while (i < notas.size()) {
            total += notas.get(i) *pesos.get(i);
            i++;
        }
        return total;
    }
}
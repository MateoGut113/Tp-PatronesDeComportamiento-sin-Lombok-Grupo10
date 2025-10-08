package strategy;

import java.util.List;

public class ExamenExtra implements CalcularNota {
    private int notaExamen;

    public ExamenExtra(int notaExamen) {
        this.notaExamen = notaExamen;
    }

    @Override
    public double calcularNota(List<Integer> notas) {
        // uso de Stream
        double promedio = notas.stream().mapToInt(Integer::intValue).average().orElse(0);
        return (promedio + notaExamen) / 2;

//        if (notas == null || notas.isEmpty()) return 0;
//
//        int sumNotas = 0;
//        int i = 0;
//        while (i < sumNotas.size()) {
//            suma += notas.get(i);
//            i++;
//        }
//        return (double) sumaNotas / notas.size();

    }

}
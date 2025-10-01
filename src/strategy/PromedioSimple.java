package strategy;

import java.util.List;

public class PromedioSimple implements CalcularNota{

    @Override
        public double calcularNota(List<Integer> notas) {
        if (notas == null || notas.isEmpty()) return 0;

        int sumaNotas = 0;
        int i = 0;

        while (i < notas.size()) {
            sumaNotas += notas.get(i);
            i++;
        }
        return (double) sumaNotas / notas.size();
        }
    }

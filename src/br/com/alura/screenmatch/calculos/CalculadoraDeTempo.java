package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public void adiciona(Titulo t)
    {
        tempoTotal += t.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}

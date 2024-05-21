package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int totalVisualizacoes;
    private Serie serie;
    private int numero;

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    public void setNumero(int i)
    {
        this.numero = i;
    }
}

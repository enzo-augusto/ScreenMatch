package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel
{
    private String diretor;

    public Filme(String nome, int ano) {
        super(nome, ano);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

        public int getClassificacao() {
            return (int) pegaMedia() / 2;
        }

    @Override
    public String toString() {
        return this.getNome() + " " + this.getAnoDeLancamento();
    }
}

package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>
{

    String nome;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes = 0;
    private int totalDeAvaliacoes = 0;
    private int duracaoEmMinutos;
    @SerializedName("Year")
    private int anoDeLancamento;

    public Titulo (String nome, int ano)
    {
        this.nome = nome;
        this.anoDeLancamento = ano;
    }

    public Titulo(TituloOMDB tituloOMDB)
    {
        this.nome = tituloOMDB.title();
        this.anoDeLancamento = Integer.valueOf(tituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOMDB.runtime().substring(0,2));

    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void exibeFichaTecnica()
    {
        System.out.printf("""
                Nome: %s
                Ano de lançamento: %d
                %n""", nome, anoDeLancamento);
    }

    public void avalia(int avaliacao)
    {
        somaDasAvaliacoes += avaliacao;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia()
    {
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return
                "nome= " + nome + '\n' +
                "data= " + getAnoDeLancamento() + '\n' +
                "duracao= "+ this.duracaoEmMinutos;
    }
}

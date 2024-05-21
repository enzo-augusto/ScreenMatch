import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal
{
    public static void main(String[] args)
    {
        Filme meuFilme = new Filme("Enzo", 1998);
        meuFilme.setDuracaoEmMinutos(200000);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        System.out.println(meuFilme.pegaMedia());

        Serie friends = new Serie("Friends", 1990);

        friends.setTemporadas(10);
        friends.setEpisodiosPorTemporada(20);
        friends.setMinutosPorEpisodio(25);

        System.out.println(friends.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.adiciona(friends);
        calculadora.adiciona(meuFilme);

        System.out.println(calculadora.getTempoTotal());

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(friends);
        primeiro.setTotalVisualizacoes(50);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);
        filtro.filtrar(primeiro);

        Filme filme = new Filme("Jaws", 1980);

        ArrayList <Titulo> lista = new ArrayList<>();

        lista.add(meuFilme);
        lista.add(filme);
        lista.add(friends);

        System.out.println(lista);

    }
}
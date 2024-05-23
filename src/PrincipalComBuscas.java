import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuscas
{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o filme do qual quer informacoes");
        String nome = leitura.nextLine();
        // Substituir espaços por "+"
        String nomeDoFilmeFormatado = nome.replace(" ", "+");

        String chave = "yourKeyHere";
        String endereco = "https://www.omdbapi.com/?t=" + nomeDoFilmeFormatado + "&apikey=" +chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOMDB meuTituloOMDB = gson.fromJson(response.body(), TituloOMDB.class);
        Titulo meuTitulo = new Titulo(meuTituloOMDB);
        System.out.println(response.body());
        System.out.println(meuTitulo);

    }
}

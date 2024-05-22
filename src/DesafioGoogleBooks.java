import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class DesafioGoogleBooks
{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner busca = new Scanner(System.in);
        System.out.println("Digite o nome do Livro");
        String nomeDoLivro = busca.nextLine();
        String nomeDoLivroFormatado = nomeDoLivro.replace(" ", "+");

        String chave = "yourAPIKeyHere";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" +nomeDoLivroFormatado+ "&" + chave + "=yourAPIKey";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


    }
}

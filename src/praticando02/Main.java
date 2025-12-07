package praticando02;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        System.out.print("Digite o titulo do filme: ");
        String tituloFilme = scanner.nextLine();

        System.out.print("Digite o ano de lançamento do filme: ");
        int anoLancamento = scanner.nextInt();

        System.out.print("Digite a duração em minutos do filme: ");
        int duracaoEmMinutos = scanner.nextInt();

        Titulo filme = new Titulo(tituloFilme, anoLancamento, duracaoEmMinutos);

        String json = gson.toJson(filme);
        System.out.println("Filme serializado para JSON: " + json);

    }
}

package praticando03;

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

        System.out.print("Nome veiculo: ");
        String nomeVeiculo = scanner.nextLine();

        System.out.print("Marca veiculo: ");
        scanner.next();
        String marcaVeiculo = scanner.nextLine();

        System.out.print("Ano modelo: ");
        int anoModelo = scanner.nextInt();

        Veiculo veiculo = new Veiculo(nomeVeiculo, marcaVeiculo, anoModelo);

        String json = gson.toJson(veiculo);

        System.out.println("Json: " + json);

    }
}

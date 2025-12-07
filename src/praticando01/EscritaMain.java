package praticando01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        System.out.print("Digite um texto para gravar em um arquivo: ");
        String textoParaGravacao = scanner.nextLine();

        try {
            FileWriter escrita = new FileWriter(nomeArquivo + ".txt");
            escrita.write(textoParaGravacao);
            escrita.close();

            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}

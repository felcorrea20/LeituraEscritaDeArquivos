package praticando01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o arquivo para leitura: ");
        String nomeArquivo = scanner.next();

        scanner.close();

        try {
            File arquivoParaLeitura = new File(nomeArquivo + ".txt");
            Scanner leitura = new Scanner(arquivoParaLeitura);

            while (leitura.hasNextLine()) {
                System.out.println(leitura.nextLine());
            }

            leitura.close();

        } catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }

    }

}

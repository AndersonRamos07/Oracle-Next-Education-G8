import actions.RequireAPI;
import basis.DotEnv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
            System.out.println("Qual e a moeda que gostaria de converter?");
            String moeda = console.nextLine();
            System.out.println("E para qual moeda converter?");
            String moedaConvertida = console.nextLine();
            System.out.println("Digite o valor a ser convertido:");
            double valor = console.nextDouble();
        console.close();

        DotEnv intro = new DotEnv();
        intro.getIntro();
        RequireAPI requireApi = new RequireAPI();
        requireApi.toRequire(moeda, moedaConvertida, valor);
    }
}
import challenge.conversor.api.Interacting;
import challenge.conversor.ui.Menu;
import static challenge.conversor.service.Functions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option = -1;
        String[] moedas = new String[2];
        //double value = 0;

        Scanner terminal = new Scanner(System.in);
        Menu menu = new Menu();
        menu.showIntro();
        moedas = (String[]) toSelectConversion(terminal);
        //option = (int) toInput("int", terminal);

        //toOutput("Qual e o valor para conversao?", "");
        double value = (double) toInput("double", terminal);

        Interacting api = new Interacting();
        api.toRequire(moedas[0],moedas[1],value);

    }
}

/*
//            System.out.println("Qual e a moeda que gostaria de converter?");
//            String moeda = console.nextLine();
//            System.out.println("E para qual moeda converter?");
//            String moedaConvertida = console.nextLine();
//            System.out.println("Digite o valor a ser convertido:");
//            double valor = console.nextDouble();

//        DotEnv intro = new DotEnv();
//        intro.getIntro();
//        RequireAPI requireApi = new RequireAPI();
//        requireApi.toRequire(moeda, moedaConvertida, valor);
*/
import challenge.conversor.api.Interacting;
import challenge.conversor.ui.Menu;
import static challenge.conversor.service.Functions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> coins = new ArrayList<>();
        Object novo = null;
        int response = 0;

        Scanner terminal = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.showIntro();
            novo = toSelectOption(terminal);
            if (novo != null) {
                coins = (ArrayList<String>) novo;
                double value = Double.parseDouble(coins.get(2));

                Interacting api = new Interacting();
                api.toRequire(coins.get(0), coins.get(1), value);
                toOutput("\nGostaria de realizar mais uma conversao?", "");
                toOutput("-> 1) Para SIM/YES, -> 2) Para NAO/NO:", "");
                response = terminal.nextInt();
                terminal.nextLine();
            }
        }while(response != 2);
        sair();
    }
}

/*
        //double value = 0;
        //option = (int) toInput("int", terminal);
        //toOutput("Qual e o valor para conversao?", "");
                //double value = (double) toInput("double", terminal);

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
import challenge.conversor.api.Interacting;
import challenge.conversor.service.Conversor;
import challenge.conversor.ui.Menu;

import static deprecated.actions.Functions.*;
//import deprecated.actions.RequireAPI;
//import deprecated.basis.DotEnv;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.showIntro();
        Conversor conversor = new Conversor();
        int option = toChoose();
        double value = setValue();
        Interacting api = new Interacting();
        api.toRequire("USD","BRL",value);

    }
}

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
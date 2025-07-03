import challenge.conversor.api.Interacting;
import challenge.conversor.ui.Menu;
import static challenge.conversor.service.Functions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> coins = new ArrayList<>();
        Object novo = null;
        int mainResponse = -1;

        Scanner terminal = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.showIntro();
            novo = toSelectOption(terminal);
            if (novo != null && novo instanceof ArrayList<?>) {
                coins = (ArrayList<String>) novo;
                double value = Double.parseDouble(coins.get(2));

                Interacting api = new Interacting();
                api.toRequire(coins.get(0), coins.get(1), value);

                if(coins.size() == 4) {
                    mainResponse = oneMoreConverter(terminal, coins.get(3));
                } else {
                    mainResponse = oneMoreConverter(terminal, "");
                }
            }
            if(novo instanceof Integer) { mainResponse = 0;}
        }while(mainResponse != 2 && mainResponse != 0);
        sair();
    }
}
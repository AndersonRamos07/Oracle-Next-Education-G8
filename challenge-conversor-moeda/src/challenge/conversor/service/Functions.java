package challenge.conversor.service;

import challenge.conversor.api.Interacting;
import challenge.conversor.ui.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Functions {

//    public static Object toInput(String pTipo, Scanner pTerminal)
/*    {
        Object response = 0;

        if (pTipo.equals("int")) {
            response = pTerminal.nextInt();
            pTerminal.nextLine();
        } else if (pTipo.equals("double")) {
            response = pTerminal.nextDouble();
            pTerminal.nextLine();
        } else {
            System.out.println("Insira um valor valido!");
        }
        return response;
    }
*/
    public static void toOutput(String pTexto, String pModo) {
        if ((pModo.equals("mesma linha"))) {
            System.out.print(pTexto);
        } else {
            System.out.println(pTexto);
        }
    }

    public static Object toSelectOption(Scanner pTerminal) {
        int choosen = pTerminal.nextInt();
        pTerminal.nextLine();

        String[] coins = {};
        ArrayList<String> response = null;

        switch (choosen) {
            case 1 -> coins = new String[]{"BRL", "USD"};
            case 2 -> coins = new String[]{"COP", "ARS"};
            case 3 -> coins = new String[]{"CLP", "MXN"};
            case 4 -> coins = new String[]{"PEN", "GTQ"};
            case 5 -> coins = new String[]{"HNL", "PAB"};
            case 6 -> coins = new String[]{"CRC", "DOP"};
            case 7 -> showList(pTerminal);
            case 8 -> customConvert(pTerminal);
            case 9 -> System.out.println("Registros (logs)");
            case 0 -> choosen = sair();
        }

        if (choosen > 0 && choosen < 7) {

            System.out.println("Digite o valor a ser convertido:");
            double valor = pTerminal.nextDouble();
            pTerminal.nextLine();

            response = new ArrayList<String>(Arrays.asList(coins));
            response.add(Double.toString(valor));
        };
        return response;
    }

    private static void showList(Scanner pTerminalList) { //7
        Menu menu = new Menu();
        menu.showListCountries(0);
        int page = pTerminalList.nextInt();
        pTerminalList.nextLine();
        menu.showListCountries(page);
        pTerminalList.nextLine();
        //menu.showListCountries(0);
    }
    private static void customConvert(Scanner pTerminalCustom) { //8
        String coinToConverter;
        String coinConverted;
        double valueToConverter;
        toOutput("Qual moeda a ser convertida? (ex: BRL)", "");
        coinToConverter = pTerminalCustom.nextLine();
        toOutput("Para qual moeda gostaria de converter? (ex: USD)", "");
        coinConverted = pTerminalCustom.nextLine();
        toOutput("Agora insira o valor a ser convertido: (ex: 70.00)", "");
        valueToConverter = pTerminalCustom.nextDouble();
        pTerminalCustom.nextLine();
        Interacting api = new Interacting();
        api.toRequire(coinToConverter,coinConverted,valueToConverter);
    }
    private static int toListLogs() { //9
        return -1;
    }
    private static int sair() { //0
        return -1;
    }
}
    /*
    [BRL(R$)  ->  USD(US$)]:  Real Brasileiro         >>>      Dolar Americano;       ░░
  -> 2) [COP($)   ->  ARS($)]:    Peso Colombiano         >>>      Peso Argentino;        ░░
  -> 3) [CLP(CLP$)->  MXN(MEX$)]: Peso Chileno            >>>      Peso Mexicano;         ░░
  -> 4) [PEN(S/)  ->  GTQ(Q)]:    Novo Sol Peruano        >>>      Quetzal Guatemalteco;  ░░
  -> 5) [HNL(L)   ->  PAB(B/.)]:  Lempira Hondurenha      >>>      Balboa Panamenho;      ░░
 -> 6) [CRC(₡)   ->  DOP(RD$)]:  Colón Costarriquenho    >>>      Peso Dominicano;
     */

/*
//        -> 1) [BRL -> USD]: Real Brasileiro ( R$ ) para Dolar Americano ( U$ );
//        -> 2) [USD -> ARS]: Dolar Americano ( U$ ) para Peso Colombiano ( COL$ );
//        -> 3) [CLP -> MXN]: Peso Chileno ( CLP$ ) para Peso Mexicano ( MEX$ );
//        -> 4) [PEN -> GTQ]: Novo Sol Peruano ( S/ ) para Quetzal Guatemalteco ( Q );
//        -> 5) [HNL -> PAB]: Lempira Hondurenha ( L ) para Balboa Panamenho ( B/. );
//        -> 6) [CRC -> ]: Colón Costarriquenho ( ₡ ) para Peso Dominicano ( RD$ );
//        -> 7) Verificar lista de moedas;
//        -> 8) Conversão personalizada;
//        -> 9) Sair;

/*
public static int toChoose()
{
    int choose = 0;
    Scanner scan = new Scanner(System.in);
    try {
        choose = scan.nextInt();
        scan.nextLine();
        System.out.print(choose);
    } catch(Exception except)
    {
        System.out.println("Deu ruim aqui nesse de antes!");
    } finally
    {
        scan.close();
    }
    return choose;
}
public static double setValue()
{
    double value = 0;
    Scanner scanValue = new Scanner(System.in);
    System.out.println("Qual valor quer converter?");
    try {
        value = scanValue.nextDouble();
        scanValue.nextLine();
        System.out.println(value);
    } catch (Exception except)
    {
        System.out.println(">>> Deu ruim aqui! <<< ( '_')");
    } finally {
        scanValue.close();
    }
    return value;
}
*/
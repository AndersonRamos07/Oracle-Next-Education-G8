package deprecated.actions;

import java.util.Scanner;

public class Functions {

    public void toSelectConversion ()
    {
        Scanner console = new Scanner(System.in);
            int choosen = console.nextInt();
            System.out.println("Digite o valor a ser convertido:");
            double valor = console.nextDouble();

        Conversor novaConversao = new Conversor();

        switch(choosen)
        {
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            case 4 -> System.out.println();
            case 5 -> System.out.println();
            case 6 -> System.out.println();
            case 7 -> System.out.println();
            case 8 -> System.out.println();
            case 9 -> System.out.println();
        }
        console.close();
    }
}
//        -> 1) [BRL -> USD]: Real Brasileiro ( R$ ) para Dolar Americano ( U$ );
//        -> 2) [USD -> ARS]: Dolar Americano ( U$ ) para Peso Colombiano ( COL$ );
//        -> 3) [CLP -> MXN]: Peso Chileno ( CLP$ ) para Peso Mexicano ( MEX$ );
//        -> 4) [PEN -> GTQ]: Novo Sol Peruano ( S/ ) para Quetzal Guatemalteco ( Q );
//        -> 5) [HNL -> PAB]: Lempira Hondurenha ( L ) para Balboa Panamenho ( B/. );
//        -> 6) [CRC -> ]: Colón Costarriquenho ( ₡ ) para Peso Dominicano ( RD$ );
//        -> 7) Verificar lista de moedas;
//        -> 8) Conversão personalizada;
//        -> 9) Sair;
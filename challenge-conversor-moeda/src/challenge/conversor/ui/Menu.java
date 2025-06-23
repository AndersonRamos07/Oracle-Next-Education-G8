package challenge.conversor.ui;

public class Menu {
    public String intro =
            """
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                  BEM VIND@ AO...                                                           Qual conversão deseja fazer?                                ░░
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░                                                                                          ░░
            ░░░░░░░░░░░░░░░░░░░░░▒▒███░░░░░░░░░░░░░ORACLE ONE░  -> 1) [BRL(R$)  ->  USD(US$)]:  Real Brasileiro         >>>      Dolar Americano;       ░░
            ░░░░C░░░░░░░░░▒▒████████████████░░░░░░░░+░ALURA░░░  -> 2) [COP($)   ->  ARS($)]:    Peso Colombiano         >>>      Peso Argentino;        ░░
            ░░░░O░░D░░░░░▒▒████░░▒▒███░░░▒▒████░░░░░░░░░░░░░░░  -> 3) [CLP(CLP$)->  MXN(MEX$)]: Peso Chileno            >>>      Peso Mexicano;         ░░
            ░░░░N░░E░░░░▒▒████░░░▒▒███░░░░░░░░░░░░░░░░░░░░░░░░  -> 4) [PEN(S/)  ->  GTQ(Q)]:    Novo Sol Peruano        >>>      Quetzal Guatemalteco;  ░░
            ░░░░V░░░░░░░░▒▒████░░▒▒███░░░░░░░░░░░░░░░░░░░░░░░░  -> 5) [HNL(L)   ->  PAB(B/.)]:  Lempira Hondurenha      >>>      Balboa Panamenho;      ░░
            ░░░░E░░M░░░░░░░▒▒████████████████░░░░░░░░░░░░░░░░░  -> 6) [CRC(₡)   ->  DOP(RD$)]:  Colón Costarriquenho    >>>      Peso Dominicano;       ░░
            ░░░░R░░O░░░░░░░░░░░░░▒▒███░░░▒▒████░░░░░░░░░░░░░░░  -> 7) Verificar lista de moedas *extra*;                                                ░░
            ░░░░S░░E░░░░░░░░░░░░░▒▒███░░░░▒▒████░░░░░░░░░░░░░░  -> 8) Conversão personalizada   *extra*;                                                ░░
            ░░░░O░░D░░░░▒▒████░░░▒▒███░░░▒▒████░░░░░░░░░░░░░░░  -> 9) Registro de conversoes    *extra*;                                                ░░
            ░░░░R░░A░░░░░░▒▒████████████████░░░░░░░░░░░░░░░░░░  -> 0) Sair;                                                                             ░░
            ░░░░░░░░░░░░░░░░░░░░░▒▒███░░░░░░░░░░░░░░░░░░░░░░░░                                                                                          ░░
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░BY░ANDERSON░SILVA░░ - Selecione uma opção válida (de 1 a 9) ou 0 para sair:  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
            >>>""";

    public void showIntro ()
    {
        System.out.print(intro);
    }
}

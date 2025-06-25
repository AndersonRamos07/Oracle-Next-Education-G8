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

    public void showIntro () {
        System.out.print(intro);
    }

    public String listCountriesP1 = """
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░Currency Code░░░▓░░░░░░░░░░░Currency Name░░░░░░░░░░░▓░░░░░░░░░Country░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓        AED        ▓            UAE Dirham	            ▓  United Arab Emirates   ▓
            ▓        AFN        ▓           Afghan Afghani	        ▓      Afghanistan        ▓
            ▓        ALL        ▓            Albanian Lek	        ▓        Albania          ▓
            ▓        AMD        ▓	        Armenian Dram       	▓        Armenia          ▓
            ▓        ANG        ▓   Netherlands Antillian Guilder	▓  Netherlands Antilles   ▓
            ▓        AOA        ▓        	Angolan Kwanza	        ▓        Angola           ▓
            ▓        ARS        ▓        	Argentine Peso	        ▓       Argentina         ▓
            ▓        AUD        ▓           Australian Dollar	    ▓       Australia         ▓
            ▓        AWG        ▓            Aruban Florin	        ▓        Aruba            ▓
            ▓        AZN        ▓           Azerbaijani Manat	    ▓       Azerbaijan        ▓
            ▓        BAM        ▓     Bosnia and Herzegovina Mark	▓ Bosnia and Herzegovina  ▓
            ▓        BBD        ▓        	Barbados Dollar         ▓   	Barbados          ▓
            ▓        BDT        ▓        	Bangladeshi Taka	    ▓       Bangladesh        ▓
            ▓        BGN        ▓        	Bulgarian Lev	        ▓       Bulgaria          ▓
            ▓        BHD        ▓        	Bahraini Dinar	        ▓       Bahrain           ▓
            ▓        BIF        ▓           Burundian Franc	        ▓       Burundi           ▓
            ▓        BMD        ▓           Bermudian Dollar	    ▓       Bermuda           ▓
            ▓        BND        ▓           Brunei Dollar	        ▓       Brunei            ▓
            ▓        BOB        ▓           Bolivian Boliviano	    ▓       Bolivia           ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░░░░░░░░░░░░░░░░░▓░░░░░░░░ -> 0) Para voltar;░<<░░░░░▓░░░░░ -> 2) Pagina 2;░>>░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            >>>""";

    public String listCountriesP2 = """
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░Currency Code░░░▓░░░░░░░░░░░Currency Name░░░░░░░░░░░▓░░░░░░░░░Country░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓      * BRL *      ▓         * Brazilian Real *	    ▓     * Brazil *          ▓
            ▓        BSD        ▓           Bahamian Dollar	        ▓       Bahamas           ▓
            ▓        BTN        ▓           Bhutanese Ngultrum	    ▓       Bhutan            ▓
            ▓        BWP        ▓           Botswana Pula	        ▓       Botswana          ▓
            ▓        BYN        ▓           Belarusian Ruble	    ▓       Belarus           ▓
            ▓        BZD        ▓           Belize Dollar	        ▓       Belize            ▓
            ▓        CAD        ▓           Canadian Dollar	        ▓       Canada            ▓
            ▓        CDF        ▓           Congolese Franc	        ▓    Democratic Republic  ▓
            ▓                   ▓                                   ▓        of the Congo     ▓
            ▓        CHF        ▓           Swiss Franc	            ▓       Switzerland       ▓
            ▓        CLP        ▓       	Chilean Peso	        ▓       Chile             ▓
            ▓        CNY        ▓           Chinese Renminbi	    ▓       China             ▓
            ▓        COP        ▓           Colombian Peso	        ▓       Colombia          ▓
            ▓        CRC        ▓           Costa Rican Colon	    ▓       Costa Rica        ▓
            ▓        CUP        ▓           Cuban Peso	            ▓       Cuba              ▓
            ▓        CVE        ▓           Cape Verdean Escudo	    ▓       Cape Verde        ▓
            ▓        CZK        ▓           Czech Koruna	        ▓       Czech Republic    ▓
            ▓        DJF        ▓           Djiboutian Franc	    ▓       Djibouti          ▓
            ▓        DKK        ▓           Danish Krone	        ▓       Denmark           ▓
            ▓        DOP        ▓           Dominican Peso	        ▓    Dominican Republic   ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓<░ -> 1) Pagina 1;░▓░░░░░░░░ -> 0) Para voltar;░<<░░░░░▓░░░░░ -> 3) Pagina 3;░>>░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            >>>""";
    public String listCountriesP3 = """
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░Currency Code░░░▓░░░░░░░░░░░Currency Name░░░░░░░░░░░▓░░░░░░░░░Country░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓        DZD        ▓           Algerian Dinar	        ▓        Algeria          ▓
            ▓        EGP        ▓           Egyptian Pound	        ▓         Egypt           ▓
            ▓        ERN        ▓           Eritrean Nakfa	        ▓        Eritrea          ▓
            ▓        ETB        ▓           Ethiopian Birr	        ▓        Ethiopia         ▓
            ▓        EUR        ▓           	Euro	            ▓     European Union      ▓
            ▓        FJD        ▓            Fiji Dollar	        ▓         Fiji            ▓
            ▓        FKP        ▓        Falkland Islands Pound	    ▓    Falkland Islands     ▓
            ▓        FOK        ▓           Faroese Króna	        ▓     Faroe Islands       ▓
            ▓        GBP        ▓           Pound Sterling	        ▓     United Kingdom      ▓
            ▓        GEL        ▓           Georgian Lari	        ▓        Georgia          ▓
            ▓        GGP        ▓           Guernsey Pound	        ▓        Guernsey         ▓
            ▓        GHS        ▓           Ghanaian Cedi	        ▓         Ghana           ▓
            ▓        GIP        ▓          Gibraltar Pound	        ▓        Gibraltar        ▓
            ▓        GMD        ▓           Gambian Dalasi	        ▓       The Gambia        ▓
            ▓        GNF        ▓           Guinean Franc	        ▓         Guinea          ▓
            ▓        GTQ        ▓         Guatemalan Quetzal	    ▓        Guatemala        ▓
            ▓        GYD        ▓          Guyanese Dollar	        ▓         Guyana          ▓
            ▓        HKD        ▓          Hong Kong Dollar	        ▓        Hong Kong        ▓
            ▓        HNL        ▓           Honduran Lempira	    ▓        Honduras         ▓
            ▓        HRK        ▓           Croatian Kuna	        ▓        Croatia          ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓<░ -> 2) Pagina 2;░▓░░░░░░░░ -> 0) Para voltar;░<<░░░░░▓░░░░░ -> 4) Pagina 4;░>>░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            >>>""";
    public String listCountriesP4 = """
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░Currency Code░░░▓░░░░░░░░░░░Currency Name░░░░░░░░░░░▓░░░░░░░░░Country░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓        HTG        ▓          Haitian Gourde	        ▓         Haiti           ▓
            ▓        HUF        ▓          Hungarian Forint	        ▓        Hungary          ▓
            ▓        IDR        ▓          Indonesian Rupiah	    ▓       Indonesia         ▓
            ▓        ILS        ▓          Israeli New Shekel	    ▓        Israel           ▓
            ▓        IMP        ▓             Manx Pound	        ▓      Isle of Man        ▓
            ▓        INR        ▓            Indian Rupee	        ▓        India            ▓
            ▓        IQD        ▓             Iraqi Dinar	        ▓         Iraq            ▓
            ▓        IRR        ▓            Iranian Rial	        ▓         Iran            ▓
            ▓        ISK        ▓           Icelandic Króna	        ▓        Iceland          ▓
            ▓        JEP        ▓            Jersey Pound	        ▓        Jersey           ▓
            ▓        JMD        ▓           Jamaican Dollar	        ▓       Jamaica           ▓
            ▓        JOD        ▓           Jordanian Dinar	        ▓        Jordan           ▓
            ▓        JPY        ▓             Japanese Yen	        ▓        Japan            ▓
            ▓        KES        ▓           Kenyan Shilling	        ▓        Kenya            ▓
            ▓        KGS        ▓           Kyrgyzstani Som	        ▓      Kyrgyzstan         ▓
            ▓        KHR        ▓           Cambodian Riel	        ▓       Cambodia          ▓
            ▓        KID        ▓           Kiribati Dollar	        ▓       Kiribati          ▓
            ▓        KMF        ▓           Comorian Franc	        ▓       Comoros           ▓
            ▓        KRW        ▓           South Korean Won	    ▓     South Korea         ▓
            ▓        KWD        ▓           Kuwaiti Dinar	        ▓        Kuwait           ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓<░ -> 3) Pagina 3;░▓░░░░░░░░ -> 0) Para voltar;░<<░░░░░▓░░░░░ -> 5) Pagina 5;░>>░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            >>>""";
    public String listCountriesP5 = """
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░Currency Code░░░▓░░░░░░░░░░░Currency Name░░░░░░░░░░░▓░░░░░░░░░Country░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓        KYD        ▓       Cayman Islands Dollar	    ▓    Cayman Islands       ▓
            ▓        KZT        ▓           Kazakhstani Tenge	    ▓        Kazakhstan       ▓
            ▓        LAK        ▓               Lao Kip	            ▓         Laos            ▓
            ▓        LBP        ▓           Lebanese Pound	        ▓        Lebanon          ▓
            ▓        LKR        ▓           Sri Lanka Rupee	        ▓       Sri Lanka         ▓
            ▓        LRD        ▓           Liberian Dollar	        ▓        Liberia          ▓
            ▓        LSL        ▓             Lesotho Loti	        ▓        Lesotho          ▓
            ▓        LYD        ▓             Libyan Dinar	        ▓         Libya           ▓
            ▓        MAD        ▓           Moroccan Dirham	        ▓        Morocco          ▓
            ▓        MDL        ▓            Moldovan Leu	        ▓        Moldova          ▓
            ▓        MGA        ▓           Malagasy Ariary	        ▓       Madagascar        ▓
            ▓        MKD        ▓           Macedonian Denar	    ▓     North Macedonia     ▓
            ▓        MMK        ▓             Burmese Kyat	        ▓        Myanmar          ▓
            ▓        MNT        ▓           Mongolian Tögrög	    ▓       Mongolia          ▓
            ▓        MOP        ▓           Macanese Pataca	        ▓        Macau            ▓
            ▓        MRU        ▓         Mauritanian Ouguiya	    ▓      Mauritania         ▓
            ▓        MUR        ▓           Mauritian Rupee	        ▓       Mauritius         ▓
            ▓        MVR        ▓           Maldivian Rufiyaa	    ▓        Maldives         ▓
            ▓        MWK        ▓           Malawian Kwacha	        ▓        Malawi           ▓
            ▓        MXN        ▓             Mexican Peso	        ▓        Mexico           ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓<░ -> 4) Pagina 4;░▓░░░░░░░░ -> 0) Para voltar;░<<░░░░░▓░░░░░ -> 6) Pagina 6;░>>░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            >>>""";
    public String listCountriesP6 = """
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░Currency Code░░░▓░░░░░░░░░░░Currency Name░░░░░░░░░░░▓░░░░░░░░░Country░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓        MYR        ▓           Malaysian Ringgit	    ▓       Malaysia          ▓
            ▓        MZN        ▓           Mozambican Metical	    ▓      Mozambique         ▓
            ▓        NAD        ▓           Namibian Dollar 	    ▓       Namibia           ▓
            ▓        NGN        ▓           Nigerian Naira	        ▓       Nigeria           ▓
            ▓        NIO        ▓          Nicaraguan Córdoba	    ▓      Nicaragua          ▓
            ▓        NOK        ▓            Norwegian Krone	    ▓            Norway       ▓
            ▓        NPR        ▓            Nepalese Rupee	        ▓        Nepal            ▓
            ▓        NZD        ▓           New Zealand Dollar	    ▓    New Zealand          ▓
            ▓        OMR        ▓               Omani Rial	        ▓        Oman             ▓
            ▓        PAB        ▓           Panamanian Balboa	    ▓       Panama            ▓
            ▓        PEN        ▓              Peruvian Sol	        ▓        Peru             ▓
            ▓        PGK        ▓        Papua New Guinean Kina	    ▓  Papua New Guinea       ▓
            ▓        PHP        ▓            Philippine Peso	    ▓        Philippines      ▓
            ▓        PKR        ▓            Pakistani Rupee	    ▓           Pakistan      ▓
            ▓        PLN        ▓              Polish Złoty	        ▓        Poland           ▓
            ▓        PYG        ▓           Paraguayan Guaraní	    ▓       Paraguay          ▓
            ▓        QAR        ▓              Qatari Riyal	        ▓        Qatar            ▓
            ▓        RON        ▓              Romanian Leu	        ▓       Romania           ▓
            ▓        RSD        ▓              Serbian Dinar	    ▓            Serbia       ▓
            ▓        RUB        ▓              Russian Ruble	    ▓            Russia       ▓
            ▓        RWF        ▓              Rwandan Franc	    ▓            Rwanda       ▓
            ▓        SAR        ▓               Saudi Riyal	        ▓     Saudi Arabia        ▓
            ▓        SBD        ▓          Solomon Islands Dollar	▓    Solomon Islands      ▓
            ▓        SCR        ▓            Seychellois Rupee	    ▓      Seychelles         ▓
            ▓        SDG        ▓              Sudanese Pound	    ▓        Sudan            ▓
            ▓        SEK        ▓              Swedish Krona	    ▓            Sweden       ▓
            ▓        SGD        ▓            Singapore Dollar	    ▓      Singapore          ▓
            ▓        SHP        ▓            Saint Helena Pound	    ▓     Saint Helena        ▓
            ▓        SLE        ▓            Sierra Leonean Leone	▓     Sierra Leone        ▓
            ▓        SOS        ▓            Somali Shilling	    ▓            Somalia      ▓
            ▓        SRD        ▓            Surinamese Dollar	    ▓       Suriname          ▓
            ▓        SSP        ▓            South Sudanese Pound	▓      South Sudan        ▓
            ▓        STN        ▓        São Tomé and Príncipe Dobra▓	São Tomé and Príncipe ▓
            ▓        SYP        ▓               Syrian Pound	    ▓             Syria       ▓
            ▓        SZL        ▓            Eswatini Lilangeni	    ▓       Eswatini          ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓<░ -> 5) Pagina 5;░▓░░░░░░░░ -> 0) Para voltar;░<<░░░░░▓░░░░░ -> 7) Pagina 7;░>>░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            >>>""";
    public String listCountriesP7 = """
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓░░░Currency Code░░░▓░░░░░░░░░░░Currency Name░░░░░░░░░░░▓░░░░░░░░░Country░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓        THB        ▓                Thai Baht	        ▓        Thailand         ▓
            ▓        TJS        ▓            Tajikistani Somoni	    ▓       Tajikistan        ▓
            ▓        TMT        ▓            Turkmenistan Manat	    ▓      Turkmenistan       ▓
            ▓        TND        ▓              Tunisian Dinar	    ▓        Tunisia          ▓
            ▓        TOP        ▓              Tongan Paʻanga	    ▓         Tonga           ▓
            ▓        TRY        ▓                Turkish Lira	    ▓         Turkey          ▓
            ▓        TTD        ▓        Trinidad and Tobago Dollar	▓   Trinidad and Tobago   ▓
            ▓        TVD        ▓            Tuvaluan Dollar	    ▓             Tuvalu      ▓
            ▓        TWD        ▓            New Taiwan Dollar	    ▓         Taiwan          ▓
            ▓        TZS        ▓            Tanzanian Shilling	    ▓        Tanzania         ▓
            ▓        UAH        ▓            Ukrainian Hryvnia	    ▓        Ukraine          ▓
            ▓        UGX        ▓            Ugandan Shil ling	    ▓         Uganda          ▓
            ▓     * USD *       ▓          * United States Dollar *	▓    * United States *    ▓
            ▓        UYU        ▓              Uruguayan Peso	    ▓        Uruguay          ▓
            ▓        UZS        ▓             Uzbekistani So'm	    ▓        Uzbekistan       ▓
            ▓        VES        ▓        Venezuelan Bolívar Soberano▓	       Venezuela      ▓
            ▓        VND        ▓            Vietnamese Đồng	    ▓            Vietnam      ▓
            ▓        VUV        ▓               Vanuatu Vatu	    ▓            Vanuatu      ▓
            ▓        WST        ▓               Samoan Tālā	        ▓         Samoa           ▓
            ▓        XAF        ▓        Central African CFA Franc	▓         CEMAC           ▓
            ▓        XCD        ▓            East Caribbean Dollar	▓ Organisation of Eastern ▓
            ▓                   ▓                                   ▓     Caribbean States    ▓
            ▓        XDR        ▓         Special Drawing Rights	▓       International     ▓
            ▓                   ▓                                   ▓       Monetary Fund     ▓
            ▓        XOF        ▓          West African CFA franc	▓          CFA            ▓
            ▓        XPF        ▓                CFP Franc	        ▓       Collectivités     ▓
            ▓                   ▓                                   ▓        d'Outre-Mer      ▓
            ▓        YER        ▓               Yemeni Rial	        ▓          Yemen          ▓
            ▓        ZAR        ▓            South African Rand	    ▓      South Africa       ▓
            ▓        ZMW        ▓              Zambian Kwacha	    ▓          Zambia         ▓
            ▓        ZWL        ▓            Zimbabwean Dollar	    ▓         Zimbabwe        ▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            ▓<░ -> 6) Pagina 6;░▓░░░░░░░░ -> 0) Para voltar;░<<░░░░░▓░░░░░░░░░░░░░░░░░░░░░░░░░▓
            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓
            >>>""";

    public void showListCountries (int parte) {
        String response = null;
        switch (parte)
        {
            case 0 -> response = introLista;
            case 1 -> response = listCountriesP1;
            case 2 -> response = listCountriesP2;
            case 3 -> response = listCountriesP3;
            case 4 -> response = listCountriesP4;
            case 5 -> response = listCountriesP5;
            case 6 -> response = listCountriesP6;
            case 7 -> response = listCountriesP7;
        }
        System.out.print(response);
    }
    public String introLista =
            """
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                                                                                           Qual página?                                                 ░░
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░                                                                                          ░░
            ░░░░░░░░░░░░░░░░░░░░░▒▒███░░░░░░░░░░░░░ORACLE ONE░  -> 1) Visualizar Pagina 1;                                                              ░░
            ░░░░C░░░░░░░░░▒▒████████████████░░░░░░░░+░ALURA░░░  -> 2) Visualizar Pagina 2;                                                              ░░
            ░░░░O░░D░░░░░▒▒████░░▒▒███░░░▒▒████░░░░░░░░░░░░░░░  -> 3) Visualizar Pagina 3;                                                              ░░
            ░░░░N░░E░░░░▒▒████░░░▒▒███░░░░░░░░░░░░░░░░░░░░░░░░  -> 4) Visualizar Pagina 4;                                                              ░░
            ░░░░V░░░░░░░░▒▒████░░▒▒███░░░░░░░░░░░░░░░░░░░░░░░░  -> 5) Visualizar Pagina 5;                                                              ░░
            ░░░░E░░M░░░░░░░▒▒████████████████░░░░░░░░░░░░░░░░░  -> 6) Visualizar Pagina 6;                                                              ░░
            ░░░░R░░O░░░░░░░░░░░░░▒▒███░░░▒▒████░░░░░░░░░░░░░░░  -> 7) Visualizar Pagina 7;                                                              ░░
            ░░░░S░░E░░░░░░░░░░░░░▒▒███░░░░▒▒████░░░░░░░░░░░░░░  -> 8) Conversão personalizada   *extra*;                                                ░░
            ░░░░O░░D░░░░▒▒████░░░▒▒███░░░▒▒████░░░░░░░░░░░░░░░  -> 9) Voltar ao menu principal;                                                         ░░
            ░░░░R░░A░░░░░░▒▒████████████████░░░░░░░░░░░░░░░░░░  -> 0) Sair;                                                                             ░░
            ░░░░░░░░░░░░░░░░░░░░░▒▒███░░░░░░░░░░░░░░░░░░░░░░░░                                                                                          ░░
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░BY░ANDERSON░SILVA░░ - Selecione uma opção válida (de 1 a 9) ou 0 para sair:  ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
            >>>""";

    public String epilog =
            """
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
                                                                            OBRIGADO E ATE MAIS...                                                      ░░
            ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░        ♥                                                                                  ░░
            ░░░░░░░░░░░░░░░░▒▒███░░░░░░▒▒███░░░░░░ORACLE ONE░                                                                                           ░░
            ░░░░C░░░░░░░░░▒▒██████░░░▒▒██████░░░░░░+░ALURA░░░        O                                                                                  ░░
            ░░░░O░░D░░░░░▒▒████████▒▒█████████░░░░░░░░░░░░░░░        B                                                                                  ░░
            ░░░░N░░E░░░░▒▒█████████████████████░░░░░░░░░░░░░░        R                                                                                  ░░
            ░░░░V░░░░░░▒▒███████████████████████░░░░░░░░░░░░░        I                                                                                  ░░
            ░░░░E░░M░░░▒▒███████████████████████░░░░░░░░░░░░░        G                                                                                  ░░
            ░░░░R░░O░░░░▒▒█████████████████████░░░░░░░░░░░░░░        A                                                                                  ░░
            ░░░░S░░E░░░░░░▒▒█████████████████░░░░░░░░░░░░░░░░        D                                                                                  ░░
            ░░░░O░░D░░░░░░░░▒▒█████████████░░░░░░░░░░░░░░░░░░        O                                                                                  ░░
            ░░░░R░░A░░░░░░░░░░▒▒█████████░░░░░░░░░░░░░░░░░░░░        !                                                                                  ░░
            ░░░░░░░░░░░░░░░░░░░░▒▒█████░░░░░░░░░░░░░░░░░░░░░░                                                                                           ░░
            ░░░░░░░░░░░░░░░░░░░░░░▒▒█░░░░BY░ANDERSON░SILVA░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
            """;
}

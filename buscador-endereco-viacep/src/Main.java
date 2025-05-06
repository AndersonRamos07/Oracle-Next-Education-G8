import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ConsultaCEP consultacep = new ConsultaCEP();

        System.out.println("Digite o cep para a busca:");
        String cep = scan.nextLine();

        try{
            Endereco novoEndereco = consultacep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando...");
        }

    }
}
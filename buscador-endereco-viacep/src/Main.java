//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsultaCEP consultacep = new ConsultaCEP();
        Endereco novoEndereco = consultacep.buscaEndereco("01001000");
        System.out.println(novoEndereco);
    }
}
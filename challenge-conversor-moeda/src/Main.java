import actions.Conversao;
import basis.DotEnv;

public class Main {
    public static void main(String[] args) {

        DotEnv intro = new DotEnv();
        intro.getIntro();
        Conversao conversao = new Conversao();
        conversao.converter("BRL");
    }
}
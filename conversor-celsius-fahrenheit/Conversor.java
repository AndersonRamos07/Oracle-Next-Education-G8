public class Conversor{
    private double temperatura;
    public int inFahrenheit;

    public Conversor()
    {
        System.out.println("Criado!\n");
    }
    public void celsius2Fahrenheit(double pTemperature) {
        this.temperatura = pTemperature;
        this.inFahrenheit = converter(this.temperatura);
        System.out.println(mensage(pTemperature));
    }
    public int converter (double pTemperature) {
        return (int) (pTemperature * 1.8) + 32;
    }
    public String mensage (double pTemperature) {
        return """
        A temperatura de %s o Celsius,
        equivale a %s em Fahrenheit
        """.formatted(pTemperature, this.inFahrenheit);
    }
}
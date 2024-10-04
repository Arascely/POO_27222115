public class Utilidades {
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 44.0;
        double fahrenheit = Utilidades.convertirCelsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }
}

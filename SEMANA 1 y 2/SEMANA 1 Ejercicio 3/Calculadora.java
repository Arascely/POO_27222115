public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }
    public double restar(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double num1 = 1.5;
        double num2 = 5.0;

        System.out.println("Suma: " + calculadora.sumar(num1, num2));
        System.out.println("Resta: " + calculadora.restar(num1, num2));
        System.out.println("Multiplicación: " + calculadora.multiplicar(num1, num2));

        try {
            System.out.println("División: " + calculadora.dividir(num1, num2));
            System.out.println("División por cero: " + calculadora.dividir(num1, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

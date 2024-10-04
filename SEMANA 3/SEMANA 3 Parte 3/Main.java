public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(34.5);
        System.out.println("Radio del círculo: " + circulo1.getRadio());
        double area = circulo1.calcularArea();
        System.out.println("Área del círculo: " + area);
    }
}
    
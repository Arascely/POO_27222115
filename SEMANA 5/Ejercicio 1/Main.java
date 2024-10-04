public class Main {
    public static void main(String[] args) {
        Forma triangulo = new Triangulo(8, 16);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        Forma cuadrado = new Cuadrado(6);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}
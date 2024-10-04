public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("José Marino", 3200);
        System.out.println("Bono de " + empleado.getNombre() + ": " + empleado.calcularBono());

        Gerente gerente = new Gerente("Laura Angel", 5500);
        System.out.println("Bono de " + gerente.getNombre() + ": " + gerente.calcularBono());
    }
}
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("4224 2211 8134 5566", "María Lorca", 600.0);
        
        cuenta.mostrarInformacion();

        cuenta.depositar(300.0);
        cuenta.retirar(800.0);
        cuenta.retirar(100.0);
        System.out.println("Saldo disponible: $" + cuenta.getSaldo());
    }
}

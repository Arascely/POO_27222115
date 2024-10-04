public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente(1000, 500);

        try {
            cuenta1.retirar(1500);
            System.out.println("Retiro exitoso. Saldo actual: " + cuenta1.getSaldo());

            cuenta1.retirar(400);
        } catch (SaldoInsuficienteException | LimitesSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        }
    }
}



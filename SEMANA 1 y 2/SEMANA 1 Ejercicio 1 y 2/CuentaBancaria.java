class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

public class CuentaBancaria {
    public String titular;
    public String numeroCuenta;
    public double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a cero.");
        }
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a cero.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Jhon Victor M", "749875637", 500.80);

        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());

        cuenta.depositar(200.0);
        try {
            cuenta.retirar(800.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}

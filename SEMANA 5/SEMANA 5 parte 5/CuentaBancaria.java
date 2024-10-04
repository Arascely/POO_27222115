public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}

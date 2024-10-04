public class CuentaCorriente extends CuentaBancaria {
    private final double limiteSobreGiro;

    public CuentaCorriente(double saldoInicial, double limiteSobreGiro) {
        super(saldoInicial);
        this.limiteSobreGiro = limiteSobreGiro;
    }
    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimitesSobregiroExcedidoException {
        if (cantidad > saldo + limiteSobreGiro) {
            throw new LimitesSobregiroExcedidoException("Límite de sobregiro excedido al intentar retirar " + cantidad);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}
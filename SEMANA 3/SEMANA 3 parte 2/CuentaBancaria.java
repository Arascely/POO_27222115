public class CuentaBancaria {
    public String numeroCuenta;     
    private double saldo;    
    protected String titular; 

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se hizo el depósito exitoso de: $" + cantidad);
        } else {
            System.out.println("El depósito debe ser mayor a 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de: $" + cantidad);
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: $" + saldo);
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a 0.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
}

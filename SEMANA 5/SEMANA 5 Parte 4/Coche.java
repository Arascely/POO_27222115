class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, int numeroPuertas) {
        super(marca); 
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void mostrarInformacion() {
        System.out.println("Marca del coche: " + getMarca());
        System.out.println("Número de puertas: " + getNumeroPuertas());
    }
}
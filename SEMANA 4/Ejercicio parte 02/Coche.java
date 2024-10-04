class Coche extends VehiculoMotorizado {
    private int numeroPuertas;

    public Coche(String marca, String modelo, double capacidadCombustible, double velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, capacidadCombustible, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void describir() {
        System.out.println("Coche " + marca + " " + modelo + " con " + numeroPuertas + " puertas.");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando a una velocidad máxima de " + velocidadMaxima + " km/h.");
    }
}

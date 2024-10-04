class VehiculoMotorizado extends Vehiculo {
    protected double capacidadCombustible; 
    protected double velocidadMaxima; 

    public VehiculoMotorizado(String marca, String modelo, double capacidadCombustible, double velocidadMaxima) {
        super(marca, modelo);
        this.capacidadCombustible = capacidadCombustible;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void llenarTanque() {
        System.out.println("El tanque ha sido llenado con " + capacidadCombustible + " litros de combustible.");
    }

    @Override
    public void describir() {
        System.out.println("Vehículo motorizado " + marca + " " + modelo + ", capacidad de combustible: " + capacidadCombustible + " litros, velocidad máxima: " + velocidadMaxima + " km/h.");
    }
    
    public void acelerar() {
        System.out.println("El vehículo motorizado " + marca + " " + modelo + " está acelerando.");
    }
}
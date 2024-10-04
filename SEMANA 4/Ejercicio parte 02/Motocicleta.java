class Motocicleta extends VehiculoMotorizado {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, double capacidadCombustible, double velocidadMaxima, boolean tieneSidecar) {
        super(marca, modelo, capacidadCombustible, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void describir() {
        String sidecarTexto = tieneSidecar ? "con sidecar" : "sin sidecar";
        System.out.println("Motocicleta " + marca + " " + modelo + " " + sidecarTexto + ".");
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta " + marca + " " + modelo + " está acelerando a una velocidad máxima de " + velocidadMaxima + " km/h.");
    }
}

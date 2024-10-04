public class Circulo {
    private final double radio;

    public Circulo(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            throw new IllegalArgumentException("El radio debe ser mayor a 0.");
        }
    }

    public double calcularArea() {
        return Math.PI * radio * radio;  
    }
    
    public double getRadio() {
        return radio;
    }
}


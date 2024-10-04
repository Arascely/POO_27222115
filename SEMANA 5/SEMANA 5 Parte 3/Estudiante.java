class Estudiante extends Persona {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String nombreOtraPersona) {
        System.out.println("¡Hola " + nombreOtraPersona + "! Soy " + nombre + ". Que tenga un buen día");
    }
}
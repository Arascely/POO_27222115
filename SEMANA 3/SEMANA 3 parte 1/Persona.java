public class Persona {
    private String nombre;
    private int edad;
    private String correoElectronico;

    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor que 0.");
        }
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null && correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
        } else {
            System.out.println("El correo electrónico debe ser válido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo Electrónico: " + correoElectronico);
    }
}


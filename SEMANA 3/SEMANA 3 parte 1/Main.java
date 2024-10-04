public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Jhonn Nieve", 30, "jhonn.30@gmail.com");
        persona1.mostrarInformacion();
    
        persona1.setNombre("Ana García");
        persona1.setEdad(28);
        persona1.setCorreoElectronico("Ana.garcia@gmail.com");
        
        persona1.mostrarInformacion();

    }
}

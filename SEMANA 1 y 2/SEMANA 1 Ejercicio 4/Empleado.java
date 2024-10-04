public class Empleado {

    public String  nombre;
    private final double salario;  
    public String departamento;

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    private double getSalario() {
        return salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + getSalario());
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jhonny Salario", 5450.0, "Proyectos");
        empleado.mostrarInformacion();

        empleado.setDepartamento("Marketing");
        empleado.mostrarInformacion();
    }
}

public class Empleado{
    protected String nombre;
    protected double salario;
    
    public Empleado (String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }
    public double calcularBono(){
        return salario * 0.10;
    }

    public String getNombre() {
        return nombre;
    }
}
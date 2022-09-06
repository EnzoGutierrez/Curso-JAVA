package herencia.domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo){
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int gerIdEmpleado(){
        return this.idEmpleado;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[Id empleado: ").append(idEmpleado);
        sb.append(", sueldo: ").append(sueldo);
        sb.append(", Persona: ").append(super.toString());
        sb.append("]");
        return sb.toString();
    }
    
}

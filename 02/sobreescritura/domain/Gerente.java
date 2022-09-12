package sobreescritura.domain;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String ObtenerDetalles(){
        return super.ObtenerDetalles() + ", departamento: " + this.departamento;
    }
}

package herencia.domain;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, Date fechaRegistro, boolean vip){
        super(nombre);
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente(){
        return this.idCliente;
    }

    public Date getFechaRegistro(){
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip(){
        return this.vip;
    }

    public void setVip(boolean vip){
        this.vip = vip;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[Id cliente: ").append(idCliente);
        sb.append(", fecha de registro: ").append(fechaRegistro);
        sb.append(", es vip: ").append(vip);
        sb.append("]");
        return sb.toString();
    }
}

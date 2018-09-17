package ar.com.eduit.curso.java.entities;
import java.util.ArrayList;
import java.util.List;
public class ClienteEmpresa {
    private int nro;
    private String razonSocial;
    private String direccion;
    private List<Cuenta> cuentas;
    public ClienteEmpresa(int nro, String razonSocial, String direccion) {
        this.nro=nro;
        this.razonSocial=razonSocial;
        this.direccion=direccion;
        this.cuentas=new ArrayList();
    }
    @Override
    public String toString() {
        return "ClienteEmpresa{" + "nro=" + nro + ", razonSocial=" + razonSocial + ", direccion=" + direccion + '}';
    }   
    public List<Cuenta> getCuentas() {
        return this.cuentas;
    }
}

package ar.com.eduit.curso.java.entities;

public class Direccion {
    private String calle;
    private String numero;
    private String piso;
    private String depto;
    private String ciudad;

    public Direccion(String calle, String numero, String piso, String depto, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = ciudad;
    }

    /**
     * Constructor para direcciones de la ciudad de Buenos Aires.
     */
    public Direccion(String calle, String numero, String piso, String depto) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = "CABA";
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", depto=" + depto + ", ciudad=" + ciudad + '}';
    }

    public String getCalle()    { return calle;     }
    public String getNumero()   { return numero;    }
    public String getPiso()     { return piso;      }
    public String getDepto()    { return depto;     }
    public String getCiudad()   { return ciudad;    }
}

package clase06;

public enum Estado {
    SOLTERO("soltero"),
    CASADO("casado"),
    VIUDO("viudo"),
    DIVORCIADO("divorciado");
    
    private String estado;

    Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
}

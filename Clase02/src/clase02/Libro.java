package clase02;

public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private String editorial;

    public Libro(int codigo, String titulo, String autor, String editorial) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}

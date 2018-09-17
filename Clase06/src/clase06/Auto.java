package clase06;

import java.util.Objects;

public class Auto implements Comparable{
    private String marca;
    private String modelo;
    private String color;
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    @Override
    public int hashCode() {
        return toString().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }
    @Override
    public int compareTo(Object o) {
        return toString().compareTo(o.toString());
    }
}

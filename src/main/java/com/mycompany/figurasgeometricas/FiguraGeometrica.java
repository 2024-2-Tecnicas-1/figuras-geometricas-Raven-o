
package com.mycompany.figurasgeometricas;

public class FiguraGeometrica {
    
    private String nombre;
    private String color;
    
    // Complejidad temporal: O(1) Tiempo constante.
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    public String getNombre() {
        return nombre;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    public String getColor() {
        return color;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    public void setColor(String color) {
        this.color = color;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    public double obtenerArea(){
        double area =0;
        return area;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    public double obtenerPerimetro(){
        double perimetro =0;
        return perimetro;
    }
    
    
}

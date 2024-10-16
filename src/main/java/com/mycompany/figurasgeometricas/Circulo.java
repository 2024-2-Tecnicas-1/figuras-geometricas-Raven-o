/**
 * Clase Circulo que hereda de FiguraGeometrica
 */
package com.mycompany.figurasgeometricas;

class Circulo extends FiguraGeometrica {
    private double radio;
    
    // Complejidad temporal: O(1) Tiempo constante.
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    // Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerPerimetro(){
        double perimetro = 2*Math.PI*this.radio;
        return perimetro;
    }
        // Complejidad temporal: O(1) Tiempo constante.

    @Override
    public double obtenerArea(){
        double area =Math.PI*Math.pow(this.radio, 2);
        return area;
    }
    
    
    
}

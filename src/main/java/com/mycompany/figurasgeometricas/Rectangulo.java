
package com.mycompany.figurasgeometricas;

class Rectangulo extends FiguraGeometrica{
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        
    }
    
    // Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerPerimetro(){
        double perimetro = 2*this.lado1+2*this.lado2;
        return perimetro;
    }
        // Complejidad temporal: O(1) Tiempo constante.

    @Override
    public double obtenerArea(){
        double area =this.lado1*this.lado2;
        return area;
    }
    
    
    
}

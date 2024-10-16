
package com.mycompany.figurasgeometricas;

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base=base;
        this.altura = altura;
    }
    // Complejidad temporal: O(1) Tiempo constante.
    @Override
    public double obtenerPerimetro(){
        double perimetro = this.base+2*Math.sqrt(Math.pow(base/2, 2)+Math.pow(altura, 2));
        return perimetro;
    }
        // Complejidad temporal: O(1) Tiempo constante.

    @Override
    public double obtenerArea(){
        double area =this.base*this.altura/2;
        return area;
    }
    
    
}

package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        String nombre;
        String color;
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre de la figura");
        nombre = sc.nextLine();
        System.out.println("Ingrese color de la figura");
        color = sc.nextLine();
        System.out.println("Ingrese tipo de figura: ");
        System.out.println("1. Circulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        opcion  = sc.nextInt();
        
        switch(opcion){
            case 1:
                
                System.out.println("Ingrese el radio del circulo");
                double radio = sc.nextDouble();
                Circulo circulo = new Circulo(nombre, color,radio);
                System.out.println("La figura "+circulo.getNombre()+" de color "+circulo.getColor()+" tiene area: "+circulo.obtenerArea()+ " y el perimetro: "+circulo.obtenerPerimetro());
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo ");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 1 del rectángulo ");
                double lado2 = sc.nextDouble();
                Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);
                System.out.println("La figura "+rectangulo.getNombre()+" de color "+rectangulo.getColor()+" tiene area: "+rectangulo.obtenerArea()+ " y el perimetro: "+rectangulo.obtenerPerimetro());
                
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triángulo ");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo ");
                double altura = sc.nextDouble();
                Triangulo triangulo = new Triangulo(nombre, color, base, altura);
                System.out.println("La figura "+triangulo.getNombre()+" de color "+triangulo.getColor()+" tiene area: "+triangulo.obtenerArea()+ " y el perimetro: "+triangulo.obtenerPerimetro());
                
                break;
            default:
                System.out.println("La opcion no existe");
                break;
        
        }
        
    }
}

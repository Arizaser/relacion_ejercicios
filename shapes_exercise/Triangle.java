/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes_exercise;

/**
 *
 * @author marizase
 */
public class Triangle implements Shape {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangle(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double area() {
        double sp = this.perimetro()/2;
        return Math.sqrt(sp*(sp-this.lado1) * (sp-this.lado2) * (sp-this.lado3));
    }

    @Override
    public double perimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }
}

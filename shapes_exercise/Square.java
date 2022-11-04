/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes_exercise;

/**
 *
 * @author marizase
 */
public class Square implements Shape {
    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }

    @Override
    public double perimetro() {
       return this.lado*4;
    }
    
}

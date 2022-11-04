/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes_exercise;

/**
 *
 * @author marizase
 */
public class Rectangle implements Shape {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return this.base * this.height;
    }

    @Override
    public double perimetro() {
        return (this.base*2) + (this.height*2);
    }
}

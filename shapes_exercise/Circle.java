/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes_exercise;

/**
 *
 * @author marizase
 */
public class Circle implements Shape {
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*this.radio;
    }
}

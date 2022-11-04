/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes_exercise;

/**
 *
 * @author marizase
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 4);
        System.out.println("Área y perimetro del rectangulo: \nÁrea: " + rect.area() + "\nPerímetro: "+rect.perimetro());
        
        Circle circ = new Circle(5);
        System.out.println("Área y perimetro del círculo: \nÁrea: " + circ.area() + "\nPerímetro: "+circ.perimetro());
        
        Square squar = new Square(5);
        System.out.println("Área y perimetro del círculo: \nÁrea: " + squar.area() + "\nPerímetro: "+squar.perimetro());
        
        Triangle triang = new Triangle(5, 3, 5);
        System.out.println("Área y perimetro del círculo: \nÁrea: " + triang.area() + "\nPerímetro: "+triang.perimetro());
    }
}

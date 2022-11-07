/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author marizase
 */
public class Calculator {

    public Calculator() {
    }
    
    public double operate(double num1, String operand, double num2) {
        double result = 0;
        switch (operand) {
            case "+" -> {
                result = num1 + num2;
                break;
            }
            case "-" -> {
                result = num1 - num2;
                break;
            }
            case "/" -> {
                result = num1 / num2;
                break;
            }
            case "*","x" -> {
                result = num1 * num2;
                break;
            }
            default -> System.out.println("No has introducido valores válidos");
        }
        return result;
    }
}

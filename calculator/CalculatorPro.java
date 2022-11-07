/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author marizase
 */
public class CalculatorPro extends Calculator {

    public CalculatorPro() {
    }
    
    public int calculateFactorial(double number) {
        for (int i = (int) (number-1); i >= 1; i--) {
            number *= i;
        }
        
        return (int) number;
    }

    @Override
    public double operate(double num1, String operand, double num2) {
        double resultado = 0;
        if ("^".equals(operand) || "!".equals(operand)) {
            switch (operand) {
                case "^" -> {
                    resultado = Math.pow(num1, num2);
                    break;
                }
                case "!" -> {
                    resultado = this.calculateFactorial(num1);
                    break;
                }
            }
            return resultado;
        }
        return super.operate(num1, operand, num2); 
    }
}

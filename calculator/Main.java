/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author marizase
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new CalculatorPro();
        double num1;
        double num2;
        String operand;

//        while (true) {
            try {
                System.out.println("Introduce el primer operando: ");
                num1 = Double.parseDouble(sc.nextLine());
                System.out.println("Introduce el operador (+)|(-)|(*)|(/)|(^)|(!): ");
                operand = sc.nextLine();
                if (!"!".equals(operand)) {
                    System.out.println("Introduce el segundo operando: ");
                    num2 = Double.parseDouble(sc.nextLine());
                } else num2 = 0;

                System.out.println("El resultado es = " + calc.operate(num1, operand, num2));
            } catch (Exception e) {
                System.out.println("HAS INTRODUCIDO DATOS INCORRECTOS. PRUEBA OTRA VEZ.");
            }
//        }
    }
}

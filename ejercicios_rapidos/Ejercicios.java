/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_octubre;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

/**
 *
 * @author marizase
 */
public class Ejercicios {
    
    
    public static void showMenu() {
        System.out.println(reverseString("---------------------------"));
        System.out.println("""
                           SELECCIONA EJERCICIO
                           | 1. Dado un string, comprobar si es pal\u00edndromo o no
                           | 2. Dado un n\u00famero, comprobar si es pal\u00edndromo o no
                           | 3. Dado un n\u00famero entero, calcular su factorial
                           | 4. Dados dos n\u00fameros, calcular su m\u00e1ximo com\u00fan divisor
                           | 5. Comprobar si un n\u00famero es un n\u00famero de Armstrong
                           | 6. Dado un string, darle la vuelta sin utilizar el m\u00e9todo reverse
                           | 7. Tenemos paquetes de arroz de 1, 3 y 5 Kilos. Calcular el m\u00ednimo n\u00famero de paquetes de arroz que necesitamos para igualar un peso pasado por par\u00e1metro. Lanzar una excepci\u00f3n si no podemos cumplirlo
                           | 8. Dado un número en romano, pasarlo a decimal
                           | 10. Crear una función que devuelva los días entre dos fechas. Las fechas vendrán indicadas por un string con formato “dd/MM/yyyy”
                           | 0. SALIR """);
        System.out.println("---------------------------");
    }
    
//  1. Dado un string, comprobar si es palíndromo o no
    public static boolean stringIsPalindrome(String str) {
        String reverse_string = "";
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse_string += str.charAt(i);
        }
 
        return str.equals(reverse_string);
    }
    
//  2. Dado un número, comprobar si es palíndromo o no
    public static boolean numberIsPalindrome(int number) {
        String reverse_string = "";
        String str = Integer.toString(number);
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse_string += str.charAt(i);
        }
 
        return str.equals(reverse_string);
    }
    
//  3. Dado un número entero, calcular su factorial
    public static int calculateFactorial(int number) {
        for (int i = (number-1); i >= 1; i--) {
            number *= i;
        }
        
        return number;
    }
    
//  4. Dados dos números, calcular su máximo común divisor
    public static int calculateGreatestCommonDivisor(int number1, int number2) {
        int num_mayor = Integer.max(number1, number2);
        int num_menor = Integer.min(number1, number2);
        
        for (int i = num_menor; i >= 1; i--) {
            if (num_menor%i == 0 && num_mayor%i == 0) {
                return i;
            }
        }
        
        return 1;
    }
    
//  5. Comprobar si un número es un número de Armstrong
    public static boolean isArmstrong(int number) {
        String number_to_string = Integer.toString(number);
        int result_addition = 0;
        
        for (int i = 0; i < number_to_string.length(); i++) {
            result_addition += Math.pow(Character.getNumericValue(number_to_string.charAt(i)), number_to_string.length());
        }
 
        return result_addition == number;
        
    }
    
//  6. Dado un string, darle la vuelta sin utilizar el método reverse
    public static String reverseString(String str) {
        String reverse_string = "";
 
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse_string += str.charAt(i);
        }
 
        return reverse_string;
    }
    
//  7. Tenemos paquetes de arroz de 1, 3 y 5 Kilos. Calcular el mínimo número de paquetes de arroz que 
//     necesitamos para igualar un peso pasado por parámetro. Lanzar una excepción si no podemos cumplirlo 
    public static void calculateMinPaquetesArroz(int peso) {
        int num_paquetes_cinco = 0;
        int num_paquetes_tres = 0;
        int num_paquetes_uno = 0;
        
        while (peso-5 >= 0) {            
            peso -= 5;
            num_paquetes_cinco++;
        }
        while (peso-3 >= 0) {            
            peso -= 3;
            num_paquetes_tres++;
        }
        while (peso-1 >= 0) {            
            peso -= 1;
            num_paquetes_uno++;
        }
        
        System.out.println("Paquetes de cinco: " + num_paquetes_cinco + "\nPaquetes de tres: " + num_paquetes_tres + "\nPaquetes de uno: " + num_paquetes_uno);
    }
    
//  Dado un número en romano, pasarlo a decimal   
    public static int getValueRomanChar(char character) {
        int valor = 0;
        switch (character) {
            case 'I' -> valor = 1;
            case 'V' -> valor = 5;
            case 'X' -> valor = 10;
            case 'L' -> valor = 50;
            case 'C' -> valor = 100;
            case 'D' -> valor = 500;
            case 'M' -> valor = 1000;
            default -> throw new AssertionError();
        }
        return valor;
    }

    public static int romanToDecimal(String numero_romano) {
        int sumatorio_total = 0;
        for (int i = 0; i < numero_romano.length(); i++) {
            char roman_char = Character.toUpperCase(numero_romano.charAt(i));
            int valor_letra = getValueRomanChar(roman_char);
            
            if ((i+1) != numero_romano.length()) {
                char siguiente_char = Character.toUpperCase(numero_romano.charAt(i+1));
                int valor_siguiente_char = getValueRomanChar(siguiente_char);
                
                if (valor_letra<valor_siguiente_char) {
                    sumatorio_total -= valor_letra;
                } else {
                    sumatorio_total += valor_letra;
                }
            } else {
                sumatorio_total += valor_letra;
            }
        }
        return sumatorio_total;
    }
    
//  Crear una función que devuelva los días entre dos fechas. Las fechas vendrán indicadas por un string con formato “dd/MM/yyyy” 
    public static long daysBetweenTwoDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);

        LocalDate smallerDate = localDate1.isBefore(localDate2) ? localDate1 : localDate2;
        LocalDate biggerDate = localDate1.isBefore(localDate2) ? localDate2 : localDate1;
        
        long daysBetween = DAYS.between(smallerDate, biggerDate);
        
        return daysBetween;
    }
    
//  Calcular el valor n de fibonacci
    public static int getNumFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return getNumFibonacci(n-1) + getNumFibonacci(n-2);
    }
    
    
    public static void main(String[] args) {
        System.out.println(stringIsPalindrome("abba"));
        System.out.println(numberIsPalindrome(1001));
        System.out.println(calculateFactorial(5));
        System.out.println(calculateGreatestCommonDivisor(10, 2));
        System.out.println(isArmstrong(370));
        System.out.println(reverseString("abcdef"));
        calculateMinPaquetesArroz(52);
        System.out.println(romanToDecimal("CMXCIX"));
        System.out.println(daysBetweenTwoDates("01/01/2022", "01/01/2023"));
        System.out.println(getNumFibonacci(5));
        
//        Scanner scanner = new Scanner( System.in );
//        int select_exercise;
//        int select_int;
//        int select_int2;
//        String select_string;
//        String select_string2;
//        
//        do {            
//            showMenu();
//            select_exercise = Integer.parseInt(scanner.nextLine());
//            
//            switch (select_exercise) {
//                case 1 -> {
//                    System.out.println("Dado un string, comprobar si es palíndromo o no\nIntroduce un string");
//                    System.out.println(stringIsPalindrome(scanner.nextLine()));
//                }
//                case 2 -> {
//                    System.out.println("Dado un número, comprobar si es palíndromo o no\nIntroduce un entero");
//                    System.out.println(numberIsPalindrome(Integer.parseInt(scanner.nextLine())));
//                }
//                case 3 -> {
//                    System.out.println("Dado un número entero, calcular su factorial\nIntroduce un entero");
//                    System.out.println(calculateFactorial(Integer.parseInt(scanner.nextLine())));
//                }
//                case 4 -> {
//                    System.out.println("Dados dos números, calcular su m\\u00e1ximo com\\u00fan divisor\nIntroduce el primer número");
//                    select_int = Integer.parseInt(scanner.nextLine());
//                    System.out.println("Introduce el segundo numero");
//                    select_int2 = Integer.parseInt(scanner.nextLine());
//
//                    System.out.println(calculateGreatestCommonDivisor(select_int, select_int2));
//                }
//                case 5 -> {
//                    System.out.println("Comprobar si un número es un número de Armstrong\nIntroduce un número");
//                    System.out.println(isArmstrong(Integer.parseInt(scanner.nextLine())));
//                }
//                case 6 -> {
//                    System.out.println("Dado un string, darle la vuelta sin utilizar el m\\u00e9todo reverse\nIntroduce un struing");
//                    System.out.println(reverseString(scanner.nextLine()));
//                }
//                case 7 -> {
//                    System.out.println("Ejercicio eficiencia paquetes\nIntroduce el número de kilos");
//                    calculateMinPaquetesArroz(Integer.parseInt(scanner.nextLine()));
//                }
//                case 8 -> {
//                    System.out.println("Dado un número en romano, pasarlo a decimal");
//                    romanToDecimal(scanner.nextLine());
//                }
//                case 9 -> {
//                    System.out.println("Crear una función que devuelva los días entre dos fechas. Las fechas vendrán indicadas por un string con formato “dd/MM/yyyy”");
//                    System.out.println("Selecciona la primera fecha");
//                    select_string = scanner.nextLine();
//                    System.out.println("Selecciona la segunda fecha");
//                    select_string2 = scanner.nextLine();
//                    daysBetweenTwoDates(select_string, select_string2);
//                }
//                case 10 -> {
//                    System.out.println("Calcular el valor n de fibonacci");
//                    getNumFibonacci(Integer.parseInt(scanner.nextLine()));
//                }
//                case 0 -> System.out.println("Gracias por participar!");
//                default -> showMenu();
//            }
//        } while (select_exercise != 0);

    }
}

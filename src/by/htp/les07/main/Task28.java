/*
Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, 
а также на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки 
программа (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
*/

package by.htp.les07.main;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
        System.out.print("Введите арифметический знак операции: ");
        char arithmeticSign = sc.next().charAt(0);
        
        while (arithmeticSign == '/' || arithmeticSign == '*' || arithmeticSign == '+' || arithmeticSign == '-') {
            System.out.print("Введите первый операнд: ");
            int firstNumber = sc.nextInt();
 
            System.out.print("Введите второй операнд: ");
            int secondNumber = sc.nextInt();
 
            if (arithmeticSign == '+') {
                int result = firstNumber + secondNumber;
                System.out.println("Результат: " + result);
            } else if (arithmeticSign == '-') {
                int result = firstNumber - secondNumber;
                System.out.println("Результат: " + result);
            } else if (arithmeticSign == '*') {
                int result = firstNumber * secondNumber;
                System.out.println("Результат: " + result);
            } else if (arithmeticSign == '/') {
                int result = firstNumber / secondNumber;
                System.out.println("Результат: " + result);
            } else if (arithmeticSign == '/' && secondNumber == 0) {
                System.out.println("Нельзя делить на 0!");
 
            }
            if (arithmeticSign != '/' || arithmeticSign != '*' || arithmeticSign != '+' || arithmeticSign != '-') {
                System.out.println("Неверный знак операции!");
            }else {
            
            if (arithmeticSign == '0') {
                break;
            }
        }
        }
 
        sc.close();
	}

	}

	

//6. Напишите программу, где пользователь вводит любое целое положительное число
//А программа суммирует все числа от 1 до введенного пользователем числа

package by.htp.les07.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		System.out.println("Введите положительное число: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int i = sc.nextInt();
		if (i < 0) {
			System.out.println("Ваше число не положительное!");
		}
		int a = 1;
		int sum = 0;
		while (a < i) {
			sum = sum + a;
			a = a + 1;
			System.out.println(sum);
		}

	}

}

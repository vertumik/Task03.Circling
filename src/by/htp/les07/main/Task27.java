//Для каждого натурального числа в промежутке от m до n вывести все делители, 
//кроме единицы и самого числа. m и n вводятся с клавиатуры.

package by.htp.les07.main;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		System.out.println("Введите число m: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		
		System.out.println("Введите число n: ");
		int n = scan.nextInt();
		
		for (int i = m; i <= n; i++) {
			System.out.print(i + ": ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print("*" + j + " ");
				}
			}
		}

	}

}

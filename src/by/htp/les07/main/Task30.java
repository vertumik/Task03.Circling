//Написать программу, переводящую римские цифры в арабские.

package by.htp.les07.main;

import java.util.Scanner;

public class Task30 {

	public static void main (String[] args) {
		String[] c = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] n = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String res = "";
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Введите число");
		int val = s.nextInt();
		for (int i = 1; i <13; i++) {
			while (val >= n[i]) {
				res = res + c[i];
				val = val - n[i];
			}
		}
		System.out.println(res);
	}
}

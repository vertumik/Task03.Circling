//Найдите наибольшую цифру данного натурального числа.

package by.htp.les07.main;

public class Task33 {

	public static void main(String[] args) {
		
		int a = 680;
		int max = 0;
		while (a > 0) {
			if (a % 10 > max) {
				max = a % 10;
			}
			a /= 10;
		}
		System.out.print(max);
	}

}

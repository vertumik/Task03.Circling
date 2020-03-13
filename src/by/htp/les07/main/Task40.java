//Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.

package by.htp.les07.main;

public class Task40 {

	public static void main(String[] args) {
		int n = 25;
		
		for (int i = 1; i <= n; i++) {
			int a = i;
			while (a > 0) {
				if (i % (a % 10) == 0) {
					System.out.println(i);
				}
				a = a / 10;
			}	
		}

	}

}

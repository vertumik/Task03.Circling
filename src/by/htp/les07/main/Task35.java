//Найдите количество четных цифр данного натурального числа.

package by.htp.les07.main;

public class Task35 {

	public static void main(String[] args) {
		int n = 21345678;
		while (n != 0) {
			int t = n % 10;
			if (t % 2 == 0) {
				System.out.println(t);
			}
			n /= 10;
		}

	}

}

//Вычислить : 1+2+4+8+...+ 2 в 10 степени.

package by.htp.les07.main;

public class Task15 {

	public static void main(String[] args) {
		int i = 1;
		int n = 10;
		int sum = 1;
		while (i <= n) {
			sum = sum * 2;
			System.out.println(sum);
			i = i + 1;
		}

	}

}

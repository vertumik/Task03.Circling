//10. Составить программу нахождения произведения квадратов первых двухсот чисел.

package by.htp.les07.main;

public class Task10 {

	public static void main(String[] args) {
		double i = 1;
		double sum = 1;
		for (; i <= 200; i++) {
			sum = sum * Math.pow(i, 2);
			System.out.println(sum);
		}

	}

}

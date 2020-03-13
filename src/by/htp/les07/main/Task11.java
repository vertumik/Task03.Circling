//11. Составить программу нахождения разности кубов первых двухсот чисел

package by.htp.les07.main;

public class Task11 {

	public static void main(String[] args) {
		double i = 1;
		double sum = 1;
		for (; i <= 200; i++) {
			sum = sum - Math.pow(i, 3);
			System.out.println(sum);
		}

	}

}

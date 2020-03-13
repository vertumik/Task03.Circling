//9. Найти сумму квадратов первых ста чисел.

package by.htp.les07.main;

public class Task09 {

	public static void main(String[] args) {
		double i = 1;
		double sum = 0;
		for (; i <= 100; i++) {
			sum = sum + Math.pow(i, 2);
			System.out.println(sum);
		}

	}

}

//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
//его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
//числом.

package by.htp.les07.main;

public class Task24 {

	public static void main(String[] args) {
		int a = Integer.parseInt("10");
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Сумма четных чисел = " + sum);
		for (int i = a; i > 0; i--) {
			int b = i;
			System.out.println(b);
		}

	}

}

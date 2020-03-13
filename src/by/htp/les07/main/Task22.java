//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
//Результат представить в виде таблицы, первый столбец которой – значения аргумента, 
//второй - соответствующие значения функции:

package by.htp.les07.main;

public class Task22 {

	public static void main(String[] args) {
		int a = 2;
		int b = 9;
		int h = 1;
		double f;
		for (int i = a; i <= b; i += h) {
			f = Math.pow(Math.sin(i), 2);
			System.out.println("Значение аргумента: " + i + " Значение функции: " + f);
		}

	}

}

//Даны числовой ряд и некоторое число е. 
//Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:

package by.htp.les07.main;

public class Task20 {

	public static void main(String[] args) {
		int n = Integer.parseInt("300");
		double e = Math.E;
		double a = 0;
		double sum = 0;
		
		//System.out.println(e);
		for (int i = 1; i <= n; i++) {
			a = 1.0 / ((3 * i - 2) * (3 * i + 1));
			//System.out.println(a);
			sum += a;
			if (sum >= e) {
				System.out.println("Сумма членов ряда = " + sum);
			}else {
				System.out.println("Сумма членов ряда не достигает е и = " + sum);
			}
		}

	}

}

//Даны числовой ряд и некоторое число е. 
//Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:

package by.htp.les07.main;

public class Task18 {

	public static void main(String[] args) {
		int n = Integer.parseInt("300");
		double e = Math.E;
		double a = 0;
		double sum = 0;
		
		//System.out.println(e);
		for (int i = 1; i <= n; i++) {
			a = Math.pow(-1, i-1) / i;
			//System.out.println(a);
			if (a > 0) {
			//System.out.println(sum);
			}else {
				sum += a;
				//System.out.println(sum2);
			}
			
			if ((-sum) >= e) {
				System.out.println("Сумма членов ряда = " + (-sum));
			}
		}

	}

}

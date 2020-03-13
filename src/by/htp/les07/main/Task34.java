//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15

package by.htp.les07.main;

public class Task34 {

	public static void main(String[] args) {
		
		for (int k = 1000; k < 10000; k++) {
		    int a = k % 10; // четвертая цифра
		    int b = (k / 10) % 10; // третья цифра
		    int c = (k / 100) % 10; // вторая цифра
		    int d = k / 1000; // первая цифра
		    int i = a + b + c + d;
		    if (i == 15) 
		    {
		        System.out.println(k);
		    }
		}

	}

}

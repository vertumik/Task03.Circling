//Вычислить значения функции на отрезке [а,b] c шагом h:

package by.htp.les07.main;

public class Task07 {

	public static void main(String[] args) {
		int a = -3;
		int b = 5;
		int h = 1;
		int y;
		while (a <= b) {
			if (a <= 2) {
				y = -a;
				System.out.println(y);
			}else {
				y = a;
				System.out.println(y);
			}
			a = a + h;
		}

	}

}

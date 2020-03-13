//Вычислить значения функции на отрезке [а,b] c шагом h

package by.htp.les07.main;

public class Task08 {

	public static void main(String[] args) {
		int a = -3;
		int b = 15;
		int h = 1;
		int c = 3;
		int y;
		while (a <= b) {
			if (a == 15) {
				y = (a + c) * 2;
				System.out.println(y);
			}else {
				y = (a - c) + 6;
				System.out.println(y);
			}
			a = a + h;
		}

	}

}

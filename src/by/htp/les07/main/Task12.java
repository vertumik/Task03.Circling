//12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 
//Составьте программу нахождения произведения первых 10 членов этой последовательности.

package by.htp.les07.main;

public class Task12 {

	public static void main(String[] args) {
		int a1 = 1;
		int n = 5;
		int temp = 1;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				a1 = 6 + a1;
				if (i < 10) {
					temp = temp * a1;
					System.out.println(temp);
				}
			}
		}else {
			System.out.println("n меньше 1");
		}
	}

}

//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

package by.htp.les07.main;

public class Task17 {

	public static void main(String[] args) {
		double a = Double.parseDouble("2.5");
		int n = Integer.parseInt("10");
		double p = 0;
		for (int i = 1; i <= n-1; i++) {
			p = a * (a+i);
		}
		System.out.println(p);

	}

}

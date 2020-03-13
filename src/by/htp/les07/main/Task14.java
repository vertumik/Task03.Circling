//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

package by.htp.les07.main;

public class Task14 {

	public static void main(String[] args) {
		double sum = 0;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		System.out.println(sum);
	}

}

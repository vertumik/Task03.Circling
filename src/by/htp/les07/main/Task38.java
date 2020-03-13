//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
//Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.


package by.htp.les07.main;

public class Task38 {

	public static void main(String[] args) {
		int n = 2468;
		
			int x = n % 10;
			n /= n;
			int y = n % 10;
			n /= n;
			int z = n % 10;
			int k = n / 10;
			if ((x-y) == (y-z) && (y-z)==(z-k)) {
				System.out.println("да");
			}else {
				System.out.println("нет");
			}


	}

}

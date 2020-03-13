//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
//делится на их произведение. Найти эти числа.

package by.htp.les07.main;

public class Task36 {

	public static void main(String[] args) {
		
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if (Math.round(((i / 100 + j) * 100)) % (i * j) == 0){
					System.out.println(i + " " + j);
				}
			}
		}
		

	}

}

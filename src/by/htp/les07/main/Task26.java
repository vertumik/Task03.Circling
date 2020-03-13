//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера 
//(Таблицу ASCII).

package by.htp.les07.main;

public class Task26 {

	public static void main(String[] args) {
		for (int i = 0; i <= 255; i++) {
			System.out.println(i + " " + (char)i);
		}
		

	}

}

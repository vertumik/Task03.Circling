//Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: 
//первое число получили путем написания сначала числа А, затем В. 
//Для получения второго числа сначала записали число В, затем А. 
//Найти числа А и В если известно , что первое четырехзначное число нацело делится
//на 99, а второе на 49.

package by.htp.les07.main;

public class Task37 {

	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if ((int)((i / 100 + j) * 100) % 99 == 0){
					System.out.println(i + " " + j);
				}
				if ((int)((i / 100 + j) * 100) % 49 == 0){
					System.out.println(i + " " + j);
				}
			}
		}

	}

}

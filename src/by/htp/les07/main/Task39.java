//В трехзначном числе зачеркнули старшую цифру. 
//Когда полученное число умножили на 7, то получили исходное число. Найти это число.

package by.htp.les07.main;

public class Task39 {

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			
			if ((i % 100) * 7 == i){
				System.out.println(i);
			}
		}

	}

}

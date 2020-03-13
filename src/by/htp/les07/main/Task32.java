//Проверить введенную пользователем строку на наличие недопустимых символов. 
//В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
// буквами, цифрами и знаком подчеркивания.

package by.htp.les07.main;

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // Объявляем Scanner
	    System.out.println("Введите строку из букв и цифр: ");
	    if (input.hasNextLine() || input.hasNextInt()) {
	    	System.out.println("Вы ввели буквы и цифры");
	    }else {
	    	System.out.println("Вы ввели недопустимые символы");
	    }
	}

}

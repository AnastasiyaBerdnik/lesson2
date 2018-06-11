package by.epam.anastasiya.hometask2;

import java.util.Scanner; // импорт из java библиотеки класса Scanner

public class Comments3 { // название класса
public static void main (String[] args) {
	int n = 10; // присваивание переменнной типа int значения 10
	Scanner sc = new Scanner(System.in);  // создаем новый объект класса сканнер, system.in  - объект, представляющий стандартный поток ввода с клавиатуры 
	String max = "", min = "", str = ""; // обозначаем переменные типа String
	

	for (int i = 0; i<n; i++) { //условие  для переменной,подходящей под условия i=0, i меньше 10, i-любое последующее значение, 
		System.out.print("> ");// выводить >
		if (sc.hasNextLine()) {   // команда смотрит есть ли стледующая строка 
			str = sc.nextLine();// если есть --- переход на след строку
			
		if (i==0) {  //ели введенное значение = 0 
			min= str;  // то минимальное значение = стр
		}
		
		if (str.length() > max.length())   //если длина строки больше макс длины то макс значение = стр
		{max = str;
		}
		
		else if  (str.length() < min.length())  // остальное если длина строки менььше минимальной длиы то миним значение = стр.
		{min = str;
		}
	}
	System.out.println ("max string = "+ max + " length = " + max.length());  // вывод на экран
	System.out.println ("min string = "+ min + " length = " + min.length());  // вывод на экран
}
}
}
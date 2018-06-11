package by.epam.anastasiya.hometask2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double L, S, R = 0, r=2; // L окружность, s - площадь, R - радиус, r степень
		
       System.out.println("¬введите R ");
        if (sc.hasNextDouble()) {
       
        	R = sc.nextDouble();
        	}
        	else  {
        	      String s = sc.next();
        		  System.out.println("¬ведите  число");                   
        }
        
        L = 2 * Math.PI*R;
        S = Math.PI * Math.pow(R, r);
        System.out.println("ѕлощадь равна   " + S + "    ќкружность равна     " + L);
	}


}

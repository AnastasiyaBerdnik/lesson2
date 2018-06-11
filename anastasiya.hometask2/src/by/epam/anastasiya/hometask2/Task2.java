package by.epam.anastasiya.hometask2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, r2 = 2, r3 = 3;
		double res;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("enter a = ");
		
		if (sc.hasNextInt())            {
			a = sc.nextInt(); 
			}
		
		System.out.print("enter b = ");
		if (sc.hasNextInt())            {
			b = sc.nextInt();
			}
		
		System.out.print("enter с = ");
		if (sc.hasNextInt())           {
			c = sc.nextInt();
			}
		
		if (a!=0)                        {
			res = Math.sqrt(Math.pow(b, r2) + 4*a*c)/2*a - (Math.pow(a, r3) + b);
			}
		else                         {
			System.out.print("Некорректная операция, знаменатель не может быть равен нулю   " );
		res = Double.NaN;
		                             }
	
		
		
		System.out.println("result = " + res);
		}
	}



package by.epam.anastasiya.hometask2;

import java.util.Scanner; // ������ �� java ���������� ������ Scanner

public class Comments3 { // �������� ������
public static void main (String[] args) {
	int n = 10; // ������������ ����������� ���� int �������� 10
	Scanner sc = new Scanner(System.in);  // ������� ����� ������ ������ �������, system.in  - ������, �������������� ����������� ����� ����� � ���������� 
	String max = "", min = "", str = ""; // ���������� ���������� ���� String
	

	for (int i = 0; i<n; i++) { //�������  ��� ����������,���������� ��� ������� i=0, i ������ 10, i-����� ����������� ��������, 
		System.out.print("> ");// �������� >
		if (sc.hasNextLine()) {   // ������� ������� ���� �� ���������� ������ 
			str = sc.nextLine();// ���� ���� --- ������� �� ���� ������
			
		if (i==0) {  //��� ��������� �������� = 0 
			min= str;  // �� ����������� �������� = ���
		}
		
		if (str.length() > max.length())   //���� ����� ������ ������ ���� ����� �� ���� �������� = ���
		{max = str;
		}
		
		else if  (str.length() < min.length())  // ��������� ���� ����� ������ ������� ����������� ���� �� ����� �������� = ���.
		{min = str;
		}
	}
	System.out.println ("max string = "+ max + " length = " + max.length());  // ����� �� �����
	System.out.println ("min string = "+ min + " length = " + min.length());  // ����� �� �����
}
}
}
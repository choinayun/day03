package day03;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		// ���� ���� ���� 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		
		int a;
		a = sc.nextInt();
		
		if(a >= 90) {
			System.out.println("A����Դϴ�.");
		}else if(a >= 80) {
			System.out.println("B����Դϴ�.");
		}else if(a >= 60) {
			System.out.println("C����Դϴ�.");
		}else {
			System.out.println("����� ��÷");
		}
		
		
	}
}

package day03;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		
		// ���� ���� ���� 3
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���̸� �Է��Ͻÿ�");
		int age = input.nextInt();
		
		System.out.println("������ ��ȭ�� �����Ͻÿ�");
		System.out.println("1. ���˵���2");
		System.out.println("2. �̿��� �����");
		int num = input.nextInt();
		
		if(age >= 15) {
			System.out.println("��̰� �����ϼ���");
		}else if(age < 15 && num == 1) {
			System.out.println("15���̸��� �ش� ��ȭ�� ������ �� �����ϴ�.");
		}else {
			System.out.println("��̰� �����ϼ���");
		}
		
		
	}
	
}

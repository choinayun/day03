package day03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		int num = 11;
	
		if(num%2 == 0) { // ������ ���̸� ���ӹ��� ����
			System.out.println("¦��");
		}else { // if ������ �����̸� else ���� 
			System.out.println("Ȧ��");
		}
		System.out.println("���� ����� ����");
		
		
		
		// ����1) ���� �Է� �޾� 5�� ������� �ƴ��� �����ϱ� 
		
		Scanner input = new Scanner(System.in); 
		  
		System.out.println("���ڸ� �Է��ϼ���"); 
		  
		num = input.nextInt(); 
		  
		if(num%5 == 0) { 
			System.out.println("5�� ����Դϴ�");  
		}else { 
			System.out.println("5�� ����� �ƴմϴ�");
		}
		
		
		
		// ����2) ���� �Է� �޾� 0���� ũ�� 100���� ������ ����, �ƴϸ� ���������� ���
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		num = input.nextInt();
		
		if(num > 0 && num < 100) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("�������Դϴ�");
		}
		
		
		
		// ����3) ���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		num = input.nextInt();
		
		if(num%2 == 0 && num%3 == 0) { // num%6 == 0
			System.out.println("¦���鼭 3�� ���");
		}else {
			System.out.println("�ƴ�");
		}
		
		
		
		// ����3-1) ���� �Է� �޾� ¦���̸鼭 3�� ����̸� ���
		// 		   3�� ����� �ƴϸ�, ¦���� �ش��ϸ� ¦�� , �Ǵ� Ȧ��
	    //         ¦���� �ƴϸ�, 3�� ����� �ش��ϸ� 3�� ���, �ƴ� 
		//         �ش� ���� ������ �ش� ���� ����
		 
		System.out.println("���ڸ� �Է��ϼ���");
		
		num = input.nextInt();
		
		if(num%6 == 0 ) {
			System.out.println("¦���鼭 3�� ���");
		
		}else {
			
			if(num%2 == 0 && num%3 != 0) {
				System.out.println("¦�� �Դϴ�");
			}else {
				System.out.println("Ȧ�� �Դϴ�");
				
				if(num%2 == 1 && num%3 == 0) {
					System.out.println("3�� ����Դϴ�");
				}else {
					System.out.println("�ƴ�");
				}
			}
			
		}

	
	}
	
}

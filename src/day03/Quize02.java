package day03;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		// ���� ���� ���� 2
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�޴��� �����ϼ���");
		System.out.println("1. ȸ������ �α���");
		System.out.println("2. �����ڷ� �α���");
		
		int num = input.nextInt();
		
		if(num == 2) {
			System.out.println("��й�ȣ�� �Է��ϼ���");
			
			int pw = input.nextInt();
			if(pw == 1234) {
				System.out.println("�����ڷ� �α��� �Ͽ����ϴ�");
			}else {
				System.out.println("�α��� ����\n��й�ȣ�� Ȯ���ϼ���");
			}
			
		}else if(num == 1) {
			System.out.println("ȸ������ �α��� �Ͽ����ϴ�");
		}else {
			System.out.println("�߸��� ���� ����Դϴ�\n�ٽ��Է��ϼ���");
		}
		
		
		
	}
}

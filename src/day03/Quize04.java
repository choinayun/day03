package day03;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("�ֻ��� 2���� ������� �Է��Ͻÿ�");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if( (a+b)%2 == 0 ) {
			System.out.println("¦��");
			if(a == b) {
				System.out.println("����");
			}else {
				System.out.println("Ȧ��");
			}
		}
	}
}

package day03;

import java.util.Scanner;

public class Quize04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("주사위 2개의 결과값을 입력하시오");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if( (a+b)%2 == 0 ) {
			System.out.println("짝수");
			if(a == b) {
				System.out.println("더블");
			}else {
				System.out.println("홀수");
			}
		}
	}
}

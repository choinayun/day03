package day03;

import java.util.Scanner;

public class Quize03 {

	public static void main(String[] args) {
		
		// 내가 만든 문제 3
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("나이를 입력하시오");
		int age = input.nextInt();
		
		System.out.println("관람할 영화를 선택하시오");
		System.out.println("1. 범죄도시2");
		System.out.println("2. 이웃집 토토로");
		int num = input.nextInt();
		
		if(age >= 15) {
			System.out.println("즐겁게 관람하세요");
		}else if(age < 15 && num == 1) {
			System.out.println("15세미만은 해당 영화를 관람할 수 없습니다.");
		}else {
			System.out.println("즐겁게 관람하세요");
		}
		
		
	}
	
}

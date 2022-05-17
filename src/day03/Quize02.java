package day03;

import java.util.Scanner;

public class Quize02 {

	public static void main(String[] args) {
		
		// 내가 만든 문제 2
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("메뉴를 선택하세요");
		System.out.println("1. 회원으로 로그인");
		System.out.println("2. 관리자로 로그인");
		
		int num = input.nextInt();
		
		if(num == 2) {
			System.out.println("비밀번호를 입력하세요");
			
			int pw = input.nextInt();
			if(pw == 1234) {
				System.out.println("관리자로 로그인 하였습니다");
			}else {
				System.out.println("로그인 실패\n비밀번호를 확인하세요");
			}
			
		}else if(num == 1) {
			System.out.println("회원으로 로그인 하였습니다");
		}else {
			System.out.println("잘못된 접근 방식입니다\n다시입력하세요");
		}
		
		
		
	}
}

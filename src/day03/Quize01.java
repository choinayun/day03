package day03;

import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) {
		
		// 내가 만든 문제 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int a;
		a = sc.nextInt();
		
		if(a >= 90) {
			System.out.println("A등급입니다.");
		}else if(a >= 80) {
			System.out.println("B등급입니다.");
		}else if(a >= 60) {
			System.out.println("C등급입니다.");
		}else {
			System.out.println("재시험 당첨");
		}
		
		
	}
}

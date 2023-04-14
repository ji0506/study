package study0414;

import java.util.Scanner;
// do while 문 사용방법
public class ST0017 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.print("세 자리의 정숫값:");
			x = stdIn.nextInt();
		}while(x < 100 || x > 999);	// 3자리의 숫자값을 입력 받아야만 종료하도록 
		
		System.out.println("입력한 값은 "+ x + "입니다");

	}
}

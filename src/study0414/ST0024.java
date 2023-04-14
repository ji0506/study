package study0414;

import java.util.Scanner;
//do while문과 while 문의 같이 사용
public class ST0024 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수를 표시합니다.");
		int x;
					
		do {
			System.out.print("양의 정수값 : ");
			x = stdIn.nextInt();
		}while(x <= 0); // 양의 숫자를 입력 받음. 단 0이나 음수 값일 경우 다시 입력
		
		int digit = 0;
		while(x > 0)
		{
			digit++;
			x /= 10; // 부호 연산을 통해 0보다 작아질때 까지 계산하여 자릿수 확인
		}

		System.out.println("입력한 숫자는 "+ digit + "자리입니다.");
	}
}

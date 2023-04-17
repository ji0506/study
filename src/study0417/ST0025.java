package study0417;

import java.util.Scanner;
// for 문 사용 방법 

public class ST0025 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("양의 정숫값:");
			n= stdIn.nextInt();
		}while(n <= 0); // 값을 입력 받고 음수 양수 판단

		
		int factorial = 1;
		int i = 1;
		
		while(i <= n)
		{
			factorial *= i;
			i++;
		} // 1부터 n까지 의 값을 곱샘하여 출력
		System.out.println("1부터 " + n + "까지의 곱은"+ factorial + "입니다.");
	}
}

package study;

import java.util.Scanner;

public class st05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int n = stdIn.nextInt();
		
		
		if(n > 0)
		{
			System.out.println("이 값은 양수 값입니다");
		}
		else if(n < 0)
			System.out.println("이 값은 음수 값입니다");
		
		else 
			System.out.println("이 값은 0입니다");

		
	}

}

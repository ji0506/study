package study0413;

import java.util.Scanner;

public class ST0008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 a: ");
		int a = stdIn.nextInt();
		System.out.print("정수값 b: ");
		int b = stdIn.nextInt();

		int diff = a >= b ? a=b : b-a;		
		
		if(diff <=10)
			System.out.println("두 값의 차는 10이하입니다");
		else 
			System.out.println("두 값의 차는 11이상입니다");
			
	}

}

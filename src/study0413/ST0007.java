package study0413;

import java.util.Scanner;

public class ST0007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 a: ");
		int a = stdIn.nextInt();
		System.out.print("정수값 b: ");
		int b = stdIn.nextInt();

		int diff;		
		
		if(a >= b)
		{
			diff = a - b;
		} 
		else 
			diff = b - a;
		
		System.out.println("두 값의 차는 " + diff + "입니다");
	}

}

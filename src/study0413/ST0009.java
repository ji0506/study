package study0413;

import java.util.Scanner;

public class ST0009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 a: ");
		int a = stdIn.nextInt();
		System.out.print("정수값 b: ");
		int b = stdIn.nextInt();
		System.out.print("정수값 c: ");
		int c = stdIn.nextInt();

		int min=a;


		if(b <min) min = b;
		if(c <min) min = c;

		System.out.println("최소값은 "+ min +"입니다");			
	}

}

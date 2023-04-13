package study0413;

import java.util.Scanner;

public class ST0012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 a: ");
		int a = stdIn.nextInt();
		System.out.print("정수값 b: ");
		int b = stdIn.nextInt();

		int med = 0;

		if(a<b) {
			int t = a;
			a=b;
			b=t;
		}
		System.out.println("a>=b가 되도록정렬했습니다");			
		System.out.println("변수 a는 " + a +"입니다");			
		System.out.println("변수 b는 " + b +"입니다");			

	}

}

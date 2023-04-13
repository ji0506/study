package study0413;

import java.util.Scanner;

public class ST0006 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("실수값 a: ");
		double a = stdIn.nextDouble();
		System.out.print("실수값 b: ");
		double b = stdIn.nextDouble();

		double max;		
		
		if(a > b)
		{
			max = a;
		} 
		else 
			max = b;
		
		System.out.println("큰 쪽의 값은 " + max + "입니다");
		
	}

}

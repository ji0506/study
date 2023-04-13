package study0413;

import java.util.Scanner;

public class ST0010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 a: ");
		int a = stdIn.nextInt();
		System.out.print("정수값 b: ");
		int b = stdIn.nextInt();
		System.out.print("정수값 c: ");
		int c = stdIn.nextInt();

		int med = 0;

		if(a>=b)
		{
			if(b>=c)
				med = b;
			else if(a <=c)
				med = a;
			else 
				med = c;
		}
		else if(a > c)
			med = a;
		else if(b > c)
			med = c;
		else 
			med = b;
		
		System.out.println("중앙값은 "+ med +"입니다");			
	}

}

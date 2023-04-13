package study0413;

import java.util.Scanner;

public class ST0011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수값 a: ");
		int a = stdIn.nextInt();
		System.out.print("정수값 b: ");
		int b = stdIn.nextInt();

		
		if(a==b)
			System.out.println("두 값이 같습니다");
		else {
			int min=0, max=0;
			if (a < b){
				min = a;
				max = b;
			}
			else {
				min = b;
				max = a;				
			}
			
			System.out.println("작은 값은 "+ min +"입니다");			
			System.out.println("큰 값은 "+ max +"입니다");			
		}
	}

}

package study;

import java.util.Scanner;

public class st04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("변수 A : "); 
		int a = stdIn.nextInt();

		System.out.println("변수 B : ");
		int b = stdIn.nextInt();
		
		
		if(!(a%b == 0))
		{
			System.out.println("B는 A의 약수 아닙니다");

		}
		else 
			System.out.println("B는 A의 약수 입니다");

	}

}

package study0414;

import java.util.Scanner;
// do while 문 활용
// if문에서 값을 바꾸고 그 사이에 값들을 전부 출력하는 프로그램 
public class ST0019 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A:");
		int a = stdIn.nextInt();
		System.out.print("정수 B:");
		int b = stdIn.nextInt();
			
		if(a > b)
		{
			int t = a;
			a = b;
			b = t;
		
		}
		
		do {
			System.out.print(a + " ");
			a = a + 1;
		}while(a <= b );
		System.out.println();
	}
}

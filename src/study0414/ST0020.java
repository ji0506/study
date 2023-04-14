package study0414;

import java.util.Scanner;
// x-- 와 --x의 차이
public class ST0020 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
					
		do {
			System.out.print("양의 정숫값: ");
			x = stdIn.nextInt();
		}while(x <= 0);

		while(x >=0)
			System.out.println(x--);
		//	System.out.println(--x); --x 는 x= x-1 를 먼저 실행하고 x--는 프린트를 먼저 실행하고 x= x-1 연산을 실행

		System.out.println("x의 값이" + x + "이 됐습니다.");
		
		

	}
}

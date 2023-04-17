package study0417;

import java.util.Scanner;
// for 문 사용 방법 

public class ST0027 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;		
		
		do {
			System.out.print("양의 정숫값 : ");
			x = stdIn.nextInt();
		}while(x <= 0);
		
		for(; x >=0; x--)
			System.out.println(x);	
	}
}

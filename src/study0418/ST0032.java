package study0418;

import java.util.Scanner;
// for 문 사용 방법 

public class ST0032 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.print("정숫값:");
		n= stdIn.nextInt();
		for(int i = 1; i <= n; i++)
			System.out.println(i + "의 제곱은 "+ i*i +"입니다.");
	}
}

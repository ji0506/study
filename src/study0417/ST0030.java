package study0417;

import java.util.Scanner;
// for 문 사용 방법 

public class ST0030 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;		
		
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;		
		for(int i = 1;i < n; i++) { 
			System.out.print(i+ " + ");
			sum +=i;
		}   // 숫자를 입력 받은 뒤 1 부터 그 사이에 값들을 더하여 출력
		System.out.print(n + "=");
		sum +=n;
		
		System.out.println(sum);
	}
}

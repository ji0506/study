package study0418;

import java.util.Scanner;
// for 문 사용 방법 

public class ST0036 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는?:");	
		int n = stdIn.nextInt();
		
		for(int i=1;i <= n;i++){
			for(int j=1; j <=n-i; j++)
				System.out.print(' ');
			for(int j=1; j <=2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

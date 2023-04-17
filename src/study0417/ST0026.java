package study0417;

import java.util.Scanner;
// for 문 사용 방법 

public class ST0026 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?:");
		int n= stdIn.nextInt();
		
		
		if(n > 0){
			for(int i=0; i < n; i++)
				System.out.println('*');
			System.out.println();
		}
	}
}

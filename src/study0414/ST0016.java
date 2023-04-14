package study0414;

import java.util.Scanner;
// do while 문 사용 방법 

public class ST0016 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		do {
			System.out.print("정수값 :");
			int n = stdIn.nextInt();
			if (n > 0)
				System.out.println("이 값은 양수입니다.");
			else if( n < 0)
				System.out.println("이 값은 음입니다.");
			else  
				System.out.println("이 값은 0입니다.");

			System.out.println("다시 한번? 1-yes / 0-No");			
			retry = stdIn.nextInt();
		}while(retry == 1);

	}
}

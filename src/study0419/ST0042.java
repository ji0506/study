package study0419;

import java.util.Scanner;

public class ST0042 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 더합니다.");
		int total = 0;
		Outer:
		for(int i = 1; i <= 10; i++){
			System.out.println(i + "그룹");
			for(int j = 0; j <5;j++) {
				System.out.print("정수: ");
				int t = stdIn.nextInt();
				if(t == 99999) 
					break Outer;
				else if(t == 88888)
					continue Outer;
				
				total += t;
			}
		}
		
		System.out.println("\n합계는 " + total + "입니다.");
		//합계와 평균을 출력하되 음수는 무시

	}
}

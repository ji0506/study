package study0414;

import java.util.Scanner;
//while 문의 활용
public class ST0021 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?:");
		int n = stdIn.nextInt();
					
		if(n > 0){
			int i = 0;
			while(i < n) {
				System.out.print("*");; // 숫자를 입력받고 입력받은 숫자만큼 * 출력
				i++;
			}
			
		}

		System.out.println();
	}
}

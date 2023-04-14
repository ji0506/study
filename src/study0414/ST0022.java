package study0414;

import java.util.Scanner;

public class ST0022 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?:");
		int n = stdIn.nextInt();
					
		if(n > 0){
			int i = 0;
			while(i < n) {
				if(i%2 == 0)
					System.out.print("*"); 
				else 
					System.out.print("+"); 
				i++;
			}
			
		}//// 숫자를 입력받고 입력받은 숫자만큼 *+ 출력. 단 양수일시 * 음수일시 + 출력

		System.out.println();
	}
}

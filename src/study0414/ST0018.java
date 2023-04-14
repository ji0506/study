package study0414;

import java.util.Random;
import java.util.Scanner;
//do while 문의 활용
public class ST0018 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int no = 10 + rand.nextInt(90);
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요");
		
		int x;
		
		do {
			System.out.print("어떤 숫자일까?:");
			x = stdIn.nextInt();
			if(x > no)
				System.out.println("더 작은 숫자입니다");
			else if(x < no)
				System.out.println("더 큰 숫자 입니다.");
		}while(x != no );// 10에서 90사이의 랜덤한 값을 입력 받은 뒤 값을 입력 받아 맞출때 까지 반복 

		System.out.println("정답입니다.");

	}
}

package study0417;

import java.util.Scanner;
// for 문 사용 방법 

public class ST0031 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 cm부터 : ");
		int hMin = stdIn.nextInt();
		System.out.print("몇 cm까지 : ");
		int hMax = stdIn.nextInt();
		System.out.print("몇 cm 단위 : ");
		int step = stdIn.nextInt();
		System.out.println("신장 표준 체중");
		System.out.println("---------");
		
		for(int i = hMin; i <= hMax; i+=step) // cm 단위를 입력 받고 들릴 단위를 입력받아 그 수 사이에 값을 늘릴 단위로 증가시켜 출력
			System.out.println(i + " " + 0.9 * (i- 100));
	}
}

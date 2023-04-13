package study0413;

import java.util.Random;

public class ST0014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Random rand = new Random();
		
		System.out.print("컴퓨터가 낸 것: ");
		int hand = rand.nextInt(3);
		
		switch(hand){
		case 0: 
			System.out.println("가위");
			break;
		case 1: 
			System.out.println("바위");
			break;

		case 2: 
			System.out.println("보");
			break;
		}		

	}

}

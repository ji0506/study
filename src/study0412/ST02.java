package study0412;
import java.util.Scanner;

public class ST02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		int n = stdIn.nextInt();
		
		
		if(n >= 0)
		{
			System.out.println("절대값은 " + n +"입니다.");
		}
		else 
			System.out.println("절대값은 " + -n +"입니다.");

	
	}

}

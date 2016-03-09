package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		int sum = 0;
		int iterNumber = inputNumber;
		
		while (iterNumber>0){
			sum += iterNumber;
			iterNumber -= 2;
		}
		System.out.println("결과값: "+sum);
		scanner.close();
	}

}

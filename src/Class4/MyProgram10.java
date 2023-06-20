package Class4;

import java.util.Scanner;

public class MyProgram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);

		do {
			sum = sum + num;
			System.out.println("please give me pos num ");
			num = sc.nextInt();
		} while (num >= 0);

		System.out.println("the sum of pos num is " + sum);

		sc.close();
	}

}

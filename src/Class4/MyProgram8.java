package Class4;

import java.util.Scanner;

public class MyProgram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 15;
		int count;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Give me number between 1 to 12");
			count = sc.nextInt();
		} while (count < 1 || count > 12);
		
		do {
			System.out.println(count);
			count = count + 1;
		} while (count <= LIMIT);
		
		System.out.println("Done");

		sc.close();
		
	}

}

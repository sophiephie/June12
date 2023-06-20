package Class4;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		while (cond) {
//		statement
//	

		final int LIMIT = 15;
		int count;

		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me a number between 1 and 12");
		count = kb.nextInt();

		if (count < 1 || count > 12) {
			System.out.println("Sorry wrong input");
			System.exit(0); // end program
		}

		while (count <= LIMIT) {
			System.out.println(count);
			count = count + 1;
		}

		System.out.println("done");

		kb.close();

	}

}

package Class4;

//import java.util.Scanner;

public class MyProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print all even number from 0-100

//		final int LIMIT = 100;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input an even number");
//		int num = sc.nextInt();
//		
//		while (num >= 0) {
//			int sum = num + 2;
//		}
//			
//	sc.close();

		int i = 0;
		while (i <= 100) {

			if (i% 2 == 0) {
				System.out.println(i);
			}
			i++;

//			System.out.println(i + " ");
//			i = i + 2;

		}
	}

}

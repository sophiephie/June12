package Assignment1;

import java.util.Scanner;

public class part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first name ");
		String first = sc.next();
		System.out.print("Please enter your last name ");
		String last = sc.next();
		System.out.print("Please enter your age ");
		int age = sc.nextInt();
		System.out.printf("Hello %s %s, you are %d years old; Nice to meet you! %n", first, last, age);

		int random = (int) (Math.random() * 50 + 1);
		System.out.println("Please guess a number between 1 and 50");
		int guess = sc.nextInt();

		if (guess == random) {
			System.out.println("Your are lucky");
		} else if (guess > random) {
			System.out.println("Choose a smaller one. you were unlucky");
		} else if (guess < random) {
			System.out.println("Choose a bigger one. you were unlucky");

		}
		sc.close();
	}

}

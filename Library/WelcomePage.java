package Library;

import java.util.Scanner;

public class WelcomePage {

	void Welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====Welcome to the Library====");
		int number = 0;

		while (true) {
			System.out.println("1-Employee ");
			System.out.println("2-Member ");
			System.out.println("3-For new membership ");
			System.out.print("Please choose one of the options above !");

			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				if (number > 3 || number <= 0) {
					System.err.println("Please enter a valid number!");
					continue;
				} else {
					break;
				}
			} else {
				String word = scanner.next();
				System.err.println(word + "  is not a number");
				continue;
			}
		}
		switch (number) {
		case 1: 
			Person person= new Employee();
			person.helloPage();

			break;
		case 2:
			Person person2= new Member();
            person2.helloPage();
            
			break;
		case 3:

			break;

		}

	}

}

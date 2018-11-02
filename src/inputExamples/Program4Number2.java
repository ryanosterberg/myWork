package inputExamples;

import java.util.Scanner;

public class Program4Number2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int indexR = 0;
		int indexL = 0;
		int Rs = 0;
		int Ls = 0;
		int nums = 0;
		System.out.println("Please type a valid combination.");
		String combination = input.nextLine();
		if (combination.length() < 6 || combination.length() > 9) {
			System.out.println("Your combination must be more than 6 and less than 9 characters long.");
		} else {
			if (combination.charAt(0) != 'R') {
				System.out.println("Please make your first character 'R'.");
			} else {
				for (int x = 1; x < combination.length(); x++) {
					if ((combination.charAt(x) == 'R') || (combination.charAt(x) == 'L')
							|| (combination.charAt(x) >= '0' && combination.charAt(x) <= '9')) {
						if (combination.charAt(x) == 'R') {
							Rs++;
							indexR = x;
						}
						if (combination.charAt(x) == 'L') {
							Ls++;
							indexL = x;
						}
					} else {
						nums++;
						break;
					}
				}
				if (nums >= 1) {
					System.out.println(
							"Please only enter Rs, Ls and numbers. Rs = " + Rs + " Ls = " + Ls + " nums = " + nums);

				} else {
					int space1 = indexL - 1; // space between L and first R
					int space2 = (indexR - indexL - 1); // space between second R and L ------here is problem - off by
														// one
					int space3 = (combination.length() - (indexR) - 1); // space between end of string and last R
					if (!(Rs == 1 && Ls == 1)) {
						System.out.println("Please only enter two Rs and one L."); // clean up w/ either breaks or
																					// elses
					} else {
						if ((space1 >= 1 && space1 <= 2) && (space2 >= 1 && space2 <= 2)
								&& (space3 >= 1 && space3 <= 2)) // has to be greater than 0
						{
							System.out.println(combination + " is a good combination!");
						} else {
							System.out.println("Please only enter one or two digits after each letter");
						}

					}
				}
			}

		}
		input.close();
	}
}

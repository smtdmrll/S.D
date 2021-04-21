package snippet;

import java.util.Scanner;

public class SD2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("çift basamaklý bir sayý gir");
		int sayi = scan.nextInt();

		for (int i = 1; i < sayi; i++) {
			System.out.println("");
			for (int j = 1; j < sayi; j++) {

				if (i == 2) {
					if (j == 3 || j == 4 || j == 5 || j == 7 || j == 8 || j == 9) {
						System.out.print("*");
					} else
						System.out.print(" ");
				} else if (i == 3) {
					if (j == 3 || j == 7 || j == 9) {
						System.out.print("*");
					} else
						System.out.print(" ");
				} else if (i == 4) {
					if (j == 3 || j == 4 || j == 5 || j == 7 || j == 9) {
						System.out.print("*");
					} else
						System.out.print(" ");
				} else if (i == 5) {
					if (j == 5 || j == 7 || j == 9) {
						System.out.print("*");
					} else
						System.out.print(" ");
				} else if (i == 6) {
					if (j == 3 || j == 4 || j == 5 || j == 7 || j == 8 || j == 9) {
						System.out.print("*");
					} else
						System.out.print(" ");

				}
			}

		}
	}
}

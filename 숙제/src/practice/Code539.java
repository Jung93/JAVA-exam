package practice;

import java.util.Scanner;

public class Code539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if(num >= 33 && num <= 127) {
			System.out.println("ASCII code =? " + (char)num);
			}else {
				System.out.println("ASCII code =? ");
				break;
			}
		}
	}
}
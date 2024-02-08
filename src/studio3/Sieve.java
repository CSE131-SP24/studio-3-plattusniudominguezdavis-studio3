package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number would you like?");
		
		
		int n = in.nextInt();
		int fill = 1;
		boolean set[] = new boolean[n + 1];
		for(int i = 1; i <= n; i++) {
			set[i] = true;
			if (i % 2 == 0 && i != 2) {
				set[i] = false;
			}
			if (i % 3 == 0 && i != 3) {
				set[i] = false;
				
			}
			if (i % 4 == 0 && i != 4) {
				set[i] = false;
			}
			if (i % 5 == 0 && i != 5) {
				set[i] = false;
			}
			if (i % 6 == 0 && i != 6) {
				set[i] = false;
			}
			if (i % 7 == 0 && i != 7) {
				set[i] = false;
			}
			if (i % 8 == 0 && i != 8) {
				set[i] = false;
			}
			if (i % 9 == 0 && i != 9) {
				set[i] = false;
			}
			if (i % 10 == 0 && i != 10) {
				set[i] = false;
			}
			
		}
		
		for(int i = 1; i <= n; i++) {
			if (set[i] == true) {
				System.out.println(i + " is prime");
			}
			//if (set[i] = true) {
				//System.out.println(i + " is prime");
		}
		
		

		//for(int i = 1; i <= n; i++) {
			//int tot = 0;
			//int div = 1;
			//set[i] = fill;
			//fill++;
			//while (div <= n) {
			//	if (i % div > 1) {
			//		tot++;
			//	}
		//	if (tot == 0) {
		//		System.out.println(i + " is prime");
		//	}
		//	}
		//	}

	
		
		
	}
}



	
	





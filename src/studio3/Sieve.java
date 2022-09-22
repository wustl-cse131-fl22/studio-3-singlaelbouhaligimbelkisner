package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Pick an Integer Greater than One ");
		int numberLimit= scan.nextInt();
		
		boolean[] prime = new boolean[numberLimit];
		//prime = true;
		//number needs to be index of array
		 
		for(int index=2; index<prime.length; index++) {
			prime[index]=true;
		}
		
		for(int index=0; index<prime.length; index++) {
			if (prime[index] == true) {
				System.out.println(index);
				for(int j = index*index; j<prime.length; j+=index) {
					prime[j]= false;
				}
			}
		}
		
		
	}

}

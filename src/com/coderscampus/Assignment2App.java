package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2App {

	public static void main(String[] args) {
	int answer;
	int guess;
	final int MAX = 100;
	
	Scanner scanner = new Scanner (System.in);
	Random random = new Random ();
	
	answer = random.nextInt(MAX) + 1;

	
	System.out.println("Guess a number between 1 and 100. You will have 5 tries.");
		guess =scanner.nextInt();
	
	for (int i = 1 ; i < 6 ; i++) {
	if (guess == answer) {
		break;
	} else if (guess > answer) {
		System.out.println("Too high");
		guess = scanner.nextInt();
	} else if (guess < answer) { 
		System.out.println("Too low");
		guess = scanner.nextInt();
		
	}
	}
	if (guess == answer) {
		System.out.println("You win!");
	} else {
		System.out.println("You lose.");
	}

}
}
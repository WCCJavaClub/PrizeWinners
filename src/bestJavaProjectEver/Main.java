package bestJavaProjectEver;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int winner;
		boolean same = true;
		Random roll = new Random();
		int [] winners = new int[3];

		for (int i = 0; i<winners.length; i++){
			winner = roll.nextInt(30) + 1;
			System.out.println(winner);

			while (same){
				if (winner == winners[0] || winner == winners[1] || winner == winners[2]){
					winner = roll.nextInt(30) + 1;
				}
				else
					same = false;
			}
			winners[i] = winner;	
		}
		System.out.println("Winners:" + winners[0] + ", " + winners[1] + ", " + winners[2]);

	}
}

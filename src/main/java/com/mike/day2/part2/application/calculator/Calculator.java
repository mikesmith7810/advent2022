package com.mike.day2.part2.application.calculator;

import java.util.Map;

import com.mike.day2.part2.application.hand.Hand;


public class Calculator {

	public static int getRoundScore( Map.Entry<Hand, String> round ) {
		Hand playInput = round.getKey();
		String playRequired = round.getValue();


		Hand playChallenge = null;

		if (playRequired.equals("X")) {
			if (playInput == Hand.ROCK) playChallenge=Hand.SCISSORS;
			else if (playInput == Hand.PAPER) playChallenge=Hand.ROCK;
			else if (playInput == Hand.SCISSORS) playChallenge=Hand.PAPER;
		}
		else if (playRequired.equals("Y")) {
			if (playInput == Hand.ROCK) playChallenge=Hand.ROCK;
			else if (playInput == Hand.PAPER) playChallenge=Hand.PAPER;
			else if (playInput == Hand.SCISSORS) playChallenge=Hand.SCISSORS;
		}
		else if (playRequired.equals("Z")) {
			if (playInput == Hand.ROCK) playChallenge=Hand.PAPER;
			else if (playInput == Hand.PAPER) playChallenge=Hand.SCISSORS;
			else if (playInput == Hand.SCISSORS) playChallenge=Hand.ROCK;
		}



		int score = 0;
		switch ( playChallenge ) {
		case ROCK:
			score = score + Hand.ROCK.getScore();
			if (playInput.equals(Hand.SCISSORS))
				score = score + 6;
			else if (playInput.equals(Hand.ROCK))
				score = score + 3;
			break;
		case PAPER:
			score = score + Hand.PAPER.getScore();
			if (playInput.equals(Hand.ROCK))
				score = score + 6;
			else if (playInput.equals(Hand.PAPER))
				score = score + 3;
			break;
		case SCISSORS:
			score = score + Hand.SCISSORS.getScore();
			if (playInput.equals(Hand.PAPER))
				score = score + 6;
			else if (playInput.equals(Hand.SCISSORS))
				score = score + 3;
			break;
		default:
			System.out.println( "No hand found" );
		}

		return score;
	}
}

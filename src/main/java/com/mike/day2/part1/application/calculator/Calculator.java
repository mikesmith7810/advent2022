package com.mike.day2.part1.application.calculator;

import java.util.Map;

import com.mike.day2.part1.application.hand.Hand;


public class Calculator {

	public static int getRoundScore( Map.Entry<Hand, Hand> round ) {
		Hand playInput = round.getKey();
		Hand playChallenge = round.getValue();

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

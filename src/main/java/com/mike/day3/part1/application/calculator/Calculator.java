package com.mike.day3.part1.application.calculator;

import java.util.Map;

import com.mike.day3.part1.application.hand.Hand;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

	public static int getRoundScore( final Map.Entry<Hand, String> round ) {
		final Hand playInput = round.getKey();
		final String playRequired = round.getValue();

		return calculateScore( playInput, getHand( playInput, playRequired ) );
	}

	private static int calculateScore( final Hand playInput, final Hand playChallenge ) {
		int score = 0;
		switch ( playChallenge ) {
		case ROCK:
			score = score + Hand.ROCK.getScore();
			if ( playInput.equals( Hand.SCISSORS ) )
				score = score + 6;
			else if ( playInput.equals( Hand.ROCK ) )
				score = score + 3;
			break;
		case PAPER:
			score = score + Hand.PAPER.getScore();
			if ( playInput.equals( Hand.ROCK ) )
				score = score + 6;
			else if ( playInput.equals( Hand.PAPER ) )
				score = score + 3;
			break;
		case SCISSORS:
			score = score + Hand.SCISSORS.getScore();
			if ( playInput.equals( Hand.PAPER ) )
				score = score + 6;
			else if ( playInput.equals( Hand.SCISSORS ) )
				score = score + 3;
			break;
		default:
			log.info( "No hand found" );
		}
		return score;
	}

	private static Hand getHand( final Hand playInput, final String playRequired ) {
		Hand playChallenge = null;

		if ( playRequired.equals( "X" ) ) {
			if ( playInput == Hand.ROCK )
				playChallenge = Hand.SCISSORS;
			else if ( playInput == Hand.PAPER )
				playChallenge = Hand.ROCK;
			else if ( playInput == Hand.SCISSORS )
				playChallenge = Hand.PAPER;
		} else if ( playRequired.equals( "Y" ) ) {
			if ( playInput == Hand.ROCK )
				playChallenge = Hand.ROCK;
			else if ( playInput == Hand.PAPER )
				playChallenge = Hand.PAPER;
			else if ( playInput == Hand.SCISSORS )
				playChallenge = Hand.SCISSORS;
		} else if ( playRequired.equals( "Z" ) ) {
			if ( playInput == Hand.ROCK )
				playChallenge = Hand.PAPER;
			else if ( playInput == Hand.PAPER )
				playChallenge = Hand.SCISSORS;
			else if ( playInput == Hand.SCISSORS )
				playChallenge = Hand.ROCK;
		}
		return playChallenge;
	}
}

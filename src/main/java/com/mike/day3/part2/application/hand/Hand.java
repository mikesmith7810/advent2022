package com.mike.day3.part2.application.hand;

public enum Hand {
	ROCK( 1, "A" ),
	PAPER( 2, "B" ),
	SCISSORS( 3, "C" );

	private final int score;
	private final String identifier1;

	Hand( final int score, final String identifier1 ) {
		this.score = score;
		this.identifier1 = identifier1;
	}

	public static Hand forIdentifier1( final String identifier1 ) {
		for ( final Hand hand : values() ) {
			if ( hand.identifier1.equals( identifier1 ) ) {
				return hand;
			}
		}
		return null;
	}

	public int getScore() {
		return score;
	}
}

package com.mike.day2.part1.application.hand;

public enum Hand {
	ROCK( 1, "A", "X" ),
	PAPER( 2, "B", "Y" ),
	SCISSORS( 3, "C", "Z" );

	private final int score;
	private final String identifier1;
	private final String identifier2;

	Hand( final int score, final String identifier1, final String identifier2 ) {
		this.score = score;
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
	}

	public static Hand forIdentifier1( final String identifier1 ) {
		for ( Hand hand : values() ) {
			if ( hand.identifier1.equals( identifier1 ) ) {
				return hand;
			}
		}
		return null;
	}

	public static Hand forIdentifier2( final String identifier2 ) {
		for ( Hand hand : values() ) {
			if ( hand.identifier2.equals( identifier2 ) ) {
				return hand;
			}
		}
		return null;
	}

	public int getScore() {
		return score;
	}
}

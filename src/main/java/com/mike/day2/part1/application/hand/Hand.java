package com.mike.day2.part1.application.hand;

public enum Hand {
	ROCK( 1, "A", "X", 1 ),
	PAPER( 2, "B", "Y", 2 ),
	SCISSORS( 3, "C", "Z", 3 );



	private final int score;
	private final String identifier1;
	private final String identifier2;
	private final int winningScore;

	Hand( final int score, final String identifier1, final String identifier2,
			final int winningScore) {
		this.score = score;
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
		this.winningScore = winningScore;
	}

	public static Hand forIdentifier1( String identifier1 ) {
		for ( Hand hand : values() ) {
			if ( hand.identifier1.equals( identifier1 ) ) {
				return hand;
			}
		}
		return null;
	}

	public static Hand forIdentifier2( String identifier2 ) {
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

	public int getWinningScore() {
		return winningScore;
	}

}

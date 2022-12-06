package com.mike.day6.part2.application;

import com.mike.day6.part1.application.parser.InputParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdventApplication {
	public static void main( final String[] args ) throws Exception {
		log.info( "Day 4" );

		final String entries = InputParser.readInput( "day6/example.txt" );

		int index = 0;
		for ( int i = 3; i < entries.length(); i++ ) {
			boolean unique = checkIfUniqueCharacters( entries, i - 4, i );

		}

		log.info( "Index of uniqueness : " + index );
	}

	private static boolean checkIfUniqueCharacters( final String input, final int start,
			final int end ) {

		for ( int i = start + 1; i < end; i++ ) {

			if ( input.charAt( start ) == input.charAt( i ) )
				return true;
		}
		return false;
	}
}

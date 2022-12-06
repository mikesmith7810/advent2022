package com.mike.day6.part1.application;

import com.mike.day6.part1.application.parser.InputParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdventApplication {
	public static void main( final String[] args ) throws Exception {
		log.info( "Day 4" );

		final String entries = InputParser.readInput( "day6/actual.txt" );

		int index = 0;
		for ( int i = 0; i < entries.length() - 14; i++ ) {
			boolean match = checkIfMatchingCharacters( entries.substring( i, i + 14 ) );

			if ( match == false ) {
				index = i + 14;
				break;
			}
		}

		log.info( "Index of uniqueness : " + index );
	}

	private static boolean checkIfMatchingCharacters( final String input ) {

		boolean match = false;
		final char[] inp = input.toCharArray();

		for ( int i = 0; i < input.length(); i++ ) {
			for ( int j = i + 1; j < input.length(); j++ ) {
				if ( inp[i] == inp[j] ) {
					match = true;
					break;
				}
			}
		}
		return match;
	}
}

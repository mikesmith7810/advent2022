package com.mike.day3.part2.application.calculator;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

	private final static Map<String, Integer> lowerCaseAlphabetMap = new HashMap<String, Integer>() {
		{
			put( "a", 1 );
			put( "b", 2 );
			put( "c", 3 );
			put( "d", 4 );
			put( "e", 5 );
			put( "f", 6 );
			put( "g", 7 );
			put( "h", 8 );
			put( "i", 9 );
			put( "j", 10 );
			put( "k", 11 );
			put( "l", 12 );
			put( "m", 13 );
			put( "n", 14 );
			put( "o", 15 );
			put( "p", 16 );
			put( "q", 17 );
			put( "r", 18 );
			put( "s", 19 );
			put( "t", 20 );
			put( "u", 21 );
			put( "v", 22 );
			put( "w", 23 );
			put( "x", 24 );
			put( "y", 25 );
			put( "z", 26 );
			put( "A", 27 );
			put( "M", 39 );
		}
	};
	public final static Map<String, Integer> upperCaseAlphabetMap = new HashMap<String, Integer>() {
		{
			put( "A", 27 );
			put( "B", 28 );
			put( "C", 29 );
			put( "D", 30 );
			put( "E", 31 );
			put( "F", 32 );
			put( "G", 33 );
			put( "H", 34 );
			put( "I", 35 );
			put( "J", 36 );
			put( "K", 37 );
			put( "L", 38 );
			put( "M", 39 );
			put( "N", 40 );
			put( "O", 42 );
			put( "P", 42 );
			put( "Q", 43 );
			put( "R", 44 );
			put( "S", 45 );
			put( "T", 46 );
			put( "U", 47 );
			put( "V", 48 );
			put( "W", 49 );
			put( "X", 50 );
			put( "Y", 51 );
			put( "Z", 52 );
		}
	};

	public static Integer getCommonItemPriority( final Map.Entry<String, String> entry ) {

		final String key = entry.getKey();
		final String value = entry.getValue();

		char commonChar = ' ';
		for ( int i = 0; i < key.length(); i++ ) {
			for ( int j = 0; j < value.length(); j++ ) {
				if ( key.charAt( i ) == value.charAt( j ) ) {
					commonChar = key.charAt( i );
				}
			}
		}

		Integer priority = 0;
		if ( Character.isLowerCase( commonChar ) )
			priority = lowerCaseAlphabetMap.get( Character.toString( commonChar ) );
		else
			priority = upperCaseAlphabetMap.get( Character.toString( commonChar ) );

		return priority;
	}
}

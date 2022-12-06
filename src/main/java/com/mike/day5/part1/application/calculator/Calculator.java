package com.mike.day5.part1.application.calculator;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {

	public static boolean checkIfOneRangeCompletelyOverlaps( Map.Entry<String, String> entry ) {
		final String pair1 = entry.getKey();
		final String pair2 = entry.getValue();

		return checkIfPair1RangeIsInPair2( pair1, pair2 );
	}

	private static boolean checkIfPair1RangeIsInPair2( final String pair1, final String pair2 ) {
		Integer start1 = Integer.valueOf( pair1.substring( 0, pair1.indexOf( "-" ) ) );
		Integer end1 = Integer.valueOf( pair1.substring( pair1.indexOf( "-" ) + 1 ) );
		Integer start2 = Integer.valueOf( pair2.substring( 0, pair2.indexOf( "-" ) ) );
		Integer end2 = Integer.valueOf( pair2.substring( pair2.indexOf( "-" ) + 1 ) );

		if ( start1 >= start2 && end1 <= end2 )
			return true;
		else if ( start2 >= start1 && end2 <= end1 )
			return true;
		else
			return false;
	}
}

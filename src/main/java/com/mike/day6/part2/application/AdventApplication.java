package com.mike.day6.part2.application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import com.mike.day6.part2.application.parser.InputParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdventApplication {
	public static void main( final String[] args ) throws Exception {
		log.info( "Day 4" );

		final ArrayList<Character> entries = InputParser.readInput( "day6/example.txt" );

		AtomicInteger counter = new AtomicInteger( 0 );

		int index = entries.stream().map( character -> {
			int marker = counter.getAndIncrement();
			checkIfMatchingCharacters( List.of(

					entries.get( marker ), entries.get( marker + 1 ), entries.get( marker + 2 ),
					entries.get( marker + 3 ) ) );

			return marker + 4;

		} ).findFirst().get();

		log.info( "Index of uniqueness : " + index );
	}

	private static boolean checkIfMatchingCharacters( final List<Character> characters ) {

		Set<Character> items = new HashSet<>();

		return characters.stream()
				.filter( character -> !items.add( character ) )
				.collect( Collectors.toList() )
				.size() != 4;
	}
}

package com.mike.day2.part2.application;

import java.util.List;
import java.util.Map;

import com.mike.day2.part2.application.calculator.Calculator;
import com.mike.day2.part2.application.hand.Hand;
import com.mike.day2.part2.application.parser.InputParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdventApplication {
	public static void main( final String[] args ) throws Exception {
		log.info( "Day 2" );

		final List<Map.Entry<Hand, String>> entries = InputParser.readInput( "day2/actual.txt" );

		Integer score = entries.stream()
				.map( entry -> Calculator.getRoundScore( entry ) )
				.mapToInt( Integer::intValue )
				.sum();

		log.info( "Score : " + score.intValue() );

	}
}

package com.mike.day5.part1.application;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.mike.day5.part1.application.calculator.Calculator;
import com.mike.day5.part1.application.parser.InputParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdventApplication {
	public static void main( final String[] args ) throws Exception {
		log.info( "Day 4" );

		final List<Map.Entry<String, String>> entries = InputParser.readInput( "day4/actual.txt" );

		final Integer sum = entries.stream()
				.filter( entry -> Calculator.checkIfOneRangeCompletelyOverlaps( entry ) )
				.collect( Collectors.toList() )
				.size();

		log.info( "Sum of overlapping ranges : " + sum );
	}
}

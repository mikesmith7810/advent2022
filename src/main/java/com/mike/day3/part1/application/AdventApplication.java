package com.mike.day3.part1.application;

import java.util.List;
import java.util.Map;

import com.mike.day3.part1.application.parser.InputParser;
import com.mike.day3.part2.application.calculator.Calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdventApplication {
	public static void main( final String[] args ) throws Exception {
		log.info( "Day 2" );

		final List<Map.Entry<String, String>> entries = InputParser.readInput( "day3/actual.txt" );

		final Integer sum = entries.stream()
				.map( entry -> Calculator.getCommonItemPriority( entry ) )
				.mapToInt( Integer::intValue )
				.sum();

		log.info( "Sum of priorities : " + sum );
	}
}

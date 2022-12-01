package com.mike.day1.part2.application;

import java.util.List;

import com.mike.day1.part2.application.calculator.Calculator;
import com.mike.day1.part2.application.dto.Elf;
import com.mike.day1.part2.application.parser.Grouper;
import com.mike.day1.part2.application.parser.InputParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdventApplication {
	public static void main( final String[] args ) throws Exception {
		log.info( "Day 1" );

		InputParser inputParser = new InputParser();
		List<String> entries = inputParser.readInput( "day1/actual.txt" );

		Grouper grouper = new Grouper();
		List<Elf> elves = grouper.groupElves( entries );

		Calculator calculator = new Calculator();
		int calories = calculator.getHighestCalories( elves );

		log.info( "Highest Calories : " + calories );

	}
}

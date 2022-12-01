package com.mike.day1.part2.application.calculator;

import java.util.Collections;
import java.util.List;

import com.mike.day1.part2.application.dto.Elf;

public class Calculator {
	public int getHighestCalories( List<Elf> elves ) {
		return elves.stream()
				.map( elf -> elf.getCalories() )
				.sorted( Collections.reverseOrder() )
				.limit( 3 )
				.mapToInt( Integer::intValue )
				.sum();
	}
}

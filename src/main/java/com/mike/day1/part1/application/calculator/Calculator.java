package com.mike.day1.part1.application.calculator;

import java.util.List;

import com.mike.day1.part1.application.dto.Elf;

public class Calculator {
	public int getHighestCalories( List<Elf> elves ) {
		return elves.stream().map( elf -> elf.getCalories() ).max( Integer::compare ).get();
	}
}

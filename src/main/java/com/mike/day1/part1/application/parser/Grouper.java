package com.mike.day1.part1.application.parser;

import java.util.ArrayList;
import java.util.List;

import com.mike.day1.part1.application.dto.Elf;

public class Grouper {

	public List<Elf> groupElves( final List<String> calories ) {
		List<Elf> elves = new ArrayList<>();

		Elf elf = Elf.builder().build();

		for ( String calorie : calories ) {
			if ( !calorie.equals( "" ) ) {
				elf.setCalories( elf.getCalories() + Integer.valueOf( calorie ) );
			} else {
				elves.add( elf );
				elf = Elf.builder().build();
			}
		}

		return elves;

	}
}

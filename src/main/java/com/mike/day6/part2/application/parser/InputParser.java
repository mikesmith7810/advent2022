package com.mike.day6.part2.application.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InputParser {

	public static ArrayList<Character> readInput( final String filename ) throws Exception {

		ArrayList<Character> characters = new ArrayList<>();

		final Path path = Paths
				.get( com.mike.day6.part1.application.parser.InputParser.class.getClassLoader()
						.getResource( filename )
						.toURI() );

		FileReader fr = new FileReader( path.toFile() );
		// Create the BufferedReader object
		BufferedReader br = new BufferedReader( fr );
		int character = 0;
		// Read character by character
		while ( ( character = br.read() ) != -1 ) {
			// convert the integer to char
			char ch = (char) character;

			characters.add( ch );
		}

		return characters;
	}
}

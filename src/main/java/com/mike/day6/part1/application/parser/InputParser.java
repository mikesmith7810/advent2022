package com.mike.day6.part1.application.parser;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InputParser {

	public static String readInput( final String filename ) throws Exception {
		final Path path = Paths
				.get( InputParser.class.getClassLoader().getResource( filename ).toURI() );

		return Files.readString( path );
	}
}

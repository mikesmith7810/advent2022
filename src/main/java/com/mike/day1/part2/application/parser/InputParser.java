package com.mike.day1.part2.application.parser;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InputParser {

	public List<String> readInput( final String filename ) throws Exception {

		List<String> inputLines = new ArrayList<>();

		final Path path = Paths.get( getClass().getClassLoader().getResource( filename ).toURI() );

		final Stream<String> lines = Files.lines( path );

		lines.forEach( line -> inputLines.add( line ) );

		return inputLines;
	}
}

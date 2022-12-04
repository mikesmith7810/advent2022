package com.mike.day4.part1.application.parser;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InputParser {

	public static List<Map.Entry<String, String>> readInput( final String filename )
			throws Exception {

		final List<Map.Entry<String, String>> inputLines = new ArrayList<>();

		final Path path = Paths
				.get( InputParser.class.getClassLoader().getResource( filename ).toURI() );

		final Stream<String> lines = Files.lines( path );

		final Function<String, Map.Entry<String, String>> splitter = line -> {
			final String pair1 = line.substring( 0, line.indexOf( "," ) );
			final String pair2 = line.substring( line.indexOf( "," ) + 1 );

			return new AbstractMap.SimpleEntry<String, String>( pair1, pair2 );
		};

		lines.forEach( line -> inputLines.add( splitter.apply( line ) ) );

		return inputLines;
	}
}

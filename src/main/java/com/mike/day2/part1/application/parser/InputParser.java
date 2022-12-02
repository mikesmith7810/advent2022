package com.mike.day2.part1.application.parser;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import com.mike.day2.part1.application.hand.Hand;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InputParser {

	public static List<Map.Entry<Hand, Hand>> readInput( final String filename ) throws Exception {

		final List<Map.Entry<Hand, Hand>> inputLines = new ArrayList<>();

		final Path path = Paths
				.get( InputParser.class.getClassLoader().getResource( filename ).toURI() );

		final Stream<String> lines = Files.lines( path );

		lines.forEach( line -> inputLines.add( new AbstractMap.SimpleEntry<Hand, Hand>(
				Hand.forIdentifier1( line.split( " " )[0] ),
				Hand.forIdentifier2( line.split( " " )[1] ) ) ) );

		return inputLines;
	}
}

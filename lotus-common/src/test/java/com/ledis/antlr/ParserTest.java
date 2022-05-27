package com.ledis.antlr;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.atn.ATN;
import org.junit.Test;

public class ParserTest {

	@Test
	public void TestParserPattern(){
		Parser parser = new Parser(null) {
			@Override
			public String[] getTokenNames() {
				return new String[]{"WORD"};
			}

			@Override
			public String[] getRuleNames() {
				return new String[]{"r1"};
			}

			@Override
			public String getGrammarFileName() {
				return "Test1";
			}

			@Override
			public ATN getATN() {
				return null;
			}
		};
	}

}

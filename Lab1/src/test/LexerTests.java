package test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

import lexer.Lexer;

import org.junit.Test;

import frontend.Token;
import frontend.Token.Type;
import static frontend.Token.Type.*;

/**
 * This class contains unit tests for your lexer. Currently, there is only one test, but you
 * are strongly encouraged to write your own tests.
 */
public class LexerTests {
	// helper method to run tests; no need to change this
	private final void runtest(String input, Token... output) {
		Lexer lexer = new Lexer(new StringReader(input));
		int i=0;
		Token actual=new Token(MODULE, 0, 0, ""), expected;
		try {
			do {
				assertTrue(i < output.length);
				expected = output[i++];
				try {
					actual = lexer.nextToken();
					assertEquals(expected, actual);
				} catch(Error e) {
					if(expected != null)
						fail(e.getMessage());
					/* return; */
				}
			} while(!actual.isEOF());
		} catch (IOException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	/** Example unit test. */
	@Test
	public void testKWs() {
		// first argument to runtest is the string to lex; the remaining arguments
		// are the expected tokens
		runtest("module false return while",
				new Token(MODULE, 0, 0, "module"),
				new Token(FALSE, 0, 7, "false"),
				new Token(RETURN, 0, 13, "return"),
				new Token(WHILE, 0, 20, "while"),
				new Token(EOF, 0, 25, ""));
	}

	@Test
	public void testKWsWithNewLine() {
		// first argument to runtest is the string to lex; the remaining arguments
		// are the expected tokens
		runtest("module false\n\treturn while",
				new Token(MODULE, 0, 0, "module"),
				new Token(FALSE, 0, 7, "false"),
				new Token(RETURN, 1, 1, "return"),
				new Token(WHILE, 1, 8, "while"),
				new Token(EOF, 1, 13, ""));
	}

	@Test
	public void testPSs() {
		runtest(", [ module",
				new Token(COMMA, 0, 0, ","),
				new Token(LBRACKET, 0, 2, "["),
				new Token(MODULE, 0, 4, "module"),
				new Token(EOF, 0, 10, ""));
	}

	@Test
	public void testOperators() {
		runtest("+==<==",
				new Token(PLUS, 0, 0, "+"),
				new Token(EQEQ, 0, 1, "=="),
				new Token(LEQ, 0, 3, "<="),
				new Token(EQL, 0, 5, "="),
				new Token(EOF, 0, 6, ""));
	}

	@Test
	public void testIDs1() {
		runtest("M m_ m0 m0_",
				new Token(ID, 0, 0, "M"),
				new Token(ID, 0, 2, "m_"),
				new Token(ID, 0, 5, "m0"),
				new Token(ID, 0, 8, "m0_"),
				new Token(EOF, 0, 11, ""));
	}

//	@Test
//	public void testIDs2() {
//		runtest("_m",
//				new Token(EOF, 0, 0, "_m"));
//	}

	@Test
	public void testIntegerLiteral1() {
		runtest("12 0012 +12 -12 12.0 12.12 0012.12",
				new Token(INT_LITERAL, 0, 0, "12"),
				new Token(INT_LITERAL, 0, 3, "0012"),
				new Token(PLUS, 0, 8, "+"),
				new Token(INT_LITERAL, 0, 9, "12"),
				new Token(MINUS, 0, 12, "-"),
				new Token(INT_LITERAL, 0, 13, "12"),
				new Token(INT_LITERAL, 0, 16, "12.0"),
				new Token(INT_LITERAL, 0, 21, "12.12"),
				new Token(INT_LITERAL, 0, 27, "0012.12"),
				new Token(EOF, 0, 34, ""));
	}



	@Test
	public void testStringLiteralWithDoubleQuote() {
		runtest("\"\"\"",
				new Token(STRING_LITERAL, 0, 0, ""),
				(Token)null,
				new Token(EOF, 0, 3, ""));
	}

	@Test
	public void testStringLiteral1() {
		runtest("\"\\n\"",
				new Token(STRING_LITERAL, 0, 0, "\\n"),
				new Token(EOF, 0, 4, ""));
	}

	@Test
	public void testStringLiteral2() {
		runtest("\"module\"",
				new Token(STRING_LITERAL, 0, 0, "module"),
				new Token(EOF, 0, 8, ""));
	}
}

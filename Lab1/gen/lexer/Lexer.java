/* The following code was generated by JFlex 1.4 on 16/9/18 2:06 PM */

/* You do not need to change anything up here. */
package lexer;

import frontend.Token;
import static frontend.Token.Type.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4
 * on 16/9/18 2:06 PM from the specification file
 * <tt>/Users/anqitu/Workspaces/NTU/CZ3007/3007-lab1/Lab1/src/frontend/lexer.flex</tt>
 */
public final class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\1\1\0\1\1\1\1\22\0\1\1\1\51\1\6"+
    "\5\0\1\37\1\42\1\53\1\52\1\34\1\50\1\5\1\44\12\3"+
    "\1\0\1\43\1\47\1\45\1\46\2\0\32\2\1\35\1\0\1\40"+
    "\1\0\1\4\1\0\1\22\1\21\1\30\1\15\1\20\1\24\1\2"+
    "\1\27\1\7\1\2\1\31\1\17\1\10\1\23\1\12\1\11\1\2"+
    "\1\13\1\25\1\14\1\16\1\33\1\26\1\2\1\32\1\2\1\36"+
    "\1\0\1\41\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\12\3\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\1\1\22\1\23\2\0"+
    "\1\24\2\3\1\25\13\3\1\26\1\27\1\30\1\31"+
    "\1\4\1\3\1\32\17\3\1\33\1\34\1\35\4\3"+
    "\1\36\5\3\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\3\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\54\0\130\0\204\0\260\0\334\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268"+
    "\0\54\0\54\0\54\0\54\0\54\0\54\0\54\0\54"+
    "\0\54\0\u0294\0\u02c0\0\u02ec\0\54\0\u0318\0\54\0\54"+
    "\0\u0344\0\260\0\54\0\u0370\0\u039c\0\130\0\u03c8\0\u03f4"+
    "\0\u0420\0\u044c\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528\0\u0554"+
    "\0\u0580\0\54\0\54\0\54\0\54\0\u0344\0\u05ac\0\130"+
    "\0\u05d8\0\u0604\0\u0630\0\u065c\0\u0688\0\u06b4\0\u06e0\0\u070c"+
    "\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\u0814\0\u0840\0\130"+
    "\0\130\0\130\0\u086c\0\u0898\0\u08c4\0\u08f0\0\130\0\u091c"+
    "\0\u0948\0\u0974\0\u09a0\0\u09cc\0\130\0\130\0\130\0\130"+
    "\0\130\0\130\0\u09f8\0\130";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\2\1\6\1\7\1\10"+
    "\1\11\1\4\1\12\1\13\3\4\1\14\1\15\2\4"+
    "\1\16\1\4\1\17\4\4\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\56\0\3\4\2\0"+
    "\25\4\23\0\1\5\1\0\1\41\46\0\6\42\1\43"+
    "\45\42\2\0\3\4\2\0\1\4\1\44\12\4\1\45"+
    "\1\46\7\4\22\0\3\4\2\0\3\4\1\47\21\4"+
    "\22\0\3\4\2\0\7\4\1\50\15\4\22\0\3\4"+
    "\2\0\11\4\1\51\13\4\22\0\3\4\2\0\4\4"+
    "\1\52\16\4\1\53\1\4\22\0\3\4\2\0\10\4"+
    "\1\54\14\4\22\0\3\4\2\0\3\4\1\55\1\56"+
    "\20\4\22\0\3\4\2\0\13\4\1\57\11\4\22\0"+
    "\3\4\2\0\20\4\1\60\4\4\22\0\3\4\2\0"+
    "\3\4\1\61\21\4\65\0\1\62\53\0\1\63\53\0"+
    "\1\64\53\0\1\65\11\0\1\66\52\0\3\4\2\0"+
    "\2\4\1\67\22\4\22\0\3\4\2\0\5\4\1\70"+
    "\17\4\22\0\3\4\2\0\6\4\1\71\16\4\22\0"+
    "\3\4\2\0\12\4\1\72\12\4\22\0\3\4\2\0"+
    "\5\4\1\73\17\4\22\0\3\4\2\0\7\4\1\74"+
    "\15\4\22\0\3\4\2\0\2\4\1\75\22\4\22\0"+
    "\3\4\2\0\16\4\1\76\6\4\22\0\3\4\2\0"+
    "\3\4\1\77\21\4\22\0\3\4\2\0\11\4\1\100"+
    "\13\4\22\0\3\4\2\0\10\4\1\101\14\4\22\0"+
    "\3\4\2\0\1\102\24\4\22\0\3\4\2\0\1\103"+
    "\24\4\22\0\3\4\2\0\3\4\1\104\21\4\22\0"+
    "\3\4\2\0\7\4\1\105\15\4\22\0\3\4\2\0"+
    "\10\4\1\106\14\4\22\0\3\4\2\0\7\4\1\107"+
    "\15\4\22\0\3\4\2\0\11\4\1\110\13\4\22\0"+
    "\3\4\2\0\11\4\1\111\13\4\22\0\3\4\2\0"+
    "\11\4\1\112\13\4\22\0\3\4\2\0\10\4\1\113"+
    "\14\4\22\0\3\4\2\0\13\4\1\114\11\4\22\0"+
    "\3\4\2\0\16\4\1\115\6\4\22\0\3\4\2\0"+
    "\10\4\1\116\14\4\22\0\3\4\2\0\6\4\1\117"+
    "\16\4\22\0\3\4\2\0\4\4\1\120\20\4\22\0"+
    "\3\4\2\0\10\4\1\121\14\4\22\0\3\4\2\0"+
    "\1\122\24\4\22\0\3\4\2\0\4\4\1\123\20\4"+
    "\22\0\3\4\2\0\11\4\1\124\13\4\22\0\3\4"+
    "\2\0\22\4\1\125\2\4\22\0\3\4\2\0\11\4"+
    "\1\126\13\4\22\0\3\4\2\0\11\4\1\117\13\4"+
    "\22\0\3\4\2\0\5\4\1\127\17\4\22\0\3\4"+
    "\2\0\11\4\1\130\13\4\22\0\3\4\2\0\21\4"+
    "\1\131\3\4\22\0\3\4\2\0\14\4\1\132\10\4"+
    "\22\0\3\4\2\0\13\4\1\133\11\4\22\0\3\4"+
    "\2\0\14\4\1\134\10\4\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2596];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\15\1\11\11\3\1\1\11\1\1\2\11"+
    "\2\0\1\11\16\1\4\11\47\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
	/* These two methods are for the convenience of rules to create toke objects.
	* If you do not want to use them, delete them
	* otherwise add the code in 
	*/
	
	private Token token(Token.Type type) {
    return new Token(type, yyline, yycolumn, yytext());
	}
	
	/* Use this method for rules where you need to process yytext() to get the lexeme of the token.
	 *
	 * Useful for string literals; e.g., the quotes around the literal are part of yytext(),
	 *       but they should not be part of the lexeme. 
	*/
	private Token token(Token.Type type, String text) {
		return new Token(type, yyline, yycolumn, text);
	}

	private String trimQuotes(String text) {
	  return text.replaceAll("^\"|\"$", "");
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { /* ignore */
          }
        case 38: break;
        case 35: 
          { return token(Token.Type.PUBLIC);
          }
        case 39: break;
        case 20: 
          { return token(Token.Type.STRING_LITERAL, trimQuotes(yytext()));
          }
        case 40: break;
        case 11: 
          { return token(Token.Type.RPAREN);
          }
        case 41: break;
        case 21: 
          { return token(Token.Type.IF);
          }
        case 42: break;
        case 26: 
          { return token(Token.Type.INT);
          }
        case 43: break;
        case 18: 
          { return token(Token.Type.PLUS);
          }
        case 44: break;
        case 9: 
          { return token(Token.Type.RBRACKET);
          }
        case 45: break;
        case 27: 
          { return token(Token.Type.TRUE);
          }
        case 46: break;
        case 13: 
          { return token(Token.Type.DIV);
          }
        case 47: break;
        case 28: 
          { return token(Token.Type.TYPE);
          }
        case 48: break;
        case 1: 
          { throw new Error("unexpected character '" + yytext() + "'");
          }
        case 49: break;
        case 29: 
          { return token(Token.Type.ELSE);
          }
        case 50: break;
        case 19: 
          { return token(Token.Type.TIMES);
          }
        case 51: break;
        case 34: 
          { return token(Token.Type.MODULE);
          }
        case 52: break;
        case 3: 
          { return token(Token.Type.ID);
          }
        case 53: break;
        case 23: 
          { return token(Token.Type.GEQ);
          }
        case 54: break;
        case 36: 
          { return token(Token.Type.RETURN);
          }
        case 55: break;
        case 30: 
          { return token(Token.Type.WHILE);
          }
        case 56: break;
        case 31: 
          { return token(Token.Type.BREAK);
          }
        case 57: break;
        case 14: 
          { return token(Token.Type.EQL);
          }
        case 58: break;
        case 25: 
          { return token(Token.Type.NEQ);
          }
        case 59: break;
        case 7: 
          { return token(Token.Type.LCURLY);
          }
        case 60: break;
        case 33: 
          { return token(Token.Type.IMPORT);
          }
        case 61: break;
        case 17: 
          { return token(Token.Type.MINUS);
          }
        case 62: break;
        case 8: 
          { return token(Token.Type.LPAREN);
          }
        case 63: break;
        case 15: 
          { return token(Token.Type.GT);
          }
        case 64: break;
        case 16: 
          { return token(Token.Type.LT);
          }
        case 65: break;
        case 5: 
          { return token(Token.Type.COMMA);
          }
        case 66: break;
        case 22: 
          { return token(Token.Type.EQEQ);
          }
        case 67: break;
        case 32: 
          { return token(Token.Type.FALSE);
          }
        case 68: break;
        case 37: 
          { return token(Token.Type.BOOLEAN);
          }
        case 69: break;
        case 4: 
          { return token(Token.Type.INT_LITERAL, trimQuotes(yytext()));
          }
        case 70: break;
        case 6: 
          { return token(Token.Type.LBRACKET);
          }
        case 71: break;
        case 10: 
          { return token(Token.Type.RCURLY);
          }
        case 72: break;
        case 24: 
          { return token(Token.Type.LEQ);
          }
        case 73: break;
        case 12: 
          { return token(Token.Type.SEMICOLON);
          }
        case 74: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { return token(EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

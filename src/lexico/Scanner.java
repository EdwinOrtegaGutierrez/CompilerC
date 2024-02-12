/* The following code was generated by JFlex 1.6.1 */

/*
    ALVAREZ VELAZQUEZ EDOSN ALI
    ORTEGA GUTIERREZ EDWIN OMAR
    SANCHEZ REYES DANIA GUADALUPE
*/

package lexico;

import java_cup.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/edwin/OneDrive/Escritorio/CompilerC/src/lexico/c_lexer.flex</tt>
 */
class Scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\50\1\71\1\71\1\57\22\0\1\60\1\40\1\61\1\0"+
    "\1\63\1\35\1\41\1\62\1\44\1\45\1\46\1\31\1\0\1\33"+
    "\1\54\1\34\1\67\10\0\1\70\1\53\1\0\1\36\1\32\1\37"+
    "\1\52\1\0\1\64\30\0\1\65\1\55\1\51\1\56\1\43\1\66"+
    "\1\0\1\1\1\5\1\11\1\16\1\7\1\17\1\23\1\13\1\15"+
    "\1\0\1\10\1\20\1\21\1\14\1\4\1\27\1\0\1\6\1\12"+
    "\1\3\1\2\1\30\1\25\1\22\1\26\1\24\1\0\1\42\1\0"+
    "\1\47\6\0\1\71\u1fa2\0\1\71\1\71\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\20\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\1\1\15\1\16"+
    "\1\17\4\1\20\0\1\20\1\21\7\0\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\2\0\1\42"+
    "\1\43\30\0\1\44\2\0\1\45\6\0\1\46\1\47"+
    "\1\50\7\0\1\51\6\0\1\52\1\53\1\0\1\54"+
    "\2\0\1\55\11\0\1\56\1\57\1\0\1\60\12\0"+
    "\1\61\1\0\1\62\4\0\1\63\2\0\1\64\5\0"+
    "\1\65\1\66\13\0\1\67\1\0\1\70\1\0\1\71"+
    "\1\72\1\73\1\74\1\75\1\76\14\0\1\77\2\0"+
    "\1\100\1\0\1\101\10\0\1\102\1\103\1\104\1\105"+
    "\22\0\1\106\2\0\1\107\10\0\1\110\1\111\12\0"+
    "\1\112\1\113\16\0\1\114\1\115";

  private static int [] zzUnpackAction() {
    int [] result = new int[291];
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
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2\0\u032c\0\u0366"+
    "\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc\0\u0536"+
    "\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658\0\u0692\0\72\0\72"+
    "\0\u06cc\0\u0706\0\u0740\0\u077a\0\u07b4\0\u07ee\0\u0828\0\u0862"+
    "\0\u089c\0\u08d6\0\u0910\0\u094a\0\u0984\0\u09be\0\u09f8\0\u0a32"+
    "\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\72\0\u0b54\0\u0b8e\0\u0bc8"+
    "\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea\0\72\0\72\0\72"+
    "\0\72\0\72\0\72\0\72\0\u0d24\0\u0d5e\0\72\0\u0d98"+
    "\0\72\0\72\0\72\0\72\0\72\0\u0dd2\0\u0e0c\0\72"+
    "\0\72\0\u0e46\0\u0e80\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68\0\u0fa2"+
    "\0\u0fdc\0\u1016\0\u1050\0\u108a\0\u10c4\0\u10fe\0\u1138\0\u1172"+
    "\0\u11ac\0\u11e6\0\u1220\0\u125a\0\u1294\0\u12ce\0\u1308\0\u1342"+
    "\0\u137c\0\72\0\u13b6\0\u13f0\0\72\0\u142a\0\u1464\0\u149e"+
    "\0\u14d8\0\u1512\0\u154c\0\72\0\72\0\72\0\u1586\0\u15c0"+
    "\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\72\0\u171c\0\u1756"+
    "\0\u1790\0\u17ca\0\u1804\0\u183e\0\72\0\72\0\u1878\0\72"+
    "\0\u18b2\0\u18ec\0\72\0\u1926\0\u1960\0\u199a\0\u19d4\0\u1a0e"+
    "\0\u1a48\0\u1a82\0\u1abc\0\u1af6\0\72\0\72\0\u1b30\0\72"+
    "\0\u1b6a\0\u1ba4\0\u1bde\0\u1c18\0\u1c52\0\u1c8c\0\u1cc6\0\u1d00"+
    "\0\u1d3a\0\u1d74\0\72\0\u1dae\0\72\0\u1de8\0\u1e22\0\u1e5c"+
    "\0\u1e96\0\72\0\u1ed0\0\u1f0a\0\72\0\u1f44\0\u1f7e\0\u1fb8"+
    "\0\u1ff2\0\u202c\0\72\0\72\0\u2066\0\u20a0\0\u20da\0\u2114"+
    "\0\u214e\0\u2188\0\u21c2\0\u21fc\0\u2236\0\u2270\0\u22aa\0\72"+
    "\0\u22e4\0\72\0\u231e\0\72\0\72\0\72\0\72\0\72"+
    "\0\72\0\u2358\0\u2392\0\u23cc\0\u2406\0\u2440\0\u247a\0\u24b4"+
    "\0\u24ee\0\u2528\0\u2562\0\u259c\0\u25d6\0\72\0\u2610\0\u264a"+
    "\0\72\0\u2684\0\72\0\u26be\0\u26f8\0\u2732\0\u276c\0\u27a6"+
    "\0\u27e0\0\u281a\0\u2854\0\72\0\72\0\72\0\72\0\u288e"+
    "\0\u28c8\0\u2902\0\u293c\0\u2976\0\u29b0\0\u29ea\0\u2a24\0\u2a5e"+
    "\0\u2a98\0\u2ad2\0\u2b0c\0\u2b46\0\u2b80\0\u2bba\0\u2bf4\0\u2c2e"+
    "\0\u2c68\0\72\0\u2ca2\0\u2cdc\0\72\0\u2d16\0\u2d50\0\u2d8a"+
    "\0\u2dc4\0\u2dfe\0\u2e38\0\u2e72\0\u2eac\0\72\0\72\0\u2ee6"+
    "\0\u2f20\0\u2f5a\0\u2f94\0\u2fce\0\u3008\0\u3042\0\u307c\0\u30b6"+
    "\0\u30f0\0\72\0\72\0\u312a\0\u3164\0\u319e\0\u31d8\0\u3212"+
    "\0\u324c\0\u3286\0\u32c0\0\u32fa\0\u3334\0\u336e\0\u33a8\0\u33e2"+
    "\0\u341c\0\72\0\72";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[291];
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
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\2\1\11\1\12\2\2\1\13\1\14\1\15\1\16"+
    "\2\2\1\17\1\2\1\20\2\2\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\2\1\36\1\37\1\40\1\41\3\2"+
    "\1\42\1\2\1\40\1\2\1\43\1\44\6\2\75\0"+
    "\1\45\103\0\1\46\103\0\1\47\51\0\1\50\72\0"+
    "\1\51\76\0\1\52\3\0\1\53\1\0\1\54\50\0"+
    "\1\55\2\0\1\56\6\0\1\57\61\0\1\60\7\0"+
    "\1\61\1\0\1\62\7\0\1\63\60\0\1\64\2\0"+
    "\1\65\56\0\1\66\2\0\1\67\66\0\1\70\13\0"+
    "\1\71\55\0\1\72\71\0\1\73\100\0\1\74\62\0"+
    "\1\75\116\0\1\76\1\77\71\0\1\100\71\0\1\101"+
    "\1\102\70\0\1\103\71\0\1\104\71\0\1\105\3\0"+
    "\1\106\65\0\1\107\4\0\1\110\64\0\1\111\71\0"+
    "\1\112\6\0\1\113\72\0\1\114\61\0\1\115\1\116"+
    "\41\0\1\117\41\0\1\120\56\0\1\121\73\0\1\122"+
    "\36\0\1\123\56\0\1\124\55\0\1\125\71\0\1\126"+
    "\30\0\1\127\100\0\1\130\2\0\1\131\103\0\1\132"+
    "\51\0\1\133\65\0\1\134\17\0\1\135\50\0\1\136"+
    "\101\0\1\137\62\0\1\140\100\0\1\141\73\0\1\142"+
    "\56\0\1\143\71\0\1\144\4\0\1\145\67\0\1\146"+
    "\110\0\1\147\1\150\62\0\1\151\57\0\1\152\70\0"+
    "\1\153\106\0\1\154\60\0\1\155\67\0\1\156\101\0"+
    "\1\157\60\0\1\160\103\0\1\161\71\0\1\162\2\0"+
    "\1\163\110\0\1\164\64\0\1\165\71\0\1\166\111\0"+
    "\1\167\25\0\1\170\134\0\1\171\53\0\1\172\107\0"+
    "\1\173\72\0\1\174\71\0\1\175\23\0\1\176\102\0"+
    "\1\177\60\0\1\200\74\0\1\201\63\0\1\202\72\0"+
    "\1\203\104\0\1\204\75\0\1\205\57\0\1\206\71\0"+
    "\1\207\71\0\1\210\65\0\1\211\6\0\1\212\65\0"+
    "\1\213\66\0\1\214\70\0\1\215\75\0\1\216\77\0"+
    "\1\217\64\0\1\220\65\0\1\221\73\0\1\222\65\0"+
    "\1\223\71\0\1\224\113\0\1\225\52\0\1\226\105\0"+
    "\1\227\67\0\1\230\54\0\1\231\141\0\1\232\22\0"+
    "\1\233\123\0\1\234\11\0\1\235\47\0\1\236\61\0"+
    "\1\237\130\0\1\240\71\0\1\241\41\0\1\242\62\0"+
    "\1\243\73\0\1\244\63\0\1\245\67\0\1\246\75\0"+
    "\1\247\65\0\1\250\100\0\1\251\57\0\1\252\103\0"+
    "\1\253\65\0\1\254\63\0\1\255\75\0\1\256\66\0"+
    "\1\257\76\0\1\260\100\0\1\261\53\0\1\262\72\0"+
    "\1\263\75\0\1\264\65\0\1\265\104\0\1\266\62\0"+
    "\1\267\137\0\1\270\60\0\1\271\111\0\1\272\56\0"+
    "\1\273\75\0\1\274\71\0\1\275\30\0\1\276\64\0"+
    "\1\277\76\0\1\300\60\0\1\301\102\0\1\302\71\0"+
    "\1\303\66\0\1\304\63\0\1\305\104\0\1\306\72\0"+
    "\1\307\65\0\1\310\65\0\1\311\102\0\1\312\66\0"+
    "\1\313\105\0\1\314\14\0\1\315\65\0\1\316\72\0"+
    "\1\317\100\0\1\320\52\0\1\321\41\0\1\322\131\0"+
    "\1\323\71\0\1\324\35\0\1\325\101\0\1\326\61\0"+
    "\1\327\64\0\1\330\72\0\1\331\106\0\1\332\134\0"+
    "\1\333\57\0\1\334\37\0\1\335\131\0\1\336\65\0"+
    "\1\337\103\0\1\340\55\0\1\341\101\0\1\342\72\0"+
    "\1\343\25\0\1\344\61\0\1\345\72\0\1\346\71\0"+
    "\1\347\136\0\1\350\16\0\1\351\140\0\1\352\75\0"+
    "\1\353\103\0\1\354\11\0\1\355\141\0\1\356\71\0"+
    "\1\357\64\0\1\360\40\0\1\361\127\0\1\362\55\0"+
    "\1\363\105\0\1\364\71\0\1\365\55\0\1\366\71\0"+
    "\1\367\45\0\1\370\65\0\1\371\125\0\1\372\100\0"+
    "\1\373\71\0\1\374\45\0\1\375\111\0\1\376\71\0"+
    "\1\377\51\0\1\u0100\47\0\1\u0101\133\0\1\u0102\21\0"+
    "\1\u0103\144\0\1\u0104\71\0\1\u0105\100\0\1\u0106\53\0"+
    "\1\u0107\32\0\1\u0108\116\0\1\u0109\103\0\1\u010a\71\0"+
    "\1\u010b\75\0\1\u010c\44\0\1\u010d\113\0\1\u010e\71\0"+
    "\1\u010f\37\0\1\u0110\141\0\1\u0111\66\0\1\u0112\72\0"+
    "\1\u0113\65\0\1\u0114\46\0\1\u0115\103\0\1\u0116\111\0"+
    "\1\u0117\52\0\1\u0118\112\0\1\u0119\54\0\1\u011a\52\0"+
    "\1\u011b\107\0\1\u011c\110\0\1\u011d\47\0\1\u011e\111\0"+
    "\1\u011f\54\0\1\u0120\76\0\1\u0121\47\0\1\u0122\103\0"+
    "\1\u0123\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13398];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\34\1\2\11\4\1\20\0\1\11\1\1"+
    "\7\0\7\11\2\1\1\11\1\1\5\11\2\0\2\11"+
    "\30\0\1\11\2\0\1\11\6\0\3\11\7\0\1\11"+
    "\6\0\2\11\1\0\1\11\2\0\1\11\11\0\2\11"+
    "\1\0\1\11\12\0\1\11\1\0\1\11\4\0\1\11"+
    "\2\0\1\11\5\0\2\11\13\0\1\11\1\0\1\11"+
    "\1\0\6\11\14\0\1\11\2\0\1\11\1\0\1\11"+
    "\10\0\4\11\22\0\1\11\2\0\1\11\10\0\2\11"+
    "\12\0\2\11\16\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[291];
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

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 186) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
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
          yycolumn += zzCharCount;
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
          zzEndReadL = zzEndRead;
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
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Simbolo no reconocido: " + yytext());
            }
          case 78: break;
          case 2: 
            { System.out.println(" Suma ");
            }
          case 79: break;
          case 3: 
            { System.out.println(" Asignación básica ");
            }
          case 80: break;
          case 4: 
            { System.out.println(" Resta ");
            }
          case 81: break;
          case 5: 
            { System.out.println(" Division ");
            }
          case 82: break;
          case 6: 
            { System.out.println(" Módulo ");
            }
          case 83: break;
          case 7: 
            { System.out.println(" Menor que ");
            }
          case 84: break;
          case 8: 
            { System.out.println(" Mayor que ");
            }
          case 85: break;
          case 9: 
            { System.out.println(" Negación lógica (NOT) ");
            }
          case 86: break;
          case 10: 
            { System.out.println(" AND binario ");
            }
          case 87: break;
          case 11: 
            { System.out.println(" OR binario ");
            }
          case 88: break;
          case 12: 
            { System.out.println(" XOR binario ");
            }
          case 89: break;
          case 13: 
            { System.out.println(" Multiplicacion ");
            }
          case 90: break;
          case 14: 
            { System.out.println(" Complemento a uno ");
            }
          case 91: break;
          case 15: 
            { /* Acciones específicas para salto de línea */
            }
          case 92: break;
          case 16: 
            { System.out.println("Especifica una condicion");
            }
          case 93: break;
          case 17: 
            { System.out.println(" Especifica el inicio de un bucle do-while ");
            }
          case 94: break;
          case 18: 
            { System.out.println(" Incremento ");
            }
          case 95: break;
          case 19: 
            { System.out.println(" Suma y asignacion ");
            }
          case 96: break;
          case 20: 
            { System.out.println(" Igual que ");
            }
          case 97: break;
          case 21: 
            { System.out.println(" Resta y asignación ");
            }
          case 98: break;
          case 22: 
            { System.out.println(" Decremento ");
            }
          case 99: break;
          case 23: 
            { System.out.println(" División y asignación ");
            }
          case 100: break;
          case 24: 
            { System.out.println(" Módulo y asignación ");
            }
          case 101: break;
          case 25: 
            { System.out.println(" Menor o igual que ");
            }
          case 102: break;
          case 26: 
            { System.out.println(" Desplazamiento a la izquierda ");
            }
          case 103: break;
          case 27: 
            { System.out.println(" Mayor que o igual que ");
            }
          case 104: break;
          case 28: 
            { System.out.println(" Desplazamiento a la derecha ");
            }
          case 105: break;
          case 29: 
            { System.out.println(" Diferente que / No igual que ");
            }
          case 106: break;
          case 30: 
            { System.out.println(" Asignación con AND binario ");
            }
          case 107: break;
          case 31: 
            { System.out.println(" Y lógico (AND) ");
            }
          case 108: break;
          case 32: 
            { System.out.println(" O lógico (OR) ");
            }
          case 109: break;
          case 33: 
            { System.out.println(" Asignación con XOR binario ");
            }
          case 110: break;
          case 34: 
            { System.out.println(" Llamada a función ");
            }
          case 111: break;
          case 35: 
            { System.out.println(" Multiplicación y asignación ");
            }
          case 112: break;
          case 36: 
            { System.out.println("Declara una variable de tipo entero");
            }
          case 113: break;
          case 37: 
            { System.out.println(" Especifica un bucle for ");
            }
          case 114: break;
          case 38: 
            { System.out.println(" Comparación a tres sentidos ");
            }
          case 115: break;
          case 39: 
            { System.out.println(" Asignación con desplazamiento a la izquierda ");
            }
          case 116: break;
          case 40: 
            { System.out.println(" Asignación con desplazamiento a la derecha ");
            }
          case 117: break;
          case 41: 
            { System.out.println(" Declara una variable local que se almacena en el stack ");
            }
          case 118: break;
          case 42: 
            { System.out.println(" Declara un conjunto de constantes enteras numeradas ");
            }
          case 119: break;
          case 43: 
            { System.out.println(" Especifica la parte else de una instruccion if ");
            }
          case 120: break;
          case 44: 
            { System.out.println(" Especifica un caso en una sentencia switch ");
            }
          case 121: break;
          case 45: 
            { System.out.println(" Declara una variable de tipo caracter ");
            }
          case 122: break;
          case 46: 
            { System.out.println("Declara una variable de tipo entero largo");
            }
          case 123: break;
          case 47: 
            { System.out.println(" Salta a una etiqueta especifica ");
            }
          case 124: break;
          case 48: 
            { System.out.println("Funcion sin valor");
            }
          case 125: break;
          case 49: 
            { System.out.println("Declara una union");
            }
          case 126: break;
          case 50: 
            { System.out.println(" Termina la ejecucion del bucle o la sentencia switch actual ");
            }
          case 127: break;
          case 51: 
            { System.out.println(" Declara una variable que no puede ser modificada ");
            }
          case 128: break;
          case 52: 
            { System.out.println("Declara una variable de tipo entero corto");
            }
          case 129: break;
          case 53: 
            { System.out.println(" Declara una variable de tipo coma flotante ");
            }
          case 130: break;
          case 54: 
            { System.out.println("Especifica un bucle while");
            }
          case 131: break;
          case 55: 
            { System.out.println("Devuelve un valor de una funcion");
            }
          case 132: break;
          case 56: 
            { System.out.println(" Declara una variable global que esta definida en otro archivo ");
            }
          case 133: break;
          case 57: 
            { System.out.println("Declara una variable local que se mantiene en la memoria despues de que la funcion termine");
            }
          case 134: break;
          case 58: 
            { System.out.println("Declara una estructura");
            }
          case 135: break;
          case 59: 
            { System.out.println("Declara una variable de tipo entero con signo");
            }
          case 136: break;
          case 60: 
            { System.out.println("Devuelve el tamano de un tipo de dato");
            }
          case 137: break;
          case 61: 
            { System.out.println("Especifica una sentencia switch");
            }
          case 138: break;
          case 62: 
            { System.out.println(" Declara una variable de tipo doble precision ");
            }
          case 139: break;
          case 63: 
            { System.out.println("Declara un nuevo tipo de dato");
            }
          case 140: break;
          case 64: 
            { System.out.println(" Especifica un caso por defecto en una sentencia switch ");
            }
          case 141: break;
          case 65: 
            { System.out.println("Enteros: " + yytext());
            }
          case 142: break;
          case 66: 
            { System.out.println("Declara una variable de tipo entero sin signo");
            }
          case 143: break;
          case 67: 
            { System.out.println("Declara una variable que se almacena en el registro");
            }
          case 144: break;
          case 68: 
            { System.out.println(" Salta a la siguiente iteracion del bucle actual ");
            }
          case 145: break;
          case 69: 
            { System.out.println("Declara una variable que puede ser modificada por hardware");
            }
          case 146: break;
          case 70: 
            { System.out.println("Comentarios unilinea: " + yytext());
            }
          case 147: break;
          case 71: 
            { System.out.println("Espacios: " + yytext());
            }
          case 148: break;
          case 72: 
            { System.out.println("Decimales: " + yytext());
            }
          case 149: break;
          case 73: 
            { System.out.println("Boleanos: " + yytext());
            }
          case 150: break;
          case 74: 
            { System.out.println("Cadenas: " + yytext());
            }
          case 151: break;
          case 75: 
            { System.out.println("Caracteres: " + yytext());
            }
          case 152: break;
          case 76: 
            { System.out.println("Comentarios multi: " + yytext());
            }
          case 153: break;
          case 77: 
            { System.out.println("Identificadores: " + yytext());
            }
          case 154: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

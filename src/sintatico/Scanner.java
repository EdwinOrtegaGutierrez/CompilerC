/* The following code was generated by JFlex 1.6.1 */

/*
    ALVAREZ VELAZQUEZ EDOSN ALI
    ORTEGA GUTIERREZ EDWIN OMAR
    SANCHEZ REYES DANIA GUADALUPE
*/

/*  package lexico; */

package sintatico;

import java_cup.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/sintatico/c_lexer.flex</tt>
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
    "\12\0\1\54\1\75\1\75\1\63\22\0\1\64\1\41\1\65\1\31"+
    "\1\67\1\36\1\42\1\66\1\45\1\46\1\47\1\32\1\0\1\34"+
    "\1\60\1\35\1\73\10\0\1\74\1\57\1\51\1\37\1\33\1\40"+
    "\1\56\1\0\1\70\30\0\1\71\1\61\1\55\1\62\1\44\1\72"+
    "\1\0\1\1\1\5\1\11\1\16\1\7\1\17\1\23\1\13\1\15"+
    "\1\0\1\10\1\20\1\21\1\14\1\4\1\27\1\0\1\6\1\12"+
    "\1\3\1\2\1\30\1\25\1\22\1\26\1\24\1\52\1\43\1\53"+
    "\1\50\6\0\1\75\u1fa2\0\1\75\1\75\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\23\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\4\1\20\0\1\25"+
    "\1\26\12\0\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\0\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\2\0\1\47\1\50\30\0\1\51"+
    "\2\0\1\52\11\0\1\53\1\54\1\0\1\55\7\0"+
    "\1\56\6\0\1\57\1\60\1\0\1\61\2\0\1\62"+
    "\11\0\1\63\1\0\1\64\2\0\1\65\14\0\1\66"+
    "\1\0\1\67\4\0\1\70\2\0\1\71\5\0\1\72"+
    "\1\0\1\73\16\0\1\74\1\0\1\75\1\0\1\76"+
    "\1\77\1\100\1\101\1\102\1\103\1\0\1\104\1\105"+
    "\15\0\1\106\2\0\1\107\3\0\1\110\10\0\1\111"+
    "\1\112\1\113\1\114\1\115\11\0\1\116\12\0\1\117"+
    "\2\0\1\120\10\0\1\121\1\122\12\0\1\123\1\124"+
    "\16\0\1\125\1\126";

  private static int [] zzUnpackAction() {
    int [] result = new int[323];
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
    "\0\0\0\76\0\174\0\272\0\370\0\u0136\0\u0174\0\u01b2"+
    "\0\u01f0\0\u022e\0\u026c\0\u02aa\0\u02e8\0\u0326\0\u0364\0\u03a2"+
    "\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8\0\u0516\0\u0554\0\u0592"+
    "\0\u05d0\0\u060e\0\u064c\0\u068a\0\u06c8\0\u0706\0\u0744\0\u0782"+
    "\0\76\0\u07c0\0\76\0\76\0\76\0\76\0\76\0\u07fe"+
    "\0\u083c\0\u087a\0\u08b8\0\u08f6\0\u0934\0\u0972\0\u09b0\0\u09ee"+
    "\0\u0a2c\0\u0a6a\0\u0aa8\0\u0ae6\0\u0b24\0\u0b62\0\u0ba0\0\u0bde"+
    "\0\u0c1c\0\u0c5a\0\u0c98\0\76\0\u0cd6\0\u0d14\0\u0d52\0\u0d90"+
    "\0\u0dce\0\u0e0c\0\u0e4a\0\u0e88\0\u0ec6\0\u0f04\0\u0f42\0\76"+
    "\0\76\0\76\0\76\0\76\0\76\0\76\0\u0f80\0\u0fbe"+
    "\0\u0ffc\0\76\0\u103a\0\76\0\76\0\76\0\76\0\76"+
    "\0\u1078\0\u10b6\0\76\0\76\0\u10f4\0\u1132\0\u1170\0\u11ae"+
    "\0\u11ec\0\u122a\0\u1268\0\u12a6\0\u12e4\0\u1322\0\u1360\0\u139e"+
    "\0\u13dc\0\u141a\0\u1458\0\u1496\0\u14d4\0\u1512\0\u1550\0\u158e"+
    "\0\u15cc\0\u160a\0\u1648\0\u1686\0\76\0\u16c4\0\u1702\0\76"+
    "\0\u1740\0\u177e\0\u17bc\0\u17fa\0\u1838\0\u1876\0\u18b4\0\u18f2"+
    "\0\u1930\0\76\0\76\0\u196e\0\76\0\u19ac\0\u19ea\0\u1a28"+
    "\0\u1a66\0\u1aa4\0\u1ae2\0\u1b20\0\76\0\u1b5e\0\u1b9c\0\u1bda"+
    "\0\u1c18\0\u1c56\0\u1c94\0\76\0\76\0\u1cd2\0\76\0\u1d10"+
    "\0\u1d4e\0\76\0\u1d8c\0\u1dca\0\u1e08\0\u1e46\0\u1e84\0\u1ec2"+
    "\0\u1f00\0\u1f3e\0\u1f7c\0\76\0\u1fba\0\76\0\u1ff8\0\u2036"+
    "\0\76\0\u2074\0\u20b2\0\u20f0\0\u212e\0\u216c\0\u21aa\0\u21e8"+
    "\0\u2226\0\u2264\0\u22a2\0\u22e0\0\u231e\0\76\0\u235c\0\76"+
    "\0\u239a\0\u23d8\0\u2416\0\u2454\0\76\0\u2492\0\u24d0\0\76"+
    "\0\u250e\0\u254c\0\u258a\0\u25c8\0\u2606\0\76\0\u2644\0\76"+
    "\0\u2682\0\u26c0\0\u26fe\0\u273c\0\u277a\0\u27b8\0\u27f6\0\u2834"+
    "\0\u2872\0\u28b0\0\u28ee\0\u292c\0\u296a\0\u29a8\0\76\0\u29e6"+
    "\0\76\0\u2a24\0\76\0\76\0\76\0\76\0\76\0\76"+
    "\0\u2a62\0\76\0\76\0\u2aa0\0\u2ade\0\u2b1c\0\u2b5a\0\u2b98"+
    "\0\u2bd6\0\u2c14\0\u2c52\0\u2c90\0\u2cce\0\u2d0c\0\u2d4a\0\u2d88"+
    "\0\76\0\u2dc6\0\u2e04\0\76\0\u2e42\0\u2e80\0\u2ebe\0\76"+
    "\0\u2efc\0\u2f3a\0\u2f78\0\u2fb6\0\u2ff4\0\u3032\0\u3070\0\u30ae"+
    "\0\76\0\76\0\76\0\76\0\76\0\u30ec\0\u312a\0\u3168"+
    "\0\u31a6\0\u31e4\0\u3222\0\u3260\0\u329e\0\u32dc\0\76\0\u331a"+
    "\0\u3358\0\u3396\0\u33d4\0\u3412\0\u3450\0\u348e\0\u34cc\0\u350a"+
    "\0\u3548\0\76\0\u3586\0\u35c4\0\76\0\u3602\0\u3640\0\u367e"+
    "\0\u36bc\0\u36fa\0\u3738\0\u3776\0\u37b4\0\76\0\76\0\u37f2"+
    "\0\u3830\0\u386e\0\u38ac\0\u38ea\0\u3928\0\u3966\0\u39a4\0\u39e2"+
    "\0\u3a20\0\76\0\76\0\u3a5e\0\u3a9c\0\u3ada\0\u3b18\0\u3b56"+
    "\0\u3b94\0\u3bd2\0\u3c10\0\u3c4e\0\u3c8c\0\u3cca\0\u3d08\0\u3d46"+
    "\0\u3d84\0\76\0\76";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[323];
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
    "\1\17\1\2\1\20\1\2\1\21\1\2\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\3\2\1\51\1\2"+
    "\1\47\1\2\1\52\1\53\6\2\101\0\1\54\107\0"+
    "\1\55\107\0\1\56\55\0\1\57\76\0\1\60\102\0"+
    "\1\61\3\0\1\62\1\0\1\63\54\0\1\64\2\0"+
    "\1\65\6\0\1\66\65\0\1\67\7\0\1\70\1\0"+
    "\1\71\7\0\1\72\64\0\1\73\2\0\1\74\62\0"+
    "\1\75\2\0\1\76\72\0\1\77\13\0\1\100\61\0"+
    "\1\101\72\0\1\102\100\0\1\103\104\0\1\104\70\0"+
    "\1\105\73\0\1\106\106\0\1\107\112\0\1\110\1\111"+
    "\75\0\1\112\75\0\1\113\1\114\74\0\1\115\75\0"+
    "\1\116\75\0\1\117\3\0\1\120\5\0\1\121\63\0"+
    "\1\122\4\0\1\123\70\0\1\124\75\0\1\125\6\0"+
    "\1\126\76\0\1\127\65\0\1\130\1\131\44\0\1\132"+
    "\42\0\1\133\62\0\1\134\77\0\1\135\41\0\1\136"+
    "\62\0\1\137\56\0\1\140\75\0\1\141\33\0\1\142"+
    "\104\0\1\143\2\0\1\144\107\0\1\145\55\0\1\146"+
    "\71\0\1\147\17\0\1\150\54\0\1\151\105\0\1\152"+
    "\66\0\1\153\104\0\1\154\77\0\1\155\62\0\1\156"+
    "\75\0\1\157\4\0\1\160\73\0\1\161\114\0\1\162"+
    "\1\163\66\0\1\164\63\0\1\165\74\0\1\166\112\0"+
    "\1\167\64\0\1\170\73\0\1\171\105\0\1\172\76\0"+
    "\1\173\63\0\1\174\107\0\1\175\75\0\1\176\75\0"+
    "\1\177\2\0\1\200\71\0\1\201\121\0\1\202\70\0"+
    "\1\203\123\0\1\204\47\0\1\205\120\0\1\206\25\0"+
    "\1\207\144\0\1\210\54\0\1\211\116\0\1\212\76\0"+
    "\1\213\75\0\1\214\23\0\1\215\106\0\1\216\64\0"+
    "\1\217\100\0\1\220\67\0\1\221\76\0\1\222\110\0"+
    "\1\223\101\0\1\224\63\0\1\225\75\0\1\226\75\0"+
    "\1\227\71\0\1\230\6\0\1\231\71\0\1\232\72\0"+
    "\1\233\74\0\1\234\101\0\1\235\103\0\1\236\70\0"+
    "\1\237\71\0\1\240\77\0\1\241\71\0\1\242\75\0"+
    "\1\243\117\0\1\244\66\0\1\245\65\0\1\246\111\0"+
    "\1\247\71\0\1\250\77\0\1\251\60\0\1\252\105\0"+
    "\1\253\130\0\1\254\106\0\1\255\22\0\1\256\130\0"+
    "\1\257\11\0\1\260\52\0\1\261\65\0\1\262\140\0"+
    "\1\263\75\0\1\264\41\0\1\265\66\0\1\266\77\0"+
    "\1\267\67\0\1\270\73\0\1\271\101\0\1\272\71\0"+
    "\1\273\104\0\1\274\63\0\1\275\107\0\1\276\71\0"+
    "\1\277\67\0\1\300\101\0\1\301\72\0\1\302\102\0"+
    "\1\303\104\0\1\304\57\0\1\305\76\0\1\306\137\0"+
    "\1\307\37\0\1\310\71\0\1\311\75\0\1\312\112\0"+
    "\1\313\115\0\1\314\53\0\1\315\66\0\1\316\147\0"+
    "\1\317\61\0\1\320\120\0\1\321\62\0\1\322\101\0"+
    "\1\323\75\0\1\324\30\0\1\325\70\0\1\326\102\0"+
    "\1\327\64\0\1\330\106\0\1\331\75\0\1\332\72\0"+
    "\1\333\67\0\1\334\110\0\1\335\76\0\1\336\71\0"+
    "\1\337\71\0\1\340\106\0\1\341\123\0\1\342\46\0"+
    "\1\343\73\0\1\344\62\0\1\345\155\0\1\346\45\0"+
    "\1\347\14\0\1\350\71\0\1\351\76\0\1\352\107\0"+
    "\1\353\53\0\1\354\44\0\1\355\136\0\1\356\75\0"+
    "\1\357\40\0\1\360\105\0\1\361\65\0\1\362\70\0"+
    "\1\363\76\0\1\364\112\0\1\365\73\0\1\366\126\0"+
    "\1\367\115\0\1\370\63\0\1\371\37\0\1\372\141\0"+
    "\1\373\71\0\1\374\107\0\1\375\61\0\1\376\105\0"+
    "\1\377\76\0\1\u0100\25\0\1\u0101\65\0\1\u0102\76\0"+
    "\1\u0103\75\0\1\u0104\75\0\1\u0105\134\0\1\u0106\107\0"+
    "\1\u0107\16\0\1\u0108\150\0\1\u0109\101\0\1\u010a\107\0"+
    "\1\u010b\11\0\1\u010c\151\0\1\u010d\75\0\1\u010e\53\0"+
    "\1\u010f\112\0\1\u0110\40\0\1\u0111\137\0\1\u0112\56\0"+
    "\1\u0113\114\0\1\u0114\75\0\1\u0115\56\0\1\u0116\75\0"+
    "\1\u0117\50\0\1\u0118\71\0\1\u0119\132\0\1\u011a\107\0"+
    "\1\u011b\75\0\1\u011c\46\0\1\u011d\120\0\1\u011e\75\0"+
    "\1\u011f\52\0\1\u0120\52\0\1\u0121\143\0\1\u0122\21\0"+
    "\1\u0123\154\0\1\u0124\75\0\1\u0125\104\0\1\u0126\54\0"+
    "\1\u0127\35\0\1\u0128\123\0\1\u0129\107\0\1\u012a\75\0"+
    "\1\u012b\104\0\1\u012c\44\0\1\u012d\120\0\1\u012e\75\0"+
    "\1\u012f\42\0\1\u0130\151\0\1\u0131\72\0\1\u0132\76\0"+
    "\1\u0133\71\0\1\u0134\47\0\1\u0135\107\0\1\u0136\120\0"+
    "\1\u0137\53\0\1\u0138\121\0\1\u0139\60\0\1\u013a\53\0"+
    "\1\u013b\116\0\1\u013c\114\0\1\u013d\50\0\1\u013e\120\0"+
    "\1\u013f\60\0\1\u0140\102\0\1\u0141\50\0\1\u0142\107\0"+
    "\1\u0143\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[15810];
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
    "\1\0\1\11\36\1\1\11\1\1\5\11\4\1\20\0"+
    "\1\11\1\1\12\0\7\11\2\1\1\0\1\11\1\1"+
    "\5\11\2\0\2\11\30\0\1\11\2\0\1\11\11\0"+
    "\2\11\1\0\1\11\7\0\1\11\6\0\2\11\1\0"+
    "\1\11\2\0\1\11\11\0\1\11\1\0\1\11\2\0"+
    "\1\11\14\0\1\11\1\0\1\11\4\0\1\11\2\0"+
    "\1\11\5\0\1\11\1\0\1\11\16\0\1\11\1\0"+
    "\1\11\1\0\6\11\1\0\2\11\15\0\1\11\2\0"+
    "\1\11\3\0\1\11\10\0\5\11\11\0\1\11\12\0"+
    "\1\11\2\0\1\11\10\0\2\11\12\0\2\11\16\0"+
    "\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[323];
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

  /* user code: */
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);|
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }


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
          case 87: break;
          case 2: 
            { System.out.println(" Suma "); 
    return symbol(sym.SUMA);
            }
          case 88: break;
          case 3: 
            { System.out.println(" Asignación básica "); 
    return symbol(sym.IGUAL);
            }
          case 89: break;
          case 4: 
            { System.out.println(" Resta "); 
    return symbol(sym.);
            }
          case 90: break;
          case 5: 
            { System.out.println(" Division "); 
    return symbol(sym.);
            }
          case 91: break;
          case 6: 
            { System.out.println(" Módulo "); 
    return symbol(sym.);
            }
          case 92: break;
          case 7: 
            { System.out.println(" Menor que "); 
    return symbol(sym.);
            }
          case 93: break;
          case 8: 
            { System.out.println(" Mayor que "); 
    return symbol(sym.);
            }
          case 94: break;
          case 9: 
            { System.out.println(" Negación lógica (NOT) "); return symbol(sym.);
            }
          case 95: break;
          case 10: 
            { System.out.println(" AND binario ");
    return symbol(sym.);
            }
          case 96: break;
          case 11: 
            { System.out.println(" OR binario "); 
    return symbol(sym.);
            }
          case 97: break;
          case 12: 
            { System.out.println(" XOR binario "); return symbol(sym.);
            }
          case 98: break;
          case 13: 
            { System.out.println("Parentesis izquierdo"); 
    return symbol(sym.PARENTHESES_LEFT);
            }
          case 99: break;
          case 14: 
            { System.out.println("Parentesis derecho"); 
    return symbol(sym.PARENTHESES_RIGHT);
            }
          case 100: break;
          case 15: 
            { System.out.println(" Multiplicacion "); 
    return symbol(sym.);
            }
          case 101: break;
          case 16: 
            { System.out.println(" Complemento a uno "); 
    return symbol(sym.);
            }
          case 102: break;
          case 17: 
            { System.out.println("Punto y coma"); 
    return symbol(sym.PUNTO_COMA);
            }
          case 103: break;
          case 18: 
            { System.out.println("Llave izquierda"); 
    return symbol(sym.BRACKET_LEFT);
            }
          case 104: break;
          case 19: 
            { System.out.println("Llave derecha"); 
    return symbol(sym.BRACKET_RIGHT);
            }
          case 105: break;
          case 20: 
            { /* Acciones específicas para salto de línea */
            }
          case 106: break;
          case 21: 
            { System.out.println("Especifica una condicion"); 
    return symbol(sym.IF);
            }
          case 107: break;
          case 22: 
            { System.out.println(" Especifica el inicio de un bucle do-while "); 
    return symbol(sym.DO);
            }
          case 108: break;
          case 23: 
            { System.out.println(" Incremento "); 
    return symbol(sym.);
            }
          case 109: break;
          case 24: 
            { System.out.println(" Suma y asignacion "); 
    return symbol(sym.);
            }
          case 110: break;
          case 25: 
            { System.out.println(" Igual que "); 
    return symbol(sym.);
            }
          case 111: break;
          case 26: 
            { System.out.println(" Resta y asignación "); 
    return symbol(sym.);
            }
          case 112: break;
          case 27: 
            { System.out.println(" Decremento "); 
    return symbol(sym.);
            }
          case 113: break;
          case 28: 
            { System.out.println(" División y asignación "); 
    return symbol(sym.);
            }
          case 114: break;
          case 29: 
            { System.out.println(" Módulo y asignación "); 
    return symbol(sym.);
            }
          case 115: break;
          case 30: 
            { System.out.println(" Menor o igual que "); 
    return symbol(sym.);
            }
          case 116: break;
          case 31: 
            { System.out.println(" Desplazamiento a la izquierda "); 
    return symbol(sym.);
            }
          case 117: break;
          case 32: 
            { System.out.println(" Mayor que o igual que "); 
    return symbol(sym.);
            }
          case 118: break;
          case 33: 
            { System.out.println(" Desplazamiento a la derecha "); 
    return symbol(sym.);
            }
          case 119: break;
          case 34: 
            { System.out.println(" Diferente que / No igual que "); 
    return symbol(sym.);
            }
          case 120: break;
          case 35: 
            { System.out.println(" Asignación con AND binario "); 
    return symbol(sym.);
            }
          case 121: break;
          case 36: 
            { System.out.println(" Y lógico (AND) "); 
    return symbol(sym.);
            }
          case 122: break;
          case 37: 
            { System.out.println(" O lógico (OR) ");
    return symbol(sym.);
            }
          case 123: break;
          case 38: 
            { System.out.println(" Asignación con XOR binario "); 
    return symbol(sym.);
            }
          case 124: break;
          case 39: 
            { System.out.println(" Llamada a función "); return symbol(sym.);
            }
          case 125: break;
          case 40: 
            { System.out.println(" Multiplicación y asignación "); 
    return symbol(sym.);
            }
          case 126: break;
          case 41: 
            { System.out.println("Declara una variable de tipo entero"); 
    return symbol(sym.INT);
            }
          case 127: break;
          case 42: 
            { System.out.println(" Especifica un bucle for "); 
    return symbol(sym.FOR);
            }
          case 128: break;
          case 43: 
            { System.out.println(" Comparación a tres sentidos "); 
    return symbol(sym.);
            }
          case 129: break;
          case 44: 
            { System.out.println(" Asignación con desplazamiento a la izquierda "); 
    return symbol(sym.);
            }
          case 130: break;
          case 45: 
            { System.out.println(" Asignación con desplazamiento a la derecha "); 
    return symbol(sym.);
            }
          case 131: break;
          case 46: 
            { System.out.println(" Declara una variable local que se almacena en el stack "); 
    return symbol(sym.AUTO);
            }
          case 132: break;
          case 47: 
            { System.out.println(" Declara un conjunto de constantes enteras numeradas "); 
    return symbol(sym.ENUM);
            }
          case 133: break;
          case 48: 
            { System.out.println(" Especifica la parte else de una instruccion if "); 
    return symbol(sym.ELSE);
            }
          case 134: break;
          case 49: 
            { System.out.println(" Especifica un caso en una sentencia switch "); 
    return symbol(sym.CASE);
            }
          case 135: break;
          case 50: 
            { System.out.println(" Declara una variable de tipo caracter "); 
    return symbol(sym.CHAR);
            }
          case 136: break;
          case 51: 
            { System.out.println("Declara una variable de tipo entero largo"); 
    return symbol(sym.LOGIN);
            }
          case 137: break;
          case 52: 
            { System.out.println(" Salta a una etiqueta especifica "); 
    return symbol(sym.GOTO);
            }
          case 138: break;
          case 53: 
            { System.out.println("Funcion sin valor"); 
    return symbol(sym.VOID);
            }
          case 139: break;
          case 54: 
            { System.out.println("Declara una union"); 
    return symbol(sym.UNION);
            }
          case 140: break;
          case 55: 
            { System.out.println(" Termina la ejecucion del bucle o la sentencia switch actual "); 
    return symbol(sym.BREAK);
            }
          case 141: break;
          case 56: 
            { System.out.println(" Declara una variable que no puede ser modificada "); 
    return symbol(sym.CONST);
            }
          case 142: break;
          case 57: 
            { System.out.println("Declara una variable de tipo entero corto"); 
    return symbol(sym.SHORT);
            }
          case 143: break;
          case 58: 
            { System.out.println(" Declara una variable de tipo coma flotante "); 
    return symbol(sym.FLOAT);
            }
          case 144: break;
          case 59: 
            { System.out.println("Especifica un bucle while"); 
    return symbol(sym.WHILE);
            }
          case 145: break;
          case 60: 
            { System.out.println("Devuelve un valor de una funcion"); 
    return symbol(sym.RETURN);
            }
          case 146: break;
          case 61: 
            { System.out.println(" Declara una variable global que esta definida en otro archivo "); 
    return symbol(sym.EXTERN);
            }
          case 147: break;
          case 62: 
            { System.out.println("Declara una variable local que se mantiene en la memoria despues de que la funcion termine"); 
    return symbol(sym.STATIC);
            }
          case 148: break;
          case 63: 
            { System.out.println("Declara una estructura"); 
    return symbol(sym.STRUCT);
            }
          case 149: break;
          case 64: 
            { System.out.println("Declara una variable de tipo entero con signo"); 
    return symbol(sym.SIGNED);
            }
          case 150: break;
          case 65: 
            { System.out.println("Devuelve el tamano de un tipo de dato"); 
    return symbol(sym.SIZEOF);
            }
          case 151: break;
          case 66: 
            { System.out.println("Especifica una sentencia switch"); 
    return symbol(sym.SWITCH);
            }
          case 152: break;
          case 67: 
            { System.out.println(" Declara una variable de tipo doble precision "); 
    return symbol(sym.DOUBLE);
            }
          case 153: break;
          case 68: 
            { System.out.println("Metodo main"); 
    return symbol(sym.MAIN);
            }
          case 154: break;
          case 69: 
            { System.out.println("Metodo print"); 
    return symbol(sym.PRINTF);
            }
          case 155: break;
          case 70: 
            { System.out.println("Declara un nuevo tipo de dato"); 
    return symbol(sym.TYPEDEF);
            }
          case 156: break;
          case 71: 
            { System.out.println(" Especifica un caso por defecto en una sentencia switch "); 
    return symbol(sym.DEFAULT);
            }
          case 157: break;
          case 72: 
            { System.out.println("Enteros: " + yytext()); 
    return symbol(sym.INTS)
            }
          case 158: break;
          case 73: 
            { System.out.println("Declara una variable de tipo entero sin signo"); 
    return symbol(sym.UNSIGNED);
            }
          case 159: break;
          case 74: 
            { System.out.println("Declara una variable que se almacena en el registro"); 
    return symbol(sym.REGISTER);
            }
          case 160: break;
          case 75: 
            { System.out.println(" Salta a la siguiente iteracion del bucle actual "); 
    return symbol(sym.CONTINUE);
            }
          case 161: break;
          case 76: 
            { System.out.println("Declara una variable que puede ser modificada por hardware"); 
    return symbol(sym.VOLATILE);
            }
          case 162: break;
          case 77: 
            { System.out.println("Inclusion de libreria");
    return symbol(sym.INCLUDE);
            }
          case 163: break;
          case 78: 
            { System.out.println("Lectura de libreria");
    return symbol(sym.LIB);
            }
          case 164: break;
          case 79: 
            { System.out.println("Comentarios unilinea: " + yytext()); 
    return symbol(sym.UNILINEA);
            }
          case 165: break;
          case 80: 
            { System.out.println("Espacios: " + yytext()); 
    return symbol(sym.INTS);
            }
          case 166: break;
          case 81: 
            { System.out.println("Decimales: " + yytext()); 
    return symbol(sym.FLOATS);
            }
          case 167: break;
          case 82: 
            { System.out.println("Boleanos: " + yytext()); 
    return symbol(sym.BOOLS);
            }
          case 168: break;
          case 83: 
            { System.out.println("Cadenas: " + yytext()); 
    return symbol(sym.STRINGS);
            }
          case 169: break;
          case 84: 
            { System.out.println("Caracteres: " + yytext()); 
    return symbol(sym.CHARS);
            }
          case 170: break;
          case 85: 
            { System.out.println("Comentarios multi: " + yytext()); 
    return symbol(sym.MULTILINEA);
            }
          case 171: break;
          case 86: 
            { System.out.println("Identificadores: " + yytext()); 
    return symbol(sym.VARS);
            }
          case 172: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

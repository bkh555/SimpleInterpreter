// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: MicroR.jflex

/* Brandon Hillert bkh0115 */

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class MicroRLexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\10\u2f00\31\u1f00\1\u0100\1\u3000\1\u3100\1\u0100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u1f00\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u0100\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u1f00\1\u4100\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u1f00\1\u4d00\1\u4e00"+
    "\1\u4f00\1\u1f00\3\u0100\1\u5000\1\u5100\1\u5200\12\u1f00\4\u0100"+
    "\1\u5300\17\u1f00\2\u0100\1\u5400\41\u1f00\2\u0100\1\u5500\1\u5600"+
    "\2\u1f00\1\u5700\1\u5800\27\u0100\1\u5900\2\u0100\1\u5a00\45\u1f00"+
    "\1\u0100\1\u5b00\1\u5c00\11\u1f00\1\u5d00\27\u1f00\1\u5e00\1\u5f00"+
    "\1\u6000\1\u6100\11\u1f00\1\u6200\1\u6300\5\u1f00\1\u6400\1\u6500"+
    "\4\u1f00\1\u6600\21\u1f00\246\u0100\1\u6700\20\u0100\1\u6800\1\u6900"+
    "\25\u0100\1\u6a00\34\u0100\1\u6b00\14\u1f00\2\u0100\1\u6c00\u0e05\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\6\1\7\1\10\1\0\1\11\1\12\1\0\1\13"+
    "\1\14\1\11\1\15\1\16\1\17\1\20\1\11\12\21"+
    "\1\0\1\22\1\23\1\24\1\25\2\0\13\26\1\27"+
    "\5\26\1\30\10\26\4\0\1\31\1\0\1\32\1\26"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\2\26"+
    "\1\42\1\43\1\44\1\45\1\46\1\26\1\47\1\50"+
    "\1\51\1\52\1\26\1\53\3\26\1\54\1\55\1\56"+
    "\7\0\1\3\44\0\1\26\12\0\1\26\4\0\1\26"+
    "\5\0\27\26\1\0\37\26\1\0\u01ca\26\4\0\14\26"+
    "\16\0\5\26\7\0\1\26\1\0\1\26\201\0\5\26"+
    "\1\0\2\26\2\0\4\26\1\0\1\26\6\0\1\26"+
    "\1\0\3\26\1\0\1\26\1\0\24\26\1\0\123\26"+
    "\1\0\213\26\10\0\246\26\1\0\46\26\2\0\1\26"+
    "\6\0\51\26\107\0\33\26\4\0\4\26\55\0\53\26"+
    "\25\0\12\21\4\0\2\26\1\0\143\26\1\0\1\26"+
    "\17\0\2\26\7\0\2\26\12\21\3\26\2\0\1\26"+
    "\20\0\1\26\1\0\36\26\35\0\131\26\13\0\1\26"+
    "\16\0\12\21\41\26\11\0\2\26\4\0\1\26\5\0"+
    "\26\26\4\0\1\26\11\0\1\26\3\0\1\26\27\0"+
    "\31\26\7\0\13\26\65\0\25\26\1\0\10\26\106\0"+
    "\66\26\3\0\1\26\22\0\1\26\7\0\12\26\4\0"+
    "\12\21\1\0\20\26\4\0\10\26\2\0\2\26\2\0"+
    "\26\26\1\0\7\26\1\0\1\26\3\0\4\26\3\0"+
    "\1\26\20\0\1\26\15\0\2\26\1\0\3\26\4\0"+
    "\12\21\2\26\12\0\1\26\10\0\6\26\4\0\2\26"+
    "\2\0\26\26\1\0\7\26\1\0\2\26\1\0\2\26"+
    "\1\0\2\26\37\0\4\26\1\0\1\26\7\0\12\21"+
    "\2\0\3\26\20\0\11\26\1\0\3\26\1\0\26\26"+
    "\1\0\7\26\1\0\2\26\1\0\5\26\3\0\1\26"+
    "\22\0\1\26\17\0\2\26\4\0\12\21\11\0\1\26"+
    "\13\0\10\26\2\0\2\26\2\0\26\26\1\0\7\26"+
    "\1\0\2\26\1\0\5\26\3\0\1\26\36\0\2\26"+
    "\1\0\3\26\4\0\12\21\1\0\1\26\21\0\1\26"+
    "\1\0\6\26\3\0\3\26\1\0\4\26\3\0\2\26"+
    "\1\0\1\26\1\0\2\26\3\0\2\26\3\0\3\26"+
    "\3\0\14\26\26\0\1\26\25\0\12\21\25\0\10\26"+
    "\1\0\3\26\1\0\27\26\1\0\20\26\3\0\1\26"+
    "\32\0\3\26\5\0\2\26\4\0\12\21\20\0\1\26"+
    "\4\0\10\26\1\0\3\26\1\0\27\26\1\0\12\26"+
    "\1\0\5\26\3\0\1\26\40\0\1\26\1\0\2\26"+
    "\4\0\12\21\1\0\2\26\22\0\10\26\1\0\3\26"+
    "\1\0\51\26\2\0\1\26\20\0\1\26\5\0\3\26"+
    "\10\0\3\26\4\0\12\21\12\0\6\26\5\0\22\26"+
    "\3\0\30\26\1\0\11\26\1\0\1\26\2\0\7\26"+
    "\37\0\12\21\21\0\60\26\1\0\2\26\14\0\7\26"+
    "\11\0\12\21\47\0\2\26\1\0\1\26\1\0\5\26"+
    "\1\0\30\26\1\0\1\26\1\0\12\26\1\0\2\26"+
    "\11\0\1\26\2\0\5\26\1\0\1\26\11\0\12\21"+
    "\2\0\4\26\40\0\1\26\37\0\12\21\26\0\10\26"+
    "\1\0\44\26\33\0\5\26\163\0\53\26\24\0\1\26"+
    "\12\21\6\0\6\26\4\0\4\26\3\0\1\26\3\0"+
    "\2\26\7\0\3\26\4\0\15\26\14\0\1\26\1\0"+
    "\12\21\6\0\46\26\1\0\1\26\5\0\1\26\2\0"+
    "\53\26\1\0\115\26\1\0\4\26\2\0\7\26\1\0"+
    "\1\26\1\0\4\26\2\0\51\26\1\0\4\26\2\0"+
    "\41\26\1\0\4\26\2\0\7\26\1\0\1\26\1\0"+
    "\4\26\2\0\17\26\1\0\71\26\1\0\4\26\2\0"+
    "\103\26\45\0\20\26\20\0\126\26\2\0\6\26\3\0"+
    "\u016c\26\2\0\21\26\1\0\32\26\5\0\113\26\6\0"+
    "\10\26\7\0\15\26\1\0\4\26\16\0\22\26\16\0"+
    "\22\26\16\0\15\26\1\0\3\26\17\0\64\26\43\0"+
    "\1\26\4\0\1\26\3\0\12\21\46\0\12\21\6\0"+
    "\131\26\7\0\5\26\2\0\42\26\1\0\1\26\5\0"+
    "\106\26\12\0\37\26\47\0\12\21\36\26\2\0\5\26"+
    "\13\0\54\26\4\0\32\26\6\0\12\21\46\0\27\26"+
    "\11\0\65\26\53\0\12\21\6\0\12\21\15\0\1\26"+
    "\135\0\57\26\21\0\7\26\4\0\12\21\51\0\36\26"+
    "\15\0\2\26\12\21\54\26\32\0\44\26\34\0\12\21"+
    "\3\0\3\26\12\21\44\26\2\0\11\26\7\0\53\26"+
    "\2\0\3\26\51\0\4\26\1\0\6\26\1\0\2\26"+
    "\3\0\1\26\5\0\300\26\100\0\26\26\2\0\6\26"+
    "\2\0\46\26\2\0\6\26\2\0\10\26\1\0\1\26"+
    "\1\0\1\26\1\0\1\26\1\0\37\26\2\0\65\26"+
    "\1\0\7\26\1\0\1\26\3\0\3\26\1\0\7\26"+
    "\3\0\4\26\2\0\6\26\4\0\15\26\5\0\3\26"+
    "\1\0\7\26\53\0\2\3\107\0\1\26\15\0\1\26"+
    "\20\0\15\26\145\0\1\26\4\0\1\26\2\0\12\26"+
    "\1\0\1\26\3\0\5\26\6\0\1\26\1\0\1\26"+
    "\1\0\1\26\1\0\4\26\1\0\13\26\2\0\4\26"+
    "\5\0\5\26\4\0\1\26\64\0\2\26\u017b\0\57\26"+
    "\1\0\57\26\1\0\205\26\6\0\4\26\3\0\2\26"+
    "\14\0\46\26\1\0\1\26\5\0\1\26\2\0\70\26"+
    "\7\0\1\26\20\0\27\26\11\0\7\26\1\0\7\26"+
    "\1\0\7\26\1\0\7\26\1\0\7\26\1\0\7\26"+
    "\1\0\7\26\1\0\7\26\120\0\1\26\325\0\2\26"+
    "\52\0\5\26\5\0\2\26\4\0\126\26\6\0\3\26"+
    "\1\0\132\26\1\0\4\26\5\0\53\26\1\0\136\26"+
    "\21\0\33\26\65\0\306\26\112\0\360\26\20\0\215\26"+
    "\103\0\56\26\2\0\15\26\3\0\20\26\12\21\2\26"+
    "\24\0\57\26\20\0\37\26\2\0\106\26\61\0\11\26"+
    "\2\0\147\26\2\0\65\26\2\0\5\26\60\0\13\26"+
    "\1\0\3\26\1\0\4\26\1\0\27\26\35\0\64\26"+
    "\16\0\62\26\34\0\12\21\30\0\6\26\3\0\1\26"+
    "\1\0\2\26\1\0\12\21\34\26\12\0\27\26\31\0"+
    "\35\26\7\0\57\26\34\0\1\26\12\21\6\0\5\26"+
    "\1\0\12\26\12\21\5\26\1\0\51\26\27\0\3\26"+
    "\1\0\10\26\4\0\12\21\6\0\27\26\3\0\1\26"+
    "\3\0\62\26\1\0\1\26\3\0\2\26\2\0\5\26"+
    "\2\0\1\26\1\0\1\26\30\0\3\26\2\0\13\26"+
    "\7\0\3\26\14\0\6\26\2\0\6\26\2\0\6\26"+
    "\11\0\7\26\1\0\7\26\1\0\53\26\1\0\14\26"+
    "\10\0\163\26\15\0\12\21\6\0\244\26\14\0\27\26"+
    "\4\0\61\26\4\0\u0100\3\156\26\2\0\152\26\46\0"+
    "\7\26\14\0\5\26\5\0\1\26\1\0\12\26\1\0"+
    "\15\26\1\0\5\26\1\0\1\26\1\0\2\26\1\0"+
    "\2\26\1\0\154\26\41\0\153\26\22\0\100\26\2\0"+
    "\66\26\50\0\14\26\164\0\5\26\1\0\207\26\23\0"+
    "\12\21\7\0\32\26\6\0\32\26\13\0\131\26\3\0"+
    "\6\26\2\0\6\26\2\0\6\26\2\0\3\26\43\0"+
    "\14\26\1\0\32\26\1\0\23\26\1\0\2\26\1\0"+
    "\17\26\2\0\16\26\42\0\173\26\205\0\35\26\3\0"+
    "\61\26\57\0\40\26\15\0\24\26\1\0\10\26\6\0"+
    "\46\26\12\0\36\26\2\0\44\26\4\0\10\26\60\0"+
    "\236\26\2\0\12\21\6\0\44\26\4\0\44\26\4\0"+
    "\50\26\10\0\64\26\234\0\67\26\11\0\26\26\12\0"+
    "\10\26\230\0\6\26\2\0\1\26\1\0\54\26\1\0"+
    "\2\26\3\0\1\26\2\0\27\26\12\0\27\26\11\0"+
    "\37\26\101\0\23\26\1\0\2\26\12\0\26\26\12\0"+
    "\32\26\106\0\70\26\6\0\2\26\100\0\1\26\17\0"+
    "\4\26\1\0\3\26\1\0\35\26\52\0\35\26\3\0"+
    "\35\26\43\0\10\26\1\0\34\26\33\0\66\26\12\0"+
    "\26\26\12\0\23\26\15\0\22\26\156\0\111\26\67\0"+
    "\63\26\15\0\63\26\15\0\44\26\14\0\12\21\306\0"+
    "\35\26\12\0\1\26\10\0\26\26\232\0\27\26\14\0"+
    "\65\26\56\0\12\21\23\0\55\26\40\0\31\26\7\0"+
    "\12\21\11\0\44\26\17\0\12\21\4\0\1\26\13\0"+
    "\43\26\3\0\1\26\14\0\60\26\16\0\4\26\13\0"+
    "\12\21\1\26\1\0\1\26\43\0\22\26\1\0\31\26"+
    "\124\0\7\26\1\0\1\26\1\0\4\26\1\0\17\26"+
    "\1\0\12\26\7\0\57\26\21\0\12\21\13\0\10\26"+
    "\2\0\2\26\2\0\26\26\1\0\7\26\1\0\2\26"+
    "\1\0\5\26\3\0\1\26\22\0\1\26\14\0\5\26"+
    "\236\0\65\26\22\0\4\26\5\0\12\21\5\0\1\26"+
    "\40\0\60\26\24\0\2\26\1\0\1\26\10\0\12\21"+
    "\246\0\57\26\51\0\4\26\44\0\60\26\24\0\1\26"+
    "\13\0\12\21\46\0\53\26\15\0\1\26\7\0\12\21"+
    "\66\0\33\26\25\0\12\21\306\0\54\26\164\0\100\26"+
    "\12\21\25\0\1\26\240\0\10\26\2\0\47\26\20\0"+
    "\1\26\1\0\1\26\34\0\1\26\12\0\50\26\7\0"+
    "\1\26\25\0\1\26\13\0\56\26\23\0\1\26\42\0"+
    "\71\26\7\0\11\26\1\0\45\26\21\0\1\26\17\0"+
    "\12\21\30\0\36\26\160\0\7\26\1\0\2\26\1\0"+
    "\46\26\25\0\1\26\11\0\12\21\6\0\6\26\1\0"+
    "\2\26\1\0\40\26\16\0\1\26\7\0\12\21\u0136\0"+
    "\23\26\15\0\232\26\346\0\304\26\274\0\57\26\321\0"+
    "\107\26\271\0\71\26\7\0\37\26\1\0\12\21\146\0"+
    "\36\26\22\0\60\26\20\0\4\26\14\0\12\21\11\0"+
    "\25\26\5\0\23\26\260\0\100\26\200\0\113\26\5\0"+
    "\1\26\102\0\15\26\100\0\2\26\1\0\1\26\34\0"+
    "\370\26\10\0\363\26\15\0\37\26\61\0\3\26\21\0"+
    "\4\26\10\0\u018c\26\4\0\153\26\5\0\15\26\3\0"+
    "\11\26\7\0\12\26\146\0\125\26\1\0\107\26\1\0"+
    "\2\26\2\0\1\26\2\0\2\26\2\0\4\26\1\0"+
    "\14\26\1\0\1\26\1\0\7\26\1\0\101\26\1\0"+
    "\4\26\2\0\10\26\1\0\7\26\1\0\34\26\1\0"+
    "\4\26\1\0\5\26\1\0\1\26\3\0\7\26\1\0"+
    "\u0154\26\2\0\31\26\1\0\31\26\1\0\37\26\1\0"+
    "\31\26\1\0\37\26\1\0\31\26\1\0\37\26\1\0"+
    "\31\26\1\0\37\26\1\0\31\26\1\0\10\26\2\0"+
    "\62\21\55\26\12\0\7\26\2\0\12\21\4\0\1\26"+
    "\u0171\0\54\26\4\0\12\21\6\0\305\26\73\0\104\26"+
    "\7\0\1\26\4\0\12\21\246\0\4\26\1\0\33\26"+
    "\1\0\2\26\1\0\1\26\2\0\1\26\1\0\12\26"+
    "\1\0\4\26\1\0\1\26\1\0\1\26\6\0\1\26"+
    "\4\0\1\26\1\0\1\26\1\0\1\26\1\0\3\26"+
    "\1\0\2\26\1\0\1\26\2\0\1\26\1\0\1\26"+
    "\1\0\1\26\1\0\1\26\1\0\1\26\1\0\2\26"+
    "\1\0\1\26\2\0\4\26\1\0\7\26\1\0\4\26"+
    "\1\0\4\26\1\0\1\26\1\0\12\26\1\0\21\26"+
    "\5\0\3\26\1\0\5\26\1\0\21\26\104\0\327\26"+
    "\51\0\65\26\13\0\336\26\2\0\u0182\26\16\0\u0131\26"+
    "\37\0\36\26\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[27904];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\1\1\2\1\4\1\1"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\1\1\15\16\16\1\17\1\1\1\20\1\21\1\0"+
    "\1\22\1\23\1\24\1\25\1\26\1\0\5\16\1\27"+
    "\7\16\1\30\2\0\14\16\2\0\1\31\1\32\1\16"+
    "\1\33\1\34\1\35\4\16\1\36\1\16\2\0\1\16"+
    "\1\37\3\16\1\40\2\0\2\16\1\41\1\42\2\0"+
    "\2\16\1\43\1\0\1\44\1\45\1\0\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
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
    "\0\0\0\57\0\57\0\136\0\215\0\274\0\353\0\57"+
    "\0\u011a\0\57\0\57\0\57\0\57\0\57\0\u0149\0\57"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439"+
    "\0\u0468\0\57\0\u0497\0\57\0\57\0\u04c6\0\57\0\57"+
    "\0\57\0\57\0\57\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1"+
    "\0\u05e0\0\u0205\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa"+
    "\0\u0729\0\57\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843"+
    "\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\u09bb"+
    "\0\u09ea\0\u0a19\0\u0205\0\u0205\0\u0a48\0\u0205\0\u0205\0\u0205"+
    "\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0205\0\u0b33\0\u0b62\0\u0b91"+
    "\0\u0bc0\0\u0205\0\u0bef\0\u0c1e\0\u0c4d\0\u0205\0\u0c7c\0\u0cab"+
    "\0\u0cda\0\u0d09\0\u0205\0\u0205\0\u0d38\0\u0d67\0\u0d96\0\u0dc5"+
    "\0\57\0\u0df4\0\u0205\0\u0205\0\u0e23\0\57";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
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
    "\1\2\2\3\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2"+
    "\1\17\1\20\1\21\1\22\1\23\3\24\1\2\1\25"+
    "\1\26\1\24\1\27\1\30\1\24\1\31\1\32\1\24"+
    "\1\33\1\34\1\24\1\35\1\36\1\37\1\40\1\24"+
    "\1\41\1\42\1\43\1\44\61\0\1\3\100\0\1\45"+
    "\61\0\1\46\27\0\2\7\4\0\51\7\12\0\1\47"+
    "\65\0\1\17\54\0\1\50\4\0\1\51\56\0\1\52"+
    "\56\0\1\53\53\0\1\24\4\0\3\24\1\54\22\24"+
    "\24\0\1\24\4\0\3\24\1\54\16\24\1\55\3\24"+
    "\24\0\1\24\4\0\3\24\1\54\13\24\1\56\6\24"+
    "\24\0\1\24\4\0\3\24\1\54\10\24\1\57\11\24"+
    "\24\0\1\24\4\0\3\24\1\54\20\24\1\60\1\24"+
    "\24\0\1\24\4\0\3\24\1\54\3\24\1\61\16\24"+
    "\24\0\1\24\4\0\3\24\1\54\4\24\1\62\15\24"+
    "\24\0\1\24\4\0\3\24\1\54\1\63\21\24\24\0"+
    "\1\24\4\0\3\24\1\54\20\24\1\64\1\24\24\0"+
    "\1\24\4\0\3\24\1\54\15\24\1\65\4\24\24\0"+
    "\1\24\4\0\3\24\1\54\3\24\1\66\16\24\24\0"+
    "\1\24\4\0\3\24\1\54\13\24\1\67\6\24\24\0"+
    "\1\24\4\0\3\24\1\54\1\70\21\24\24\0\1\24"+
    "\4\0\3\24\1\54\6\24\1\71\13\24\60\0\1\72"+
    "\42\0\1\73\36\0\1\24\4\0\3\24\1\0\22\24"+
    "\23\0\1\74\1\24\4\0\3\24\1\54\22\24\24\0"+
    "\1\24\4\0\3\24\1\54\12\24\1\75\7\24\24\0"+
    "\1\24\4\0\3\24\1\54\16\24\1\76\3\24\24\0"+
    "\1\24\4\0\3\24\1\54\12\24\1\77\7\24\24\0"+
    "\1\24\4\0\3\24\1\54\1\100\21\24\24\0\1\24"+
    "\4\0\3\24\1\54\7\24\1\101\12\24\24\0\1\24"+
    "\4\0\3\24\1\54\10\24\1\102\11\24\24\0\1\24"+
    "\4\0\3\24\1\54\7\24\1\103\12\24\24\0\1\24"+
    "\4\0\3\24\1\54\1\104\16\24\1\105\2\24\24\0"+
    "\1\24\4\0\3\24\1\54\20\24\1\106\1\24\24\0"+
    "\1\24\4\0\3\24\1\54\7\24\1\107\12\24\24\0"+
    "\1\24\4\0\3\24\1\54\7\24\1\110\12\24\53\0"+
    "\1\111\47\0\1\112\36\0\1\24\4\0\3\24\1\54"+
    "\16\24\1\113\3\24\24\0\1\24\4\0\3\24\1\54"+
    "\3\24\1\114\16\24\24\0\1\24\4\0\3\24\1\54"+
    "\1\24\1\115\20\24\24\0\1\24\4\0\3\24\1\54"+
    "\2\24\1\116\17\24\24\0\1\24\4\0\3\24\1\54"+
    "\12\24\1\117\7\24\24\0\1\24\4\0\3\24\1\54"+
    "\10\24\1\120\11\24\24\0\1\24\4\0\3\24\1\54"+
    "\12\24\1\121\7\24\24\0\1\24\4\0\3\24\1\54"+
    "\2\24\1\122\17\24\24\0\1\24\4\0\3\24\1\54"+
    "\20\24\1\123\1\24\24\0\1\24\4\0\3\24\1\54"+
    "\15\24\1\124\4\24\24\0\1\24\4\0\3\24\1\54"+
    "\10\24\1\125\11\24\24\0\1\24\4\0\3\24\1\54"+
    "\10\24\1\126\11\24\54\0\1\127\51\0\1\130\33\0"+
    "\1\24\4\0\3\24\1\54\17\24\1\131\2\24\24\0"+
    "\1\24\4\0\3\24\1\54\17\24\1\132\2\24\24\0"+
    "\1\24\4\0\3\24\1\54\10\24\1\133\11\24\24\0"+
    "\1\24\4\0\3\24\1\54\15\24\1\134\4\24\24\0"+
    "\1\24\4\0\3\24\1\54\1\24\1\135\20\24\24\0"+
    "\1\24\4\0\3\24\1\54\3\24\1\136\16\24\23\0"+
    "\1\137\107\0\1\140\26\0\1\24\4\0\3\24\1\54"+
    "\7\24\1\141\12\24\24\0\1\24\4\0\3\24\1\54"+
    "\7\24\1\142\12\24\24\0\1\24\4\0\3\24\1\54"+
    "\12\24\1\143\7\24\24\0\1\24\4\0\3\24\1\54"+
    "\3\24\1\144\16\24\33\0\1\145\63\0\1\146\42\0"+
    "\1\24\4\0\3\24\1\54\13\24\1\147\6\24\24\0"+
    "\1\24\4\0\3\24\1\54\12\24\1\150\7\24\12\0"+
    "\1\151\106\0\1\152\40\0\1\24\4\0\3\24\1\54"+
    "\12\24\1\153\7\24\24\0\1\24\4\0\3\24\1\54"+
    "\3\24\1\154\16\24\40\0\1\155\70\0\1\156\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3666];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\1\11\1\1\5\11\1\1\1\11"+
    "\21\1\1\11\1\1\2\11\1\0\5\11\1\0\15\1"+
    "\1\11\2\0\14\1\2\0\14\1\2\0\6\1\2\0"+
    "\4\1\2\0\2\1\1\11\1\0\2\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
  private void echo () { System . out . print (yytext ()); }

  public int position () { return yycolumn; }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MicroRLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

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
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
          {   { return new Token (Symbol . EOF); }
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { echo (); ErrorMessage . print (yycolumn, "Illegal character");
            }
            // fall through
          case 39: break;
          case 2:
            { echo ();
            }
            // fall through
          case 40: break;
          case 3:
            { echo (); return new Token (Symbol . NOT);
            }
            // fall through
          case 41: break;
          case 4:
            { echo (); return new Token (Symbol . MULOP, yytext ());
            }
            // fall through
          case 42: break;
          case 5:
            { echo (); return new Token (Symbol . LPAREN);
            }
            // fall through
          case 43: break;
          case 6:
            { echo (); return new Token (Symbol . RPAREN);
            }
            // fall through
          case 44: break;
          case 7:
            { echo (); return new Token (Symbol . PLUS);
            }
            // fall through
          case 45: break;
          case 8:
            { echo (); return new Token (Symbol . COMMA);
            }
            // fall through
          case 46: break;
          case 9:
            { echo (); return new Token (Symbol . MINUS);
            }
            // fall through
          case 47: break;
          case 10:
            { echo (); return new Token (Symbol . INTEGER, yytext ());
            }
            // fall through
          case 48: break;
          case 11:
            { echo (); return new Token (Symbol . SEMICOLON);
            }
            // fall through
          case 49: break;
          case 12:
            { echo (); return new Token (Symbol . LT);
            }
            // fall through
          case 50: break;
          case 13:
            { echo (); return new Token (Symbol . GT);
            }
            // fall through
          case 51: break;
          case 14:
            { echo (); return new Token (Symbol . ID, yytext ());
            }
            // fall through
          case 52: break;
          case 15:
            { echo (); return new Token (Symbol . LBRACE);
            }
            // fall through
          case 53: break;
          case 16:
            { echo (); return new Token (Symbol . RBRACE);
            }
            // fall through
          case 54: break;
          case 17:
            { echo (); return new Token (Symbol . NE);
            }
            // fall through
          case 55: break;
          case 18:
            { echo (); return new Token (Symbol . AND);
            }
            // fall through
          case 56: break;
          case 19:
            { echo (); return new Token (Symbol . ASSIGN);
            }
            // fall through
          case 57: break;
          case 20:
            { echo (); return new Token (Symbol . LE);
            }
            // fall through
          case 58: break;
          case 21:
            { echo (); return new Token (Symbol . EQ);
            }
            // fall through
          case 59: break;
          case 22:
            { echo (); return new Token (Symbol . GE);
            }
            // fall through
          case 60: break;
          case 23:
            { echo (); return new Token (Symbol . IF);
            }
            // fall through
          case 61: break;
          case 24:
            { echo (); return new Token (Symbol . OR);
            }
            // fall through
          case 62: break;
          case 25:
            { echo (); return new Token (Symbol . CONS);
            }
            // fall through
          case 63: break;
          case 26:
            { echo (); return new Token (Symbol . ELSE);
            }
            // fall through
          case 64: break;
          case 27:
            { echo (); return new Token (Symbol . HEAD);
            }
            // fall through
          case 65: break;
          case 28:
            { echo (); return new Token (Symbol . MAIN);
            }
            // fall through
          case 66: break;
          case 29:
            { echo (); return new Token (Symbol . NULL);
            }
            // fall through
          case 67: break;
          case 30:
            { echo (); return new Token (Symbol . TAIL);
            }
            // fall through
          case 68: break;
          case 31:
            { echo (); return new Token (Symbol . PRINT);
            }
            // fall through
          case 69: break;
          case 32:
            { echo (); return new Token (Symbol . WHILE);
            }
            // fall through
          case 70: break;
          case 33:
            { echo (); return new Token (Symbol . RETURN);
            }
            // fall through
          case 71: break;
          case 34:
            { echo (); return new Token (Symbol . SOURCE);
            }
            // fall through
          case 72: break;
          case 35:
            { echo (); return new Token (Symbol . LISTR);
            }
            // fall through
          case 73: break;
          case 36:
            { echo (); return new Token (Symbol . FUNCTION);
            }
            // fall through
          case 74: break;
          case 37:
            { echo (); return new Token (Symbol . READLINE);
            }
            // fall through
          case 75: break;
          case 38:
            { echo (); return new Token (Symbol . ASINTEGER);
            }
            // fall through
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
// Token class definition
// Token is a class to represent lexical tokens in the in the MicroR
// programming language.

public class Token {

  private Symbol symbol;	// current token
  private String lexeme;	// lexeme

  public Token () { }

  public Token (Symbol symbol) {
    this (symbol, null);
  }

  public Token (Symbol symbol, String lexeme) {
    this . symbol = symbol;
    this . lexeme  = lexeme;
  }

  public Symbol symbol () { return symbol; }

  public String lexeme () { return lexeme; }

  public String toString () {
    switch (symbol) {
      case COMMA :     return "(punctuation, ,) ";
      case SEMICOLON : return "(punctuation, ;) ";
      case LBRACE :    return "(punctuation, {) ";
      case RBRACE :    return "(punctuation, }) ";
      case ASSIGN :    return "(operator, <-) ";
      case AND :       return "(operator, &&) ";
      case OR :        return "(operator, ||) ";
      case NOT :       return "(operator, !) ";
      case LT :        return "(operator, <) ";
      case LE :        return "(operator, <=) ";
      case GT :        return "(operator, >) ";
      case GE :        return "(operator, >=) ";
      case EQ :        return "(operator, ==) ";
      case NE :        return "(operator, !=) ";
      case PLUS :      return "(operator, +) ";
      case MINUS :     return "(operator, -) ";
      case MULOP :     return "(operator, " + lexeme + ") ";
      case RELOP :     return "(operator, " + lexeme + ") ";
      case LPAREN :    return "(operator, () ";
      case RPAREN :    return "(operator, )) ";
      case ASINTEGER : return "(keyword, as.integer) ";
      case CONS :      return "(keyword, cons) ";
      case ELSE :      return "(keyword, else) ";
      case FUNCTION :  return "(keyword, function) ";
      case HEAD :      return "(keyword, head) ";
      case IF :        return "(keyword, if) ";
      case MAIN :      return "(keyword, main) ";
      case NULL :      return "(keyword, null) ";
      case PRINT :     return "(keyword, print) ";
      case READLINE :  return "(keyword, readline) ";
      case RETURN :    return "(keyword, return) ";
      case SOURCE :    return "(keyword, source) ";
      case TAIL :      return "(keyword, tail) ";
      case WHILE :     return "(keyword, while) ";
      case LISTR :     return "(string, \"List.R\") ";
      case ID :        return "(identifier, " + lexeme + ") ";
      case INTEGER :   return "(integer, " + lexeme + ") ";
      default : 
	ErrorMessage . print (0, "Unrecognized token");
        return null;
    }
  }

}

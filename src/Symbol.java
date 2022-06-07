// Symbol enumeration definition
// Symbol is an enumeration to represent lexical token classes in the MicroR
// programming language.

public enum Symbol {
  EOF, 
  // punctuation
  COMMA, SEMICOLON, LBRACE, RBRACE, 
  // operators
  ASSIGN, AND, OR, NOT, ADDOP, MULOP, RELOP,
  LPAREN, RPAREN, 
  // keywords
  ASINTEGER, CONS, ELSE, FUNCTION, HEAD, IF, MAIN, NULL, PRINT, READLINE, 
  RETURN, SOURCE, TAIL, WHILE,
  // "List.R" string
  LISTR,
  // ids and integers
  ID, INTEGER
}

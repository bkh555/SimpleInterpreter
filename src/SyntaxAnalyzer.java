// SyntaxAnalyzer class
// SyntaxAnalyzer is a class to represent a recursive descent parser for the 
// MicroR programming language.

import java.io.*;

public class SyntaxAnalyzer {

  protected MicroRLexer lexer;	// lexical analyzer
  protected Token token;	// current token

  public SyntaxAnalyzer () throws IOException {
    lexer = new MicroRLexer (new InputStreamReader (System . in));
    getToken ();
  }

  private void getToken () throws IOException { 
    token = lexer . nextToken (); 
  }

  // Program ::= source ( “List.R” ) {FunctionDef} MainDef

  public void program () throws IOException {
    if (token . symbol () != Symbol . SOURCE) 	// source
      ErrorMessage . print (lexer . position (), "source EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . LPAREN) 	// (
      ErrorMessage . print (lexer . position (), "( EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . LISTR) 	// "List.R"
      ErrorMessage . print (lexer . position (), "\"List.R\" EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . RPAREN ) 	// )
      ErrorMessage . print (lexer . position (), ") EXPECTED");
    getToken ();
    while (token . symbol () == Symbol . ID) 	// {FunctionDef}
      System.out.println(functionDef ());

    System.out.println(mainDef());
    if (token . symbol () != Symbol . EOF) 
      ErrorMessage . print (lexer . position (), "END OF PROGRAM EXPECTED");
  }

  // FunctionDef ::= 
  //     id <− function ( [id {, id }] ) "{" {Statement} return ( Expr ) ; "}"

  public Program functionDef () throws IOException {
    if (token . symbol () != Symbol . ID)        	// id
      ErrorMessage . print (lexer . position (), "id EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . ASSIGN)     	// <-
      ErrorMessage . print (lexer . position (), "<- EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . FUNCTION)  	// function
      ErrorMessage . print (lexer . position (), "function EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . LPAREN)     	// (
      ErrorMessage . print (lexer . position (), "( EXPECTED");
    getToken ();
    if (token . symbol () == Symbol . ID) {     	// [ id
      getToken ();
      while (token . symbol () == Symbol . COMMA) {	// { ,
        getToken ();
        if (token . symbol () != Symbol . ID)      	// id
          ErrorMessage . print (lexer . position (), "id EXPECTED");
        getToken ();
      }                                          	// }
    }                                             	// ]
    if (token . symbol () != Symbol . RPAREN)   	// )
        ErrorMessage . print (lexer . position (), ") EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . LBRACE)      	// "{"
      ErrorMessage . print (lexer . position (), "{ EXPECTED");
    getToken ();
    Statement stmt = statementList();
    if (token . symbol () != Symbol . RETURN)    	// return
      ErrorMessage . print (lexer . position (), "return EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . LPAREN)    	// (
      ErrorMessage . print (lexer . position (), "( EXPECTED");
    getToken ();
    cond ();                                     	// Expr
    if (token . symbol () != Symbol . RPAREN)    	// )
      ErrorMessage . print (lexer . position (), ") EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . SEMICOLON)    	// ;
      ErrorMessage . print (lexer . position (), "; EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . RBRACE)    	// "}"
      ErrorMessage . print (lexer . position (), "} EXPECTED");
    getToken ();
    return stmt;
  }

  // MainDef ::= main < − function ( ) "{" StatementList "}"

  public Program mainDef () throws IOException {
    if (token . symbol () != Symbol . MAIN)   	// main
      ErrorMessage . print (lexer . position (), "main EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . ASSIGN)  	// <-
      ErrorMessage . print (lexer . position (), "<- EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . FUNCTION) // function
      ErrorMessage . print (lexer . position (), "function EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . LPAREN) 	// (
      ErrorMessage . print (lexer . position (), "( EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . RPAREN) 	// )
      ErrorMessage . print (lexer . position (), ") EXPECTED");
    getToken ();
    if (token . symbol () != Symbol . LBRACE) 	// "{"
      ErrorMessage . print (lexer . position (), "{ EXPECTED");
    getToken ();
    Statement stmt = statementList();                      	// StatementList
    if (token . symbol () != Symbol . RBRACE) 	// "}"
      ErrorMessage . print (lexer . position (), "} EXPECTED");
    getToken();
    return stmt;
  }

  // StatementList ::= Statement { Statement }

  public Statement statementList () throws IOException {
    Statement stmt1 = null, stmt2;                          	// Statement
    while (token . symbol () == Symbol . IF  	// {
        || token . symbol () == Symbol . WHILE
        || token . symbol () == Symbol . ID
        || token . symbol () == Symbol . PRINT) {
      if (stmt1 == null) {
        stmt1 = statement();
      } else {
        stmt2 = statement();
        if (stmt2 != null)
          stmt1 = new Statement(stmt1, stmt2);
      }
    }
    return stmt1;
  }
  public Statement statement () throws IOException {

    Expression exp;
    Statement stmt = null, stmt1, stmt2 = null;
    String id;
    VariableRef var;

    switch (token . symbol ()) {

      case IF :                                  	// if
        getToken ();
        if (token . symbol () != Symbol . LPAREN)   	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        exp = cond ();                                 	// Cond
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . LBRACE) 	// "{"
          ErrorMessage . print (lexer . position (), "{ EXPECTED");
        getToken ();
        stmt1 = statementList ();                       	// StatementList
        if (token . symbol () != Symbol . RBRACE) 	// "}"
          ErrorMessage . print (lexer . position (), "} EXPECTED");
        getToken ();
        if (token . symbol () == Symbol . ELSE) {  	// [ else
          getToken ();
          if (token . symbol () != Symbol . LBRACE) 	// "{"
            ErrorMessage . print (lexer . position (), "{ EXPECTED");
          getToken ();
          stmt2 = statementList ();                       	// StatementList
          if (token . symbol () != Symbol . RBRACE) 	// "}"
            ErrorMessage . print (lexer . position (), "} EXPECTED");
          getToken ();
        }                                        	// ]
	    stmt = new Conditional(exp, stmt1, stmt2);
        break;

      case WHILE :                                  	// while
        getToken ();
        if (token . symbol () != Symbol . LPAREN)   	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        exp = cond ();                                 	// Cond
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . LBRACE) 	// "{"
          ErrorMessage . print (lexer . position (), "{ EXPECTED");
        getToken ();
        stmt1 = statementList ();
	    stmt = new Loop (exp, stmt1);                       	// StatementList
        if (token . symbol () != Symbol . RBRACE) 	// "}"
          ErrorMessage . print (lexer . position (), "} EXPECTED");
        getToken ();
        break;

      case ID :
        id = token . lexeme();    // id
        getToken ();
        var = new VariableRef(id);
        if (token . symbol () != Symbol . ASSIGN)  	// <-
          ErrorMessage . print (lexer . position (), "<- EXPECTED");
        getToken();
        exp = cond();
        stmt = new Assignment(var, exp);
        if (token . symbol () != Symbol . SEMICOLON)  	// ;
          ErrorMessage . print (lexer . position (), "; EXPECTED");
        getToken();
        break;

      case PRINT :      // print
        getToken ();
        if (token . symbol () != Symbol . LPAREN)  	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        id = token . lexeme();
        var = new VariableRef(id);
        exp = cond ();              // Expr
        stmt = new Prints(var);
        if (token . symbol () != Symbol . RPAREN) 	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . SEMICOLON)  	// ;
          ErrorMessage . print (lexer . position (), "; EXPECTED");
        getToken ();
        break;

      default :
        ErrorMessage . print (lexer . position (), "UNRECOGNIZABLE SYMBOL");

    }
	return stmt;
  }

  // Cond ::= AndExpr {|| AndExpr}

  public Expression cond () throws IOException {
    Expression exp;
    exp = andExpr ();                                	// AndExpr
    while (token . symbol () == Symbol . OR) { 	// { ||
      getToken ();
      exp = new Binary ("||", exp, andExpr ());                              	// AndExpr }
    }
    return exp;
  }

  // AndExpr ::= RelExpr {&& RelExpr}

  public Expression andExpr () throws IOException {
    Expression andExp;
    andExp = relExpr ();                                	// relExpr
    while (token . symbol () == Symbol . AND) { // { &&
      getToken ();
      andExp = new Binary("&&", andExp, relExpr ());                              	// relExpr }
    }
    return andExp;
  }

  // RelExpr ::= [!] Expr RelOper Expr

  public Expression relExpr () throws IOException {
    Expression relation = null;
    String op;
    relation = Expr ();
    while(token.symbol() == Symbol.RELOP){
      op = token.lexeme();
      getToken();
	  relation = new Binary (op, relation, Expr ());
    }
    return relation;
  }

  
  // MulExpr ::= PrefixExpr {MulOper PrefixExpr}
  // MulOper ::= * | /

  public Expression Expr () throws IOException {
    Expression addition;
    String op;
    addition = mulExpr ();
    while(token.symbol() == Symbol.ADDOP){
        op = token . lexeme ();
        getToken();
        addition = new Binary (op, addition, mulExpr ());
    }
    return addition;
  }

   public Expression mulExpr () throws IOException {
    Expression mul;
    String op;
    mul = simpleExpr ();
    while(token.symbol() == Symbol.MULOP){
	    op = token.lexeme();
        getToken();
        mul = new Binary (op, mul, simpleExpr ());
    }
    return mul;
  }


  public Expression prefixExpr () throws IOException {
    Expression factor, primary;
    String op = null;
    if(token.symbol() == Symbol . ADDOP){
        op = token . lexeme();
	    getToken();
    }

    primary = simpleExpr ();
    if (op != null)
	  factor = new Unary (op, primary);
    else
	  factor = primary;
    return factor;
  }


  // PrefixExpr ::= [AddOper] SimpleExpr
  // SimpleExpr ::= integer | ( Expr ) | as.integer ( readline ( ) ) 
  //   | id [ ( [Expr {, Expr}] ) ] | cons ( Expr , Expr ) | head ( Expr ) 
  //   | tail ( Expr ) | null ( )

  public Expression simpleExpr () throws IOException {
    Expression exp, primary = null;
    String id, type;

    switch (token . symbol ()) {

      case INTEGER :   
	    primary = new IntValue(Integer.parseInt(token.lexeme()));                          	// integer
        getToken ();
        break;

      case LPAREN :                                  	// (
        getToken ();
        primary = Expr ();                                	// Expr
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        break;

      case ASINTEGER :                            	// as.integer
        getToken ();
        if (token . symbol () != Symbol . LPAREN)  	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . READLINE) 	// readline
          ErrorMessage . print (lexer . position (), "readline EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . LPAREN)  	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . SEMICOLON)  	// ;
          ErrorMessage . print (lexer . position (), "; EXPECTED");
        primary = new ReadLine();
        break;

      case ID :
        id = token . lexeme(); // id
        getToken ();
        if (token . symbol () != Symbol . LPAREN) {
          primary = new VariableRef(id);
        }
        else { 	// [
            getToken();
            exp = cond();
            primary = new ArrayRef(id, exp);
            while (token . symbol () == Symbol . COMMA){
              exp = cond();
            }
            if (token . symbol () != Symbol . RPAREN) 	// )
              ErrorMessage . print (lexer . position (), ") EXPECTED");
            getToken();
          }                                      	// ]
        break;

      case CONS :                               	// cons
        getToken ();
        if (token . symbol () != Symbol . LPAREN)  	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        exp = cond ();                                 	// Expr
        if (token . symbol () != Symbol . COMMA)   	// ,
          ErrorMessage . print (lexer . position (), ", EXPECTED");
        getToken ();
        exp = cond ();                                 	// Expr
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        break;

      case HEAD :                               	// head
        getToken ();
        if (token . symbol () != Symbol . LPAREN) 	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        exp = cond ();                                	// Expr
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        break;

      case TAIL :                                	// tail
        getToken ();
        if (token . symbol () != Symbol . LPAREN) 	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        exp = cond ();                                	// Expr
        if (token . symbol () != Symbol . RPAREN)  	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        break;

      case NULL :                               	// null
        getToken ();
        if (token . symbol () != Symbol . LPAREN) 	// (
          ErrorMessage . print (lexer . position (), "( EXPECTED");
        getToken ();
        if (token . symbol () != Symbol . RPAREN) 	// )
          ErrorMessage . print (lexer . position (), ") EXPECTED");
        getToken ();
        break;

      default :
        ErrorMessage . print (lexer . position (), "UNRECOGNIZABLE SYMBOL");
    }
	return primary;
  }
}

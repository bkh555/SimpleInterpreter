%%
%{
  private void echo () { System . out . print (yytext ()); }

  public int position () { return yycolumn; }
%}

%class    MicroRLexer
%function nextToken
%type	  Token
%unicode
%line
%column
%eofval{
  { return new Token (Symbol . EOF); }
%eofval}

LineTerminator = \r|\n|\r\n
Comment	   = "#".*
WhiteSpace     = {LineTerminator} | [ \t\f]
Id         = [:letter:] ("_"?([:letter:] | [:digit:]))*
Integer    = [:digit:] [:digit:]*
RelOp      = "<" | "<=" | ">" | ">="
MulOp      = "*" | "/" | "%"

%%
","		{ echo (); return new Token (Symbol . COMMA); }
";"		{ echo (); return new Token (Symbol . SEMICOLON); }
"{"		{ echo (); return new Token (Symbol . LBRACE); }
"}"		{ echo (); return new Token (Symbol . RBRACE); }
"<-"     	{ echo (); return new Token (Symbol . ASSIGN); }
"&&"    	{ echo (); return new Token (Symbol . AND); }
"||"    	{ echo (); return new Token (Symbol . OR); }
"!"     	{ echo (); return new Token (Symbol . NOT); }
"<"     	{ echo (); return new Token (Symbol . LT); }
"<="    	{ echo (); return new Token (Symbol . LE); }
">"     	{ echo (); return new Token (Symbol . GT); }
">="    	{ echo (); return new Token (Symbol . GE); }
"=="     	{ echo (); return new Token (Symbol . EQ); }
"!="    	{ echo (); return new Token (Symbol . NE); }
"+"		{ echo (); return new Token (Symbol . PLUS); }
"-"		{ echo (); return new Token (Symbol . MINUS); }
{MulOp}         { echo (); return new Token (Symbol . MULOP, yytext ()); }
{RelOp}         { echo (); return new Token (Symbol . RELOP, yytext ()); }
"("		{ echo (); return new Token (Symbol . LPAREN); }
")"		{ echo (); return new Token (Symbol . RPAREN); }
as"."integer	{ echo (); return new Token (Symbol . ASINTEGER); }
cons    	{ echo (); return new Token (Symbol . CONS); }
else    	{ echo (); return new Token (Symbol . ELSE); }
function	{ echo (); return new Token (Symbol . FUNCTION); }
head    	{ echo (); return new Token (Symbol . HEAD); }
if		{ echo (); return new Token (Symbol . IF); }
main    	{ echo (); return new Token (Symbol . MAIN); }
null 	 	{ echo (); return new Token (Symbol . NULL); }
print 		{ echo (); return new Token (Symbol . PRINT); }
readline	{ echo (); return new Token (Symbol . READLINE); }
return  	{ echo (); return new Token (Symbol . RETURN); }
source     	{ echo (); return new Token (Symbol . SOURCE); }
tail 	 	{ echo (); return new Token (Symbol . TAIL); }
while		{ echo (); return new Token (Symbol . WHILE); }
\"List"."R\"	{ echo (); return new Token (Symbol . LISTR); }
{Id}    	{ echo (); return new Token (Symbol . ID, yytext ()); }
{Integer}	{ echo (); return new Token (Symbol . INTEGER, yytext ()); }
{Comment}	{ echo (); }
{WhiteSpace}	{ echo (); }
.		{ echo (); ErrorMessage . print (yycolumn, "Illegal character"); }

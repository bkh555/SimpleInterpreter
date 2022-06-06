abstract class Program { }

class Statement extends Program {

   protected Statement stmt1, stmt2;

   public Statement () { }

   public Statement (Statement stmt1, Statement stmt2) {
     this . stmt1 = stmt1;
     this . stmt2 = stmt2;
   }

   public String toString () {
     if (stmt1 == null)
       return "()";
     else if (stmt2 == null)
       return "(" + stmt2 + ")";
     else
       return "(: " + stmt1 + " " + stmt2 + ")";
   }

}

class Assignment extends Statement {

   protected VariableRef lhs;
   protected Expression rhs;

   public Assignment () { }

   public Assignment (VariableRef lhs, Expression rhs) {
     this . lhs = lhs;
     this . rhs = rhs;
   }

   public String toString () {
     return "(= " + lhs + " " + rhs + ")";
   }

}

class Conditional extends Statement {

  protected Expression test;
  protected Statement elseStmt, thenStmt;

  public Conditional () { }

  public Conditional (Expression test, Statement thenStmt, Statement elseStmt) {
    this . test = test;
    this . thenStmt = thenStmt;
    this . elseStmt = elseStmt;
  }

  public String toString () {
     return "(if " + test + " " + thenStmt + " " + elseStmt + ")";
   }

}

class Loop extends Statement {

  protected Expression test;
  protected Statement body;

  public Loop () { }

  public Loop (Expression test, Statement body) {
    this . test = test;
    this . body = body;
  }

  public String toString () {
     return "(while " + test + " " + body + ")";
   }

}

abstract class Expression { }

class VariableRef extends Expression {

  protected String id;

  public VariableRef () { }

  public VariableRef (String id) {
    this . id = id;
  }

  public String toString () {
    return "(id " + id + ")";
  }

}

abstract class Value extends Expression { }

class IntValue extends Value {

  protected int intValue;

  public IntValue () { }

  public IntValue (int intValue) {
    this . intValue = intValue;
  }

  public String toString () {
    return "(intValue " + intValue + ")";
  }

}

class Binary extends Expression {

  protected String op;
  protected Expression term1, term2;

  public Binary () { }

  public Binary (String op, Expression term1, Expression term2) {
    this . op = op;
    this . term1 = term1;
    this . term2 = term2;
  }

  public String toString () {
    return "(" + op + " " + term1 + " " + term2 + ")";
  }

}

class Unary extends Expression {

  protected String op;
  protected Expression term;

  public Unary () { }

  public Unary (String op, Expression term) {
    this . op = op;
    this . term = term;
  }

  public String toString () {
    return "(" + op + " " + term + ")";
  }

}

grammar PL;

program: statement+;

statement: NEWLINE
      | declaration NEWLINE
      | assignment NEWLINE
      | funcInvoke NEWLINE
      | whileLoop NEWLINE
      ;

whileLoop  : 'while' booleanExpr '{' statement+ '}';

funcInvoke: ID '(' dataExpr ')';

assignment: ID ASMT dataExpr;

declaration: 'declare' assignment;

booleanExpr: ID BOOL INT
      | ID BOOL ID
      | booleanExpr 'and' booleanExpr
      | booleanExpr 'or' booleanExpr
      | '(' booleanExpr ')'
      ;

dataExpr  : INT
      | ID
      | dataExpr '+' dataExpr
      | dataExpr '*' dataExpr
      | dataExpr '-' dataExpr
      | dataExpr '/' dataExpr
      | dataExpr ',' dataExpr
      | '(' dataExpr ')'
      ;


ID: [a-zA-Z]+;

INT   : [0-9]+
      ;

BOOL  : '>'
      | '<'
      | '=='
      ;

ASMT  : '=';

WS: [ \t]+ -> skip;

NEWLINE: '\n';

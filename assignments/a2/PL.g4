grammar PL;

prog  : line+;

line  : NEWLINE
      | declaration NEWLINE
      | loop NEWLINE
      ;

declaration: 'declare' VARIABLE ASMT dataExpr
      ;

loop  : 'while' bool '{'
      | 'while' bool 'or' bool '{'
      | 'while' bool 'and' bool '{'
      ;

dataExpr  : INT
      | '(' dataExpr ')'
      | dataExpr '+' dataExpr
      | dataExpr '*' dataExpr
      | dataExpr '-' dataExpr
      | dataExpr '/' dataExpr
      ;

bool  : VARIABLE BOOL INT
      | '(' bool ')'
      ;

VARIABLE: [a-zA-Z]+;

INT   : [0-9]+
      ;

BOOL  : '>'
      | '<'
      | '=='
      ;

ASMT  : '=';

WS: [ \t]+ -> skip;

NEWLINE: '\n';

grammar Calc;

prog: stmt+;

stmt: expr NEWLINE
  | NEWLINE
  ;

expr: INT
  | expr ('+'|'-') expr
  | expr ('*'|'/') expr
  | '(' expr ')'
  ;

INT: [0-9]+;

NEWLINE: '\r'?'\n';

WS: [ \t]+ -> skip;

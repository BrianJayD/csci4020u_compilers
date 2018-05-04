grammar Variables;

@header {

}

@members {
  int v1;
  int v2;
}

prog: lines+;

lines: initialize
    | expr;

expr: input OP input;

initialize
    : VAR '=' NUMBER {
      v1 = NUMBER;
      System.out.println(v1);
    }
    ;

input: VAR
    | NUMBER
    ;

NUMBER: [0-9]+;

VAR: [a-z]+;

OP: '+' | '-' | '*' | '/';

WS: [ \t\r\n]+ -> skip;

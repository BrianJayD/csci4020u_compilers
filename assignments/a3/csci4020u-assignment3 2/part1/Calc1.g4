grammar Calc1;

@header{

}

@members{
  Integer count = 0;
}

prog
    : line+ {System.out.println("STATUS OKAY");}
    ;

line
    : display {
      //System.out.println("Line " + count + ": " + $display.text);
      count++;
    }
    | assign {
      //System.out.println("Line " + count + ": " + $assign.text);
      count++;
    }
    | print
    ;

display
    : 'display' '(' print ')'
    ;

print
    : scientific
    | string
    | print ',' print
    ;

assign
    : VARIABLE '=' basic
    ;

scientific
    : basic
    | 'pow' '(' scientific ',' value')'
    | 'sin' '(' scientific ')'
    | 'cos' '(' scientific ')'
    | scientific OP scientific
    ;

basic
    : value
    | basic OP basic
    | '(' basic ')'
    ;

string: QUOTE (VARIABLE | CHARS) QUOTE;

value
    : number
    | VARIABLE
    ;

number
    : NUM
    | NUM '.' NUM
    ;

NUM: [0-9]+;

QUOTE: '"' | '“' | '”';

VARIABLE: [a-z]+;

CHARS: [a-zA-Z0-9:=]+;

OP: '+' | '-' | '*' | '/';


WS: [ \t\r\n]+ -> skip;

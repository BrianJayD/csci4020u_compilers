grammar Factor;

prog: expr+;

expr: expr addition
    | NUMBER
    ;

addition: '+' expr;

NUMBER: [0-9]+;

WS: [ \t\r\n] -> skip;

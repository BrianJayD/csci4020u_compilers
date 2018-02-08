lexer grammar Hello;

Directive: '#'('include' | 'define');

Library: '<'[a-zA-Z]+'.h>';

Types: 'int' | 'float' | 'char' | 'char*' | 'char**';



Whitespace: [ \t\r\n]+ -> skip;

grammar Midterm;

object: '{' section '}';

section: entry
      | entry ',' section
      ;

entry: '\n'
      | string ':' array
      ;

array: number
      | '[' array_values ']'
      | object
      ;

array_values: value
      | value ',' array_values
      ;

value: number
      | string
      ;

string: LETTER
      | string LETTER
      ;

number: DIGIT
      | number DIGIT
      ;

LETTER: [a-zA-Z];

DIGIT: [0-9];

WS: [ \t\n\r"]+ -> skip;

grammar Csv;

@header {

}

@members {
    int col;
}

file: (row NL)+;

row locals [int i=0]
    : (STUFF {
        $i++;
        if ($i == col) System.out.println($STUFF.text);
      })+
    ;

COMMA: ',' -> skip;

NL: '\r'? '\n';

STUFF: ~[\r\t\n,]+;

grammar Calc;

@members {
  public void echo() {System.out.println("echo");}
}

program: (expr '\n' {System.out.println($expr.v);})+;

expr returns [double v]
    : Number {$v = Double.parseDouble($Number.text);} //Converts shit naw mean?
    | e1=expr '+' e2=expr {$v = $e1.v + $e2.v;} //Embedded actions. Variable names.
    | e1=expr '-' e2=expr {$v = $e1.v - $e2.v;}
    | e1=expr '*' e2=expr {$v = $e1.v * $e2.v;}
    | e1=expr '/' e2=expr {$v = $e1.v / $e2.v;}
    | '(' expr ')' {$v = $expr.v;}
    ;

Number: [0-9]+;

WS: [ \t\r] -> skip;

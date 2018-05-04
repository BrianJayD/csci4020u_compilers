grammar Calc2;

@header{
  import java.util.*;
  import java.lang.*;
}

@members{
  Integer count = 0;
  Map<String, Double> varValues = new HashMap<String, Double>();

  public void print(String p) {
    System.out.println("print(): " + p);
  }

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
    ;

display
    : 'display' '(' print ')' {
      System.out.println($print.str);
    }
    ;

print returns [String str]
    : scientific {
      $str = Double.toString($scientific.stfc);
    }
    | string {
      $str = $string.unq;
    }
    | c=print ',' d=print {
      $str = $c.str + $d.str;
    }
    ;

assign
    : VARIABLE '=' basic {
      varValues.put($VARIABLE.text, $basic.ans);
      //System.out.println("Assign: " + varValues.get($VARIABLE.text));
    }
    ;

scientific returns [double stfc]
    : basic {
      $stfc = $basic.ans;
    }
    | 'pow' '(' scientific ',' value')' {
      $stfc = Math.pow($scientific.stfc, $value.val);
    }
    | 'sin' '(' scientific ')' {
      $stfc = Math.sin($scientific.stfc);
    }
    | 'cos' '(' scientific ')' {
      $stfc = Math.cos($scientific.stfc);
    }
    | a=scientific OP b=scientific {
      String comp = $OP.text;
      //System.out.println(comp);
      if (comp.equals("+")) {
        $stfc = $a.stfc + $b.stfc;
        //System.out.println($stfc);
      }
      if (comp.equals("-")) {
        $stfc = $a.stfc - $b.stfc;
        //System.out.println($stfc);
      }
      if (comp.equals("*")) {
        $stfc = $a.stfc * $b.stfc;
        //System.out.println($stfc);
      }
      if (comp.equals("/")) {
        if ($b.stfc == 0) {
          System.err.println("Cannot Divide");
        } else {
          $stfc = $a.stfc / $b.stfc;
        }
        //System.out.println($stfc);
      }
    }
    ;

basic returns [double ans]
    : value {
      $ans = $value.val;
    }
    | x=basic OP y=basic {
      String comp = $OP.text;
      //System.out.println(comp);
      if (comp.equals("+")) {
        $ans = $x.ans + $y.ans;
        //System.out.println($ans);
      }
      if (comp.equals("-")) {
        $ans = $x.ans - $y.ans;
        //System.out.println($ans);
      }
      if (comp.equals("*")) {
        $ans = $x.ans * $y.ans;
        //System.out.println($ans);
      }
      if (comp.equals("/")) {
        if ($y.ans == 0) {
          System.err.println("Cannot Divide");
        } else {
          $ans = $x.ans / $y.ans;
        }
        //System.out.println($ans);
      }
    }
    | '(' basic ')' {
      $ans = $basic.ans;
    }
    ;

string returns [String unq]
    : QUOTE x=(VARIABLE | CHARS) QUOTE {
      $unq = $x.text;
      //System.out.println($unq);
    }
    ;

value returns [double val]
    : number {
      $val = $number.num;
      //System.out.println($val);
    }
    | VARIABLE {
      //System.out.println("VARIABLE: " + varValues.get($VARIABLE.text));
      $val = varValues.get($VARIABLE.text);
      //System.out.println($val);
    }
    ;

number returns [double num]
    : NUM {
      $num = Double.parseDouble($NUM.text);
      //print(Double.toString($num));
    }
    | x=NUM '.' y=NUM {
      String convert = $x.text + "." + $y.text;
      $num = Double.parseDouble(convert);
      //print(Double.toString($num));
    }
    ;

NUM: [0-9]+;

QUOTE: '"' | '“' | '”';

VARIABLE: [a-z]+;

CHARS: [a-zA-Z0-9:=]+;

OP: '+' | '-' | '*' | '/';


WS: [ \t\r\n]+ -> skip;

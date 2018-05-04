grammar PL;

@header{
  import java.util.*;
}

@members{
  Integer count = 0;

  HashMap<String, Double> varValues = new HashMap<String, Double>();
  HashMap<String, Double> funcArgs = new HashMap<String, Double>();
  HashMap<String, List<String>> funcBody = new HashMap<String, List<String>>();

  public Double math(Double a, Double b, String opSym) {
    if (opSym.equals("+")) {
      return (a + b);
    }
    if (opSym.equals("-")) {
      return (a - b);
    }
    if (opSym.equals("*")) {
      return (a * b);
    }
    if (opSym.equals("/")) {
      return (a / b);
    }
    return a;
  }

  public void display(double p) {
    System.out.println(p);
  }

  public boolean condCheck(double a, double b, String sym) {
    if (sym.equals(">") && (a > b)) {
      return true;
    }
    if (sym.equals("<") && (a < b)) {
      return true;
    }
    if (sym.equals("==") && (a == b)) {
      return true;
    }
    return false;
  }

  public double evalIfElse(double l, double r, String sym) {
    boolean b = condCheck(l, r, sym);

    if (b) {
      return l;
    } else {
      return r;
    }
  }

  public void evalBlock(String name, HashMap<String, Double> vars, List<Double> vals, String[] ops) {
    List<String> body = funcBody.get(name);
    for (int i = 0; i < body.size(); i++) {
      System.out.println("BODY: " + body.get(i));
    }
  }

}

prog
    : block
    ;

block returns [List<String> t]
    @init { $t = new ArrayList<String>(); }
    : line { $t.add($line.s); } (block {
        for (int i = 0; i < $block.t.size(); i++) {
          $t.add($block.t.get(i));
        }
      })?
    ;

line returns [String s]
    : print { $s = "print"; }
    | assign { $s = "assign"; }
    | ifElse { $s = "ifElse"; }
    | funcDecl { $s = "funcDecl"; }
    | funcCall { $s = "funcCall"; }
    ;

funcCall returns [double rtn]
    : VARIABLE iniparams {
      int j = 0;
      for (String name: funcArgs.keySet()) {
        String key = name.toString();
        Double v = $iniparams.prm.get(j);
        funcArgs.put(key, v);
        System.out.println("UPDATE: " + key + " " + funcArgs.get(key));
        j++;
      }
      evalBlock($VARIABLE.text, funcArgs, $iniparams.prm, null);
    }
    ;

funcDecl
    : 'function' VARIABLE iniparams {
        System.out.println($VARIABLE.text);
        for (String name: $iniparams.phm.keySet()){

          String key = name.toString();
          String value = $iniparams.phm.get(name).toString();
          System.out.println(key + " " + value);
        }
        funcArgs = $iniparams.phm;
      }
      '{' block {
        funcBody.put($VARIABLE.text, $block.t);
      } '}'

    ;

iniparams returns [HashMap<String, Double> phm, List<Double> prm]
    @init {
      $phm = new HashMap<String, Double>();
      $prm = new ArrayList<Double>();
    }
    : ('(')? VARIABLE { $phm.put($VARIABLE.text, 0.0); }
      (',' iniparams {
        for (String name: $iniparams.phm.keySet()){

          String key = name.toString();
          Double value = $iniparams.phm.get(name);
          $phm.put(key, value);
        }
      })? (')')?
    | ('(')? basic {
        $prm.add($basic.ans);
      }
      (',' iniparams {
        for (int i = 0; i < $iniparams.prm.size(); i++) {
          $prm.add($iniparams.prm.get(i));
        }
      })? (')')?
    ;

ifElse returns [double r]
    : 'if' '(' condition ')' '{' i=VARIABLE '}' {
        if ($condition.c) { $r = varValues.get($i.text); }
      } ('else' '{' e=VARIABLE '}')? {
        if (!($condition.c)) { $r = varValues.get($e.text); }
      }
    ;

condition returns [double left, double right, boolean c]
    : ('(')? a=basic COMP b=basic (')')? {
        $left = $a.ans;
        $right = $b.ans;
        $c = condCheck($a.ans, $b.ans, $COMP.text);
      }
    ;

print
    : '->' basic { display($basic.ans); }
    ;

assign
    : VARIABLE '=' (basic { varValues.put($VARIABLE.text, $basic.ans); }
      | ifElse { varValues.put($VARIABLE.text, $ifElse.r); })
    ;

basic returns [double ans]
    : value { $ans = $value.v; }
    | a=basic OP b=basic {
        $ans = math($a.ans, $b.ans, $OP.text);
      }
    | '(' basic ')' { $ans = $basic.ans; }
    ;

value returns [double v]
    : number { $v = $number.n; }
    | VARIABLE { $v = varValues.get($VARIABLE.text); }
    ;

number returns [double n]
    : NUM { $n = Double.parseDouble($NUM.text); }
    | x=NUM '.' y=NUM {
        String convert = $x.text + "." + $y.text;
        $n = Double.parseDouble(convert);
      }
    ;

NUM: [0-9]+;

QUOTE: '"' | '“' | '”';

VARIABLE: [a-z]+;

CHARS: [a-zA-Z0-9:=]+;

OP: '+' | '-' | '*' | '/';

COMP: '>' | '<' | '==';

WS: [ \t\r\n]+ -> skip;

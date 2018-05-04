grammar Func;

@header {
    import java.util.Map;
    import java.util.ArrayList;
    import java.util.HashMap;
}

@members {
    public Map<String, ArrayList<Integer>> memory = new HashMap<>();

    //save
    public void save(String id, ArrayList<Integer> list) {
      System.out.println(id + " = " + list.toString());
      this.memory.put(id, list);
    }

    //load
    public ArrayList<Integer> load(String id) {
      return this.memory.get(id);
    }

    //multiply
    public Integer mul(ArrayList<Integer> list) {
      Integer result = 1;
      for (Integer ele: list) {
        result *= ele;
      }
      return result;
    }
}

program: (statement NL)+;

statement: assign | function {System.out.println($function.v);};

assign:
    ID '=' list {
      save($ID.text, $list.v);}
    ;

list returns [ArrayList<Integer> v = new ArrayList<>()]
    : '[' i1=INT (',' i2=INT {$v.add(Integer.parseInt($i2.text));})* ']' {
      $v.add(Integer.parseInt($i1.text));
    }
    ;

function returns [Integer v]
    : 'reduce(' ID ',' '*' ')' {$v = mul(load($ID.text));};

ID: [a-z]+;

INT: [0-9]+;

NL: '\r'?'\n';

WS: [ \t] -> skip;

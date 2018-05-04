grammar Recursion;

expr: NUMBER addition;

addition: + expr addition;

NUMBER: [0-9]+;

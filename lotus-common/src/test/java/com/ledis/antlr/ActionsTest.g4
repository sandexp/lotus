// 测试动作
grammar ActionsTest;

ID : [a-z]+;

WS : [ \t\n\r] -> skip;

decl: type ID ';' {
  System.out.println("var = "+ $ID.text);
};

type: 'int' | 'float';


stat: 'return' ID ';' {
    System.out.println("line = "+ $ID.line);
};

returnStat : 'return' expr ';' {
   System.out.println("matched "+$expr.text);
};

returnStat2 : 'return' expr ';' {
   System.out.println("matched "+$start.getText());
};


expr:  expr '(' expr ')'
    | expr '+' expr
    | expr '-' expr
    | expr '*' expr
    | expr '/' expr
    | ID
    ;
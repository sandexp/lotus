grammar Test;


WS : [ \t\r\n]+ -> skip;

operend: DIGIT;

operator: plus | sub | multi | div;

plus : '+';

sub : '-';

multi : '*';

div : '/';

result: operend operator operend;

r1 : 'loli' DIGIT;

DIGIT : [0-9]+;

WORD : [a-z]+;

stat : 'return' value = expr ';' # Return
    | 'break' ';' # Break
    ;

expr : expr multi expr # Mult
    | expr plus expr # Plu
    | expr sub expr # Dec
    | expr div expr # Rev
    | DIGIT # Int
    ;

inc : expr '++';

name : WORD;

field : expr '.' expr;

// 创建匹配数组类型的token
array : '{' el+=DIGIT (',' el+=DIGIT)* '}';

elist : exprs+=expr ( ',' exprs+=expr)*;

add[int x] returns [int res]: '+=' DIGIT {$res = $x + $DIGIT.int;} ;

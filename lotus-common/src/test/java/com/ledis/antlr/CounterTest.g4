grammar CounterTest;

s : expr EOF ;

expr:	add ((MUL | DIV) add)* ;

add :   atom ((ADD | SUB) atom)* ;

atom : INT ;

INT : [0-9]+;
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';
WS : [ \t]+ -> channel(HIDDEN);
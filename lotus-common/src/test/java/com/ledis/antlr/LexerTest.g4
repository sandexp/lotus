lexer grammar LexerTest;

INT: DIGIT+;
WORD : LETTER+;

fragment DIGIT : [0-9];
fragment LETTER : [A-Za-z];

WS: [ \r\t\n]+ -> skip;

AND: '&';

// test command
COMMENT : '<!--' .*? '-->';
CDATA : '<![CDATA[' .*? ']]>';
OPEN : '<' -> pushMode(INSIDE);
SPECIAL_OPEN : '<?' WORD -> more, pushMode(INSIDE);

mode INSIDE;
CLOSE : '>' -> popMode ;
SPECIAL_CLOSE : '?>' -> popMode ;
SLASH_CLOSE : '/>' -> popMode;
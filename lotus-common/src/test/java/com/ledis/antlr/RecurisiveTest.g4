grammar RecurisiveTest;

Terminator: ';';
Equal: '=';
Multi: '*';
Add: '+';
LeftBrucket: '(';
RightBrucket: ')';
ID: [0-9]+;

expr: expr Multi expr
    | expr Add expr
    | expr LeftBrucket expr RightBrucket
    | ID
    ;

stat: expr Equal expr Terminator
    | expr Terminator
    ;

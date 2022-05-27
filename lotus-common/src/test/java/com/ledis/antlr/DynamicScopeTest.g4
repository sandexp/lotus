grammar DynamicScopeTest;

import ActionsTest;
prog : block;

block
locals[List<String> symbols = new ArrayList<String>()] : '{' decl* stat+ '}' {
    System.out.println("symbols= "+$symbols);
};// action

decl: 'int' ID {
    $block::symbols.add($ID.text);
} ';'
;

stat: ID '=' INT ';' {
    if( !$block::symbols.contains($ID.text) ){
        System.out.println("Undefined value: "+$ID.text);
    }
    }
    | block
    ;

ID: [a-z]+;
INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;
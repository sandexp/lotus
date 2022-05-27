grammar PredicateTest;

WS : [ \r\n\t] -> skip;

ENUM: [a-z]+ {getText().equals("enum")}?
	   {System.out.println("enum!");}
    ;
ID  : [a-z]+ {System.out.println("ID "+getText());} ;

r: ' ';

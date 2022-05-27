// 这个文件主要用于测试规则属性的使用
grammar RuleAttributeTest;

/**
定义一个函数
输入为一个字符串数组
输出为一个哈希表
*/
row[String[] columns]
    returns [Map<String,String> values]
    locals [int col=0]
    @init {
       $values =new HashMap<String,String>();
    }
    @after {
       if ($values!=null && $values.size()>0){
         System.out.println("values = "+ $values);
       }
    }:
;

INT: [0-9]+;

WORD: [a-z]+;

string: WORD
    | WORD '+'
    | WORD '+' INT
    ;



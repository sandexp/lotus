
1. 加入到工作路径
```bash
export CLASSPATH=".:/usr/local/lib/antlr-4.9.1-complete.jar:$CLASSPATH"
```

2. 重命名
```bash
alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.9.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.9.1-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'

```

3. 代码生成
```bash
$ antlr4 Hello.g4
```

4. 编译
```bash
$ javac Hello*.java
```

5. 运行
```bash
$ grun Hello r -tree
```

6. [常见的Antlr4 Action类型](https://github.com/antlr/antlr4/blob/master/doc/actions.md)

7. [谓词的使用](https://github.com/antlr/antlr4/blob/master/doc/predicates.md)

8. maven使用 Antlr 4进行打包
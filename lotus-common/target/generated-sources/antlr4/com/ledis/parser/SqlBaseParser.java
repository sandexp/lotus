// Generated from com/ledis/parser/SqlBase.g4 by ANTLR 4.7.1
package com.ledis.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CATALOG=35, CATALOGS=36, CHANGE=37, CHECK=38, CLEAR=39, 
		CLUSTER=40, CLUSTERED=41, CODEGEN=42, COLLATE=43, COLLECTION=44, COLUMN=45, 
		COLUMNS=46, COMMENT=47, COMMIT=48, COMPACT=49, COMPACTIONS=50, COMPUTE=51, 
		CONCATENATE=52, CONSTRAINT=53, COST=54, CREATE=55, CROSS=56, CUBE=57, 
		CURRENT=58, CURRENT_DATE=59, CURRENT_TIME=60, CURRENT_TIMESTAMP=61, CURRENT_USER=62, 
		DAY=63, DATA=64, DATABASE=65, DATABASES=66, DBPROPERTIES=67, DEFINED=68, 
		DELETE=69, DELIMITED=70, DESC=71, DESCRIBE=72, DFS=73, DIRECTORIES=74, 
		DIRECTORY=75, DISTINCT=76, DISTRIBUTE=77, DIV=78, DROP=79, ELSE=80, END=81, 
		ESCAPE=82, ESCAPED=83, EXCEPT=84, EXCHANGE=85, EXISTS=86, EXPLAIN=87, 
		EXPORT=88, EXTENDED=89, EXTERNAL=90, EXTRACT=91, FALSE=92, FETCH=93, FIELDS=94, 
		FILTER=95, FILEFORMAT=96, FIRST=97, FOLLOWING=98, FOR=99, FOREIGN=100, 
		FORMAT=101, FORMATTED=102, FROM=103, FULL=104, FUNCTION=105, FUNCTIONS=106, 
		GLOBAL=107, GRANT=108, GROUP=109, GROUPING=110, HAVING=111, HOUR=112, 
		IF=113, IGNORE=114, IMPORT=115, IN=116, INDEX=117, INDEXES=118, INNER=119, 
		INPATH=120, INPUTFORMAT=121, INSERT=122, INTERSECT=123, INTERVAL=124, 
		INTO=125, IS=126, ITEMS=127, JOIN=128, KEYS=129, LAST=130, LATERAL=131, 
		LAZY=132, LEADING=133, LEFT=134, LIKE=135, ILIKE=136, LIMIT=137, LINES=138, 
		LIST=139, LOAD=140, LOCAL=141, LOCATION=142, LOCK=143, LOCKS=144, LOGICAL=145, 
		MACRO=146, MAP=147, MATCHED=148, MERGE=149, MINUTE=150, MONTH=151, MSCK=152, 
		NAMESPACE=153, NAMESPACES=154, NATURAL=155, NO=156, NOT=157, NULL=158, 
		NULLS=159, OF=160, ON=161, ONLY=162, OPTION=163, OPTIONS=164, OR=165, 
		ORDER=166, OUT=167, OUTER=168, OUTPUTFORMAT=169, OVER=170, OVERLAPS=171, 
		OVERLAY=172, OVERWRITE=173, PARTITION=174, PARTITIONED=175, PARTITIONS=176, 
		PERCENTLIT=177, PIVOT=178, PLACING=179, POSITION=180, PRECEDING=181, PRIMARY=182, 
		PRINCIPALS=183, PROPERTIES=184, PURGE=185, QUERY=186, RANGE=187, RECORDREADER=188, 
		RECORDWRITER=189, RECOVER=190, REDUCE=191, REFERENCES=192, REFRESH=193, 
		RENAME=194, REPAIR=195, REPLACE=196, RESET=197, RESPECT=198, RESTRICT=199, 
		REVOKE=200, RIGHT=201, RLIKE=202, ROLE=203, ROLES=204, ROLLBACK=205, ROLLUP=206, 
		ROW=207, ROWS=208, SECOND=209, SCHEMA=210, SELECT=211, SEMI=212, SEPARATED=213, 
		SERDE=214, SERDEPROPERTIES=215, SESSION_USER=216, SET=217, SETMINUS=218, 
		SETS=219, SHOW=220, SKEWED=221, SOME=222, SORT=223, SORTED=224, START=225, 
		STATISTICS=226, STORED=227, STRATIFY=228, STRUCT=229, SUBSTR=230, SUBSTRING=231, 
		SYNC=232, TABLE=233, TABLES=234, TABLESAMPLE=235, TBLPROPERTIES=236, TEMPORARY=237, 
		TERMINATED=238, THEN=239, TIME=240, TO=241, TOUCH=242, TRAILING=243, TRANSACTION=244, 
		TRANSACTIONS=245, TRANSFORM=246, TRIM=247, TRUE=248, TRUNCATE=249, TRY_CAST=250, 
		TYPE=251, UNARCHIVE=252, UNBOUNDED=253, UNCACHE=254, UNION=255, UNIQUE=256, 
		UNKNOWN=257, UNLOCK=258, UNSET=259, UPDATE=260, USE=261, USER=262, USING=263, 
		VALUES=264, VIEW=265, VIEWS=266, WHEN=267, WHERE=268, WINDOW=269, WITH=270, 
		YEAR=271, ZONE=272, ENGINE=273, EQ=274, NSEQ=275, NEQ=276, NEQJ=277, LT=278, 
		LTE=279, GT=280, GTE=281, PLUS=282, MINUS=283, ASTERISK=284, SLASH=285, 
		PERCENT=286, TILDE=287, AMPERSAND=288, PIPE=289, CONCAT_PIPE=290, HAT=291, 
		STRING=292, BIGINT_LITERAL=293, SMALLINT_LITERAL=294, TINYINT_LITERAL=295, 
		INTEGER_VALUE=296, EXPONENT_VALUE=297, DECIMAL_VALUE=298, FLOAT_LITERAL=299, 
		DOUBLE_LITERAL=300, BIGDECIMAL_LITERAL=301, IDENTIFIER=302, BACKQUOTED_IDENTIFIER=303, 
		SIMPLE_COMMENT=304, BRACKETED_COMMENT=305, WS=306, UNRECOGNIZED=307;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_configKey = 8, RULE_configValue = 9, RULE_unsupportedHiveNativeCommands = 10, 
		RULE_createTableHeader = 11, RULE_replaceTableHeader = 12, RULE_bucketSpec = 13, 
		RULE_skewSpec = 14, RULE_locationSpec = 15, RULE_commentSpec = 16, RULE_query = 17, 
		RULE_insertInto = 18, RULE_partitionSpecLocation = 19, RULE_partitionSpec = 20, 
		RULE_partitionVal = 21, RULE_namespace = 22, RULE_describeFuncName = 23, 
		RULE_describeColName = 24, RULE_ctes = 25, RULE_namedQuery = 26, RULE_tableProvider = 27, 
		RULE_createTableClauses = 28, RULE_tablePropertyList = 29, RULE_tableProperty = 30, 
		RULE_tablePropertyKey = 31, RULE_tablePropertyValue = 32, RULE_constantList = 33, 
		RULE_nestedConstantList = 34, RULE_createFileFormat = 35, RULE_fileFormat = 36, 
		RULE_storageHandler = 37, RULE_resource = 38, RULE_dmlStatementNoWith = 39, 
		RULE_queryOrganization = 40, RULE_multiInsertQueryBody = 41, RULE_queryTerm = 42, 
		RULE_queryPrimary = 43, RULE_sortItem = 44, RULE_fromStatement = 45, RULE_fromStatementBody = 46, 
		RULE_querySpecification = 47, RULE_transformClause = 48, RULE_selectClause = 49, 
		RULE_setClause = 50, RULE_matchedClause = 51, RULE_notMatchedClause = 52, 
		RULE_matchedAction = 53, RULE_notMatchedAction = 54, RULE_assignmentList = 55, 
		RULE_assignment = 56, RULE_whereClause = 57, RULE_havingClause = 58, RULE_hint = 59, 
		RULE_hintStatement = 60, RULE_fromClause = 61, RULE_aggregationClause = 62, 
		RULE_groupByClause = 63, RULE_groupingAnalytics = 64, RULE_groupingElement = 65, 
		RULE_groupingSet = 66, RULE_pivotClause = 67, RULE_pivotColumn = 68, RULE_pivotValue = 69, 
		RULE_lateralView = 70, RULE_setQuantifier = 71, RULE_relation = 72, RULE_joinRelation = 73, 
		RULE_joinType = 74, RULE_joinCriteria = 75, RULE_sample = 76, RULE_sampleMethod = 77, 
		RULE_identifierList = 78, RULE_identifierSeq = 79, RULE_orderedIdentifierList = 80, 
		RULE_orderedIdentifier = 81, RULE_identifierCommentList = 82, RULE_identifierComment = 83, 
		RULE_relationPrimary = 84, RULE_inlineTable = 85, RULE_functionTable = 86, 
		RULE_tableAlias = 87, RULE_rowFormat = 88, RULE_multipartIdentifierList = 89, 
		RULE_multipartIdentifier = 90, RULE_tableIdentifier = 91, RULE_functionIdentifier = 92, 
		RULE_namedExpression = 93, RULE_namedExpressionSeq = 94, RULE_partitionFieldList = 95, 
		RULE_partitionField = 96, RULE_transform = 97, RULE_transformArgument = 98, 
		RULE_expression = 99, RULE_expressionSeq = 100, RULE_booleanExpression = 101, 
		RULE_predicate = 102, RULE_valueExpression = 103, RULE_primaryExpression = 104, 
		RULE_constant = 105, RULE_comparisonOperator = 106, RULE_arithmeticOperator = 107, 
		RULE_predicateOperator = 108, RULE_booleanValue = 109, RULE_interval = 110, 
		RULE_errorCapturingMultiUnitsInterval = 111, RULE_multiUnitsInterval = 112, 
		RULE_errorCapturingUnitToUnitInterval = 113, RULE_unitToUnitInterval = 114, 
		RULE_intervalValue = 115, RULE_colPosition = 116, RULE_dataType = 117, 
		RULE_qualifiedColTypeWithPositionList = 118, RULE_qualifiedColTypeWithPosition = 119, 
		RULE_colTypeList = 120, RULE_colType = 121, RULE_complexColTypeList = 122, 
		RULE_complexColType = 123, RULE_whenClause = 124, RULE_windowClause = 125, 
		RULE_namedWindow = 126, RULE_windowSpec = 127, RULE_windowFrame = 128, 
		RULE_frameBound = 129, RULE_qualifiedNameList = 130, RULE_functionName = 131, 
		RULE_qualifiedName = 132, RULE_errorCapturingIdentifier = 133, RULE_errorCapturingIdentifierExtra = 134, 
		RULE_identifier = 135, RULE_strictIdentifier = 136, RULE_quotedIdentifier = 137, 
		RULE_number = 138, RULE_alterColumnAction = 139, RULE_ansiNonReserved = 140, 
		RULE_strictNonReserved = 141, RULE_nonReserved = 142;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
		"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
		"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
		"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
		"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
		"namespace", "describeFuncName", "describeColName", "ctes", "namedQuery", 
		"tableProvider", "createTableClauses", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
		"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
		"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
		"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
		"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
		"matchedAction", "notMatchedAction", "assignmentList", "assignment", "whereClause", 
		"havingClause", "hint", "hintStatement", "fromClause", "aggregationClause", 
		"groupByClause", "groupingAnalytics", "groupingElement", "groupingSet", 
		"pivotClause", "pivotColumn", "pivotValue", "lateralView", "setQuantifier", 
		"relation", "joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
		"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
		"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
		"functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
		"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
		"namedExpressionSeq", "partitionFieldList", "partitionField", "transform", 
		"transformArgument", "expression", "expressionSeq", "booleanExpression", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
		"unitToUnitInterval", "intervalValue", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
		"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
		"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
		"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
		"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
		"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
		"ansiNonReserved", "strictNonReserved", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
		"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
		"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
		"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
		"'CASE'", "'CAST'", "'CATALOG'", "'CATALOGS'", "'CHANGE'", "'CHECK'", 
		"'CLEAR'", "'CLUSTER'", "'CLUSTERED'", "'CODEGEN'", "'COLLATE'", "'COLLECTION'", 
		"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", "'COMPACTIONS'", 
		"'COMPUTE'", "'CONCATENATE'", "'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", 
		"'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
		"'CURRENT_USER'", "'DAY'", "'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", 
		"'DEFINED'", "'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", 
		"'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", 
		"'DROP'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", 
		"'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", 
		"'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", 
		"'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", 
		"'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", 
		"'GROUPING'", "'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", 
		"'INDEX'", "'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", 
		"'INTERSECT'", "'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", 
		"'LAST'", "'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'ILIKE'", 
		"'LIMIT'", "'LINES'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", 
		"'LOCKS'", "'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MINUTE'", 
		"'MONTH'", "'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", 
		null, "'NULL'", "'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", 
		"'OR'", "'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", 
		"'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", 
		"'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", 
		"'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", 
		"'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", 
		"'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", 
		"'REVOKE'", "'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", 
		"'ROW'", "'ROWS'", "'SECOND'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", 
		"'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", 
		"'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", 
		"'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", 
		"'SYNC'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, 
		"'TERMINATED'", "'THEN'", "'TIME'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
		"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TRY_CAST'", 
		"'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", 
		"'UNKNOWN'", "'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", 
		"'VALUES'", "'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", 
		"'YEAR'", "'ZONE'", "'ENGINE'", null, "'<=>'", "'<>'", "'!='", "'<'", 
		null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", 
		"'||'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
		"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
		"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CATALOG", "CATALOGS", 
		"CHANGE", "CHECK", "CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", 
		"COLLECTION", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", 
		"COMPUTE", "CONCATENATE", "CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", 
		"CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
		"DAY", "DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
		"DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", "DISTINCT", 
		"DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", 
		"EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", 
		"FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", 
		"FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", 
		"GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", "IF", "IGNORE", 
		"IMPORT", "IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", 
		"INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", 
		"LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "ILIKE", "LIMIT", 
		"LINES", "LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", 
		"MACRO", "MAP", "MATCHED", "MERGE", "MINUTE", "MONTH", "MSCK", "NAMESPACE", 
		"NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", 
		"OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", 
		"OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", 
		"PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", 
		"PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
		"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
		"REPAIR", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", 
		"RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SECOND", 
		"SCHEMA", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", "SESSION_USER", 
		"SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", "SORT", "SORTED", 
		"START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", 
		"SYNC", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", 
		"TERMINATED", "THEN", "TIME", "TO", "TOUCH", "TRAILING", "TRANSACTION", 
		"TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TRY_CAST", "TYPE", 
		"UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", 
		"UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", "VIEW", "VIEWS", 
		"WHEN", "WHERE", "WINDOW", "WITH", "YEAR", "ZONE", "ENGINE", "EQ", "NSEQ", 
		"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
		"SLASH", "PERCENT", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", 
		"STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
		"EXPONENT_VALUE", "DECIMAL_VALUE", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			statement();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(287);
				match(T__0);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			namedExpression();
			setState(296);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			tableIdentifier();
			setState(299);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			multipartIdentifier();
			setState(302);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			functionIdentifier();
			setState(305);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			dataType();
			setState(308);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			colTypeList();
			setState(311);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCatalogContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public SetCatalogContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetCatalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetCatalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetCatalog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyzeTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyzeTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyzeTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeZoneContext extends StatementContext {
		public Token timezone;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableExtendedContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTableExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTableExtended(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTableExtended(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseNamespaceContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUseNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUseNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUseNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(314);
					ctes();
					}
				}

				setState(317);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(USE);
				setState(319);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new UseNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(USE);
				setState(321);
				match(NAMESPACE);
				setState(322);
				multipartIdentifier();
				}
				break;
			case 5:
				_localctx = new SetCatalogContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(SET);
				setState(324);
				match(CATALOG);
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(325);
					identifier();
					}
					break;
				case 2:
					{
					setState(326);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(329);
				match(CREATE);
				setState(330);
				namespace();
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(331);
					match(IF);
					setState(332);
					match(NOT);
					setState(333);
					match(EXISTS);
					}
					break;
				}
				setState(336);
				multipartIdentifier();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(342);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(337);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(338);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(339);
						match(WITH);
						setState(340);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(ALTER);
				setState(348);
				namespace();
				setState(349);
				multipartIdentifier();
				setState(350);
				match(SET);
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(352);
				tablePropertyList();
				}
				break;
			case 8:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				match(ALTER);
				setState(355);
				namespace();
				setState(356);
				multipartIdentifier();
				setState(357);
				match(SET);
				setState(358);
				locationSpec();
				}
				break;
			case 9:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(360);
				match(DROP);
				setState(361);
				namespace();
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(362);
					match(IF);
					setState(363);
					match(EXISTS);
					}
					break;
				}
				setState(366);
				multipartIdentifier();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(367);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 10:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(370);
				match(SHOW);
				setState(371);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(372);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(373);
					multipartIdentifier();
					}
				}

				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(376);
						match(LIKE);
						}
					}

					setState(379);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(382);
				createTableHeader();
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(383);
					match(T__1);
					setState(384);
					colTypeList();
					setState(385);
					match(T__2);
					}
					break;
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(389);
					tableProvider();
					}
				}

				setState(392);
				createTableClauses();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (REDUCE - 191)) | (1L << (SELECT - 191)) | (1L << (TABLE - 191)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(393);
						match(AS);
						}
					}

					setState(396);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(399);
				match(CREATE);
				setState(400);
				match(TABLE);
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(401);
					match(IF);
					setState(402);
					match(NOT);
					setState(403);
					match(EXISTS);
					}
					break;
				}
				setState(406);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(407);
				match(LIKE);
				setState(408);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (ROW - 207)) | (1L << (STORED - 207)) | (1L << (TBLPROPERTIES - 207)) | (1L << (USING - 207)))) != 0)) {
					{
					setState(415);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(409);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(410);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(411);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(412);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(413);
						match(TBLPROPERTIES);
						setState(414);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(420);
				replaceTableHeader();
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(421);
					match(T__1);
					setState(422);
					colTypeList();
					setState(423);
					match(T__2);
					}
					break;
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(427);
					tableProvider();
					}
				}

				setState(430);
				createTableClauses();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (REDUCE - 191)) | (1L << (SELECT - 191)) | (1L << (TABLE - 191)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(431);
						match(AS);
						}
					}

					setState(434);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(437);
				match(ANALYZE);
				setState(438);
				match(TABLE);
				setState(439);
				multipartIdentifier();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(440);
					partitionSpec();
					}
				}

				setState(443);
				match(COMPUTE);
				setState(444);
				match(STATISTICS);
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(445);
					identifier();
					}
					break;
				case 2:
					{
					setState(446);
					match(FOR);
					setState(447);
					match(COLUMNS);
					setState(448);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(449);
					match(FOR);
					setState(450);
					match(ALL);
					setState(451);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(454);
				match(ANALYZE);
				setState(455);
				match(TABLES);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(456);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(457);
					multipartIdentifier();
					}
				}

				setState(460);
				match(COMPUTE);
				setState(461);
				match(STATISTICS);
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(462);
					identifier();
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(465);
				match(ALTER);
				setState(466);
				match(TABLE);
				setState(467);
				multipartIdentifier();
				setState(468);
				match(ADD);
				setState(469);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(470);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 17:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(472);
				match(ALTER);
				setState(473);
				match(TABLE);
				setState(474);
				multipartIdentifier();
				setState(475);
				match(ADD);
				setState(476);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(477);
				match(T__1);
				setState(478);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(479);
				match(T__2);
				}
				break;
			case 18:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(481);
				match(ALTER);
				setState(482);
				match(TABLE);
				setState(483);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(484);
				match(RENAME);
				setState(485);
				match(COLUMN);
				setState(486);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(487);
				match(TO);
				setState(488);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(490);
				match(ALTER);
				setState(491);
				match(TABLE);
				setState(492);
				multipartIdentifier();
				setState(493);
				match(DROP);
				setState(494);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(495);
				match(T__1);
				setState(496);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(497);
				match(T__2);
				}
				break;
			case 20:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(499);
				match(ALTER);
				setState(500);
				match(TABLE);
				setState(501);
				multipartIdentifier();
				setState(502);
				match(DROP);
				setState(503);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(504);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 21:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(506);
				match(ALTER);
				setState(507);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(509);
				match(RENAME);
				setState(510);
				match(TO);
				setState(511);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 22:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(513);
				match(ALTER);
				setState(514);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(515);
				multipartIdentifier();
				setState(516);
				match(SET);
				setState(517);
				match(TBLPROPERTIES);
				setState(518);
				tablePropertyList();
				}
				break;
			case 23:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(520);
				match(ALTER);
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				multipartIdentifier();
				setState(523);
				match(UNSET);
				setState(524);
				match(TBLPROPERTIES);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(525);
					match(IF);
					setState(526);
					match(EXISTS);
					}
				}

				setState(529);
				tablePropertyList();
				}
				break;
			case 24:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(531);
				match(ALTER);
				setState(532);
				match(TABLE);
				setState(533);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(535);
					match(COLUMN);
					}
					break;
				}
				setState(538);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(539);
					alterColumnAction();
					}
				}

				}
				break;
			case 25:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(542);
				match(ALTER);
				setState(543);
				match(TABLE);
				setState(544);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(545);
					partitionSpec();
					}
				}

				setState(548);
				match(CHANGE);
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(549);
					match(COLUMN);
					}
					break;
				}
				setState(552);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(553);
				colType();
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(554);
					colPosition();
					}
				}

				}
				break;
			case 26:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(557);
				match(ALTER);
				setState(558);
				match(TABLE);
				setState(559);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(560);
					partitionSpec();
					}
				}

				setState(563);
				match(REPLACE);
				setState(564);
				match(COLUMNS);
				setState(565);
				match(T__1);
				setState(566);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(567);
				match(T__2);
				}
				break;
			case 27:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(569);
				match(ALTER);
				setState(570);
				match(TABLE);
				setState(571);
				multipartIdentifier();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(572);
					partitionSpec();
					}
				}

				setState(575);
				match(SET);
				setState(576);
				match(SERDE);
				setState(577);
				match(STRING);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(578);
					match(WITH);
					setState(579);
					match(SERDEPROPERTIES);
					setState(580);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(583);
				match(ALTER);
				setState(584);
				match(TABLE);
				setState(585);
				multipartIdentifier();
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(586);
					partitionSpec();
					}
				}

				setState(589);
				match(SET);
				setState(590);
				match(SERDEPROPERTIES);
				setState(591);
				tablePropertyList();
				}
				break;
			case 29:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(593);
				match(ALTER);
				setState(594);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(595);
				multipartIdentifier();
				setState(596);
				match(ADD);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(597);
					match(IF);
					setState(598);
					match(NOT);
					setState(599);
					match(EXISTS);
					}
				}

				setState(603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(602);
					partitionSpecLocation();
					}
					}
					setState(605); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 30:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(607);
				match(ALTER);
				setState(608);
				match(TABLE);
				setState(609);
				multipartIdentifier();
				setState(610);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(611);
				match(RENAME);
				setState(612);
				match(TO);
				setState(613);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 31:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(615);
				match(ALTER);
				setState(616);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(617);
				multipartIdentifier();
				setState(618);
				match(DROP);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(619);
					match(IF);
					setState(620);
					match(EXISTS);
					}
				}

				setState(623);
				partitionSpec();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(624);
					match(T__3);
					setState(625);
					partitionSpec();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(631);
					match(PURGE);
					}
				}

				}
				break;
			case 32:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(634);
				match(ALTER);
				setState(635);
				match(TABLE);
				setState(636);
				multipartIdentifier();
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(637);
					partitionSpec();
					}
				}

				setState(640);
				match(SET);
				setState(641);
				locationSpec();
				}
				break;
			case 33:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(643);
				match(ALTER);
				setState(644);
				match(TABLE);
				setState(645);
				multipartIdentifier();
				setState(646);
				match(RECOVER);
				setState(647);
				match(PARTITIONS);
				}
				break;
			case 34:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(649);
				match(DROP);
				setState(650);
				match(TABLE);
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(651);
					match(IF);
					setState(652);
					match(EXISTS);
					}
					break;
				}
				setState(655);
				multipartIdentifier();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(656);
					match(PURGE);
					}
				}

				}
				break;
			case 35:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(659);
				match(DROP);
				setState(660);
				match(VIEW);
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(661);
					match(IF);
					setState(662);
					match(EXISTS);
					}
					break;
				}
				setState(665);
				multipartIdentifier();
				}
				break;
			case 36:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(666);
				match(CREATE);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(667);
					match(OR);
					setState(668);
					match(REPLACE);
					}
				}

				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(671);
						match(GLOBAL);
						}
					}

					setState(674);
					match(TEMPORARY);
					}
				}

				setState(677);
				match(VIEW);
				setState(681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(678);
					match(IF);
					setState(679);
					match(NOT);
					setState(680);
					match(EXISTS);
					}
					break;
				}
				setState(683);
				multipartIdentifier();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(684);
					identifierCommentList();
					}
				}

				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(693);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(687);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(688);
						match(PARTITIONED);
						setState(689);
						match(ON);
						setState(690);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(691);
						match(TBLPROPERTIES);
						setState(692);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				match(AS);
				setState(699);
				query();
				}
				break;
			case 37:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(701);
				match(CREATE);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(702);
					match(OR);
					setState(703);
					match(REPLACE);
					}
				}

				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(706);
					match(GLOBAL);
					}
				}

				setState(709);
				match(TEMPORARY);
				setState(710);
				match(VIEW);
				setState(711);
				tableIdentifier();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(712);
					match(T__1);
					setState(713);
					colTypeList();
					setState(714);
					match(T__2);
					}
				}

				setState(718);
				tableProvider();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(719);
					match(OPTIONS);
					setState(720);
					tablePropertyList();
					}
				}

				}
				break;
			case 38:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(723);
				match(ALTER);
				setState(724);
				match(VIEW);
				setState(725);
				multipartIdentifier();
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(726);
					match(AS);
					}
				}

				setState(729);
				query();
				}
				break;
			case 39:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(731);
				match(CREATE);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(732);
					match(OR);
					setState(733);
					match(REPLACE);
					}
				}

				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(736);
					match(TEMPORARY);
					}
				}

				setState(739);
				match(FUNCTION);
				setState(743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(740);
					match(IF);
					setState(741);
					match(NOT);
					setState(742);
					match(EXISTS);
					}
					break;
				}
				setState(745);
				multipartIdentifier();
				setState(746);
				match(AS);
				setState(747);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(748);
					match(USING);
					setState(749);
					resource();
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(750);
						match(T__3);
						setState(751);
						resource();
						}
						}
						setState(756);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 40:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(759);
				match(DROP);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(760);
					match(TEMPORARY);
					}
				}

				setState(763);
				match(FUNCTION);
				setState(766);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(764);
					match(IF);
					setState(765);
					match(EXISTS);
					}
					break;
				}
				setState(768);
				multipartIdentifier();
				}
				break;
			case 41:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(769);
				match(EXPLAIN);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (EXTENDED - 89)) | (1L << (FORMATTED - 89)) | (1L << (LOGICAL - 89)))) != 0)) {
					{
					setState(770);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (EXTENDED - 89)) | (1L << (FORMATTED - 89)) | (1L << (LOGICAL - 89)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(773);
				statement();
				}
				break;
			case 42:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(774);
				match(SHOW);
				setState(775);
				match(TABLES);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(776);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(777);
					multipartIdentifier();
					}
				}

				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(780);
						match(LIKE);
						}
					}

					setState(783);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(786);
				match(SHOW);
				setState(787);
				match(TABLE);
				setState(788);
				match(EXTENDED);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(789);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(790);
					((ShowTableExtendedContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(793);
				match(LIKE);
				setState(794);
				((ShowTableExtendedContext)_localctx).pattern = match(STRING);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(795);
					partitionSpec();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(798);
				match(SHOW);
				setState(799);
				match(TBLPROPERTIES);
				setState(800);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(801);
					match(T__1);
					setState(802);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(803);
					match(T__2);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(807);
				match(SHOW);
				setState(808);
				match(COLUMNS);
				setState(809);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(810);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(811);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(812);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(815);
				match(SHOW);
				setState(816);
				match(VIEWS);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(817);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(818);
					multipartIdentifier();
					}
				}

				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(821);
						match(LIKE);
						}
					}

					setState(824);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(827);
				match(SHOW);
				setState(828);
				match(PARTITIONS);
				setState(829);
				multipartIdentifier();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(830);
					partitionSpec();
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(833);
				match(SHOW);
				setState(835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(834);
					identifier();
					}
					break;
				}
				setState(837);
				match(FUNCTIONS);
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(839);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(838);
						match(LIKE);
						}
						break;
					}
					setState(843);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(841);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(842);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 49:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(847);
				match(SHOW);
				setState(848);
				match(CREATE);
				setState(849);
				match(TABLE);
				setState(850);
				multipartIdentifier();
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(851);
					match(AS);
					setState(852);
					match(SERDE);
					}
				}

				}
				break;
			case 50:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(855);
				match(SHOW);
				setState(856);
				match(CURRENT);
				setState(857);
				match(NAMESPACE);
				}
				break;
			case 51:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(858);
				match(SHOW);
				setState(859);
				match(CATALOGS);
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(860);
						match(LIKE);
						}
					}

					setState(863);
					((ShowCatalogsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 52:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(866);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(867);
				match(FUNCTION);
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(868);
					match(EXTENDED);
					}
					break;
				}
				setState(871);
				describeFuncName();
				}
				break;
			case 53:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(872);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(873);
				namespace();
				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(874);
					match(EXTENDED);
					}
					break;
				}
				setState(877);
				multipartIdentifier();
				}
				break;
			case 54:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(880);
					match(TABLE);
					}
					break;
				}
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(883);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(886);
				multipartIdentifier();
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(887);
					partitionSpec();
					}
					break;
				}
				setState(891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(890);
					describeColName();
					}
					break;
				}
				}
				break;
			case 55:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(894);
					match(QUERY);
					}
				}

				setState(897);
				query();
				}
				break;
			case 56:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(898);
				match(COMMENT);
				setState(899);
				match(ON);
				setState(900);
				namespace();
				setState(901);
				multipartIdentifier();
				setState(902);
				match(IS);
				setState(903);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 57:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(905);
				match(COMMENT);
				setState(906);
				match(ON);
				setState(907);
				match(TABLE);
				setState(908);
				multipartIdentifier();
				setState(909);
				match(IS);
				setState(910);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 58:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(912);
				match(REFRESH);
				setState(913);
				match(TABLE);
				setState(914);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(915);
				match(REFRESH);
				setState(916);
				match(FUNCTION);
				setState(917);
				multipartIdentifier();
				}
				break;
			case 60:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(918);
				match(REFRESH);
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(919);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(923);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(920);
							matchWildcard();
							}
							} 
						}
						setState(925);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 61:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(928);
				match(CACHE);
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(929);
					match(LAZY);
					}
				}

				setState(932);
				match(TABLE);
				setState(933);
				multipartIdentifier();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(934);
					match(OPTIONS);
					setState(935);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (REDUCE - 191)) | (1L << (SELECT - 191)) | (1L << (TABLE - 191)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(938);
						match(AS);
						}
					}

					setState(941);
					query();
					}
				}

				}
				break;
			case 62:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(944);
				match(UNCACHE);
				setState(945);
				match(TABLE);
				setState(948);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(946);
					match(IF);
					setState(947);
					match(EXISTS);
					}
					break;
				}
				setState(950);
				multipartIdentifier();
				}
				break;
			case 63:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(951);
				match(CLEAR);
				setState(952);
				match(CACHE);
				}
				break;
			case 64:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(953);
				match(LOAD);
				setState(954);
				match(DATA);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(955);
					match(LOCAL);
					}
				}

				setState(958);
				match(INPATH);
				setState(959);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(960);
					match(OVERWRITE);
					}
				}

				setState(963);
				match(INTO);
				setState(964);
				match(TABLE);
				setState(965);
				multipartIdentifier();
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(966);
					partitionSpec();
					}
				}

				}
				break;
			case 65:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(969);
				match(TRUNCATE);
				setState(970);
				match(TABLE);
				setState(971);
				multipartIdentifier();
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(972);
					partitionSpec();
					}
				}

				}
				break;
			case 66:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(975);
				match(MSCK);
				setState(976);
				match(REPAIR);
				setState(977);
				match(TABLE);
				setState(978);
				multipartIdentifier();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(979);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(980);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 67:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(983);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(984);
				identifier();
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(985);
						matchWildcard();
						}
						} 
					}
					setState(990);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(991);
				match(SET);
				setState(992);
				match(ROLE);
				setState(996);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(993);
						matchWildcard();
						}
						} 
					}
					setState(998);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 69:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(999);
				match(SET);
				setState(1000);
				match(TIME);
				setState(1001);
				match(ZONE);
				setState(1002);
				interval();
				}
				break;
			case 70:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1003);
				match(SET);
				setState(1004);
				match(TIME);
				setState(1005);
				match(ZONE);
				setState(1006);
				((SetTimeZoneContext)_localctx).timezone = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==STRING) ) {
					((SetTimeZoneContext)_localctx).timezone = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 71:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1007);
				match(SET);
				setState(1008);
				match(TIME);
				setState(1009);
				match(ZONE);
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1010);
						matchWildcard();
						}
						} 
					}
					setState(1015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 72:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1016);
				match(SET);
				setState(1017);
				configKey();
				setState(1018);
				match(EQ);
				setState(1019);
				configValue();
				}
				break;
			case 73:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1021);
				match(SET);
				setState(1022);
				configKey();
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1023);
					match(EQ);
					setState(1027);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1024);
							matchWildcard();
							}
							} 
						}
						setState(1029);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					}
					}
				}

				}
				break;
			case 74:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1032);
				match(SET);
				setState(1036);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1033);
						matchWildcard();
						}
						} 
					}
					setState(1038);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				setState(1039);
				match(EQ);
				setState(1040);
				configValue();
				}
				break;
			case 75:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1041);
				match(SET);
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1042);
						matchWildcard();
						}
						} 
					}
					setState(1047);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 76:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1048);
				match(RESET);
				setState(1049);
				configKey();
				}
				break;
			case 77:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1050);
				match(RESET);
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1051);
						matchWildcard();
						}
						} 
					}
					setState(1056);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 78:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1057);
				unsupportedHiveNativeCommands();
				setState(1061);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1058);
						matchWildcard();
						}
						} 
					}
					setState(1063);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1073);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1076);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1075);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1078);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1080);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1079);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1082);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1086);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1090);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1091);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1098);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1099);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1101);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1102);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1108);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1109);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1110);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1114);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1117);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1121);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1123);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1124);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1127);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1133);
				tableIdentifier();
				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1137);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1139);
				tableIdentifier();
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1145);
				tableIdentifier();
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1151);
				tableIdentifier();
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1157);
				tableIdentifier();
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1163);
				tableIdentifier();
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1171);
				tableIdentifier();
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1178);
				tableIdentifier();
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1184);
				tableIdentifier();
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1190);
				tableIdentifier();
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1194);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1195);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1196);
				tableIdentifier();
				setState(1197);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1199);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1201);
				tableIdentifier();
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1202);
					partitionSpec();
					}
				}

				setState(1205);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1208);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1209);
				tableIdentifier();
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1210);
					partitionSpec();
					}
				}

				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1217);
				tableIdentifier();
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1218);
					partitionSpec();
					}
				}

				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1226);
				tableIdentifier();
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1227);
					partitionSpec();
					}
				}

				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1233);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1234);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1236);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1237);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(CREATE);
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1241);
				match(TEMPORARY);
				}
			}

			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1244);
				match(EXTERNAL);
				}
			}

			setState(1247);
			match(TABLE);
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1248);
				match(IF);
				setState(1249);
				match(NOT);
				setState(1250);
				match(EXISTS);
				}
				break;
			}
			setState(1253);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1255);
				match(CREATE);
				setState(1256);
				match(OR);
				}
			}

			setState(1259);
			match(REPLACE);
			setState(1260);
			match(TABLE);
			setState(1261);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(CLUSTERED);
			setState(1264);
			match(BY);
			setState(1265);
			identifierList();
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1266);
				match(SORTED);
				setState(1267);
				match(BY);
				setState(1268);
				orderedIdentifierList();
				}
			}

			setState(1271);
			match(INTO);
			setState(1272);
			match(INTEGER_VALUE);
			setState(1273);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(SKEWED);
			setState(1276);
			match(BY);
			setState(1277);
			identifierList();
			setState(1278);
			match(ON);
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1279);
				constantList();
				}
				break;
			case 2:
				{
				setState(1280);
				nestedConstantList();
				}
				break;
			}
			setState(1286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1283);
				match(STORED);
				setState(1284);
				match(AS);
				setState(1285);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(LOCATION);
			setState(1289);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			match(COMMENT);
			setState(1292);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1294);
				ctes();
				}
			}

			setState(1297);
			queryTerm(0);
			setState(1298);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insertInto);
		int _la;
		try {
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1300);
				match(INSERT);
				setState(1301);
				match(OVERWRITE);
				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1302);
					match(TABLE);
					}
					break;
				}
				setState(1305);
				multipartIdentifier();
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1306);
					partitionSpec();
					setState(1310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1307);
						match(IF);
						setState(1308);
						match(NOT);
						setState(1309);
						match(EXISTS);
						}
					}

					}
				}

				setState(1315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1314);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(INSERT);
				setState(1318);
				match(INTO);
				setState(1320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1319);
					match(TABLE);
					}
					break;
				}
				setState(1322);
				multipartIdentifier();
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1323);
					partitionSpec();
					}
				}

				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1326);
					match(IF);
					setState(1327);
					match(NOT);
					setState(1328);
					match(EXISTS);
					}
				}

				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1331);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1334);
				match(INSERT);
				setState(1335);
				match(OVERWRITE);
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1336);
					match(LOCAL);
					}
				}

				setState(1339);
				match(DIRECTORY);
				setState(1340);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1341);
					rowFormat();
					}
				}

				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1344);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1347);
				match(INSERT);
				setState(1348);
				match(OVERWRITE);
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1349);
					match(LOCAL);
					}
				}

				setState(1352);
				match(DIRECTORY);
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1353);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1356);
				tableProvider();
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1357);
					match(OPTIONS);
					setState(1358);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			partitionSpec();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1364);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(PARTITION);
			setState(1368);
			match(T__1);
			setState(1369);
			partitionVal();
			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1370);
				match(T__3);
				setState(1371);
				partitionVal();
				}
				}
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1377);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			identifier();
			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1380);
				match(EQ);
				setState(1381);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_describeFuncName);
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1386);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1387);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1388);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1389);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1390);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1394);
				match(T__4);
				setState(1395);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(WITH);
			setState(1402);
			namedQuery();
			setState(1407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1403);
				match(T__3);
				setState(1404);
				namedQuery();
				}
				}
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1411);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1414);
				match(AS);
				}
			}

			setState(1417);
			match(T__1);
			setState(1418);
			query();
			setState(1419);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(USING);
			setState(1422);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public PartitionFieldListContext partitioning;
		public TablePropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LOCATION - 142)) | (1L << (OPTIONS - 142)) | (1L << (PARTITIONED - 142)))) != 0) || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (ROW - 207)) | (1L << (SKEWED - 207)) | (1L << (STORED - 207)) | (1L << (TBLPROPERTIES - 207)))) != 0)) {
				{
				setState(1437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1424);
					match(OPTIONS);
					setState(1425);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1426);
					match(PARTITIONED);
					setState(1427);
					match(BY);
					setState(1428);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1429);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1430);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1431);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1432);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1433);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1434);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1435);
					match(TBLPROPERTIES);
					setState(1436);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(T__1);
			setState(1443);
			tableProperty();
			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1444);
				match(T__3);
				setState(1445);
				tableProperty();
				}
				}
				setState(1450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1451);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 248)) & ~0x3f) == 0 && ((1L << (_la - 248)) & ((1L << (TRUE - 248)) | (1L << (EQ - 248)) | (1L << (STRING - 248)) | (1L << (INTEGER_VALUE - 248)) | (1L << (DECIMAL_VALUE - 248)))) != 0)) {
				{
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1454);
					match(EQ);
					}
				}

				setState(1457);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				identifier();
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1461);
					match(T__4);
					setState(1462);
					identifier();
					}
					}
					setState(1467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tablePropertyValue);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1472);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1473);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1474);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(T__1);
			setState(1478);
			constant();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1479);
				match(T__3);
				setState(1480);
				constant();
				}
				}
				setState(1485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1486);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(T__1);
			setState(1489);
			constantList();
			setState(1494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1490);
				match(T__3);
				setState(1491);
				constantList();
				}
				}
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1497);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createFileFormat);
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1499);
				match(STORED);
				setState(1500);
				match(AS);
				setState(1501);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1502);
				match(STORED);
				setState(1503);
				match(BY);
				setState(1504);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fileFormat);
		try {
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				match(INPUTFORMAT);
				setState(1508);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1509);
				match(OUTPUTFORMAT);
				setState(1510);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(STRING);
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1515);
				match(WITH);
				setState(1516);
				match(SERDEPROPERTIES);
				setState(1517);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			identifier();
			setState(1521);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				insertInto();
				setState(1524);
				query();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				fromClause();
				setState(1528); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1527);
					multiInsertQueryBody();
					}
					}
					setState(1530); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				match(DELETE);
				setState(1533);
				match(FROM);
				setState(1534);
				multipartIdentifier();
				setState(1535);
				tableAlias();
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1536);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1539);
				match(UPDATE);
				setState(1540);
				multipartIdentifier();
				setState(1541);
				tableAlias();
				setState(1542);
				setClause();
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1543);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1546);
				match(MERGE);
				setState(1547);
				match(INTO);
				setState(1548);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1549);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1550);
				match(USING);
				setState(1556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1551);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1552);
					match(T__1);
					setState(1553);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1554);
					match(T__2);
					}
					break;
				}
				setState(1558);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1559);
				match(ON);
				setState(1560);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1561);
						matchedClause();
						}
						} 
					}
					setState(1566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
				}
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1567);
					notMatchedClause();
					}
					}
					setState(1572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1575);
				match(ORDER);
				setState(1576);
				match(BY);
				setState(1577);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1578);
						match(T__3);
						setState(1579);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1584);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
				}
				}
				break;
			}
			setState(1597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1587);
				match(CLUSTER);
				setState(1588);
				match(BY);
				setState(1589);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1594);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1590);
						match(T__3);
						setState(1591);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1596);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				}
				break;
			}
			setState(1609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1599);
				match(DISTRIBUTE);
				setState(1600);
				match(BY);
				setState(1601);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1602);
						match(T__3);
						setState(1603);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				}
				break;
			}
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				setState(1611);
				match(SORT);
				setState(1612);
				match(BY);
				setState(1613);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1614);
						match(T__3);
						setState(1615);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				}
				break;
			}
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1623);
				windowClause();
				}
				break;
			}
			setState(1631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1626);
				match(LIMIT);
				setState(1629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1627);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1628);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			insertInto();
			setState(1634);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1637);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1639);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1640);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1641);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1643);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1642);
							setQuantifier();
							}
						}

						setState(1645);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1646);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1647);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1648);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1650);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1649);
							setQuantifier();
							}
						}

						setState(1652);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1653);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1654);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1655);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1657);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1656);
							setQuantifier();
							}
						}

						setState(1659);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_queryPrimary);
		try {
			setState(1674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1667);
				match(TABLE);
				setState(1668);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1669);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1670);
				match(T__1);
				setState(1671);
				query();
				setState(1672);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			expression();
			setState(1678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1677);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1680);
				match(NULLS);
				setState(1681);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			fromClause();
			setState(1686); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1685);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1688); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				transformClause();
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1691);
					whereClause();
					}
					break;
				}
				setState(1694);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1696);
				selectClause();
				setState(1700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1697);
						lateralView();
						}
						} 
					}
					setState(1702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				setState(1704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1703);
					whereClause();
					}
					break;
				}
				setState(1707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1706);
					aggregationClause();
					}
					break;
				}
				setState(1710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1709);
					havingClause();
					}
					break;
				}
				setState(1713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1712);
					windowClause();
					}
					break;
				}
				setState(1715);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_querySpecification);
		try {
			int _alt;
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1719);
				transformClause();
				setState(1721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1720);
					fromClause();
					}
					break;
				}
				setState(1726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1723);
						lateralView();
						}
						} 
					}
					setState(1728);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				setState(1730);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1729);
					whereClause();
					}
					break;
				}
				setState(1733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1732);
					aggregationClause();
					}
					break;
				}
				setState(1736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1735);
					havingClause();
					}
					break;
				}
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1738);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1741);
				selectClause();
				setState(1743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1742);
					fromClause();
					}
					break;
				}
				setState(1748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1745);
						lateralView();
						}
						} 
					}
					setState(1750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				setState(1752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1751);
					whereClause();
					}
					break;
				}
				setState(1755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1754);
					aggregationClause();
					}
					break;
				}
				setState(1758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1757);
					havingClause();
					}
					break;
				}
				setState(1761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1760);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1765);
				match(SELECT);
				setState(1766);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1767);
				match(T__1);
				setState(1769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1768);
					setQuantifier();
					}
					break;
				}
				setState(1771);
				expressionSeq();
				setState(1772);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1774);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1775);
					setQuantifier();
					}
					break;
				}
				setState(1778);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1779);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1780);
					setQuantifier();
					}
					break;
				}
				setState(1783);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1786);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1789);
				match(RECORDWRITER);
				setState(1790);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1793);
			match(USING);
			setState(1794);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1795);
				match(AS);
				setState(1805);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1796);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1797);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1798);
					match(T__1);
					setState(1801);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
					case 1:
						{
						setState(1799);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1800);
						colTypeList();
						}
						break;
					}
					setState(1803);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1809);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1812);
				match(RECORDREADER);
				setState(1813);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			match(SELECT);
			setState(1820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1817);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			}
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1823);
				setQuantifier();
				}
				break;
			}
			setState(1826);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			match(SET);
			setState(1829);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			match(WHEN);
			setState(1832);
			match(MATCHED);
			setState(1835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1833);
				match(AND);
				setState(1834);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1837);
			match(THEN);
			setState(1838);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1840);
			match(WHEN);
			setState(1841);
			match(NOT);
			setState(1842);
			match(MATCHED);
			setState(1845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1843);
				match(AND);
				setState(1844);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1847);
			match(THEN);
			setState(1848);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedAction);
		try {
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1850);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1851);
				match(UPDATE);
				setState(1852);
				match(SET);
				setState(1853);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1854);
				match(UPDATE);
				setState(1855);
				match(SET);
				setState(1856);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedAction);
		int _la;
		try {
			setState(1877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				match(INSERT);
				setState(1860);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1861);
				match(INSERT);
				setState(1862);
				match(T__1);
				setState(1863);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1864);
				match(T__2);
				setState(1865);
				match(VALUES);
				setState(1866);
				match(T__1);
				setState(1867);
				expression();
				setState(1872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1868);
					match(T__3);
					setState(1869);
					expression();
					}
					}
					setState(1874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1875);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			assignment();
			setState(1884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1880);
				match(T__3);
				setState(1881);
				assignment();
				}
				}
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1888);
			match(EQ);
			setState(1889);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			match(WHERE);
			setState(1892);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			match(HAVING);
			setState(1895);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			match(T__5);
			setState(1898);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1900);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
					case 1:
						{
						setState(1899);
						match(T__3);
						}
						break;
					}
					setState(1902);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			setState(1908);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_hintStatement);
		int _la;
		try {
			setState(1923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1910);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1912);
				match(T__1);
				setState(1913);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1914);
					match(T__3);
					setState(1915);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1920);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1921);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			match(FROM);
			setState(1926);
			relation();
			setState(1931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1927);
					match(T__3);
					setState(1928);
					relation();
					}
					} 
				}
				setState(1933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
			}
			setState(1937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1934);
					lateralView();
					}
					} 
				}
				setState(1939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1940);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(1982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				match(GROUP);
				setState(1944);
				match(BY);
				setState(1945);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(1950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1946);
						match(T__3);
						setState(1947);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(1952);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
				match(GROUP);
				setState(1954);
				match(BY);
				setState(1955);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1956);
						match(T__3);
						setState(1957);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1962);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
				}
				setState(1980);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1963);
					match(WITH);
					setState(1964);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1965);
					match(WITH);
					setState(1966);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1967);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1968);
					match(SETS);
					setState(1969);
					match(T__1);
					setState(1970);
					groupingSet();
					setState(1975);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1971);
						match(T__3);
						setState(1972);
						groupingSet();
						}
						}
						setState(1977);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1978);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_groupByClause);
		try {
			setState(1986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1985);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingAnalytics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingAnalytics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_groupingAnalytics);
		int _la;
		try {
			setState(2013);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1988);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1989);
				match(T__1);
				setState(1990);
				groupingSet();
				setState(1995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1991);
					match(T__3);
					setState(1992);
					groupingSet();
					}
					}
					setState(1997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1998);
				match(T__2);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2000);
				match(GROUPING);
				setState(2001);
				match(SETS);
				setState(2002);
				match(T__1);
				setState(2003);
				groupingElement();
				setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2004);
					match(T__3);
					setState(2005);
					groupingElement();
					}
					}
					setState(2010);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2011);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_groupingElement);
		try {
			setState(2017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2015);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2016);
				groupingSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_groupingSet);
		int _la;
		try {
			setState(2032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				match(T__1);
				setState(2028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
				case 1:
					{
					setState(2020);
					expression();
					setState(2025);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2021);
						match(T__3);
						setState(2022);
						expression();
						}
						}
						setState(2027);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2030);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			match(PIVOT);
			setState(2035);
			match(T__1);
			setState(2036);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2037);
			match(FOR);
			setState(2038);
			pivotColumn();
			setState(2039);
			match(IN);
			setState(2040);
			match(T__1);
			setState(2041);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2042);
				match(T__3);
				setState(2043);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2049);
			match(T__2);
			setState(2050);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_pivotColumn);
		int _la;
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2053);
				match(T__1);
				setState(2054);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2055);
					match(T__3);
					setState(2056);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2062);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			expression();
			setState(2071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2067);
					match(AS);
					}
					break;
				}
				setState(2070);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(LATERAL);
			setState(2074);
			match(VIEW);
			setState(2076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2075);
				match(OUTER);
				}
				break;
			}
			setState(2078);
			qualifiedName();
			setState(2079);
			match(T__1);
			setState(2088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2080);
				expression();
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2081);
					match(T__3);
					setState(2082);
					expression();
					}
					}
					setState(2087);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2090);
			match(T__2);
			setState(2091);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2092);
					match(AS);
					}
					break;
				}
				setState(2095);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2096);
						match(T__3);
						setState(2097);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2105);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2107);
				match(LATERAL);
				}
				break;
			}
			setState(2110);
			relationPrimary();
			setState(2114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2111);
					joinRelation();
					}
					} 
				}
				setState(2116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_joinRelation);
		try {
			setState(2134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2117);
				joinType();
				}
				setState(2118);
				match(JOIN);
				setState(2120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2119);
					match(LATERAL);
					}
					break;
				}
				setState(2122);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2123);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2126);
				match(NATURAL);
				setState(2127);
				joinType();
				setState(2128);
				match(JOIN);
				setState(2130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2129);
					match(LATERAL);
					}
					break;
				}
				setState(2132);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_joinType);
		int _la;
		try {
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2136);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2139);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2140);
				match(LEFT);
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2141);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2144);
					match(LEFT);
					}
				}

				setState(2147);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2148);
				match(RIGHT);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2149);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2152);
				match(FULL);
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2153);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2156);
					match(LEFT);
					}
				}

				setState(2159);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_joinCriteria);
		try {
			setState(2166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2162);
				match(ON);
				setState(2163);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2164);
				match(USING);
				setState(2165);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(TABLESAMPLE);
			setState(2169);
			match(T__1);
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2170);
				sampleMethod();
				}
				break;
			}
			setState(2173);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_sampleMethod);
		int _la;
		try {
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2175);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2178);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2179);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2180);
				expression();
				setState(2181);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2183);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2184);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2185);
				match(OUT);
				setState(2186);
				match(OF);
				setState(2187);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2188);
					match(ON);
					setState(2194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
					case 1:
						{
						setState(2189);
						identifier();
						}
						break;
					case 2:
						{
						setState(2190);
						qualifiedName();
						setState(2191);
						match(T__1);
						setState(2192);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2198);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(T__1);
			setState(2202);
			identifierSeq();
			setState(2203);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2206);
					match(T__3);
					setState(2207);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,280,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(T__1);
			setState(2214);
			orderedIdentifier();
			setState(2219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2215);
				match(T__3);
				setState(2216);
				orderedIdentifier();
				}
				}
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2222);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2225);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			match(T__1);
			setState(2229);
			identifierComment();
			setState(2234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2230);
				match(T__3);
				setState(2231);
				identifierComment();
				}
				}
				setState(2236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2237);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			identifier();
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2240);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_relationPrimary);
		try {
			setState(2267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2243);
				multipartIdentifier();
				setState(2245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2244);
					sample();
					}
					break;
				}
				setState(2247);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2249);
				match(T__1);
				setState(2250);
				query();
				setState(2251);
				match(T__2);
				setState(2253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2252);
					sample();
					}
					break;
				}
				setState(2255);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2257);
				match(T__1);
				setState(2258);
				relation();
				setState(2259);
				match(T__2);
				setState(2261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2260);
					sample();
					}
					break;
				}
				setState(2263);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2265);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2266);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			match(VALUES);
			setState(2270);
			expression();
			setState(2275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2271);
					match(T__3);
					setState(2272);
					expression();
					}
					} 
				}
				setState(2277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			setState(2278);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2281);
			match(T__1);
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2282);
				expression();
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2283);
					match(T__3);
					setState(2284);
					expression();
					}
					}
					setState(2289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2292);
			match(T__2);
			setState(2293);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2295);
					match(AS);
					}
					break;
				}
				setState(2298);
				strictIdentifier();
				setState(2300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2299);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_rowFormat);
		try {
			setState(2353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2304);
				match(ROW);
				setState(2305);
				match(FORMAT);
				setState(2306);
				match(SERDE);
				setState(2307);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2308);
					match(WITH);
					setState(2309);
					match(SERDEPROPERTIES);
					setState(2310);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2313);
				match(ROW);
				setState(2314);
				match(FORMAT);
				setState(2315);
				match(DELIMITED);
				setState(2325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2316);
					match(FIELDS);
					setState(2317);
					match(TERMINATED);
					setState(2318);
					match(BY);
					setState(2319);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
					case 1:
						{
						setState(2320);
						match(ESCAPED);
						setState(2321);
						match(BY);
						setState(2322);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2327);
					match(COLLECTION);
					setState(2328);
					match(ITEMS);
					setState(2329);
					match(TERMINATED);
					setState(2330);
					match(BY);
					setState(2331);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2334);
					match(MAP);
					setState(2335);
					match(KEYS);
					setState(2336);
					match(TERMINATED);
					setState(2337);
					match(BY);
					setState(2338);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2341);
					match(LINES);
					setState(2342);
					match(TERMINATED);
					setState(2343);
					match(BY);
					setState(2344);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2347);
					match(NULL);
					setState(2348);
					match(DEFINED);
					setState(2349);
					match(AS);
					setState(2350);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			multipartIdentifier();
			setState(2360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2356);
				match(T__3);
				setState(2357);
				multipartIdentifier();
				}
				}
				setState(2362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2364);
					match(T__4);
					setState(2365);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				setState(2371);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2372);
				match(T__4);
				}
				break;
			}
			setState(2376);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				{
				setState(2378);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2379);
				match(T__4);
				}
				break;
			}
			setState(2383);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			expression();
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2386);
					match(AS);
					}
					break;
				}
				setState(2391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2389);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2390);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			namedExpression();
			setState(2400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2396);
					match(T__3);
					setState(2397);
					namedExpression();
					}
					} 
				}
				setState(2402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			match(T__1);
			setState(2404);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2405);
				match(T__3);
				setState(2406);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2412);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_partitionField);
		try {
			setState(2416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2414);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2415);
				colType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_transform);
		int _la;
		try {
			setState(2431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2418);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2419);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2420);
				match(T__1);
				setState(2421);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2422);
					match(T__3);
					setState(2423);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2429);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_transformArgument);
		try {
			setState(2435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2433);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2434);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2437);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			expression();
			setState(2444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2440);
				match(T__3);
				setState(2441);
				expression();
				}
				}
				setState(2446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2448);
				match(NOT);
				setState(2449);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2450);
				match(EXISTS);
				setState(2451);
				match(T__1);
				setState(2452);
				query();
				setState(2453);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2455);
				valueExpression(0);
				setState(2457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2456);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2467);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2461);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2462);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2463);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2464);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2465);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2466);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_predicate);
		int _la;
		try {
			setState(2554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2472);
					match(NOT);
					}
				}

				setState(2475);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2476);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2477);
				match(AND);
				setState(2478);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2480);
					match(NOT);
					}
				}

				setState(2483);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2484);
				match(T__1);
				setState(2485);
				expression();
				setState(2490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2486);
					match(T__3);
					setState(2487);
					expression();
					}
					}
					setState(2492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2493);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2495);
					match(NOT);
					}
				}

				setState(2498);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2499);
				match(T__1);
				setState(2500);
				query();
				setState(2501);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2503);
					match(NOT);
					}
				}

				setState(2506);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2507);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2508);
					match(NOT);
					}
				}

				setState(2511);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2512);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2513);
					match(T__1);
					setState(2514);
					match(T__2);
					}
					break;
				case 2:
					{
					setState(2515);
					match(T__1);
					setState(2516);
					expression();
					setState(2521);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2517);
						match(T__3);
						setState(2518);
						expression();
						}
						}
						setState(2523);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2524);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2528);
					match(NOT);
					}
				}

				setState(2531);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2532);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
				case 1:
					{
					setState(2533);
					match(ESCAPE);
					setState(2534);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2537);
				match(IS);
				setState(2539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2538);
					match(NOT);
					}
				}

				setState(2541);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2542);
				match(IS);
				setState(2544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2543);
					match(NOT);
					}
				}

				setState(2546);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2547);
				match(IS);
				setState(2549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2548);
					match(NOT);
					}
				}

				setState(2551);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2552);
				match(FROM);
				setState(2553);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2557);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2558);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (PLUS - 282)) | (1L << (MINUS - 282)) | (1L << (TILDE - 282)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2559);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2581);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2562);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2563);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (ASTERISK - 284)) | (1L << (SLASH - 284)) | (1L << (PERCENT - 284)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2564);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2565);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2566);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (PLUS - 282)) | (1L << (MINUS - 282)) | (1L << (CONCAT_PIPE - 282)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2567);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2568);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2569);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2570);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2571);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2572);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2573);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2574);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2575);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2576);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2577);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2578);
						comparisonOperator();
						setState(2579);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,337,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentLikeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentLikeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 208;
		enterRecursionRule(_localctx, 208, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentLikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2587);
				((CurrentLikeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_DATE) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER))) != 0)) ) {
					((CurrentLikeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2588);
				match(CASE);
				setState(2590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2589);
					whenClause();
					}
					}
					setState(2592); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2594);
					match(ELSE);
					setState(2595);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2598);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2600);
				match(CASE);
				setState(2601);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2602);
					whenClause();
					}
					}
					setState(2605); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2607);
					match(ELSE);
					setState(2608);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2611);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2613);
				((CastContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CAST || _la==TRY_CAST) ) {
					((CastContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2614);
				match(T__1);
				setState(2615);
				expression();
				setState(2616);
				match(AS);
				setState(2617);
				dataType();
				setState(2618);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2620);
				match(STRUCT);
				setState(2621);
				match(T__1);
				setState(2630);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2622);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2623);
						match(T__3);
						setState(2624);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2629);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2632);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2633);
				match(FIRST);
				setState(2634);
				match(T__1);
				setState(2635);
				expression();
				setState(2638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2636);
					match(IGNORE);
					setState(2637);
					match(NULLS);
					}
				}

				setState(2640);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2642);
				match(LAST);
				setState(2643);
				match(T__1);
				setState(2644);
				expression();
				setState(2647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2645);
					match(IGNORE);
					setState(2646);
					match(NULLS);
					}
				}

				setState(2649);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2651);
				match(POSITION);
				setState(2652);
				match(T__1);
				setState(2653);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2654);
				match(IN);
				setState(2655);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2656);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2658);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2659);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2660);
				qualifiedName();
				setState(2661);
				match(T__4);
				setState(2662);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2664);
				match(T__1);
				setState(2665);
				namedExpression();
				setState(2668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2666);
					match(T__3);
					setState(2667);
					namedExpression();
					}
					}
					setState(2670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2672);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2674);
				match(T__1);
				setState(2675);
				query();
				setState(2676);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2678);
				functionName();
				setState(2679);
				match(T__1);
				setState(2691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
				case 1:
					{
					setState(2681);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
					case 1:
						{
						setState(2680);
						setQuantifier();
						}
						break;
					}
					setState(2683);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2684);
						match(T__3);
						setState(2685);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2690);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2693);
				match(T__2);
				setState(2700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
				case 1:
					{
					setState(2694);
					match(FILTER);
					setState(2695);
					match(T__1);
					setState(2696);
					match(WHERE);
					setState(2697);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2698);
					match(T__2);
					}
					break;
				}
				setState(2704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
				case 1:
					{
					setState(2702);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2703);
					match(NULLS);
					}
					break;
				}
				setState(2708);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
				case 1:
					{
					setState(2706);
					match(OVER);
					setState(2707);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2710);
				identifier();
				setState(2711);
				match(T__7);
				setState(2712);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2714);
				match(T__1);
				setState(2715);
				identifier();
				setState(2718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2716);
					match(T__3);
					setState(2717);
					identifier();
					}
					}
					setState(2720); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2722);
				match(T__2);
				setState(2723);
				match(T__7);
				setState(2724);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2726);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2727);
				match(T__1);
				setState(2728);
				expression();
				setState(2729);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2731);
				match(EXTRACT);
				setState(2732);
				match(T__1);
				setState(2733);
				((ExtractContext)_localctx).field = identifier();
				setState(2734);
				match(FROM);
				setState(2735);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2736);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2738);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2739);
				match(T__1);
				setState(2740);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2741);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2742);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2743);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2744);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2747);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2749);
				match(TRIM);
				setState(2750);
				match(T__1);
				setState(2752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
				case 1:
					{
					setState(2751);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
				case 1:
					{
					setState(2754);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2757);
				match(FROM);
				setState(2758);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2759);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2761);
				match(OVERLAY);
				setState(2762);
				match(T__1);
				setState(2763);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2764);
				match(PLACING);
				setState(2765);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2766);
				match(FROM);
				setState(2767);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2768);
					match(FOR);
					setState(2769);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2772);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2784);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2776);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2777);
						match(T__8);
						setState(2778);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2779);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2781);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2782);
						match(T__4);
						setState(2783);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constant);
		try {
			int _alt;
			setState(2801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2789);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2790);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2791);
				identifier();
				setState(2792);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2794);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2795);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2797); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2796);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2799); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,361,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2803);
			_la = _input.LA(1);
			if ( !(((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (EQ - 274)) | (1L << (NSEQ - 274)) | (1L << (NEQ - 274)) | (1L << (NEQJ - 274)) | (1L << (LT - 274)) | (1L << (LTE - 274)) | (1L << (GT - 274)) | (1L << (GTE - 274)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (PLUS - 282)) | (1L << (MINUS - 282)) | (1L << (ASTERISK - 282)) | (1L << (SLASH - 282)) | (1L << (PERCENT - 282)) | (1L << (TILDE - 282)) | (1L << (AMPERSAND - 282)) | (1L << (PIPE - 282)) | (1L << (CONCAT_PIPE - 282)) | (1L << (HAT - 282)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2807);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (IN - 116)) | (1L << (NOT - 116)) | (1L << (OR - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2809);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2811);
			match(INTERVAL);
			setState(2814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
			case 1:
				{
				setState(2812);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2813);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext body;
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2816);
			((ErrorCapturingMultiUnitsIntervalContext)_localctx).body = multiUnitsInterval();
			setState(2818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2817);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2823); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2820);
					intervalValue();
					setState(2821);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2825); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,365,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				{
				setState(2828);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2829);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2832);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2833);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2834);
			match(TO);
			setState(2835);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2837);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2840);
			_la = _input.LA(1);
			if ( !(((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (STRING - 292)) | (1L << (INTEGER_VALUE - 292)) | (1L << (DECIMAL_VALUE - 292)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_colPosition);
		try {
			setState(2845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2842);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2843);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2844);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YearMonthIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public List<TerminalNode> MONTH() { return getTokens(SqlBaseParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(SqlBaseParser.MONTH, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public YearMonthIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterYearMonthIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitYearMonthIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitYearMonthIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DayTimeIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public List<TerminalNode> HOUR() { return getTokens(SqlBaseParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(SqlBaseParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(SqlBaseParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(SqlBaseParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(SqlBaseParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(SqlBaseParser.SECOND, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public DayTimeIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDayTimeIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDayTimeIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDayTimeIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_dataType);
		int _la;
		try {
			setState(2893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2847);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2848);
				match(LT);
				setState(2849);
				dataType();
				setState(2850);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2852);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2853);
				match(LT);
				setState(2854);
				dataType();
				setState(2855);
				match(T__3);
				setState(2856);
				dataType();
				setState(2857);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2859);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2866);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2860);
					match(LT);
					setState(2862);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
					case 1:
						{
						setState(2861);
						complexColTypeList();
						}
						break;
					}
					setState(2864);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2865);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new YearMonthIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2868);
				match(INTERVAL);
				setState(2869);
				((YearMonthIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MONTH || _la==YEAR) ) {
					((YearMonthIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
				case 1:
					{
					setState(2870);
					match(TO);
					setState(2871);
					((YearMonthIntervalDataTypeContext)_localctx).to = match(MONTH);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new DayTimeIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2874);
				match(INTERVAL);
				setState(2875);
				((DayTimeIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==SECOND) ) {
					((DayTimeIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
				case 1:
					{
					setState(2876);
					match(TO);
					setState(2877);
					((DayTimeIntervalDataTypeContext)_localctx).to = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==HOUR || _la==MINUTE || _la==SECOND) ) {
						((DayTimeIntervalDataTypeContext)_localctx).to = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2880);
				identifier();
				setState(2891);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2881);
					match(T__1);
					setState(2882);
					match(INTEGER_VALUE);
					setState(2887);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2883);
						match(T__3);
						setState(2884);
						match(INTEGER_VALUE);
						}
						}
						setState(2889);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2890);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2895);
			qualifiedColTypeWithPosition();
			setState(2900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2896);
				match(T__3);
				setState(2897);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2904);
			dataType();
			setState(2907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2905);
				match(NOT);
				setState(2906);
				match(NULL);
				}
			}

			setState(2910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2909);
				commentSpec();
				}
			}

			setState(2913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2912);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
			colType();
			setState(2920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2916);
					match(T__3);
					setState(2917);
					colType();
					}
					} 
				}
				setState(2922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,380,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2923);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2924);
			dataType();
			setState(2927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
			case 1:
				{
				setState(2925);
				match(NOT);
				setState(2926);
				match(NULL);
				}
				break;
			}
			setState(2930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				{
				setState(2929);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2932);
			complexColType();
			setState(2937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2933);
				match(T__3);
				setState(2934);
				complexColType();
				}
				}
				setState(2939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2940);
			identifier();
			setState(2942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				{
				setState(2941);
				match(T__10);
				}
				break;
			}
			setState(2944);
			dataType();
			setState(2947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2945);
				match(NOT);
				setState(2946);
				match(NULL);
				}
			}

			setState(2950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2949);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2952);
			match(WHEN);
			setState(2953);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2954);
			match(THEN);
			setState(2955);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2957);
			match(WINDOW);
			setState(2958);
			namedWindow();
			setState(2963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2959);
					match(T__3);
					setState(2960);
					namedWindow();
					}
					} 
				}
				setState(2965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,387,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2966);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2967);
			match(AS);
			setState(2968);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_windowSpec);
		int _la;
		try {
			setState(3016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2970);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2971);
				match(T__1);
				setState(2972);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2973);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2975);
				match(T__1);
				setState(3010);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2976);
					match(CLUSTER);
					setState(2977);
					match(BY);
					setState(2978);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2983);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2979);
						match(T__3);
						setState(2980);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2985);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2986);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2987);
						match(BY);
						setState(2988);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2993);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2989);
							match(T__3);
							setState(2990);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2995);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(3008);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2998);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2999);
						match(BY);
						setState(3000);
						sortItem();
						setState(3005);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(3001);
							match(T__3);
							setState(3002);
							sortItem();
							}
							}
							setState(3007);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(3012);
					windowFrame();
					}
				}

				setState(3015);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_windowFrame);
		try {
			setState(3034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3018);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3019);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3020);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3021);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3022);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3023);
				match(BETWEEN);
				setState(3024);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3025);
				match(AND);
				setState(3026);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3028);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3029);
				match(BETWEEN);
				setState(3030);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3031);
				match(AND);
				setState(3032);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_frameBound);
		int _la;
		try {
			setState(3043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3036);
				match(UNBOUNDED);
				setState(3037);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3038);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3039);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3040);
				expression();
				setState(3041);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3045);
			qualifiedName();
			setState(3050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(3046);
				match(T__3);
				setState(3047);
				qualifiedName();
				}
				}
				setState(3052);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_functionName);
		try {
			setState(3057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3053);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3054);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3055);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3056);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3059);
			identifier();
			setState(3064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3060);
					match(T__4);
					setState(3061);
					identifier();
					}
					} 
				}
				setState(3066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3067);
			identifier();
			setState(3068);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3072); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3070);
						match(MINUS);
						setState(3071);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3074); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_identifier);
		try {
			setState(3082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3079);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3080);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3081);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_strictIdentifier);
		try {
			setState(3090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3084);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3085);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3086);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3087);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3088);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3089);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3092);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_number);
		int _la;
		try {
			setState(3137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,415,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3094);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3095);
					match(MINUS);
					}
				}

				setState(3098);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3099);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3100);
					match(MINUS);
					}
				}

				setState(3103);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3104);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3105);
					match(MINUS);
					}
				}

				setState(3108);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3109);
					match(MINUS);
					}
				}

				setState(3112);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3113);
					match(MINUS);
					}
				}

				setState(3116);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3117);
					match(MINUS);
					}
				}

				setState(3120);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3121);
					match(MINUS);
					}
				}

				setState(3124);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3125);
					match(MINUS);
					}
				}

				setState(3128);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3129);
					match(MINUS);
					}
				}

				setState(3132);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3133);
					match(MINUS);
					}
				}

				setState(3136);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_alterColumnAction);
		int _la;
		try {
			setState(3146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3139);
				match(TYPE);
				setState(3140);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3141);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3142);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3143);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3144);
				match(NOT);
				setState(3145);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode ENGINE() { return getToken(SqlBaseParser.ENGINE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ANTI) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (ITEMS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (KEYS - 129)) | (1L << (LAST - 129)) | (1L << (LAZY - 129)) | (1L << (LIKE - 129)) | (1L << (ILIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OUT - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (REFRESH - 193)) | (1L << (RENAME - 193)) | (1L << (REPAIR - 193)) | (1L << (REPLACE - 193)) | (1L << (RESET - 193)) | (1L << (RESPECT - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SECOND - 193)) | (1L << (SCHEMA - 193)) | (1L << (SEMI - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SET - 193)) | (1L << (SETMINUS - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SYNC - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESAMPLE - 193)) | (1L << (TBLPROPERTIES - 193)) | (1L << (TEMPORARY - 193)) | (1L << (TERMINATED - 193)) | (1L << (TOUCH - 193)) | (1L << (TRANSACTION - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (TRANSFORM - 193)) | (1L << (TRIM - 193)) | (1L << (TRUE - 193)) | (1L << (TRUNCATE - 193)) | (1L << (TRY_CAST - 193)) | (1L << (TYPE - 193)) | (1L << (UNARCHIVE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNCACHE - 193)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (UNLOCK - 258)) | (1L << (UNSET - 258)) | (1L << (UPDATE - 258)) | (1L << (USE - 258)) | (1L << (VALUES - 258)) | (1L << (VIEW - 258)) | (1L << (VIEWS - 258)) | (1L << (WINDOW - 258)) | (1L << (YEAR - 258)) | (1L << (ZONE - 258)) | (1L << (ENGINE - 258)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3150);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (EXCEPT - 84)) | (1L << (FULL - 84)) | (1L << (INNER - 84)) | (1L << (INTERSECT - 84)) | (1L << (JOIN - 84)) | (1L << (LATERAL - 84)) | (1L << (LEFT - 84)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (NATURAL - 155)) | (1L << (ON - 155)) | (1L << (RIGHT - 155)) | (1L << (SEMI - 155)) | (1L << (SETMINUS - 155)))) != 0) || _la==UNION || _la==USING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode ENGINE() { return getToken(SqlBaseParser.ENGINE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATA - 64)) | (1L << (DATABASE - 64)) | (1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (KEYS - 129)) | (1L << (LAST - 129)) | (1L << (LAZY - 129)) | (1L << (LEADING - 129)) | (1L << (LIKE - 129)) | (1L << (ILIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NOT - 129)) | (1L << (NULL - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OUT - 129)) | (1L << (OUTER - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAPS - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIMARY - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)) | (1L << (REFERENCES - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (REFRESH - 193)) | (1L << (RENAME - 193)) | (1L << (REPAIR - 193)) | (1L << (REPLACE - 193)) | (1L << (RESET - 193)) | (1L << (RESPECT - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SECOND - 193)) | (1L << (SCHEMA - 193)) | (1L << (SELECT - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SESSION_USER - 193)) | (1L << (SET - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SOME - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SYNC - 193)) | (1L << (TABLE - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESAMPLE - 193)) | (1L << (TBLPROPERTIES - 193)) | (1L << (TEMPORARY - 193)) | (1L << (TERMINATED - 193)) | (1L << (THEN - 193)) | (1L << (TIME - 193)) | (1L << (TO - 193)) | (1L << (TOUCH - 193)) | (1L << (TRAILING - 193)) | (1L << (TRANSACTION - 193)) | (1L << (TRANSACTIONS - 193)) | (1L << (TRANSFORM - 193)) | (1L << (TRIM - 193)) | (1L << (TRUE - 193)) | (1L << (TRUNCATE - 193)) | (1L << (TRY_CAST - 193)) | (1L << (TYPE - 193)) | (1L << (UNARCHIVE - 193)) | (1L << (UNBOUNDED - 193)) | (1L << (UNCACHE - 193)) | (1L << (UNIQUE - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (UNKNOWN - 257)) | (1L << (UNLOCK - 257)) | (1L << (UNSET - 257)) | (1L << (UPDATE - 257)) | (1L << (USE - 257)) | (1L << (USER - 257)) | (1L << (VALUES - 257)) | (1L << (VIEW - 257)) | (1L << (VIEWS - 257)) | (1L << (WHEN - 257)) | (1L << (WHERE - 257)) | (1L << (WINDOW - 257)) | (1L << (WITH - 257)) | (1L << (YEAR - 257)) | (1L << (ZONE - 257)) | (1L << (ENGINE - 257)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 101:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 103:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 104:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 135:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 136:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 138:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0135\u0c55\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\3\2\3\2\7\2\u0123\n\2\f\2\16"+
		"\2\u0126\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u013e\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u014a\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0151\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u0159\n\t\f\t\16\t\u015c\13\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u016f\n\t\3\t\3"+
		"\t\5\t\u0173\n\t\3\t\3\t\3\t\3\t\5\t\u0179\n\t\3\t\5\t\u017c\n\t\3\t\5"+
		"\t\u017f\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0186\n\t\3\t\5\t\u0189\n\t\3\t\3"+
		"\t\5\t\u018d\n\t\3\t\5\t\u0190\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0197\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01a2\n\t\f\t\16\t\u01a5\13\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u01ac\n\t\3\t\5\t\u01af\n\t\3\t\3\t\5\t\u01b3\n"+
		"\t\3\t\5\t\u01b6\n\t\3\t\3\t\3\t\3\t\5\t\u01bc\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u01c7\n\t\3\t\3\t\3\t\3\t\5\t\u01cd\n\t\3\t\3\t\3"+
		"\t\5\t\u01d2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0212\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u021b\n\t\3\t\3\t\5\t\u021f\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0225\n\t\3\t\3\t\5\t\u0229\n\t\3\t\3\t\3\t\5\t\u022e\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0234\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0240\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0248\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u024e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u025b\n\t"+
		"\3\t\6\t\u025e\n\t\r\t\16\t\u025f\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0270\n\t\3\t\3\t\3\t\7\t\u0275\n\t\f\t\16\t"+
		"\u0278\13\t\3\t\5\t\u027b\n\t\3\t\3\t\3\t\3\t\5\t\u0281\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0290\n\t\3\t\3\t\5\t\u0294"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u029a\n\t\3\t\3\t\3\t\3\t\5\t\u02a0\n\t\3\t\5"+
		"\t\u02a3\n\t\3\t\5\t\u02a6\n\t\3\t\3\t\3\t\3\t\5\t\u02ac\n\t\3\t\3\t\5"+
		"\t\u02b0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u02b8\n\t\f\t\16\t\u02bb\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02c3\n\t\3\t\5\t\u02c6\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u02cf\n\t\3\t\3\t\3\t\5\t\u02d4\n\t\3\t\3\t\3\t\3\t"+
		"\5\t\u02da\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u02e1\n\t\3\t\5\t\u02e4\n\t\3\t"+
		"\3\t\3\t\3\t\5\t\u02ea\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u02f3\n\t\f"+
		"\t\16\t\u02f6\13\t\5\t\u02f8\n\t\3\t\3\t\5\t\u02fc\n\t\3\t\3\t\3\t\5\t"+
		"\u0301\n\t\3\t\3\t\3\t\5\t\u0306\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u030d\n\t"+
		"\3\t\5\t\u0310\n\t\3\t\5\t\u0313\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u031a\n\t"+
		"\3\t\3\t\3\t\5\t\u031f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0328\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0330\n\t\3\t\3\t\3\t\3\t\5\t\u0336\n\t\3\t"+
		"\5\t\u0339\n\t\3\t\5\t\u033c\n\t\3\t\3\t\3\t\3\t\5\t\u0342\n\t\3\t\3\t"+
		"\5\t\u0346\n\t\3\t\3\t\5\t\u034a\n\t\3\t\3\t\5\t\u034e\n\t\5\t\u0350\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0358\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0360"+
		"\n\t\3\t\5\t\u0363\n\t\3\t\3\t\3\t\5\t\u0368\n\t\3\t\3\t\3\t\3\t\5\t\u036e"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u0374\n\t\3\t\5\t\u0377\n\t\3\t\3\t\5\t\u037b"+
		"\n\t\3\t\5\t\u037e\n\t\3\t\3\t\5\t\u0382\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u039c\n\t\f\t\16\t\u039f\13\t\5\t\u03a1\n\t\3\t\3\t\5\t\u03a5\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u03ab\n\t\3\t\5\t\u03ae\n\t\3\t\5\t\u03b1\n\t\3\t"+
		"\3\t\3\t\3\t\5\t\u03b7\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03bf\n\t\3\t\3"+
		"\t\3\t\5\t\u03c4\n\t\3\t\3\t\3\t\3\t\5\t\u03ca\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u03d0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d8\n\t\3\t\3\t\3\t\7\t\u03dd"+
		"\n\t\f\t\16\t\u03e0\13\t\3\t\3\t\3\t\7\t\u03e5\n\t\f\t\16\t\u03e8\13\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03f6\n\t\f\t\16"+
		"\t\u03f9\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0404\n\t\f\t\16"+
		"\t\u0407\13\t\5\t\u0409\n\t\3\t\3\t\7\t\u040d\n\t\f\t\16\t\u0410\13\t"+
		"\3\t\3\t\3\t\3\t\7\t\u0416\n\t\f\t\16\t\u0419\13\t\3\t\3\t\3\t\3\t\7\t"+
		"\u041f\n\t\f\t\16\t\u0422\13\t\3\t\3\t\7\t\u0426\n\t\f\t\16\t\u0429\13"+
		"\t\5\t\u042b\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0437\n"+
		"\f\3\f\3\f\5\f\u043b\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0442\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04b6\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04be"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04c6\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u04cf\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04d9\n\f\3\r\3\r\5"+
		"\r\u04dd\n\r\3\r\5\r\u04e0\n\r\3\r\3\r\3\r\3\r\5\r\u04e6\n\r\3\r\3\r\3"+
		"\16\3\16\5\16\u04ec\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u04f8\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0504\n\20\3\20\3\20\3\20\5\20\u0509\n\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\5\23\u0512\n\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u051a"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0521\n\24\5\24\u0523\n\24\3\24\5"+
		"\24\u0526\n\24\3\24\3\24\3\24\5\24\u052b\n\24\3\24\3\24\5\24\u052f\n\24"+
		"\3\24\3\24\3\24\5\24\u0534\n\24\3\24\5\24\u0537\n\24\3\24\3\24\3\24\5"+
		"\24\u053c\n\24\3\24\3\24\3\24\5\24\u0541\n\24\3\24\5\24\u0544\n\24\3\24"+
		"\3\24\3\24\5\24\u0549\n\24\3\24\3\24\5\24\u054d\n\24\3\24\3\24\3\24\5"+
		"\24\u0552\n\24\5\24\u0554\n\24\3\25\3\25\5\25\u0558\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u055f\n\26\f\26\16\26\u0562\13\26\3\26\3\26\3\27\3\27"+
		"\3\27\5\27\u0569\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0572\n"+
		"\31\3\32\3\32\3\32\7\32\u0577\n\32\f\32\16\32\u057a\13\32\3\33\3\33\3"+
		"\33\3\33\7\33\u0580\n\33\f\33\16\33\u0583\13\33\3\34\3\34\5\34\u0587\n"+
		"\34\3\34\5\34\u058a\n\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u05a0\n\36"+
		"\f\36\16\36\u05a3\13\36\3\37\3\37\3\37\3\37\7\37\u05a9\n\37\f\37\16\37"+
		"\u05ac\13\37\3\37\3\37\3 \3 \5 \u05b2\n \3 \5 \u05b5\n \3!\3!\3!\7!\u05ba"+
		"\n!\f!\16!\u05bd\13!\3!\5!\u05c0\n!\3\"\3\"\3\"\3\"\5\"\u05c6\n\"\3#\3"+
		"#\3#\3#\7#\u05cc\n#\f#\16#\u05cf\13#\3#\3#\3$\3$\3$\3$\7$\u05d7\n$\f$"+
		"\16$\u05da\13$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u05e4\n%\3&\3&\3&\3&\3&\5&\u05eb"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u05f1\n\'\3(\3(\3(\3)\3)\3)\3)\3)\6)\u05fb\n)"+
		"\r)\16)\u05fc\3)\3)\3)\3)\3)\5)\u0604\n)\3)\3)\3)\3)\3)\5)\u060b\n)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0617\n)\3)\3)\3)\3)\7)\u061d\n)\f)\16"+
		")\u0620\13)\3)\7)\u0623\n)\f)\16)\u0626\13)\5)\u0628\n)\3*\3*\3*\3*\3"+
		"*\7*\u062f\n*\f*\16*\u0632\13*\5*\u0634\n*\3*\3*\3*\3*\3*\7*\u063b\n*"+
		"\f*\16*\u063e\13*\5*\u0640\n*\3*\3*\3*\3*\3*\7*\u0647\n*\f*\16*\u064a"+
		"\13*\5*\u064c\n*\3*\3*\3*\3*\3*\7*\u0653\n*\f*\16*\u0656\13*\5*\u0658"+
		"\n*\3*\5*\u065b\n*\3*\3*\3*\5*\u0660\n*\5*\u0662\n*\3+\3+\3+\3,\3,\3,"+
		"\3,\3,\3,\3,\5,\u066e\n,\3,\3,\3,\3,\3,\5,\u0675\n,\3,\3,\3,\3,\3,\5,"+
		"\u067c\n,\3,\7,\u067f\n,\f,\16,\u0682\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5"+
		"-\u068d\n-\3.\3.\5.\u0691\n.\3.\3.\5.\u0695\n.\3/\3/\6/\u0699\n/\r/\16"+
		"/\u069a\3\60\3\60\5\60\u069f\n\60\3\60\3\60\3\60\3\60\7\60\u06a5\n\60"+
		"\f\60\16\60\u06a8\13\60\3\60\5\60\u06ab\n\60\3\60\5\60\u06ae\n\60\3\60"+
		"\5\60\u06b1\n\60\3\60\5\60\u06b4\n\60\3\60\3\60\5\60\u06b8\n\60\3\61\3"+
		"\61\5\61\u06bc\n\61\3\61\7\61\u06bf\n\61\f\61\16\61\u06c2\13\61\3\61\5"+
		"\61\u06c5\n\61\3\61\5\61\u06c8\n\61\3\61\5\61\u06cb\n\61\3\61\5\61\u06ce"+
		"\n\61\3\61\3\61\5\61\u06d2\n\61\3\61\7\61\u06d5\n\61\f\61\16\61\u06d8"+
		"\13\61\3\61\5\61\u06db\n\61\3\61\5\61\u06de\n\61\3\61\5\61\u06e1\n\61"+
		"\3\61\5\61\u06e4\n\61\5\61\u06e6\n\61\3\62\3\62\3\62\3\62\5\62\u06ec\n"+
		"\62\3\62\3\62\3\62\3\62\3\62\5\62\u06f3\n\62\3\62\3\62\3\62\5\62\u06f8"+
		"\n\62\3\62\5\62\u06fb\n\62\3\62\5\62\u06fe\n\62\3\62\3\62\5\62\u0702\n"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u070c\n\62\3\62\3\62"+
		"\5\62\u0710\n\62\5\62\u0712\n\62\3\62\5\62\u0715\n\62\3\62\3\62\5\62\u0719"+
		"\n\62\3\63\3\63\7\63\u071d\n\63\f\63\16\63\u0720\13\63\3\63\5\63\u0723"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u072e\n\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u0738\n\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0744\n\67\38\38\38\38\38\38\38\3"+
		"8\38\38\38\78\u0751\n8\f8\168\u0754\138\38\38\58\u0758\n8\39\39\39\79"+
		"\u075d\n9\f9\169\u0760\139\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\5=\u076f"+
		"\n=\3=\7=\u0772\n=\f=\16=\u0775\13=\3=\3=\3>\3>\3>\3>\3>\3>\7>\u077f\n"+
		">\f>\16>\u0782\13>\3>\3>\5>\u0786\n>\3?\3?\3?\3?\7?\u078c\n?\f?\16?\u078f"+
		"\13?\3?\7?\u0792\n?\f?\16?\u0795\13?\3?\5?\u0798\n?\3@\3@\3@\3@\3@\7@"+
		"\u079f\n@\f@\16@\u07a2\13@\3@\3@\3@\3@\3@\7@\u07a9\n@\f@\16@\u07ac\13"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u07b8\n@\f@\16@\u07bb\13@\3@\3@\5@"+
		"\u07bf\n@\5@\u07c1\n@\3A\3A\5A\u07c5\nA\3B\3B\3B\3B\3B\7B\u07cc\nB\fB"+
		"\16B\u07cf\13B\3B\3B\3B\3B\3B\3B\3B\3B\7B\u07d9\nB\fB\16B\u07dc\13B\3"+
		"B\3B\5B\u07e0\nB\3C\3C\5C\u07e4\nC\3D\3D\3D\3D\7D\u07ea\nD\fD\16D\u07ed"+
		"\13D\5D\u07ef\nD\3D\3D\5D\u07f3\nD\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u07ff"+
		"\nE\fE\16E\u0802\13E\3E\3E\3E\3F\3F\3F\3F\3F\7F\u080c\nF\fF\16F\u080f"+
		"\13F\3F\3F\5F\u0813\nF\3G\3G\5G\u0817\nG\3G\5G\u081a\nG\3H\3H\3H\5H\u081f"+
		"\nH\3H\3H\3H\3H\3H\7H\u0826\nH\fH\16H\u0829\13H\5H\u082b\nH\3H\3H\3H\5"+
		"H\u0830\nH\3H\3H\3H\7H\u0835\nH\fH\16H\u0838\13H\5H\u083a\nH\3I\3I\3J"+
		"\5J\u083f\nJ\3J\3J\7J\u0843\nJ\fJ\16J\u0846\13J\3K\3K\3K\5K\u084b\nK\3"+
		"K\3K\5K\u084f\nK\3K\3K\3K\3K\5K\u0855\nK\3K\3K\5K\u0859\nK\3L\5L\u085c"+
		"\nL\3L\3L\3L\5L\u0861\nL\3L\5L\u0864\nL\3L\3L\3L\5L\u0869\nL\3L\3L\5L"+
		"\u086d\nL\3L\5L\u0870\nL\3L\5L\u0873\nL\3M\3M\3M\3M\5M\u0879\nM\3N\3N"+
		"\3N\5N\u087e\nN\3N\3N\3O\5O\u0883\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\5O\u0895\nO\5O\u0897\nO\3O\5O\u089a\nO\3P\3P\3P\3P\3Q"+
		"\3Q\3Q\7Q\u08a3\nQ\fQ\16Q\u08a6\13Q\3R\3R\3R\3R\7R\u08ac\nR\fR\16R\u08af"+
		"\13R\3R\3R\3S\3S\5S\u08b5\nS\3T\3T\3T\3T\7T\u08bb\nT\fT\16T\u08be\13T"+
		"\3T\3T\3U\3U\5U\u08c4\nU\3V\3V\5V\u08c8\nV\3V\3V\3V\3V\3V\3V\5V\u08d0"+
		"\nV\3V\3V\3V\3V\3V\3V\5V\u08d8\nV\3V\3V\3V\3V\5V\u08de\nV\3W\3W\3W\3W"+
		"\7W\u08e4\nW\fW\16W\u08e7\13W\3W\3W\3X\3X\3X\3X\3X\7X\u08f0\nX\fX\16X"+
		"\u08f3\13X\5X\u08f5\nX\3X\3X\3X\3Y\5Y\u08fb\nY\3Y\3Y\5Y\u08ff\nY\5Y\u0901"+
		"\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u090a\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z"+
		"\u0916\nZ\5Z\u0918\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u091f\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u0926"+
		"\nZ\3Z\3Z\3Z\3Z\5Z\u092c\nZ\3Z\3Z\3Z\3Z\5Z\u0932\nZ\5Z\u0934\nZ\3[\3["+
		"\3[\7[\u0939\n[\f[\16[\u093c\13[\3\\\3\\\3\\\7\\\u0941\n\\\f\\\16\\\u0944"+
		"\13\\\3]\3]\3]\5]\u0949\n]\3]\3]\3^\3^\3^\5^\u0950\n^\3^\3^\3_\3_\5_\u0956"+
		"\n_\3_\3_\5_\u095a\n_\5_\u095c\n_\3`\3`\3`\7`\u0961\n`\f`\16`\u0964\13"+
		"`\3a\3a\3a\3a\7a\u096a\na\fa\16a\u096d\13a\3a\3a\3b\3b\5b\u0973\nb\3c"+
		"\3c\3c\3c\3c\3c\7c\u097b\nc\fc\16c\u097e\13c\3c\3c\5c\u0982\nc\3d\3d\5"+
		"d\u0986\nd\3e\3e\3f\3f\3f\7f\u098d\nf\ff\16f\u0990\13f\3g\3g\3g\3g\3g"+
		"\3g\3g\3g\3g\3g\5g\u099c\ng\5g\u099e\ng\3g\3g\3g\3g\3g\3g\7g\u09a6\ng"+
		"\fg\16g\u09a9\13g\3h\5h\u09ac\nh\3h\3h\3h\3h\3h\3h\5h\u09b4\nh\3h\3h\3"+
		"h\3h\3h\7h\u09bb\nh\fh\16h\u09be\13h\3h\3h\3h\5h\u09c3\nh\3h\3h\3h\3h"+
		"\3h\3h\5h\u09cb\nh\3h\3h\3h\5h\u09d0\nh\3h\3h\3h\3h\3h\3h\3h\3h\7h\u09da"+
		"\nh\fh\16h\u09dd\13h\3h\3h\5h\u09e1\nh\3h\5h\u09e4\nh\3h\3h\3h\3h\5h\u09ea"+
		"\nh\3h\3h\5h\u09ee\nh\3h\3h\3h\5h\u09f3\nh\3h\3h\3h\5h\u09f8\nh\3h\3h"+
		"\3h\5h\u09fd\nh\3i\3i\3i\3i\5i\u0a03\ni\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i"+
		"\3i\3i\3i\3i\3i\3i\3i\3i\3i\7i\u0a18\ni\fi\16i\u0a1b\13i\3j\3j\3j\3j\6"+
		"j\u0a21\nj\rj\16j\u0a22\3j\3j\5j\u0a27\nj\3j\3j\3j\3j\3j\6j\u0a2e\nj\r"+
		"j\16j\u0a2f\3j\3j\5j\u0a34\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\7j\u0a44\nj\fj\16j\u0a47\13j\5j\u0a49\nj\3j\3j\3j\3j\3j\3j\5j\u0a51"+
		"\nj\3j\3j\3j\3j\3j\3j\3j\5j\u0a5a\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\6j\u0a6f\nj\rj\16j\u0a70\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\5j\u0a7c\nj\3j\3j\3j\7j\u0a81\nj\fj\16j\u0a84\13j\5j\u0a86\nj"+
		"\3j\3j\3j\3j\3j\3j\3j\5j\u0a8f\nj\3j\3j\5j\u0a93\nj\3j\3j\5j\u0a97\nj"+
		"\3j\3j\3j\3j\3j\3j\3j\3j\6j\u0aa1\nj\rj\16j\u0aa2\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0abc\nj\3j\3j\3"+
		"j\3j\3j\5j\u0ac3\nj\3j\5j\u0ac6\nj\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3"+
		"j\3j\5j\u0ad5\nj\3j\3j\5j\u0ad9\nj\3j\3j\3j\3j\3j\3j\3j\3j\7j\u0ae3\n"+
		"j\fj\16j\u0ae6\13j\3k\3k\3k\3k\3k\3k\3k\3k\6k\u0af0\nk\rk\16k\u0af1\5"+
		"k\u0af4\nk\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3p\5p\u0b01\np\3q\3q\5q\u0b05"+
		"\nq\3r\3r\3r\6r\u0b0a\nr\rr\16r\u0b0b\3s\3s\3s\5s\u0b11\ns\3t\3t\3t\3"+
		"t\3t\3u\5u\u0b19\nu\3u\3u\3v\3v\3v\5v\u0b20\nv\3w\3w\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3w\3w\3w\3w\3w\5w\u0b31\nw\3w\3w\5w\u0b35\nw\3w\3w\3w\3w\5w\u0b3b"+
		"\nw\3w\3w\3w\3w\5w\u0b41\nw\3w\3w\3w\3w\3w\7w\u0b48\nw\fw\16w\u0b4b\13"+
		"w\3w\5w\u0b4e\nw\5w\u0b50\nw\3x\3x\3x\7x\u0b55\nx\fx\16x\u0b58\13x\3y"+
		"\3y\3y\3y\5y\u0b5e\ny\3y\5y\u0b61\ny\3y\5y\u0b64\ny\3z\3z\3z\7z\u0b69"+
		"\nz\fz\16z\u0b6c\13z\3{\3{\3{\3{\5{\u0b72\n{\3{\5{\u0b75\n{\3|\3|\3|\7"+
		"|\u0b7a\n|\f|\16|\u0b7d\13|\3}\3}\5}\u0b81\n}\3}\3}\3}\5}\u0b86\n}\3}"+
		"\5}\u0b89\n}\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\7\177\u0b94\n\177"+
		"\f\177\16\177\u0b97\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0ba8\n\u0081\f\u0081\16\u0081\u0bab\13\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\7\u0081\u0bb2\n\u0081\f\u0081\16\u0081\u0bb5"+
		"\13\u0081\5\u0081\u0bb7\n\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\7\u0081\u0bbe\n\u0081\f\u0081\16\u0081\u0bc1\13\u0081\5\u0081\u0bc3\n"+
		"\u0081\5\u0081\u0bc5\n\u0081\3\u0081\5\u0081\u0bc8\n\u0081\3\u0081\5\u0081"+
		"\u0bcb\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u0bdd\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u0be6\n\u0083\3\u0084\3\u0084\3\u0084\7\u0084\u0beb\n"+
		"\u0084\f\u0084\16\u0084\u0bee\13\u0084\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0bf4\n\u0085\3\u0086\3\u0086\3\u0086\7\u0086\u0bf9\n\u0086\f"+
		"\u0086\16\u0086\u0bfc\13\u0086\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\6\u0088\u0c03\n\u0088\r\u0088\16\u0088\u0c04\3\u0088\5\u0088\u0c08\n"+
		"\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u0c0d\n\u0089\3\u008a\3\u008a\3"+
		"\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0c15\n\u008a\3\u008b\3\u008b\3"+
		"\u008c\3\u008c\5\u008c\u0c1b\n\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0c20"+
		"\n\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0c25\n\u008c\3\u008c\3\u008c"+
		"\5\u008c\u0c29\n\u008c\3\u008c\3\u008c\5\u008c\u0c2d\n\u008c\3\u008c\3"+
		"\u008c\5\u008c\u0c31\n\u008c\3\u008c\3\u008c\5\u008c\u0c35\n\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0c39\n\u008c\3\u008c\3\u008c\5\u008c\u0c3d\n\u008c\3"+
		"\u008c\3\u008c\5\u008c\u0c41\n\u008c\3\u008c\5\u008c\u0c44\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0c4d\n\u008d"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\13\u039d\u03de"+
		"\u03e6\u03f7\u0405\u040e\u0417\u0420\u0427\6V\u00cc\u00d0\u00d2\u0091"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\2\66\4\2EE\u00ba\u00ba\4\2\"\"\u00c9\u00c9\4\2DD\u009c\u009c\4"+
		"\2iivv\3\2/\60\4\2\u00eb\u00eb\u010b\u010b\4\2\21\21\'\'\7\2,,88[[hh\u0093"+
		"\u0093\3\2IJ\4\2[[hh\4\2\u00a0\u00a0\u0126\u0126\5\2\16\16QQ\u00ea\u00ea"+
		"\4\2\16\16\u008d\u008d\4\2\u008f\u008f\u0126\u0126\5\2CC\u009b\u009b\u00d4"+
		"\u00d4\6\2VV}}\u00dc\u00dc\u0101\u0101\5\2VV\u00dc\u00dc\u0101\u0101\4"+
		"\2\31\31II\4\2cc\u0084\u0084\4\2;;\u00d0\u00d0\4\2\20\20NN\4\2\u012a\u012a"+
		"\u012c\u012c\3\2\u0089\u008a\5\2\20\20\25\25\u00e0\u00e0\5\2^^\u00fa\u00fa"+
		"\u0103\u0103\4\2\u011c\u011d\u0121\u0121\4\2PP\u011e\u0120\4\2\u011c\u011d"+
		"\u0124\u0124\4\2==?@\4\2$$\u00fc\u00fc\4\2tt\u00c8\u00c8\3\2\u00e8\u00e9"+
		"\4\2\6\6ii\4\2\6\6ee\5\2\35\35\u0087\u0087\u00f5\u00f5\3\2\u0114\u011b"+
		"\4\2PP\u011c\u0125\6\2\23\23vv\u009f\u009f\u00a7\u00a7\4\2^^\u00fa\u00fa"+
		"\3\2\u011c\u011d\5\2\u0126\u0126\u012a\u012a\u012c\u012c\4\2\u0099\u0099"+
		"\u0111\u0111\6\2AArr\u0098\u0098\u00d3\u00d3\5\2rr\u0098\u0098\u00d3\u00d3"+
		"\4\2OO\u00b0\u00b0\4\2\u00a8\u00a8\u00e1\u00e1\4\2dd\u00b7\u00b7\3\2\u012b"+
		"\u012c\4\2QQ\u00db\u00db\63\2\16\17\21\22\24\24\26\27\31\32\34\34\36\""+
		"%\'),..\60\6688;<AMOQUUW]``bdghkmppruwxz|~~\u0081\u0081\u0083\u0084\u0086"+
		"\u0086\u0089\u009c\u009e\u009e\u00a1\u00a2\u00a5\u00a6\u00a9\u00a9\u00ab"+
		"\u00ac\u00ae\u00b7\u00b9\u00c1\u00c3\u00ca\u00cc\u00d4\u00d6\u00d9\u00db"+
		"\u00df\u00e1\u00ea\u00ec\u00f0\u00f4\u00f4\u00f6\u0100\u0104\u0107\u010a"+
		"\u010c\u010f\u010f\u0111\u0113\22\2\24\24::VVjjyy}}\u0082\u0082\u0085"+
		"\u0085\u0088\u0088\u009d\u009d\u00a3\u00a3\u00cb\u00cb\u00d6\u00d6\u00dc"+
		"\u00dc\u0101\u0101\u0109\u0109\23\2\16\23\259;UWikxz|~\u0081\u0083\u0084"+
		"\u0086\u0087\u0089\u009c\u009e\u00a2\u00a4\u00ca\u00cc\u00d5\u00d7\u00db"+
		"\u00dd\u0100\u0102\u0108\u010a\u0113\2\u0e43\2\u0120\3\2\2\2\4\u0129\3"+
		"\2\2\2\6\u012c\3\2\2\2\b\u012f\3\2\2\2\n\u0132\3\2\2\2\f\u0135\3\2\2\2"+
		"\16\u0138\3\2\2\2\20\u042a\3\2\2\2\22\u042c\3\2\2\2\24\u042e\3\2\2\2\26"+
		"\u04d8\3\2\2\2\30\u04da\3\2\2\2\32\u04eb\3\2\2\2\34\u04f1\3\2\2\2\36\u04fd"+
		"\3\2\2\2 \u050a\3\2\2\2\"\u050d\3\2\2\2$\u0511\3\2\2\2&\u0553\3\2\2\2"+
		"(\u0555\3\2\2\2*\u0559\3\2\2\2,\u0565\3\2\2\2.\u056a\3\2\2\2\60\u0571"+
		"\3\2\2\2\62\u0573\3\2\2\2\64\u057b\3\2\2\2\66\u0584\3\2\2\28\u058f\3\2"+
		"\2\2:\u05a1\3\2\2\2<\u05a4\3\2\2\2>\u05af\3\2\2\2@\u05bf\3\2\2\2B\u05c5"+
		"\3\2\2\2D\u05c7\3\2\2\2F\u05d2\3\2\2\2H\u05e3\3\2\2\2J\u05ea\3\2\2\2L"+
		"\u05ec\3\2\2\2N\u05f2\3\2\2\2P\u0627\3\2\2\2R\u0633\3\2\2\2T\u0663\3\2"+
		"\2\2V\u0666\3\2\2\2X\u068c\3\2\2\2Z\u068e\3\2\2\2\\\u0696\3\2\2\2^\u06b7"+
		"\3\2\2\2`\u06e5\3\2\2\2b\u06fa\3\2\2\2d\u071a\3\2\2\2f\u0726\3\2\2\2h"+
		"\u0729\3\2\2\2j\u0732\3\2\2\2l\u0743\3\2\2\2n\u0757\3\2\2\2p\u0759\3\2"+
		"\2\2r\u0761\3\2\2\2t\u0765\3\2\2\2v\u0768\3\2\2\2x\u076b\3\2\2\2z\u0785"+
		"\3\2\2\2|\u0787\3\2\2\2~\u07c0\3\2\2\2\u0080\u07c4\3\2\2\2\u0082\u07df"+
		"\3\2\2\2\u0084\u07e3\3\2\2\2\u0086\u07f2\3\2\2\2\u0088\u07f4\3\2\2\2\u008a"+
		"\u0812\3\2\2\2\u008c\u0814\3\2\2\2\u008e\u081b\3\2\2\2\u0090\u083b\3\2"+
		"\2\2\u0092\u083e\3\2\2\2\u0094\u0858\3\2\2\2\u0096\u0872\3\2\2\2\u0098"+
		"\u0878\3\2\2\2\u009a\u087a\3\2\2\2\u009c\u0899\3\2\2\2\u009e\u089b\3\2"+
		"\2\2\u00a0\u089f\3\2\2\2\u00a2\u08a7\3\2\2\2\u00a4\u08b2\3\2\2\2\u00a6"+
		"\u08b6\3\2\2\2\u00a8\u08c1\3\2\2\2\u00aa\u08dd\3\2\2\2\u00ac\u08df\3\2"+
		"\2\2\u00ae\u08ea\3\2\2\2\u00b0\u0900\3\2\2\2\u00b2\u0933\3\2\2\2\u00b4"+
		"\u0935\3\2\2\2\u00b6\u093d\3\2\2\2\u00b8\u0948\3\2\2\2\u00ba\u094f\3\2"+
		"\2\2\u00bc\u0953\3\2\2\2\u00be\u095d\3\2\2\2\u00c0\u0965\3\2\2\2\u00c2"+
		"\u0972\3\2\2\2\u00c4\u0981\3\2\2\2\u00c6\u0985\3\2\2\2\u00c8\u0987\3\2"+
		"\2\2\u00ca\u0989\3\2\2\2\u00cc\u099d\3\2\2\2\u00ce\u09fc\3\2\2\2\u00d0"+
		"\u0a02\3\2\2\2\u00d2\u0ad8\3\2\2\2\u00d4\u0af3\3\2\2\2\u00d6\u0af5\3\2"+
		"\2\2\u00d8\u0af7\3\2\2\2\u00da\u0af9\3\2\2\2\u00dc\u0afb\3\2\2\2\u00de"+
		"\u0afd\3\2\2\2\u00e0\u0b02\3\2\2\2\u00e2\u0b09\3\2\2\2\u00e4\u0b0d\3\2"+
		"\2\2\u00e6\u0b12\3\2\2\2\u00e8\u0b18\3\2\2\2\u00ea\u0b1f\3\2\2\2\u00ec"+
		"\u0b4f\3\2\2\2\u00ee\u0b51\3\2\2\2\u00f0\u0b59\3\2\2\2\u00f2\u0b65\3\2"+
		"\2\2\u00f4\u0b6d\3\2\2\2\u00f6\u0b76\3\2\2\2\u00f8\u0b7e\3\2\2\2\u00fa"+
		"\u0b8a\3\2\2\2\u00fc\u0b8f\3\2\2\2\u00fe\u0b98\3\2\2\2\u0100\u0bca\3\2"+
		"\2\2\u0102\u0bdc\3\2\2\2\u0104\u0be5\3\2\2\2\u0106\u0be7\3\2\2\2\u0108"+
		"\u0bf3\3\2\2\2\u010a\u0bf5\3\2\2\2\u010c\u0bfd\3\2\2\2\u010e\u0c07\3\2"+
		"\2\2\u0110\u0c0c\3\2\2\2\u0112\u0c14\3\2\2\2\u0114\u0c16\3\2\2\2\u0116"+
		"\u0c43\3\2\2\2\u0118\u0c4c\3\2\2\2\u011a\u0c4e\3\2\2\2\u011c\u0c50\3\2"+
		"\2\2\u011e\u0c52\3\2\2\2\u0120\u0124\5\20\t\2\u0121\u0123\7\3\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\2\2\3\u0128"+
		"\3\3\2\2\2\u0129\u012a\5\u00bc_\2\u012a\u012b\7\2\2\3\u012b\5\3\2\2\2"+
		"\u012c\u012d\5\u00b8]\2\u012d\u012e\7\2\2\3\u012e\7\3\2\2\2\u012f\u0130"+
		"\5\u00b6\\\2\u0130\u0131\7\2\2\3\u0131\t\3\2\2\2\u0132\u0133\5\u00ba^"+
		"\2\u0133\u0134\7\2\2\3\u0134\13\3\2\2\2\u0135\u0136\5\u00ecw\2\u0136\u0137"+
		"\7\2\2\3\u0137\r\3\2\2\2\u0138\u0139\5\u00f2z\2\u0139\u013a\7\2\2\3\u013a"+
		"\17\3\2\2\2\u013b\u042b\5$\23\2\u013c\u013e\5\64\33\2\u013d\u013c\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u042b\5P)\2\u0140\u0141"+
		"\7\u0107\2\2\u0141\u042b\5\u00b6\\\2\u0142\u0143\7\u0107\2\2\u0143\u0144"+
		"\7\u009b\2\2\u0144\u042b\5\u00b6\\\2\u0145\u0146\7\u00db\2\2\u0146\u0149"+
		"\7%\2\2\u0147\u014a\5\u0110\u0089\2\u0148\u014a\7\u0126\2\2\u0149\u0147"+
		"\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u042b\3\2\2\2\u014b\u014c\79\2\2\u014c"+
		"\u0150\5.\30\2\u014d\u014e\7s\2\2\u014e\u014f\7\u009f\2\2\u014f\u0151"+
		"\7X\2\2\u0150\u014d\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u015a\5\u00b6\\\2\u0153\u0159\5\"\22\2\u0154\u0159\5 \21\2\u0155\u0156"+
		"\7\u0110\2\2\u0156\u0157\t\2\2\2\u0157\u0159\5<\37\2\u0158\u0153\3\2\2"+
		"\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u042b\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015e\7\21\2\2\u015e\u015f\5.\30\2\u015f\u0160\5\u00b6\\\2\u0160\u0161"+
		"\7\u00db\2\2\u0161\u0162\t\2\2\2\u0162\u0163\5<\37\2\u0163\u042b\3\2\2"+
		"\2\u0164\u0165\7\21\2\2\u0165\u0166\5.\30\2\u0166\u0167\5\u00b6\\\2\u0167"+
		"\u0168\7\u00db\2\2\u0168\u0169\5 \21\2\u0169\u042b\3\2\2\2\u016a\u016b"+
		"\7Q\2\2\u016b\u016e\5.\30\2\u016c\u016d\7s\2\2\u016d\u016f\7X\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\5\u00b6"+
		"\\\2\u0171\u0173\t\3\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u042b\3\2\2\2\u0174\u0175\7\u00de\2\2\u0175\u0178\t\4\2\2\u0176\u0177"+
		"\t\5\2\2\u0177\u0179\5\u00b6\\\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2"+
		"\2\u0179\u017e\3\2\2\2\u017a\u017c\7\u0089\2\2\u017b\u017a\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\7\u0126\2\2\u017e\u017b"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u042b\3\2\2\2\u0180\u0185\5\30\r\2"+
		"\u0181\u0182\7\4\2\2\u0182\u0183\5\u00f2z\2\u0183\u0184\7\5\2\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0181\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2"+
		"\2\2\u0187\u0189\58\35\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018f\5:\36\2\u018b\u018d\7\30\2\2\u018c\u018b\3"+
		"\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\5$\23\2\u018f"+
		"\u018c\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u042b\3\2\2\2\u0191\u0192\79"+
		"\2\2\u0192\u0196\7\u00eb\2\2\u0193\u0194\7s\2\2\u0194\u0195\7\u009f\2"+
		"\2\u0195\u0197\7X\2\2\u0196\u0193\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0199\5\u00b8]\2\u0199\u019a\7\u0089\2\2\u019a\u01a3\5"+
		"\u00b8]\2\u019b\u01a2\58\35\2\u019c\u01a2\5\u00b2Z\2\u019d\u01a2\5H%\2"+
		"\u019e\u01a2\5 \21\2\u019f\u01a0\7\u00ee\2\2\u01a0\u01a2\5<\37\2\u01a1"+
		"\u019b\3\2\2\2\u01a1\u019c\3\2\2\2\u01a1\u019d\3\2\2\2\u01a1\u019e\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u042b\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01ab\5\32"+
		"\16\2\u01a7\u01a8\7\4\2\2\u01a8\u01a9\5\u00f2z\2\u01a9\u01aa\7\5\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2"+
		"\2\2\u01ad\u01af\58\35\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b5\5:\36\2\u01b1\u01b3\7\30\2\2\u01b2\u01b1\3"+
		"\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\5$\23\2\u01b5"+
		"\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u042b\3\2\2\2\u01b7\u01b8\7\22"+
		"\2\2\u01b8\u01b9\7\u00eb\2\2\u01b9\u01bb\5\u00b6\\\2\u01ba\u01bc\5*\26"+
		"\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be"+
		"\7\65\2\2\u01be\u01c6\7\u00e4\2\2\u01bf\u01c7\5\u0110\u0089\2\u01c0\u01c1"+
		"\7e\2\2\u01c1\u01c2\7\60\2\2\u01c2\u01c7\5\u00a0Q\2\u01c3\u01c4\7e\2\2"+
		"\u01c4\u01c5\7\20\2\2\u01c5\u01c7\7\60\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c0"+
		"\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u042b\3\2\2\2\u01c8"+
		"\u01c9\7\22\2\2\u01c9\u01cc\7\u00ec\2\2\u01ca\u01cb\t\5\2\2\u01cb\u01cd"+
		"\5\u00b6\\\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2"+
		"\2\u01ce\u01cf\7\65\2\2\u01cf\u01d1\7\u00e4\2\2\u01d0\u01d2\5\u0110\u0089"+
		"\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u042b\3\2\2\2\u01d3\u01d4"+
		"\7\21\2\2\u01d4\u01d5\7\u00eb\2\2\u01d5\u01d6\5\u00b6\\\2\u01d6\u01d7"+
		"\7\16\2\2\u01d7\u01d8\t\6\2\2\u01d8\u01d9\5\u00eex\2\u01d9\u042b\3\2\2"+
		"\2\u01da\u01db\7\21\2\2\u01db\u01dc\7\u00eb\2\2\u01dc\u01dd\5\u00b6\\"+
		"\2\u01dd\u01de\7\16\2\2\u01de\u01df\t\6\2\2\u01df\u01e0\7\4\2\2\u01e0"+
		"\u01e1\5\u00eex\2\u01e1\u01e2\7\5\2\2\u01e2\u042b\3\2\2\2\u01e3\u01e4"+
		"\7\21\2\2\u01e4\u01e5\7\u00eb\2\2\u01e5\u01e6\5\u00b6\\\2\u01e6\u01e7"+
		"\7\u00c4\2\2\u01e7\u01e8\7/\2\2\u01e8\u01e9\5\u00b6\\\2\u01e9\u01ea\7"+
		"\u00f3\2\2\u01ea\u01eb\5\u010c\u0087\2\u01eb\u042b\3\2\2\2\u01ec\u01ed"+
		"\7\21\2\2\u01ed\u01ee\7\u00eb\2\2\u01ee\u01ef\5\u00b6\\\2\u01ef\u01f0"+
		"\7Q\2\2\u01f0\u01f1\t\6\2\2\u01f1\u01f2\7\4\2\2\u01f2\u01f3\5\u00b4[\2"+
		"\u01f3\u01f4\7\5\2\2\u01f4\u042b\3\2\2\2\u01f5\u01f6\7\21\2\2\u01f6\u01f7"+
		"\7\u00eb\2\2\u01f7\u01f8\5\u00b6\\\2\u01f8\u01f9\7Q\2\2\u01f9\u01fa\t"+
		"\6\2\2\u01fa\u01fb\5\u00b4[\2\u01fb\u042b\3\2\2\2\u01fc\u01fd\7\21\2\2"+
		"\u01fd\u01fe\t\7\2\2\u01fe\u01ff\5\u00b6\\\2\u01ff\u0200\7\u00c4\2\2\u0200"+
		"\u0201\7\u00f3\2\2\u0201\u0202\5\u00b6\\\2\u0202\u042b\3\2\2\2\u0203\u0204"+
		"\7\21\2\2\u0204\u0205\t\7\2\2\u0205\u0206\5\u00b6\\\2\u0206\u0207\7\u00db"+
		"\2\2\u0207\u0208\7\u00ee\2\2\u0208\u0209\5<\37\2\u0209\u042b\3\2\2\2\u020a"+
		"\u020b\7\21\2\2\u020b\u020c\t\7\2\2\u020c\u020d\5\u00b6\\\2\u020d\u020e"+
		"\7\u0105\2\2\u020e\u0211\7\u00ee\2\2\u020f\u0210\7s\2\2\u0210\u0212\7"+
		"X\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\5<\37\2\u0214\u042b\3\2\2\2\u0215\u0216\7\21\2\2\u0216\u0217\7"+
		"\u00eb\2\2\u0217\u0218\5\u00b6\\\2\u0218\u021a\t\b\2\2\u0219\u021b\7/"+
		"\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\5\u00b6\\\2\u021d\u021f\5\u0118\u008d\2\u021e\u021d\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u042b\3\2\2\2\u0220\u0221\7\21\2\2\u0221\u0222\7"+
		"\u00eb\2\2\u0222\u0224\5\u00b6\\\2\u0223\u0225\5*\26\2\u0224\u0223\3\2"+
		"\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7\'\2\2\u0227"+
		"\u0229\7/\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022b\5\u00b6\\\2\u022b\u022d\5\u00f4{\2\u022c\u022e\5\u00ea"+
		"v\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u042b\3\2\2\2\u022f"+
		"\u0230\7\21\2\2\u0230\u0231\7\u00eb\2\2\u0231\u0233\5\u00b6\\\2\u0232"+
		"\u0234\5*\26\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0236\7\u00c6\2\2\u0236\u0237\7\60\2\2\u0237\u0238\7\4\2\2"+
		"\u0238\u0239\5\u00eex\2\u0239\u023a\7\5\2\2\u023a\u042b\3\2\2\2\u023b"+
		"\u023c\7\21\2\2\u023c\u023d\7\u00eb\2\2\u023d\u023f\5\u00b6\\\2\u023e"+
		"\u0240\5*\26\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0242\7\u00db\2\2\u0242\u0243\7\u00d8\2\2\u0243\u0247\7\u0126"+
		"\2\2\u0244\u0245\7\u0110\2\2\u0245\u0246\7\u00d9\2\2\u0246\u0248\5<\37"+
		"\2\u0247\u0244\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u042b\3\2\2\2\u0249\u024a"+
		"\7\21\2\2\u024a\u024b\7\u00eb\2\2\u024b\u024d\5\u00b6\\\2\u024c\u024e"+
		"\5*\26\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0250\7\u00db\2\2\u0250\u0251\7\u00d9\2\2\u0251\u0252\5<\37\2\u0252\u042b"+
		"\3\2\2\2\u0253\u0254\7\21\2\2\u0254\u0255\t\7\2\2\u0255\u0256\5\u00b6"+
		"\\\2\u0256\u025a\7\16\2\2\u0257\u0258\7s\2\2\u0258\u0259\7\u009f\2\2\u0259"+
		"\u025b\7X\2\2\u025a\u0257\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2"+
		"\2\2\u025c\u025e\5(\25\2\u025d\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u042b\3\2\2\2\u0261\u0262\7\21"+
		"\2\2\u0262\u0263\7\u00eb\2\2\u0263\u0264\5\u00b6\\\2\u0264\u0265\5*\26"+
		"\2\u0265\u0266\7\u00c4\2\2\u0266\u0267\7\u00f3\2\2\u0267\u0268\5*\26\2"+
		"\u0268\u042b\3\2\2\2\u0269\u026a\7\21\2\2\u026a\u026b\t\7\2\2\u026b\u026c"+
		"\5\u00b6\\\2\u026c\u026f\7Q\2\2\u026d\u026e\7s\2\2\u026e\u0270\7X\2\2"+
		"\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0276"+
		"\5*\26\2\u0272\u0273\7\6\2\2\u0273\u0275\5*\26\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0279\u027b\7\u00bb\2\2\u027a\u0279\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u042b\3\2\2\2\u027c\u027d\7\21\2\2\u027d\u027e\7"+
		"\u00eb\2\2\u027e\u0280\5\u00b6\\\2\u027f\u0281\5*\26\2\u0280\u027f\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\7\u00db\2\2\u0283"+
		"\u0284\5 \21\2\u0284\u042b\3\2\2\2\u0285\u0286\7\21\2\2\u0286\u0287\7"+
		"\u00eb\2\2\u0287\u0288\5\u00b6\\\2\u0288\u0289\7\u00c0\2\2\u0289\u028a"+
		"\7\u00b2\2\2\u028a\u042b\3\2\2\2\u028b\u028c\7Q\2\2\u028c\u028f\7\u00eb"+
		"\2\2\u028d\u028e\7s\2\2\u028e\u0290\7X\2\2\u028f\u028d\3\2\2\2\u028f\u0290"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\5\u00b6\\\2\u0292\u0294\7\u00bb"+
		"\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u042b\3\2\2\2\u0295"+
		"\u0296\7Q\2\2\u0296\u0299\7\u010b\2\2\u0297\u0298\7s\2\2\u0298\u029a\7"+
		"X\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u042b\5\u00b6\\\2\u029c\u029f\79\2\2\u029d\u029e\7\u00a7\2\2\u029e\u02a0"+
		"\7\u00c6\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a5\3\2\2"+
		"\2\u02a1\u02a3\7m\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a6\7\u00ef\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a6\3\2\2"+
		"\2\u02a6\u02a7\3\2\2\2\u02a7\u02ab\7\u010b\2\2\u02a8\u02a9\7s\2\2\u02a9"+
		"\u02aa\7\u009f\2\2\u02aa\u02ac\7X\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\5\u00b6\\\2\u02ae\u02b0\5\u00a6"+
		"T\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b9\3\2\2\2\u02b1"+
		"\u02b8\5\"\22\2\u02b2\u02b3\7\u00b1\2\2\u02b3\u02b4\7\u00a3\2\2\u02b4"+
		"\u02b8\5\u009eP\2\u02b5\u02b6\7\u00ee\2\2\u02b6\u02b8\5<\37\2\u02b7\u02b1"+
		"\3\2\2\2\u02b7\u02b2\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bc\u02bd\7\30\2\2\u02bd\u02be\5$\23\2\u02be\u042b\3\2\2\2\u02bf"+
		"\u02c2\79\2\2\u02c0\u02c1\7\u00a7\2\2\u02c1\u02c3\7\u00c6\2\2\u02c2\u02c0"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c6\7m\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7\u00ef"+
		"\2\2\u02c8\u02c9\7\u010b\2\2\u02c9\u02ce\5\u00b8]\2\u02ca\u02cb\7\4\2"+
		"\2\u02cb\u02cc\5\u00f2z\2\u02cc\u02cd\7\5\2\2\u02cd\u02cf\3\2\2\2\u02ce"+
		"\u02ca\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\58"+
		"\35\2\u02d1\u02d2\7\u00a6\2\2\u02d2\u02d4\5<\37\2\u02d3\u02d1\3\2\2\2"+
		"\u02d3\u02d4\3\2\2\2\u02d4\u042b\3\2\2\2\u02d5\u02d6\7\21\2\2\u02d6\u02d7"+
		"\7\u010b\2\2\u02d7\u02d9\5\u00b6\\\2\u02d8\u02da\7\30\2\2\u02d9\u02d8"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\5$\23\2\u02dc"+
		"\u042b\3\2\2\2\u02dd\u02e0\79\2\2\u02de\u02df\7\u00a7\2\2\u02df\u02e1"+
		"\7\u00c6\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2\2"+
		"\2\u02e2\u02e4\7\u00ef\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e9\7k\2\2\u02e6\u02e7\7s\2\2\u02e7\u02e8\7\u009f"+
		"\2\2\u02e8\u02ea\7X\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ec\5\u00b6\\\2\u02ec\u02ed\7\30\2\2\u02ed\u02f7"+
		"\7\u0126\2\2\u02ee\u02ef\7\u0109\2\2\u02ef\u02f4\5N(\2\u02f0\u02f1\7\6"+
		"\2\2\u02f1\u02f3\5N(\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02ee\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u042b\3\2\2\2\u02f9\u02fb\7Q"+
		"\2\2\u02fa\u02fc\7\u00ef\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"\u02fd\3\2\2\2\u02fd\u0300\7k\2\2\u02fe\u02ff\7s\2\2\u02ff\u0301\7X\2"+
		"\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u042b"+
		"\5\u00b6\\\2\u0303\u0305\7Y\2\2\u0304\u0306\t\t\2\2\u0305\u0304\3\2\2"+
		"\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u042b\5\20\t\2\u0308"+
		"\u0309\7\u00de\2\2\u0309\u030c\7\u00ec\2\2\u030a\u030b\t\5\2\2\u030b\u030d"+
		"\5\u00b6\\\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0312\3\2\2"+
		"\2\u030e\u0310\7\u0089\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0313\7\u0126\2\2\u0312\u030f\3\2\2\2\u0312\u0313"+
		"\3\2\2\2\u0313\u042b\3\2\2\2\u0314\u0315\7\u00de\2\2\u0315\u0316\7\u00eb"+
		"\2\2\u0316\u0319\7[\2\2\u0317\u0318\t\5\2\2\u0318\u031a\5\u00b6\\\2\u0319"+
		"\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\7\u0089"+
		"\2\2\u031c\u031e\7\u0126\2\2\u031d\u031f\5*\26\2\u031e\u031d\3\2\2\2\u031e"+
		"\u031f\3\2\2\2\u031f\u042b\3\2\2\2\u0320\u0321\7\u00de\2\2\u0321\u0322"+
		"\7\u00ee\2\2\u0322\u0327\5\u00b6\\\2\u0323\u0324\7\4\2\2\u0324\u0325\5"+
		"@!\2\u0325\u0326\7\5\2\2\u0326\u0328\3\2\2\2\u0327\u0323\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u042b\3\2\2\2\u0329\u032a\7\u00de\2\2\u032a\u032b"+
		"\7\60\2\2\u032b\u032c\t\5\2\2\u032c\u032f\5\u00b6\\\2\u032d\u032e\t\5"+
		"\2\2\u032e\u0330\5\u00b6\\\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u042b\3\2\2\2\u0331\u0332\7\u00de\2\2\u0332\u0335\7\u010c\2\2\u0333\u0334"+
		"\t\5\2\2\u0334\u0336\5\u00b6\\\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2"+
		"\2\u0336\u033b\3\2\2\2\u0337\u0339\7\u0089\2\2\u0338\u0337\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\7\u0126\2\2\u033b\u0338"+
		"\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u042b\3\2\2\2\u033d\u033e\7\u00de\2"+
		"\2\u033e\u033f\7\u00b2\2\2\u033f\u0341\5\u00b6\\\2\u0340\u0342\5*\26\2"+
		"\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u042b\3\2\2\2\u0343\u0345"+
		"\7\u00de\2\2\u0344\u0346\5\u0110\u0089\2\u0345\u0344\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034f\7l\2\2\u0348\u034a\7\u0089\2"+
		"\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u034e"+
		"\5\u00b6\\\2\u034c\u034e\7\u0126\2\2\u034d\u034b\3\2\2\2\u034d\u034c\3"+
		"\2\2\2\u034e\u0350\3\2\2\2\u034f\u0349\3\2\2\2\u034f\u0350\3\2\2\2\u0350"+
		"\u042b\3\2\2\2\u0351\u0352\7\u00de\2\2\u0352\u0353\79\2\2\u0353\u0354"+
		"\7\u00eb\2\2\u0354\u0357\5\u00b6\\\2\u0355\u0356\7\30\2\2\u0356\u0358"+
		"\7\u00d8\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u042b\3\2\2"+
		"\2\u0359\u035a\7\u00de\2\2\u035a\u035b\7<\2\2\u035b\u042b\7\u009b\2\2"+
		"\u035c\u035d\7\u00de\2\2\u035d\u0362\7&\2\2\u035e\u0360\7\u0089\2\2\u035f"+
		"\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\7\u0126"+
		"\2\2\u0362\u035f\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u042b\3\2\2\2\u0364"+
		"\u0365\t\n\2\2\u0365\u0367\7k\2\2\u0366\u0368\7[\2\2\u0367\u0366\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u042b\5\60\31\2\u036a"+
		"\u036b\t\n\2\2\u036b\u036d\5.\30\2\u036c\u036e\7[\2\2\u036d\u036c\3\2"+
		"\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\5\u00b6\\\2\u0370"+
		"\u042b\3\2\2\2\u0371\u0373\t\n\2\2\u0372\u0374\7\u00eb\2\2\u0373\u0372"+
		"\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0377\t\13\2\2"+
		"\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a"+
		"\5\u00b6\\\2\u0379\u037b\5*\26\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2"+
		"\2\u037b\u037d\3\2\2\2\u037c\u037e\5\62\32\2\u037d\u037c\3\2\2\2\u037d"+
		"\u037e\3\2\2\2\u037e\u042b\3\2\2\2\u037f\u0381\t\n\2\2\u0380\u0382\7\u00bc"+
		"\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u042b\5$\23\2\u0384\u0385\7\61\2\2\u0385\u0386\7\u00a3\2\2\u0386\u0387"+
		"\5.\30\2\u0387\u0388\5\u00b6\\\2\u0388\u0389\7\u0080\2\2\u0389\u038a\t"+
		"\f\2\2\u038a\u042b\3\2\2\2\u038b\u038c\7\61\2\2\u038c\u038d\7\u00a3\2"+
		"\2\u038d\u038e\7\u00eb\2\2\u038e\u038f\5\u00b6\\\2\u038f\u0390\7\u0080"+
		"\2\2\u0390\u0391\t\f\2\2\u0391\u042b\3\2\2\2\u0392\u0393\7\u00c3\2\2\u0393"+
		"\u0394\7\u00eb\2\2\u0394\u042b\5\u00b6\\\2\u0395\u0396\7\u00c3\2\2\u0396"+
		"\u0397\7k\2\2\u0397\u042b\5\u00b6\\\2\u0398\u03a0\7\u00c3\2\2\u0399\u03a1"+
		"\7\u0126\2\2\u039a\u039c\13\2\2\2\u039b\u039a\3\2\2\2\u039c\u039f\3\2"+
		"\2\2\u039d\u039e\3\2\2\2\u039d\u039b\3\2\2\2\u039e\u03a1\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u03a0\u0399\3\2\2\2\u03a0\u039d\3\2\2\2\u03a1\u042b\3\2"+
		"\2\2\u03a2\u03a4\7!\2\2\u03a3\u03a5\7\u0086\2\2\u03a4\u03a3\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\7\u00eb\2\2\u03a7\u03aa"+
		"\5\u00b6\\\2\u03a8\u03a9\7\u00a6\2\2\u03a9\u03ab\5<\37\2\u03aa\u03a8\3"+
		"\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03b0\3\2\2\2\u03ac\u03ae\7\30\2\2\u03ad"+
		"\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\5$"+
		"\23\2\u03b0\u03ad\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u042b\3\2\2\2\u03b2"+
		"\u03b3\7\u0100\2\2\u03b3\u03b6\7\u00eb\2\2\u03b4\u03b5\7s\2\2\u03b5\u03b7"+
		"\7X\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u042b\5\u00b6\\\2\u03b9\u03ba\7)\2\2\u03ba\u042b\7!\2\2\u03bb\u03bc\7"+
		"\u008e\2\2\u03bc\u03be\7B\2\2\u03bd\u03bf\7\u008f\2\2\u03be\u03bd\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\7z\2\2\u03c1"+
		"\u03c3\7\u0126\2\2\u03c2\u03c4\7\u00af\2\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4"+
		"\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\7\177\2\2\u03c6\u03c7\7\u00eb"+
		"\2\2\u03c7\u03c9\5\u00b6\\\2\u03c8\u03ca\5*\26\2\u03c9\u03c8\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u042b\3\2\2\2\u03cb\u03cc\7\u00fb\2\2\u03cc\u03cd"+
		"\7\u00eb\2\2\u03cd\u03cf\5\u00b6\\\2\u03ce\u03d0\5*\26\2\u03cf\u03ce\3"+
		"\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u042b\3\2\2\2\u03d1\u03d2\7\u009a\2\2"+
		"\u03d2\u03d3\7\u00c5\2\2\u03d3\u03d4\7\u00eb\2\2\u03d4\u03d7\5\u00b6\\"+
		"\2\u03d5\u03d6\t\r\2\2\u03d6\u03d8\7\u00b2\2\2\u03d7\u03d5\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u042b\3\2\2\2\u03d9\u03da\t\16\2\2\u03da\u03de\5"+
		"\u0110\u0089\2\u03db\u03dd\13\2\2\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3"+
		"\2\2\2\u03de\u03df\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u042b\3\2\2\2\u03e0"+
		"\u03de\3\2\2\2\u03e1\u03e2\7\u00db\2\2\u03e2\u03e6\7\u00cd\2\2\u03e3\u03e5"+
		"\13\2\2\2\u03e4\u03e3\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e7\3\2\2\2"+
		"\u03e6\u03e4\3\2\2\2\u03e7\u042b\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ea"+
		"\7\u00db\2\2\u03ea\u03eb\7\u00f2\2\2\u03eb\u03ec\7\u0112\2\2\u03ec\u042b"+
		"\5\u00dep\2\u03ed\u03ee\7\u00db\2\2\u03ee\u03ef\7\u00f2\2\2\u03ef\u03f0"+
		"\7\u0112\2\2\u03f0\u042b\t\17\2\2\u03f1\u03f2\7\u00db\2\2\u03f2\u03f3"+
		"\7\u00f2\2\2\u03f3\u03f7\7\u0112\2\2\u03f4\u03f6\13\2\2\2\u03f5\u03f4"+
		"\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8"+
		"\u042b\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\u00db\2\2\u03fb\u03fc"+
		"\5\22\n\2\u03fc\u03fd\7\u0114\2\2\u03fd\u03fe\5\24\13\2\u03fe\u042b\3"+
		"\2\2\2\u03ff\u0400\7\u00db\2\2\u0400\u0408\5\22\n\2\u0401\u0405\7\u0114"+
		"\2\2\u0402\u0404\13\2\2\2\u0403\u0402\3\2\2\2\u0404\u0407\3\2\2\2\u0405"+
		"\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2"+
		"\2\2\u0408\u0401\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u042b\3\2\2\2\u040a"+
		"\u040e\7\u00db\2\2\u040b\u040d\13\2\2\2\u040c\u040b\3\2\2\2\u040d\u0410"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0411\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0411\u0412\7\u0114\2\2\u0412\u042b\5\24\13\2\u0413\u0417"+
		"\7\u00db\2\2\u0414\u0416\13\2\2\2\u0415\u0414\3\2\2\2\u0416\u0419\3\2"+
		"\2\2\u0417\u0418\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u042b\3\2\2\2\u0419"+
		"\u0417\3\2\2\2\u041a\u041b\7\u00c7\2\2\u041b\u042b\5\22\n\2\u041c\u0420"+
		"\7\u00c7\2\2\u041d\u041f\13\2\2\2\u041e\u041d\3\2\2\2\u041f\u0422\3\2"+
		"\2\2\u0420\u0421\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u042b\3\2\2\2\u0422"+
		"\u0420\3\2\2\2\u0423\u0427\5\26\f\2\u0424\u0426\13\2\2\2\u0425\u0424\3"+
		"\2\2\2\u0426\u0429\3\2\2\2\u0427\u0428\3\2\2\2\u0427\u0425\3\2\2\2\u0428"+
		"\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u013b\3\2\2\2\u042a\u013d\3\2"+
		"\2\2\u042a\u0140\3\2\2\2\u042a\u0142\3\2\2\2\u042a\u0145\3\2\2\2\u042a"+
		"\u014b\3\2\2\2\u042a\u015d\3\2\2\2\u042a\u0164\3\2\2\2\u042a\u016a\3\2"+
		"\2\2\u042a\u0174\3\2\2\2\u042a\u0180\3\2\2\2\u042a\u0191\3\2\2\2\u042a"+
		"\u01a6\3\2\2\2\u042a\u01b7\3\2\2\2\u042a\u01c8\3\2\2\2\u042a\u01d3\3\2"+
		"\2\2\u042a\u01da\3\2\2\2\u042a\u01e3\3\2\2\2\u042a\u01ec\3\2\2\2\u042a"+
		"\u01f5\3\2\2\2\u042a\u01fc\3\2\2\2\u042a\u0203\3\2\2\2\u042a\u020a\3\2"+
		"\2\2\u042a\u0215\3\2\2\2\u042a\u0220\3\2\2\2\u042a\u022f\3\2\2\2\u042a"+
		"\u023b\3\2\2\2\u042a\u0249\3\2\2\2\u042a\u0253\3\2\2\2\u042a\u0261\3\2"+
		"\2\2\u042a\u0269\3\2\2\2\u042a\u027c\3\2\2\2\u042a\u0285\3\2\2\2\u042a"+
		"\u028b\3\2\2\2\u042a\u0295\3\2\2\2\u042a\u029c\3\2\2\2\u042a\u02bf\3\2"+
		"\2\2\u042a\u02d5\3\2\2\2\u042a\u02dd\3\2\2\2\u042a\u02f9\3\2\2\2\u042a"+
		"\u0303\3\2\2\2\u042a\u0308\3\2\2\2\u042a\u0314\3\2\2\2\u042a\u0320\3\2"+
		"\2\2\u042a\u0329\3\2\2\2\u042a\u0331\3\2\2\2\u042a\u033d\3\2\2\2\u042a"+
		"\u0343\3\2\2\2\u042a\u0351\3\2\2\2\u042a\u0359\3\2\2\2\u042a\u035c\3\2"+
		"\2\2\u042a\u0364\3\2\2\2\u042a\u036a\3\2\2\2\u042a\u0371\3\2\2\2\u042a"+
		"\u037f\3\2\2\2\u042a\u0384\3\2\2\2\u042a\u038b\3\2\2\2\u042a\u0392\3\2"+
		"\2\2\u042a\u0395\3\2\2\2\u042a\u0398\3\2\2\2\u042a\u03a2\3\2\2\2\u042a"+
		"\u03b2\3\2\2\2\u042a\u03b9\3\2\2\2\u042a\u03bb\3\2\2\2\u042a\u03cb\3\2"+
		"\2\2\u042a\u03d1\3\2\2\2\u042a\u03d9\3\2\2\2\u042a\u03e1\3\2\2\2\u042a"+
		"\u03e9\3\2\2\2\u042a\u03ed\3\2\2\2\u042a\u03f1\3\2\2\2\u042a\u03fa\3\2"+
		"\2\2\u042a\u03ff\3\2\2\2\u042a\u040a\3\2\2\2\u042a\u0413\3\2\2\2\u042a"+
		"\u041a\3\2\2\2\u042a\u041c\3\2\2\2\u042a\u0423\3\2\2\2\u042b\21\3\2\2"+
		"\2\u042c\u042d\5\u0114\u008b\2\u042d\23\3\2\2\2\u042e\u042f\5\u0114\u008b"+
		"\2\u042f\25\3\2\2\2\u0430\u0431\79\2\2\u0431\u04d9\7\u00cd\2\2\u0432\u0433"+
		"\7Q\2\2\u0433\u04d9\7\u00cd\2\2\u0434\u0436\7n\2\2\u0435\u0437\7\u00cd"+
		"\2\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u04d9\3\2\2\2\u0438"+
		"\u043a\7\u00ca\2\2\u0439\u043b\7\u00cd\2\2\u043a\u0439\3\2\2\2\u043a\u043b"+
		"\3\2\2\2\u043b\u04d9\3\2\2\2\u043c\u043d\7\u00de\2\2\u043d\u04d9\7n\2"+
		"\2\u043e\u043f\7\u00de\2\2\u043f\u0441\7\u00cd\2\2\u0440\u0442\7n\2\2"+
		"\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u04d9\3\2\2\2\u0443\u0444"+
		"\7\u00de\2\2\u0444\u04d9\7\u00b9\2\2\u0445\u0446\7\u00de\2\2\u0446\u04d9"+
		"\7\u00ce\2\2\u0447\u0448\7\u00de\2\2\u0448\u0449\7<\2\2\u0449\u04d9\7"+
		"\u00ce\2\2\u044a\u044b\7Z\2\2\u044b\u04d9\7\u00eb\2\2\u044c\u044d\7u\2"+
		"\2\u044d\u04d9\7\u00eb\2\2\u044e\u044f\7\u00de\2\2\u044f\u04d9\7\64\2"+
		"\2\u0450\u0451\7\u00de\2\2\u0451\u0452\79\2\2\u0452\u04d9\7\u00eb\2\2"+
		"\u0453\u0454\7\u00de\2\2\u0454\u04d9\7\u00f7\2\2\u0455\u0456\7\u00de\2"+
		"\2\u0456\u04d9\7x\2\2\u0457\u0458\7\u00de\2\2\u0458\u04d9\7\u0092\2\2"+
		"\u0459\u045a\79\2\2\u045a\u04d9\7w\2\2\u045b\u045c\7Q\2\2\u045c\u04d9"+
		"\7w\2\2\u045d\u045e\7\21\2\2\u045e\u04d9\7w\2\2\u045f\u0460\7\u0091\2"+
		"\2\u0460\u04d9\7\u00eb\2\2\u0461\u0462\7\u0091\2\2\u0462\u04d9\7C\2\2"+
		"\u0463\u0464\7\u0104\2\2\u0464\u04d9\7\u00eb\2\2\u0465\u0466\7\u0104\2"+
		"\2\u0466\u04d9\7C\2\2\u0467\u0468\79\2\2\u0468\u0469\7\u00ef\2\2\u0469"+
		"\u04d9\7\u0094\2\2\u046a\u046b\7Q\2\2\u046b\u046c\7\u00ef\2\2\u046c\u04d9"+
		"\7\u0094\2\2\u046d\u046e\7\21\2\2\u046e\u046f\7\u00eb\2\2\u046f\u0470"+
		"\5\u00b8]\2\u0470\u0471\7\u009f\2\2\u0471\u0472\7+\2\2\u0472\u04d9\3\2"+
		"\2\2\u0473\u0474\7\21\2\2\u0474\u0475\7\u00eb\2\2\u0475\u0476\5\u00b8"+
		"]\2\u0476\u0477\7+\2\2\u0477\u0478\7 \2\2\u0478\u04d9\3\2\2\2\u0479\u047a"+
		"\7\21\2\2\u047a\u047b\7\u00eb\2\2\u047b\u047c\5\u00b8]\2\u047c\u047d\7"+
		"\u009f\2\2\u047d\u047e\7\u00e2\2\2\u047e\u04d9\3\2\2\2\u047f\u0480\7\21"+
		"\2\2\u0480\u0481\7\u00eb\2\2\u0481\u0482\5\u00b8]\2\u0482\u0483\7\u00df"+
		"\2\2\u0483\u0484\7 \2\2\u0484\u04d9\3\2\2\2\u0485\u0486\7\21\2\2\u0486"+
		"\u0487\7\u00eb\2\2\u0487\u0488\5\u00b8]\2\u0488\u0489\7\u009f\2\2\u0489"+
		"\u048a\7\u00df\2\2\u048a\u04d9\3\2\2\2\u048b\u048c\7\21\2\2\u048c\u048d"+
		"\7\u00eb\2\2\u048d\u048e\5\u00b8]\2\u048e\u048f\7\u009f\2\2\u048f\u0490"+
		"\7\u00e5\2\2\u0490\u0491\7\30\2\2\u0491\u0492\7L\2\2\u0492\u04d9\3\2\2"+
		"\2\u0493\u0494\7\21\2\2\u0494\u0495\7\u00eb\2\2\u0495\u0496\5\u00b8]\2"+
		"\u0496\u0497\7\u00db\2\2\u0497\u0498\7\u00df\2\2\u0498\u0499\7\u0090\2"+
		"\2\u0499\u04d9\3\2\2\2\u049a\u049b\7\21\2\2\u049b\u049c\7\u00eb\2\2\u049c"+
		"\u049d\5\u00b8]\2\u049d\u049e\7W\2\2\u049e\u049f\7\u00b0\2\2\u049f\u04d9"+
		"\3\2\2\2\u04a0\u04a1\7\21\2\2\u04a1\u04a2\7\u00eb\2\2\u04a2\u04a3\5\u00b8"+
		"]\2\u04a3\u04a4\7\26\2\2\u04a4\u04a5\7\u00b0\2\2\u04a5\u04d9\3\2\2\2\u04a6"+
		"\u04a7\7\21\2\2\u04a7\u04a8\7\u00eb\2\2\u04a8\u04a9\5\u00b8]\2\u04a9\u04aa"+
		"\7\u00fe\2\2\u04aa\u04ab\7\u00b0\2\2\u04ab\u04d9\3\2\2\2\u04ac\u04ad\7"+
		"\21\2\2\u04ad\u04ae\7\u00eb\2\2\u04ae\u04af\5\u00b8]\2\u04af\u04b0\7\u00f4"+
		"\2\2\u04b0\u04d9\3\2\2\2\u04b1\u04b2\7\21\2\2\u04b2\u04b3\7\u00eb\2\2"+
		"\u04b3\u04b5\5\u00b8]\2\u04b4\u04b6\5*\26\2\u04b5\u04b4\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7\63\2\2\u04b8\u04d9\3"+
		"\2\2\2\u04b9\u04ba\7\21\2\2\u04ba\u04bb\7\u00eb\2\2\u04bb\u04bd\5\u00b8"+
		"]\2\u04bc\u04be\5*\26\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c0\7\66\2\2\u04c0\u04d9\3\2\2\2\u04c1\u04c2\7"+
		"\21\2\2\u04c2\u04c3\7\u00eb\2\2\u04c3\u04c5\5\u00b8]\2\u04c4\u04c6\5*"+
		"\26\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7"+
		"\u04c8\7\u00db\2\2\u04c8\u04c9\7b\2\2\u04c9\u04d9\3\2\2\2\u04ca\u04cb"+
		"\7\21\2\2\u04cb\u04cc\7\u00eb\2\2\u04cc\u04ce\5\u00b8]\2\u04cd\u04cf\5"+
		"*\26\2\u04ce\u04cd\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0"+
		"\u04d1\7\u00c6\2\2\u04d1\u04d2\7\60\2\2\u04d2\u04d9\3\2\2\2\u04d3\u04d4"+
		"\7\u00e3\2\2\u04d4\u04d9\7\u00f6\2\2\u04d5\u04d9\7\62\2\2\u04d6\u04d9"+
		"\7\u00cf\2\2\u04d7\u04d9\7K\2\2\u04d8\u0430\3\2\2\2\u04d8\u0432\3\2\2"+
		"\2\u04d8\u0434\3\2\2\2\u04d8\u0438\3\2\2\2\u04d8\u043c\3\2\2\2\u04d8\u043e"+
		"\3\2\2\2\u04d8\u0443\3\2\2\2\u04d8\u0445\3\2\2\2\u04d8\u0447\3\2\2\2\u04d8"+
		"\u044a\3\2\2\2\u04d8\u044c\3\2\2\2\u04d8\u044e\3\2\2\2\u04d8\u0450\3\2"+
		"\2\2\u04d8\u0453\3\2\2\2\u04d8\u0455\3\2\2\2\u04d8\u0457\3\2\2\2\u04d8"+
		"\u0459\3\2\2\2\u04d8\u045b\3\2\2\2\u04d8\u045d\3\2\2\2\u04d8\u045f\3\2"+
		"\2\2\u04d8\u0461\3\2\2\2\u04d8\u0463\3\2\2\2\u04d8\u0465\3\2\2\2\u04d8"+
		"\u0467\3\2\2\2\u04d8\u046a\3\2\2\2\u04d8\u046d\3\2\2\2\u04d8\u0473\3\2"+
		"\2\2\u04d8\u0479\3\2\2\2\u04d8\u047f\3\2\2\2\u04d8\u0485\3\2\2\2\u04d8"+
		"\u048b\3\2\2\2\u04d8\u0493\3\2\2\2\u04d8\u049a\3\2\2\2\u04d8\u04a0\3\2"+
		"\2\2\u04d8\u04a6\3\2\2\2\u04d8\u04ac\3\2\2\2\u04d8\u04b1\3\2\2\2\u04d8"+
		"\u04b9\3\2\2\2\u04d8\u04c1\3\2\2\2\u04d8\u04ca\3\2\2\2\u04d8\u04d3\3\2"+
		"\2\2\u04d8\u04d5\3\2\2\2\u04d8\u04d6\3\2\2\2\u04d8\u04d7\3\2\2\2\u04d9"+
		"\27\3\2\2\2\u04da\u04dc\79\2\2\u04db\u04dd\7\u00ef\2\2\u04dc\u04db\3\2"+
		"\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04df\3\2\2\2\u04de\u04e0\7\\\2\2\u04df"+
		"\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e5\7\u00eb"+
		"\2\2\u04e2\u04e3\7s\2\2\u04e3\u04e4\7\u009f\2\2\u04e4\u04e6\7X\2\2\u04e5"+
		"\u04e2\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\5\u00b6"+
		"\\\2\u04e8\31\3\2\2\2\u04e9\u04ea\79\2\2\u04ea\u04ec\7\u00a7\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7\u00c6"+
		"\2\2\u04ee\u04ef\7\u00eb\2\2\u04ef\u04f0\5\u00b6\\\2\u04f0\33\3\2\2\2"+
		"\u04f1\u04f2\7+\2\2\u04f2\u04f3\7 \2\2\u04f3\u04f7\5\u009eP\2\u04f4\u04f5"+
		"\7\u00e2\2\2\u04f5\u04f6\7 \2\2\u04f6\u04f8\5\u00a2R\2\u04f7\u04f4\3\2"+
		"\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\7\177\2\2\u04fa"+
		"\u04fb\7\u012a\2\2\u04fb\u04fc\7\37\2\2\u04fc\35\3\2\2\2\u04fd\u04fe\7"+
		"\u00df\2\2\u04fe\u04ff\7 \2\2\u04ff\u0500\5\u009eP\2\u0500\u0503\7\u00a3"+
		"\2\2\u0501\u0504\5D#\2\u0502\u0504\5F$\2\u0503\u0501\3\2\2\2\u0503\u0502"+
		"\3\2\2\2\u0504\u0508\3\2\2\2\u0505\u0506\7\u00e5\2\2\u0506\u0507\7\30"+
		"\2\2\u0507\u0509\7L\2\2\u0508\u0505\3\2\2\2\u0508\u0509\3\2\2\2\u0509"+
		"\37\3\2\2\2\u050a\u050b\7\u0090\2\2\u050b\u050c\7\u0126\2\2\u050c!\3\2"+
		"\2\2\u050d\u050e\7\61\2\2\u050e\u050f\7\u0126\2\2\u050f#\3\2\2\2\u0510"+
		"\u0512\5\64\33\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3"+
		"\2\2\2\u0513\u0514\5V,\2\u0514\u0515\5R*\2\u0515%\3\2\2\2\u0516\u0517"+
		"\7|\2\2\u0517\u0519\7\u00af\2\2\u0518\u051a\7\u00eb\2\2\u0519\u0518\3"+
		"\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u0522\5\u00b6\\\2"+
		"\u051c\u0520\5*\26\2\u051d\u051e\7s\2\2\u051e\u051f\7\u009f\2\2\u051f"+
		"\u0521\7X\2\2\u0520\u051d\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0523\3\2"+
		"\2\2\u0522\u051c\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\3\2\2\2\u0524"+
		"\u0526\5\u009eP\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0554"+
		"\3\2\2\2\u0527\u0528\7|\2\2\u0528\u052a\7\177\2\2\u0529\u052b\7\u00eb"+
		"\2\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u052e\5\u00b6\\\2\u052d\u052f\5*\26\2\u052e\u052d\3\2\2\2\u052e\u052f"+
		"\3\2\2\2\u052f\u0533\3\2\2\2\u0530\u0531\7s\2\2\u0531\u0532\7\u009f\2"+
		"\2\u0532\u0534\7X\2\2\u0533\u0530\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0536"+
		"\3\2\2\2\u0535\u0537\5\u009eP\2\u0536\u0535\3\2\2\2\u0536\u0537\3\2\2"+
		"\2\u0537\u0554\3\2\2\2\u0538\u0539\7|\2\2\u0539\u053b\7\u00af\2\2\u053a"+
		"\u053c\7\u008f\2\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d"+
		"\3\2\2\2\u053d\u053e\7M\2\2\u053e\u0540\7\u0126\2\2\u053f\u0541\5\u00b2"+
		"Z\2\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542"+
		"\u0544\5H%\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0554\3\2\2"+
		"\2\u0545\u0546\7|\2\2\u0546\u0548\7\u00af\2\2\u0547\u0549\7\u008f\2\2"+
		"\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054c"+
		"\7M\2\2\u054b\u054d\7\u0126\2\2\u054c\u054b\3\2\2\2\u054c\u054d\3\2\2"+
		"\2\u054d\u054e\3\2\2\2\u054e\u0551\58\35\2\u054f\u0550\7\u00a6\2\2\u0550"+
		"\u0552\5<\37\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554\3\2"+
		"\2\2\u0553\u0516\3\2\2\2\u0553\u0527\3\2\2\2\u0553\u0538\3\2\2\2\u0553"+
		"\u0545\3\2\2\2\u0554\'\3\2\2\2\u0555\u0557\5*\26\2\u0556\u0558\5 \21\2"+
		"\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558)\3\2\2\2\u0559\u055a\7"+
		"\u00b0\2\2\u055a\u055b\7\4\2\2\u055b\u0560\5,\27\2\u055c\u055d\7\6\2\2"+
		"\u055d\u055f\5,\27\2\u055e\u055c\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u055e"+
		"\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562\u0560\3\2\2\2\u0563"+
		"\u0564\7\5\2\2\u0564+\3\2\2\2\u0565\u0568\5\u0110\u0089\2\u0566\u0567"+
		"\7\u0114\2\2\u0567\u0569\5\u00d4k\2\u0568\u0566\3\2\2\2\u0568\u0569\3"+
		"\2\2\2\u0569-\3\2\2\2\u056a\u056b\t\20\2\2\u056b/\3\2\2\2\u056c\u0572"+
		"\5\u010a\u0086\2\u056d\u0572\7\u0126\2\2\u056e\u0572\5\u00d6l\2\u056f"+
		"\u0572\5\u00d8m\2\u0570\u0572\5\u00dan\2\u0571\u056c\3\2\2\2\u0571\u056d"+
		"\3\2\2\2\u0571\u056e\3\2\2\2\u0571\u056f\3\2\2\2\u0571\u0570\3\2\2\2\u0572"+
		"\61\3\2\2\2\u0573\u0578\5\u0110\u0089\2\u0574\u0575\7\7\2\2\u0575\u0577"+
		"\5\u0110\u0089\2\u0576\u0574\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3"+
		"\2\2\2\u0578\u0579\3\2\2\2\u0579\63\3\2\2\2\u057a\u0578\3\2\2\2\u057b"+
		"\u057c\7\u0110\2\2\u057c\u0581\5\66\34\2\u057d\u057e\7\6\2\2\u057e\u0580"+
		"\5\66\34\2\u057f\u057d\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2\2\2"+
		"\u0581\u0582\3\2\2\2\u0582\65\3\2\2\2\u0583\u0581\3\2\2\2\u0584\u0586"+
		"\5\u010c\u0087\2\u0585\u0587\5\u009eP\2\u0586\u0585\3\2\2\2\u0586\u0587"+
		"\3\2\2\2\u0587\u0589\3\2\2\2\u0588\u058a\7\30\2\2\u0589\u0588\3\2\2\2"+
		"\u0589\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\7\4\2\2\u058c\u058d"+
		"\5$\23\2\u058d\u058e\7\5\2\2\u058e\67\3\2\2\2\u058f\u0590\7\u0109\2\2"+
		"\u0590\u0591\5\u00b6\\\2\u05919\3\2\2\2\u0592\u0593\7\u00a6\2\2\u0593"+
		"\u05a0\5<\37\2\u0594\u0595\7\u00b1\2\2\u0595\u0596\7 \2\2\u0596\u05a0"+
		"\5\u00c0a\2\u0597\u05a0\5\36\20\2\u0598\u05a0\5\34\17\2\u0599\u05a0\5"+
		"\u00b2Z\2\u059a\u05a0\5H%\2\u059b\u05a0\5 \21\2\u059c\u05a0\5\"\22\2\u059d"+
		"\u059e\7\u00ee\2\2\u059e\u05a0\5<\37\2\u059f\u0592\3\2\2\2\u059f\u0594"+
		"\3\2\2\2\u059f\u0597\3\2\2\2\u059f\u0598\3\2\2\2\u059f\u0599\3\2\2\2\u059f"+
		"\u059a\3\2\2\2\u059f\u059b\3\2\2\2\u059f\u059c\3\2\2\2\u059f\u059d\3\2"+
		"\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2"+
		";\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05a5\7\4\2\2\u05a5\u05aa\5> \2\u05a6"+
		"\u05a7\7\6\2\2\u05a7\u05a9\5> \2\u05a8\u05a6\3\2\2\2\u05a9\u05ac\3\2\2"+
		"\2\u05aa\u05a8\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05aa"+
		"\3\2\2\2\u05ad\u05ae\7\5\2\2\u05ae=\3\2\2\2\u05af\u05b4\5@!\2\u05b0\u05b2"+
		"\7\u0114\2\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2"+
		"\2\u05b3\u05b5\5B\"\2\u05b4\u05b1\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5?\3"+
		"\2\2\2\u05b6\u05bb\5\u0110\u0089\2\u05b7\u05b8\7\7\2\2\u05b8\u05ba\5\u0110"+
		"\u0089\2\u05b9\u05b7\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb"+
		"\u05bc\3\2\2\2\u05bc\u05c0\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05c0\7\u0126"+
		"\2\2\u05bf\u05b6\3\2\2\2\u05bf\u05be\3\2\2\2\u05c0A\3\2\2\2\u05c1\u05c6"+
		"\7\u012a\2\2\u05c2\u05c6\7\u012c\2\2\u05c3\u05c6\5\u00dco\2\u05c4\u05c6"+
		"\7\u0126\2\2\u05c5\u05c1\3\2\2\2\u05c5\u05c2\3\2\2\2\u05c5\u05c3\3\2\2"+
		"\2\u05c5\u05c4\3\2\2\2\u05c6C\3\2\2\2\u05c7\u05c8\7\4\2\2\u05c8\u05cd"+
		"\5\u00d4k\2\u05c9\u05ca\7\6\2\2\u05ca\u05cc\5\u00d4k\2\u05cb\u05c9\3\2"+
		"\2\2\u05cc\u05cf\3\2\2\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce"+
		"\u05d0\3\2\2\2\u05cf\u05cd\3\2\2\2\u05d0\u05d1\7\5\2\2\u05d1E\3\2\2\2"+
		"\u05d2\u05d3\7\4\2\2\u05d3\u05d8\5D#\2\u05d4\u05d5\7\6\2\2\u05d5\u05d7"+
		"\5D#\2\u05d6\u05d4\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8"+
		"\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05dc\7\5"+
		"\2\2\u05dcG\3\2\2\2\u05dd\u05de\7\u00e5\2\2\u05de\u05df\7\30\2\2\u05df"+
		"\u05e4\5J&\2\u05e0\u05e1\7\u00e5\2\2\u05e1\u05e2\7 \2\2\u05e2\u05e4\5"+
		"L\'\2\u05e3\u05dd\3\2\2\2\u05e3\u05e0\3\2\2\2\u05e4I\3\2\2\2\u05e5\u05e6"+
		"\7{\2\2\u05e6\u05e7\7\u0126\2\2\u05e7\u05e8\7\u00ab\2\2\u05e8\u05eb\7"+
		"\u0126\2\2\u05e9\u05eb\5\u0110\u0089\2\u05ea\u05e5\3\2\2\2\u05ea\u05e9"+
		"\3\2\2\2\u05ebK\3\2\2\2\u05ec\u05f0\7\u0126\2\2\u05ed\u05ee\7\u0110\2"+
		"\2\u05ee\u05ef\7\u00d9\2\2\u05ef\u05f1\5<\37\2\u05f0\u05ed\3\2\2\2\u05f0"+
		"\u05f1\3\2\2\2\u05f1M\3\2\2\2\u05f2\u05f3\5\u0110\u0089\2\u05f3\u05f4"+
		"\7\u0126\2\2\u05f4O\3\2\2\2\u05f5\u05f6\5&\24\2\u05f6\u05f7\5$\23\2\u05f7"+
		"\u0628\3\2\2\2\u05f8\u05fa\5|?\2\u05f9\u05fb\5T+\2\u05fa\u05f9\3\2\2\2"+
		"\u05fb\u05fc\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u0628"+
		"\3\2\2\2\u05fe\u05ff\7G\2\2\u05ff\u0600\7i\2\2\u0600\u0601\5\u00b6\\\2"+
		"\u0601\u0603\5\u00b0Y\2\u0602\u0604\5t;\2\u0603\u0602\3\2\2\2\u0603\u0604"+
		"\3\2\2\2\u0604\u0628\3\2\2\2\u0605\u0606\7\u0106\2\2\u0606\u0607\5\u00b6"+
		"\\\2\u0607\u0608\5\u00b0Y\2\u0608\u060a\5f\64\2\u0609\u060b\5t;\2\u060a"+
		"\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u0628\3\2\2\2\u060c\u060d\7\u0097"+
		"\2\2\u060d\u060e\7\177\2\2\u060e\u060f\5\u00b6\\\2\u060f\u0610\5\u00b0"+
		"Y\2\u0610\u0616\7\u0109\2\2\u0611\u0617\5\u00b6\\\2\u0612\u0613\7\4\2"+
		"\2\u0613\u0614\5$\23\2\u0614\u0615\7\5\2\2\u0615\u0617\3\2\2\2\u0616\u0611"+
		"\3\2\2\2\u0616\u0612\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\5\u00b0Y"+
		"\2\u0619\u061a\7\u00a3\2\2\u061a\u061e\5\u00ccg\2\u061b\u061d\5h\65\2"+
		"\u061c\u061b\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e\u061f"+
		"\3\2\2\2\u061f\u0624\3\2\2\2\u0620\u061e\3\2\2\2\u0621\u0623\5j\66\2\u0622"+
		"\u0621\3\2\2\2\u0623\u0626\3\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625\u0628\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u05f5\3\2\2\2\u0627"+
		"\u05f8\3\2\2\2\u0627\u05fe\3\2\2\2\u0627\u0605\3\2\2\2\u0627\u060c\3\2"+
		"\2\2\u0628Q\3\2\2\2\u0629\u062a\7\u00a8\2\2\u062a\u062b\7 \2\2\u062b\u0630"+
		"\5Z.\2\u062c\u062d\7\6\2\2\u062d\u062f\5Z.\2\u062e\u062c\3\2\2\2\u062f"+
		"\u0632\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0634\3\2"+
		"\2\2\u0632\u0630\3\2\2\2\u0633\u0629\3\2\2\2\u0633\u0634\3\2\2\2\u0634"+
		"\u063f\3\2\2\2\u0635\u0636\7*\2\2\u0636\u0637\7 \2\2\u0637\u063c\5\u00c8"+
		"e\2\u0638\u0639\7\6\2\2\u0639\u063b\5\u00c8e\2\u063a\u0638\3\2\2\2\u063b"+
		"\u063e\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063d\3\2\2\2\u063d\u0640\3\2"+
		"\2\2\u063e\u063c\3\2\2\2\u063f\u0635\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"\u064b\3\2\2\2\u0641\u0642\7O\2\2\u0642\u0643\7 \2\2\u0643\u0648\5\u00c8"+
		"e\2\u0644\u0645\7\6\2\2\u0645\u0647\5\u00c8e\2\u0646\u0644\3\2\2\2\u0647"+
		"\u064a\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064c\3\2"+
		"\2\2\u064a\u0648\3\2\2\2\u064b\u0641\3\2\2\2\u064b\u064c\3\2\2\2\u064c"+
		"\u0657\3\2\2\2\u064d\u064e\7\u00e1\2\2\u064e\u064f\7 \2\2\u064f\u0654"+
		"\5Z.\2\u0650\u0651\7\6\2\2\u0651\u0653\5Z.\2\u0652\u0650\3\2\2\2\u0653"+
		"\u0656\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0658\3\2"+
		"\2\2\u0656\u0654\3\2\2\2\u0657\u064d\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u065a\3\2\2\2\u0659\u065b\5\u00fc\177\2\u065a\u0659\3\2\2\2\u065a\u065b"+
		"\3\2\2\2\u065b\u0661\3\2\2\2\u065c\u065f\7\u008b\2\2\u065d\u0660\7\20"+
		"\2\2\u065e\u0660\5\u00c8e\2\u065f\u065d\3\2\2\2\u065f\u065e\3\2\2\2\u0660"+
		"\u0662\3\2\2\2\u0661\u065c\3\2\2\2\u0661\u0662\3\2\2\2\u0662S\3\2\2\2"+
		"\u0663\u0664\5&\24\2\u0664\u0665\5^\60\2\u0665U\3\2\2\2\u0666\u0667\b"+
		",\1\2\u0667\u0668\5X-\2\u0668\u0680\3\2\2\2\u0669\u066a\f\5\2\2\u066a"+
		"\u066b\6,\3\2\u066b\u066d\t\21\2\2\u066c\u066e\5\u0090I\2\u066d\u066c"+
		"\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u067f\5V,\6\u0670"+
		"\u0671\f\4\2\2\u0671\u0672\6,\5\2\u0672\u0674\7}\2\2\u0673\u0675\5\u0090"+
		"I\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676"+
		"\u067f\5V,\5\u0677\u0678\f\3\2\2\u0678\u0679\6,\7\2\u0679\u067b\t\22\2"+
		"\2\u067a\u067c\5\u0090I\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c"+
		"\u067d\3\2\2\2\u067d\u067f\5V,\4\u067e\u0669\3\2\2\2\u067e\u0670\3\2\2"+
		"\2\u067e\u0677\3\2\2\2\u067f\u0682\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681"+
		"\3\2\2\2\u0681W\3\2\2\2\u0682\u0680\3\2\2\2\u0683\u068d\5`\61\2\u0684"+
		"\u068d\5\\/\2\u0685\u0686\7\u00eb\2\2\u0686\u068d\5\u00b6\\\2\u0687\u068d"+
		"\5\u00acW\2\u0688\u0689\7\4\2\2\u0689\u068a\5$\23\2\u068a\u068b\7\5\2"+
		"\2\u068b\u068d\3\2\2\2\u068c\u0683\3\2\2\2\u068c\u0684\3\2\2\2\u068c\u0685"+
		"\3\2\2\2\u068c\u0687\3\2\2\2\u068c\u0688\3\2\2\2\u068dY\3\2\2\2\u068e"+
		"\u0690\5\u00c8e\2\u068f\u0691\t\23\2\2\u0690\u068f\3\2\2\2\u0690\u0691"+
		"\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0693\7\u00a1\2\2\u0693\u0695\t\24"+
		"\2\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695[\3\2\2\2\u0696\u0698"+
		"\5|?\2\u0697\u0699\5^\60\2\u0698\u0697\3\2\2\2\u0699\u069a\3\2\2\2\u069a"+
		"\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b]\3\2\2\2\u069c\u069e\5b\62\2"+
		"\u069d\u069f\5t;\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a0"+
		"\3\2\2\2\u06a0\u06a1\5R*\2\u06a1\u06b8\3\2\2\2\u06a2\u06a6\5d\63\2\u06a3"+
		"\u06a5\5\u008eH\2\u06a4\u06a3\3\2\2\2\u06a5\u06a8\3\2\2\2\u06a6\u06a4"+
		"\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a9"+
		"\u06ab\5t;\2\u06aa\u06a9\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ad\3\2\2"+
		"\2\u06ac\u06ae\5~@\2\u06ad\u06ac\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06b0"+
		"\3\2\2\2\u06af\u06b1\5v<\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1"+
		"\u06b3\3\2\2\2\u06b2\u06b4\5\u00fc\177\2\u06b3\u06b2\3\2\2\2\u06b3\u06b4"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\5R*\2\u06b6\u06b8\3\2\2\2\u06b7"+
		"\u069c\3\2\2\2\u06b7\u06a2\3\2\2\2\u06b8_\3\2\2\2\u06b9\u06bb\5b\62\2"+
		"\u06ba\u06bc\5|?\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06c0"+
		"\3\2\2\2\u06bd\u06bf\5\u008eH\2\u06be\u06bd\3\2\2\2\u06bf\u06c2\3\2\2"+
		"\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0"+
		"\3\2\2\2\u06c3\u06c5\5t;\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5"+
		"\u06c7\3\2\2\2\u06c6\u06c8\5~@\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2"+
		"\2\u06c8\u06ca\3\2\2\2\u06c9\u06cb\5v<\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb"+
		"\3\2\2\2\u06cb\u06cd\3\2\2\2\u06cc\u06ce\5\u00fc\177\2\u06cd\u06cc\3\2"+
		"\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06e6\3\2\2\2\u06cf\u06d1\5d\63\2\u06d0"+
		"\u06d2\5|?\2\u06d1\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d6\3\2\2"+
		"\2\u06d3\u06d5\5\u008eH\2\u06d4\u06d3\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6"+
		"\u06d4\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06d6\3\2"+
		"\2\2\u06d9\u06db\5t;\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dd"+
		"\3\2\2\2\u06dc\u06de\5~@\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de"+
		"\u06e0\3\2\2\2\u06df\u06e1\5v<\2\u06e0\u06df\3\2\2\2\u06e0\u06e1\3\2\2"+
		"\2\u06e1\u06e3\3\2\2\2\u06e2\u06e4\5\u00fc\177\2\u06e3\u06e2\3\2\2\2\u06e3"+
		"\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06b9\3\2\2\2\u06e5\u06cf\3\2"+
		"\2\2\u06e6a\3\2\2\2\u06e7\u06e8\7\u00d5\2\2\u06e8\u06e9\7\u00f8\2\2\u06e9"+
		"\u06eb\7\4\2\2\u06ea\u06ec\5\u0090I\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec"+
		"\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\5\u00caf\2\u06ee\u06ef\7\5\2"+
		"\2\u06ef\u06fb\3\2\2\2\u06f0\u06f2\7\u0095\2\2\u06f1\u06f3\5\u0090I\2"+
		"\u06f2\u06f1\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06fb"+
		"\5\u00caf\2\u06f5\u06f7\7\u00c1\2\2\u06f6\u06f8\5\u0090I\2\u06f7\u06f6"+
		"\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fb\5\u00caf"+
		"\2\u06fa\u06e7\3\2\2\2\u06fa\u06f0\3\2\2\2\u06fa\u06f5\3\2\2\2\u06fb\u06fd"+
		"\3\2\2\2\u06fc\u06fe\5\u00b2Z\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2"+
		"\2\u06fe\u0701\3\2\2\2\u06ff\u0700\7\u00bf\2\2\u0700\u0702\7\u0126\2\2"+
		"\u0701\u06ff\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704"+
		"\7\u0109\2\2\u0704\u0711\7\u0126\2\2\u0705\u070f\7\30\2\2\u0706\u0710"+
		"\5\u00a0Q\2\u0707\u0710\5\u00f2z\2\u0708\u070b\7\4\2\2\u0709\u070c\5\u00a0"+
		"Q\2\u070a\u070c\5\u00f2z\2\u070b\u0709\3\2\2\2\u070b\u070a\3\2\2\2\u070c"+
		"\u070d\3\2\2\2\u070d\u070e\7\5\2\2\u070e\u0710\3\2\2\2\u070f\u0706\3\2"+
		"\2\2\u070f\u0707\3\2\2\2\u070f\u0708\3\2\2\2\u0710\u0712\3\2\2\2\u0711"+
		"\u0705\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0714\3\2\2\2\u0713\u0715\5\u00b2"+
		"Z\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0718\3\2\2\2\u0716"+
		"\u0717\7\u00be\2\2\u0717\u0719\7\u0126\2\2\u0718\u0716\3\2\2\2\u0718\u0719"+
		"\3\2\2\2\u0719c\3\2\2\2\u071a\u071e\7\u00d5\2\2\u071b\u071d\5x=\2\u071c"+
		"\u071b\3\2\2\2\u071d\u0720\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2"+
		"\2\2\u071f\u0722\3\2\2\2\u0720\u071e\3\2\2\2\u0721\u0723\5\u0090I\2\u0722"+
		"\u0721\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0725\5\u00be"+
		"`\2\u0725e\3\2\2\2\u0726\u0727\7\u00db\2\2\u0727\u0728\5p9\2\u0728g\3"+
		"\2\2\2\u0729\u072a\7\u010d\2\2\u072a\u072d\7\u0096\2\2\u072b\u072c\7\23"+
		"\2\2\u072c\u072e\5\u00ccg\2\u072d\u072b\3\2\2\2\u072d\u072e\3\2\2\2\u072e"+
		"\u072f\3\2\2\2\u072f\u0730\7\u00f1\2\2\u0730\u0731\5l\67\2\u0731i\3\2"+
		"\2\2\u0732\u0733\7\u010d\2\2\u0733\u0734\7\u009f\2\2\u0734\u0737\7\u0096"+
		"\2\2\u0735\u0736\7\23\2\2\u0736\u0738\5\u00ccg\2\u0737\u0735\3\2\2\2\u0737"+
		"\u0738\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073a\7\u00f1\2\2\u073a\u073b"+
		"\5n8\2\u073bk\3\2\2\2\u073c\u0744\7G\2\2\u073d\u073e\7\u0106\2\2\u073e"+
		"\u073f\7\u00db\2\2\u073f\u0744\7\u011e\2\2\u0740\u0741\7\u0106\2\2\u0741"+
		"\u0742\7\u00db\2\2\u0742\u0744\5p9\2\u0743\u073c\3\2\2\2\u0743\u073d\3"+
		"\2\2\2\u0743\u0740\3\2\2\2\u0744m\3\2\2\2\u0745\u0746\7|\2\2\u0746\u0758"+
		"\7\u011e\2\2\u0747\u0748\7|\2\2\u0748\u0749\7\4\2\2\u0749\u074a\5\u00b4"+
		"[\2\u074a\u074b\7\5\2\2\u074b\u074c\7\u010a\2\2\u074c\u074d\7\4\2\2\u074d"+
		"\u0752\5\u00c8e\2\u074e\u074f\7\6\2\2\u074f\u0751\5\u00c8e\2\u0750\u074e"+
		"\3\2\2\2\u0751\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753"+
		"\u0755\3\2\2\2\u0754\u0752\3\2\2\2\u0755\u0756\7\5\2\2\u0756\u0758\3\2"+
		"\2\2\u0757\u0745\3\2\2\2\u0757\u0747\3\2\2\2\u0758o\3\2\2\2\u0759\u075e"+
		"\5r:\2\u075a\u075b\7\6\2\2\u075b\u075d\5r:\2\u075c\u075a\3\2\2\2\u075d"+
		"\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075fq\3\2\2\2"+
		"\u0760\u075e\3\2\2\2\u0761\u0762\5\u00b6\\\2\u0762\u0763\7\u0114\2\2\u0763"+
		"\u0764\5\u00c8e\2\u0764s\3\2\2\2\u0765\u0766\7\u010e\2\2\u0766\u0767\5"+
		"\u00ccg\2\u0767u\3\2\2\2\u0768\u0769\7q\2\2\u0769\u076a\5\u00ccg\2\u076a"+
		"w\3\2\2\2\u076b\u076c\7\b\2\2\u076c\u0773\5z>\2\u076d\u076f\7\6\2\2\u076e"+
		"\u076d\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0772\5z"+
		">\2\u0771\u076e\3\2\2\2\u0772\u0775\3\2\2\2\u0773\u0771\3\2\2\2\u0773"+
		"\u0774\3\2\2\2\u0774\u0776\3\2\2\2\u0775\u0773\3\2\2\2\u0776\u0777\7\t"+
		"\2\2\u0777y\3\2\2\2\u0778\u0786\5\u0110\u0089\2\u0779\u077a\5\u0110\u0089"+
		"\2\u077a\u077b\7\4\2\2\u077b\u0780\5\u00d2j\2\u077c\u077d\7\6\2\2\u077d"+
		"\u077f\5\u00d2j\2\u077e\u077c\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e"+
		"\3\2\2\2\u0780\u0781\3\2\2\2\u0781\u0783\3\2\2\2\u0782\u0780\3\2\2\2\u0783"+
		"\u0784\7\5\2\2\u0784\u0786\3\2\2\2\u0785\u0778\3\2\2\2\u0785\u0779\3\2"+
		"\2\2\u0786{\3\2\2\2\u0787\u0788\7i\2\2\u0788\u078d\5\u0092J\2\u0789\u078a"+
		"\7\6\2\2\u078a\u078c\5\u0092J\2\u078b\u0789\3\2\2\2\u078c\u078f\3\2\2"+
		"\2\u078d\u078b\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u0793\3\2\2\2\u078f\u078d"+
		"\3\2\2\2\u0790\u0792\5\u008eH\2\u0791\u0790\3\2\2\2\u0792\u0795\3\2\2"+
		"\2\u0793\u0791\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0797\3\2\2\2\u0795\u0793"+
		"\3\2\2\2\u0796\u0798\5\u0088E\2\u0797\u0796\3\2\2\2\u0797\u0798\3\2\2"+
		"\2\u0798}\3\2\2\2\u0799\u079a\7o\2\2\u079a\u079b\7 \2\2\u079b\u07a0\5"+
		"\u0080A\2\u079c\u079d\7\6\2\2\u079d\u079f\5\u0080A\2\u079e\u079c\3\2\2"+
		"\2\u079f\u07a2\3\2\2\2\u07a0\u079e\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07c1"+
		"\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a3\u07a4\7o\2\2\u07a4\u07a5\7 \2\2\u07a5"+
		"\u07aa\5\u00c8e\2\u07a6\u07a7\7\6\2\2\u07a7\u07a9\5\u00c8e\2\u07a8\u07a6"+
		"\3\2\2\2\u07a9\u07ac\3\2\2\2\u07aa\u07a8\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab"+
		"\u07be\3\2\2\2\u07ac\u07aa\3\2\2\2\u07ad\u07ae\7\u0110\2\2\u07ae\u07bf"+
		"\7\u00d0\2\2\u07af\u07b0\7\u0110\2\2\u07b0\u07bf\7;\2\2\u07b1\u07b2\7"+
		"p\2\2\u07b2\u07b3\7\u00dd\2\2\u07b3\u07b4\7\4\2\2\u07b4\u07b9\5\u0086"+
		"D\2\u07b5\u07b6\7\6\2\2\u07b6\u07b8\5\u0086D\2\u07b7\u07b5\3\2\2\2\u07b8"+
		"\u07bb\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bc\3\2"+
		"\2\2\u07bb\u07b9\3\2\2\2\u07bc\u07bd\7\5\2\2\u07bd\u07bf\3\2\2\2\u07be"+
		"\u07ad\3\2\2\2\u07be\u07af\3\2\2\2\u07be\u07b1\3\2\2\2\u07be\u07bf\3\2"+
		"\2\2\u07bf\u07c1\3\2\2\2\u07c0\u0799\3\2\2\2\u07c0\u07a3\3\2\2\2\u07c1"+
		"\177\3\2\2\2\u07c2\u07c5\5\u0082B\2\u07c3\u07c5\5\u00c8e\2\u07c4\u07c2"+
		"\3\2\2\2\u07c4\u07c3\3\2\2\2\u07c5\u0081\3\2\2\2\u07c6\u07c7\t\25\2\2"+
		"\u07c7\u07c8\7\4\2\2\u07c8\u07cd\5\u0086D\2\u07c9\u07ca\7\6\2\2\u07ca"+
		"\u07cc\5\u0086D\2\u07cb\u07c9\3\2\2\2\u07cc\u07cf\3\2\2\2\u07cd\u07cb"+
		"\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07d0\3\2\2\2\u07cf\u07cd\3\2\2\2\u07d0"+
		"\u07d1\7\5\2\2\u07d1\u07e0\3\2\2\2\u07d2\u07d3\7p\2\2\u07d3\u07d4\7\u00dd"+
		"\2\2\u07d4\u07d5\7\4\2\2\u07d5\u07da\5\u0084C\2\u07d6\u07d7\7\6\2\2\u07d7"+
		"\u07d9\5\u0084C\2\u07d8\u07d6\3\2\2\2\u07d9\u07dc\3\2\2\2\u07da\u07d8"+
		"\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dd\3\2\2\2\u07dc\u07da\3\2\2\2\u07dd"+
		"\u07de\7\5\2\2\u07de\u07e0\3\2\2\2\u07df\u07c6\3\2\2\2\u07df\u07d2\3\2"+
		"\2\2\u07e0\u0083\3\2\2\2\u07e1\u07e4\5\u0082B\2\u07e2\u07e4\5\u0086D\2"+
		"\u07e3\u07e1\3\2\2\2\u07e3\u07e2\3\2\2\2\u07e4\u0085\3\2\2\2\u07e5\u07ee"+
		"\7\4\2\2\u07e6\u07eb\5\u00c8e\2\u07e7\u07e8\7\6\2\2\u07e8\u07ea\5\u00c8"+
		"e\2\u07e9\u07e7\3\2\2\2\u07ea\u07ed\3\2\2\2\u07eb\u07e9\3\2\2\2\u07eb"+
		"\u07ec\3\2\2\2\u07ec\u07ef\3\2\2\2\u07ed\u07eb\3\2\2\2\u07ee\u07e6\3\2"+
		"\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f3\7\5\2\2\u07f1"+
		"\u07f3\5\u00c8e\2\u07f2\u07e5\3\2\2\2\u07f2\u07f1\3\2\2\2\u07f3\u0087"+
		"\3\2\2\2\u07f4\u07f5\7\u00b4\2\2\u07f5\u07f6\7\4\2\2\u07f6\u07f7\5\u00be"+
		"`\2\u07f7\u07f8\7e\2\2\u07f8\u07f9\5\u008aF\2\u07f9\u07fa\7v\2\2\u07fa"+
		"\u07fb\7\4\2\2\u07fb\u0800\5\u008cG\2\u07fc\u07fd\7\6\2\2\u07fd\u07ff"+
		"\5\u008cG\2\u07fe\u07fc\3\2\2\2\u07ff\u0802\3\2\2\2\u0800\u07fe\3\2\2"+
		"\2\u0800\u0801\3\2\2\2\u0801\u0803\3\2\2\2\u0802\u0800\3\2\2\2\u0803\u0804"+
		"\7\5\2\2\u0804\u0805\7\5\2\2\u0805\u0089\3\2\2\2\u0806\u0813\5\u0110\u0089"+
		"\2\u0807\u0808\7\4\2\2\u0808\u080d\5\u0110\u0089\2\u0809\u080a\7\6\2\2"+
		"\u080a\u080c\5\u0110\u0089\2\u080b\u0809\3\2\2\2\u080c\u080f\3\2\2\2\u080d"+
		"\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0810\3\2\2\2\u080f\u080d\3\2"+
		"\2\2\u0810\u0811\7\5\2\2\u0811\u0813\3\2\2\2\u0812\u0806\3\2\2\2\u0812"+
		"\u0807\3\2\2\2\u0813\u008b\3\2\2\2\u0814\u0819\5\u00c8e\2\u0815\u0817"+
		"\7\30\2\2\u0816\u0815\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0818\3\2\2\2"+
		"\u0818\u081a\5\u0110\u0089\2\u0819\u0816\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u008d\3\2\2\2\u081b\u081c\7\u0085\2\2\u081c\u081e\7\u010b\2\2\u081d\u081f"+
		"\7\u00aa\2\2\u081e\u081d\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0820\3\2\2"+
		"\2\u0820\u0821\5\u010a\u0086\2\u0821\u082a\7\4\2\2\u0822\u0827\5\u00c8"+
		"e\2\u0823\u0824\7\6\2\2\u0824\u0826\5\u00c8e\2\u0825\u0823\3\2\2\2\u0826"+
		"\u0829\3\2\2\2\u0827\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u082b\3\2"+
		"\2\2\u0829\u0827\3\2\2\2\u082a\u0822\3\2\2\2\u082a\u082b\3\2\2\2\u082b"+
		"\u082c\3\2\2\2\u082c\u082d\7\5\2\2\u082d\u0839\5\u0110\u0089\2\u082e\u0830"+
		"\7\30\2\2\u082f\u082e\3\2\2\2\u082f\u0830\3\2\2\2\u0830\u0831\3\2\2\2"+
		"\u0831\u0836\5\u0110\u0089\2\u0832\u0833\7\6\2\2\u0833\u0835\5\u0110\u0089"+
		"\2\u0834\u0832\3\2\2\2\u0835\u0838\3\2\2\2\u0836\u0834\3\2\2\2\u0836\u0837"+
		"\3\2\2\2\u0837\u083a\3\2\2\2\u0838\u0836\3\2\2\2\u0839\u082f\3\2\2\2\u0839"+
		"\u083a\3\2\2\2\u083a\u008f\3\2\2\2\u083b\u083c\t\26\2\2\u083c\u0091\3"+
		"\2\2\2\u083d\u083f\7\u0085\2\2\u083e\u083d\3\2\2\2\u083e\u083f\3\2\2\2"+
		"\u083f\u0840\3\2\2\2\u0840\u0844\5\u00aaV\2\u0841\u0843\5\u0094K\2\u0842"+
		"\u0841\3\2\2\2\u0843\u0846\3\2\2\2\u0844\u0842\3\2\2\2\u0844\u0845\3\2"+
		"\2\2\u0845\u0093\3\2\2\2\u0846\u0844\3\2\2\2\u0847\u0848\5\u0096L\2\u0848"+
		"\u084a\7\u0082\2\2\u0849\u084b\7\u0085\2\2\u084a\u0849\3\2\2\2\u084a\u084b"+
		"\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084e\5\u00aaV\2\u084d\u084f\5\u0098"+
		"M\2\u084e\u084d";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0859\3\2\2\2\u0850\u0851\7\u009d\2"+
		"\2\u0851\u0852\5\u0096L\2\u0852\u0854\7\u0082\2\2\u0853\u0855\7\u0085"+
		"\2\2\u0854\u0853\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856"+
		"\u0857\5\u00aaV\2\u0857\u0859\3\2\2\2\u0858\u0847\3\2\2\2\u0858\u0850"+
		"\3\2\2\2\u0859\u0095\3\2\2\2\u085a\u085c\7y\2\2\u085b\u085a\3\2\2\2\u085b"+
		"\u085c\3\2\2\2\u085c\u0873\3\2\2\2\u085d\u0873\7:\2\2\u085e\u0860\7\u0088"+
		"\2\2\u085f\u0861\7\u00aa\2\2\u0860\u085f\3\2\2\2\u0860\u0861\3\2\2\2\u0861"+
		"\u0873\3\2\2\2\u0862\u0864\7\u0088\2\2\u0863\u0862\3\2\2\2\u0863\u0864"+
		"\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0873\7\u00d6\2\2\u0866\u0868\7\u00cb"+
		"\2\2\u0867\u0869\7\u00aa\2\2\u0868\u0867\3\2\2\2\u0868\u0869\3\2\2\2\u0869"+
		"\u0873\3\2\2\2\u086a\u086c\7j\2\2\u086b\u086d\7\u00aa\2\2\u086c\u086b"+
		"\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u0873\3\2\2\2\u086e\u0870\7\u0088\2"+
		"\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0873"+
		"\7\24\2\2\u0872\u085b\3\2\2\2\u0872\u085d\3\2\2\2\u0872\u085e\3\2\2\2"+
		"\u0872\u0863\3\2\2\2\u0872\u0866\3\2\2\2\u0872\u086a\3\2\2\2\u0872\u086f"+
		"\3\2\2\2\u0873\u0097\3\2\2\2\u0874\u0875\7\u00a3\2\2\u0875\u0879\5\u00cc"+
		"g\2\u0876\u0877\7\u0109\2\2\u0877\u0879\5\u009eP\2\u0878\u0874\3\2\2\2"+
		"\u0878\u0876\3\2\2\2\u0879\u0099\3\2\2\2\u087a\u087b\7\u00ed\2\2\u087b"+
		"\u087d\7\4\2\2\u087c\u087e\5\u009cO\2\u087d\u087c\3\2\2\2\u087d\u087e"+
		"\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\7\5\2\2\u0880\u009b\3\2\2\2\u0881"+
		"\u0883\7\u011d\2\2\u0882\u0881\3\2\2\2\u0882\u0883\3\2\2\2\u0883\u0884"+
		"\3\2\2\2\u0884\u0885\t\27\2\2\u0885\u089a\7\u00b3\2\2\u0886\u0887\5\u00c8"+
		"e\2\u0887\u0888\7\u00d2\2\2\u0888\u089a\3\2\2\2\u0889\u088a\7\36\2\2\u088a"+
		"\u088b\7\u012a\2\2\u088b\u088c\7\u00a9\2\2\u088c\u088d\7\u00a2\2\2\u088d"+
		"\u0896\7\u012a\2\2\u088e\u0894\7\u00a3\2\2\u088f\u0895\5\u0110\u0089\2"+
		"\u0890\u0891\5\u010a\u0086\2\u0891\u0892\7\4\2\2\u0892\u0893\7\5\2\2\u0893"+
		"\u0895\3\2\2\2\u0894\u088f\3\2\2\2\u0894\u0890\3\2\2\2\u0895\u0897\3\2"+
		"\2\2\u0896\u088e\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u089a\3\2\2\2\u0898"+
		"\u089a\5\u00c8e\2\u0899\u0882\3\2\2\2\u0899\u0886\3\2\2\2\u0899\u0889"+
		"\3\2\2\2\u0899\u0898\3\2\2\2\u089a\u009d\3\2\2\2\u089b\u089c\7\4\2\2\u089c"+
		"\u089d\5\u00a0Q\2\u089d\u089e\7\5\2\2\u089e\u009f\3\2\2\2\u089f\u08a4"+
		"\5\u010c\u0087\2\u08a0\u08a1\7\6\2\2\u08a1\u08a3\5\u010c\u0087\2\u08a2"+
		"\u08a0\3\2\2\2\u08a3\u08a6\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a4\u08a5\3\2"+
		"\2\2\u08a5\u00a1\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a7\u08a8\7\4\2\2\u08a8"+
		"\u08ad\5\u00a4S\2\u08a9\u08aa\7\6\2\2\u08aa\u08ac\5\u00a4S\2\u08ab\u08a9"+
		"\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae"+
		"\u08b0\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0\u08b1\7\5\2\2\u08b1\u00a3\3\2"+
		"\2\2\u08b2\u08b4\5\u010c\u0087\2\u08b3\u08b5\t\23\2\2\u08b4\u08b3\3\2"+
		"\2\2\u08b4\u08b5\3\2\2\2\u08b5\u00a5\3\2\2\2\u08b6\u08b7\7\4\2\2\u08b7"+
		"\u08bc\5\u00a8U\2\u08b8\u08b9\7\6\2\2\u08b9\u08bb\5\u00a8U\2\u08ba\u08b8"+
		"\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd"+
		"\u08bf\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf\u08c0\7\5\2\2\u08c0\u00a7\3\2"+
		"\2\2\u08c1\u08c3\5\u0110\u0089\2\u08c2\u08c4\5\"\22\2\u08c3\u08c2\3\2"+
		"\2\2\u08c3\u08c4\3\2\2\2\u08c4\u00a9\3\2\2\2\u08c5\u08c7\5\u00b6\\\2\u08c6"+
		"\u08c8\5\u009aN\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08c9"+
		"\3\2\2\2\u08c9\u08ca\5\u00b0Y\2\u08ca\u08de\3\2\2\2\u08cb\u08cc\7\4\2"+
		"\2\u08cc\u08cd\5$\23\2\u08cd\u08cf\7\5\2\2\u08ce\u08d0\5\u009aN\2\u08cf"+
		"\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\5\u00b0"+
		"Y\2\u08d2\u08de\3\2\2\2\u08d3\u08d4\7\4\2\2\u08d4\u08d5\5\u0092J\2\u08d5"+
		"\u08d7\7\5\2\2\u08d6\u08d8\5\u009aN\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8"+
		"\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08da\5\u00b0Y\2\u08da\u08de\3\2\2"+
		"\2\u08db\u08de\5\u00acW\2\u08dc\u08de\5\u00aeX\2\u08dd\u08c5\3\2\2\2\u08dd"+
		"\u08cb\3\2\2\2\u08dd\u08d3\3\2\2\2\u08dd\u08db\3\2\2\2\u08dd\u08dc\3\2"+
		"\2\2\u08de\u00ab\3\2\2\2\u08df\u08e0\7\u010a\2\2\u08e0\u08e5\5\u00c8e"+
		"\2\u08e1\u08e2\7\6\2\2\u08e2\u08e4\5\u00c8e\2\u08e3\u08e1\3\2\2\2\u08e4"+
		"\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e8\3\2"+
		"\2\2\u08e7\u08e5\3\2\2\2\u08e8\u08e9\5\u00b0Y\2\u08e9\u00ad\3\2\2\2\u08ea"+
		"\u08eb\5\u0108\u0085\2\u08eb\u08f4\7\4\2\2\u08ec\u08f1\5\u00c8e\2\u08ed"+
		"\u08ee\7\6\2\2\u08ee\u08f0\5\u00c8e\2\u08ef\u08ed\3\2\2\2\u08f0\u08f3"+
		"\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2\u08f5\3\2\2\2\u08f3"+
		"\u08f1\3\2\2\2\u08f4\u08ec\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\3\2"+
		"\2\2\u08f6\u08f7\7\5\2\2\u08f7\u08f8\5\u00b0Y\2\u08f8\u00af\3\2\2\2\u08f9"+
		"\u08fb\7\30\2\2\u08fa\u08f9\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\3"+
		"\2\2\2\u08fc\u08fe\5\u0112\u008a\2\u08fd\u08ff\5\u009eP\2\u08fe\u08fd"+
		"\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0901\3\2\2\2\u0900\u08fa\3\2\2\2\u0900"+
		"\u0901\3\2\2\2\u0901\u00b1\3\2\2\2\u0902\u0903\7\u00d1\2\2\u0903\u0904"+
		"\7g\2\2\u0904\u0905\7\u00d8\2\2\u0905\u0909\7\u0126\2\2\u0906\u0907\7"+
		"\u0110\2\2\u0907\u0908\7\u00d9\2\2\u0908\u090a\5<\37\2\u0909\u0906\3\2"+
		"\2\2\u0909\u090a\3\2\2\2\u090a\u0934\3\2\2\2\u090b\u090c\7\u00d1\2\2\u090c"+
		"\u090d\7g\2\2\u090d\u0917\7H\2\2\u090e\u090f\7`\2\2\u090f\u0910\7\u00f0"+
		"\2\2\u0910\u0911\7 \2\2\u0911\u0915\7\u0126\2\2\u0912\u0913\7U\2\2\u0913"+
		"\u0914\7 \2\2\u0914\u0916\7\u0126\2\2\u0915\u0912\3\2\2\2\u0915\u0916"+
		"\3\2\2\2\u0916\u0918\3\2\2\2\u0917\u090e\3\2\2\2\u0917\u0918\3\2\2\2\u0918"+
		"\u091e\3\2\2\2\u0919\u091a\7.\2\2\u091a\u091b\7\u0081\2\2\u091b\u091c"+
		"\7\u00f0\2\2\u091c\u091d\7 \2\2\u091d\u091f\7\u0126\2\2\u091e\u0919\3"+
		"\2\2\2\u091e\u091f\3\2\2\2\u091f\u0925\3\2\2\2\u0920\u0921\7\u0095\2\2"+
		"\u0921\u0922\7\u0083\2\2\u0922\u0923\7\u00f0\2\2\u0923\u0924\7 \2\2\u0924"+
		"\u0926\7\u0126\2\2\u0925\u0920\3\2\2\2\u0925\u0926\3\2\2\2\u0926\u092b"+
		"\3\2\2\2\u0927\u0928\7\u008c\2\2\u0928\u0929\7\u00f0\2\2\u0929\u092a\7"+
		" \2\2\u092a\u092c\7\u0126\2\2\u092b\u0927\3\2\2\2\u092b\u092c\3\2\2\2"+
		"\u092c\u0931\3\2\2\2\u092d\u092e\7\u00a0\2\2\u092e\u092f\7F\2\2\u092f"+
		"\u0930\7\30\2\2\u0930\u0932\7\u0126\2\2\u0931\u092d\3\2\2\2\u0931\u0932"+
		"\3\2\2\2\u0932\u0934\3\2\2\2\u0933\u0902\3\2\2\2\u0933\u090b\3\2\2\2\u0934"+
		"\u00b3\3\2\2\2\u0935\u093a\5\u00b6\\\2\u0936\u0937\7\6\2\2\u0937\u0939"+
		"\5\u00b6\\\2\u0938\u0936\3\2\2\2\u0939\u093c\3\2\2\2\u093a\u0938\3\2\2"+
		"\2\u093a\u093b\3\2\2\2\u093b\u00b5\3\2\2\2\u093c\u093a\3\2\2\2\u093d\u0942"+
		"\5\u010c\u0087\2\u093e\u093f\7\7\2\2\u093f\u0941\5\u010c\u0087\2\u0940"+
		"\u093e\3\2\2\2\u0941\u0944\3\2\2\2\u0942\u0940\3\2\2\2\u0942\u0943\3\2"+
		"\2\2\u0943\u00b7\3\2\2\2\u0944\u0942\3\2\2\2\u0945\u0946\5\u010c\u0087"+
		"\2\u0946\u0947\7\7\2\2\u0947\u0949\3\2\2\2\u0948\u0945\3\2\2\2\u0948\u0949"+
		"\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\5\u010c\u0087\2\u094b\u00b9\3"+
		"\2\2\2\u094c\u094d\5\u010c\u0087\2\u094d\u094e\7\7\2\2\u094e\u0950\3\2"+
		"\2\2\u094f\u094c\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\3\2\2\2\u0951"+
		"\u0952\5\u010c\u0087\2\u0952\u00bb\3\2\2\2\u0953\u095b\5\u00c8e\2\u0954"+
		"\u0956\7\30\2\2\u0955\u0954\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0959\3"+
		"\2\2\2\u0957\u095a\5\u010c\u0087\2\u0958\u095a\5\u009eP\2\u0959\u0957"+
		"\3\2\2\2\u0959\u0958\3\2\2\2\u095a\u095c\3\2\2\2\u095b\u0955\3\2\2\2\u095b"+
		"\u095c\3\2\2\2\u095c\u00bd\3\2\2\2\u095d\u0962\5\u00bc_\2\u095e\u095f"+
		"\7\6\2\2\u095f\u0961\5\u00bc_\2\u0960\u095e\3\2\2\2\u0961\u0964\3\2\2"+
		"\2\u0962\u0960\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u00bf\3\2\2\2\u0964\u0962"+
		"\3\2\2\2\u0965\u0966\7\4\2\2\u0966\u096b\5\u00c2b\2\u0967\u0968\7\6\2"+
		"\2\u0968\u096a\5\u00c2b\2\u0969\u0967\3\2\2\2\u096a\u096d\3\2\2\2\u096b"+
		"\u0969\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096e\3\2\2\2\u096d\u096b\3\2"+
		"\2\2\u096e\u096f\7\5\2\2\u096f\u00c1\3\2\2\2\u0970\u0973\5\u00c4c\2\u0971"+
		"\u0973\5\u00f4{\2\u0972\u0970\3\2\2\2\u0972\u0971\3\2\2\2\u0973\u00c3"+
		"\3\2\2\2\u0974\u0982\5\u010a\u0086\2\u0975\u0976\5\u0110\u0089\2\u0976"+
		"\u0977\7\4\2\2\u0977\u097c\5\u00c6d\2\u0978\u0979\7\6\2\2\u0979\u097b"+
		"\5\u00c6d\2\u097a\u0978\3\2\2\2\u097b\u097e\3\2\2\2\u097c\u097a\3\2\2"+
		"\2\u097c\u097d\3\2\2\2\u097d\u097f\3\2\2\2\u097e\u097c\3\2\2\2\u097f\u0980"+
		"\7\5\2\2\u0980\u0982\3\2\2\2\u0981\u0974\3\2\2\2\u0981\u0975\3\2\2\2\u0982"+
		"\u00c5\3\2\2\2\u0983\u0986\5\u010a\u0086\2\u0984\u0986\5\u00d4k\2\u0985"+
		"\u0983\3\2\2\2\u0985\u0984\3\2\2\2\u0986\u00c7\3\2\2\2\u0987\u0988\5\u00cc"+
		"g\2\u0988\u00c9\3\2\2\2\u0989\u098e\5\u00c8e\2\u098a\u098b\7\6\2\2\u098b"+
		"\u098d\5\u00c8e\2\u098c\u098a\3\2\2\2\u098d\u0990\3\2\2\2\u098e\u098c"+
		"\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u00cb\3\2\2\2\u0990\u098e\3\2\2\2\u0991"+
		"\u0992\bg\1\2\u0992\u0993\7\u009f\2\2\u0993\u099e\5\u00ccg\7\u0994\u0995"+
		"\7X\2\2\u0995\u0996\7\4\2\2\u0996\u0997\5$\23\2\u0997\u0998\7\5\2\2\u0998"+
		"\u099e\3\2\2\2\u0999\u099b\5\u00d0i\2\u099a\u099c\5\u00ceh\2\u099b\u099a"+
		"\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099e\3\2\2\2\u099d\u0991\3\2\2\2\u099d"+
		"\u0994\3\2\2\2\u099d\u0999\3\2\2\2\u099e\u09a7\3\2\2\2\u099f\u09a0\f\4"+
		"\2\2\u09a0\u09a1\7\23\2\2\u09a1\u09a6\5\u00ccg\5\u09a2\u09a3\f\3\2\2\u09a3"+
		"\u09a4\7\u00a7\2\2\u09a4\u09a6\5\u00ccg\4\u09a5\u099f\3\2\2\2\u09a5\u09a2"+
		"\3\2\2\2\u09a6\u09a9\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8"+
		"\u00cd\3\2\2\2\u09a9\u09a7\3\2\2\2\u09aa\u09ac\7\u009f\2\2\u09ab\u09aa"+
		"\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\7\34\2\2"+
		"\u09ae\u09af\5\u00d0i\2\u09af\u09b0\7\23\2\2\u09b0\u09b1\5\u00d0i\2\u09b1"+
		"\u09fd\3\2\2\2\u09b2\u09b4\7\u009f\2\2\u09b3\u09b2\3\2\2\2\u09b3\u09b4"+
		"\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\7v\2\2\u09b6\u09b7\7\4\2\2\u09b7"+
		"\u09bc\5\u00c8e\2\u09b8\u09b9\7\6\2\2\u09b9\u09bb\5\u00c8e\2\u09ba\u09b8"+
		"\3\2\2\2\u09bb\u09be\3\2\2\2\u09bc\u09ba\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd"+
		"\u09bf\3\2\2\2\u09be\u09bc\3\2\2\2\u09bf\u09c0\7\5\2\2\u09c0\u09fd\3\2"+
		"\2\2\u09c1\u09c3\7\u009f\2\2\u09c2\u09c1\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3"+
		"\u09c4\3\2\2\2\u09c4\u09c5\7v\2\2\u09c5\u09c6\7\4\2\2\u09c6\u09c7\5$\23"+
		"\2\u09c7\u09c8\7\5\2\2\u09c8\u09fd\3\2\2\2\u09c9\u09cb\7\u009f\2\2\u09ca"+
		"\u09c9\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\7\u00cc"+
		"\2\2\u09cd\u09fd\5\u00d0i\2\u09ce\u09d0\7\u009f\2\2\u09cf\u09ce\3\2\2"+
		"\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1\3\2\2\2\u09d1\u09d2\t\30\2\2\u09d2"+
		"\u09e0\t\31\2\2\u09d3\u09d4\7\4\2\2\u09d4\u09e1\7\5\2\2\u09d5\u09d6\7"+
		"\4\2\2\u09d6\u09db\5\u00c8e\2\u09d7\u09d8\7\6\2\2\u09d8\u09da\5\u00c8"+
		"e\2\u09d9\u09d7\3\2\2\2\u09da\u09dd\3\2\2\2\u09db\u09d9\3\2\2\2\u09db"+
		"\u09dc\3\2\2\2\u09dc\u09de\3\2\2\2\u09dd\u09db\3\2\2\2\u09de\u09df\7\5"+
		"\2\2\u09df\u09e1\3\2\2\2\u09e0\u09d3\3\2\2\2\u09e0\u09d5\3\2\2\2\u09e1"+
		"\u09fd\3\2\2\2\u09e2\u09e4\7\u009f\2\2\u09e3\u09e2\3\2\2\2\u09e3\u09e4"+
		"\3\2\2\2\u09e4\u09e5\3\2\2\2\u09e5\u09e6\t\30\2\2\u09e6\u09e9\5\u00d0"+
		"i\2\u09e7\u09e8\7T\2\2\u09e8\u09ea\7\u0126\2\2\u09e9\u09e7\3\2\2\2\u09e9"+
		"\u09ea\3\2\2\2\u09ea\u09fd\3\2\2\2\u09eb\u09ed\7\u0080\2\2\u09ec\u09ee"+
		"\7\u009f\2\2\u09ed\u09ec\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09ef\3\2\2"+
		"\2\u09ef\u09fd\7\u00a0\2\2\u09f0\u09f2\7\u0080\2\2\u09f1\u09f3\7\u009f"+
		"\2\2\u09f2\u09f1\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4"+
		"\u09fd\t\32\2\2\u09f5\u09f7\7\u0080\2\2\u09f6\u09f8\7\u009f\2\2\u09f7"+
		"\u09f6\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u09fa\7N"+
		"\2\2\u09fa\u09fb\7i\2\2\u09fb\u09fd\5\u00d0i\2\u09fc\u09ab\3\2\2\2\u09fc"+
		"\u09b3\3\2\2\2\u09fc\u09c2\3\2\2\2\u09fc\u09ca\3\2\2\2\u09fc\u09cf\3\2"+
		"\2\2\u09fc\u09e3\3\2\2\2\u09fc\u09eb\3\2\2\2\u09fc\u09f0\3\2\2\2\u09fc"+
		"\u09f5\3\2\2\2\u09fd\u00cf\3\2\2\2\u09fe\u09ff\bi\1\2\u09ff\u0a03\5\u00d2"+
		"j\2\u0a00\u0a01\t\33\2\2\u0a01\u0a03\5\u00d0i\t\u0a02\u09fe\3\2\2\2\u0a02"+
		"\u0a00\3\2\2\2\u0a03\u0a19\3\2\2\2\u0a04\u0a05\f\b\2\2\u0a05\u0a06\t\34"+
		"\2\2\u0a06\u0a18\5\u00d0i\t\u0a07\u0a08\f\7\2\2\u0a08\u0a09\t\35\2\2\u0a09"+
		"\u0a18\5\u00d0i\b\u0a0a\u0a0b\f\6\2\2\u0a0b\u0a0c\7\u0122\2\2\u0a0c\u0a18"+
		"\5\u00d0i\7\u0a0d\u0a0e\f\5\2\2\u0a0e\u0a0f\7\u0125\2\2\u0a0f\u0a18\5"+
		"\u00d0i\6\u0a10\u0a11\f\4\2\2\u0a11\u0a12\7\u0123\2\2\u0a12\u0a18\5\u00d0"+
		"i\5\u0a13\u0a14\f\3\2\2\u0a14\u0a15\5\u00d6l\2\u0a15\u0a16\5\u00d0i\4"+
		"\u0a16\u0a18\3\2\2\2\u0a17\u0a04\3\2\2\2\u0a17\u0a07\3\2\2\2\u0a17\u0a0a"+
		"\3\2\2\2\u0a17\u0a0d\3\2\2\2\u0a17\u0a10\3\2\2\2\u0a17\u0a13\3\2\2\2\u0a18"+
		"\u0a1b\3\2\2\2\u0a19\u0a17\3\2\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u00d1\3\2"+
		"\2\2\u0a1b\u0a19\3\2\2\2\u0a1c\u0a1d\bj\1\2\u0a1d\u0ad9\t\36\2\2\u0a1e"+
		"\u0a20\7#\2\2\u0a1f\u0a21\5\u00fa~\2\u0a20\u0a1f\3\2\2\2\u0a21\u0a22\3"+
		"\2\2\2\u0a22\u0a20\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a26\3\2\2\2\u0a24"+
		"\u0a25\7R\2\2\u0a25\u0a27\5\u00c8e\2\u0a26\u0a24\3\2\2\2\u0a26\u0a27\3"+
		"\2\2\2\u0a27\u0a28\3\2\2\2\u0a28\u0a29\7S\2\2\u0a29\u0ad9\3\2\2\2\u0a2a"+
		"\u0a2b\7#\2\2\u0a2b\u0a2d\5\u00c8e\2\u0a2c\u0a2e\5\u00fa~\2\u0a2d\u0a2c"+
		"\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f\u0a2d\3\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30"+
		"\u0a33\3\2\2\2\u0a31\u0a32\7R\2\2\u0a32\u0a34\5\u00c8e\2\u0a33\u0a31\3"+
		"\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\7S\2\2\u0a36"+
		"\u0ad9\3\2\2\2\u0a37\u0a38\t\37\2\2\u0a38\u0a39\7\4\2\2\u0a39\u0a3a\5"+
		"\u00c8e\2\u0a3a\u0a3b\7\30\2\2\u0a3b\u0a3c\5\u00ecw\2\u0a3c\u0a3d\7\5"+
		"\2\2\u0a3d\u0ad9\3\2\2\2\u0a3e\u0a3f\7\u00e7\2\2\u0a3f\u0a48\7\4\2\2\u0a40"+
		"\u0a45\5\u00bc_\2\u0a41\u0a42\7\6\2\2\u0a42\u0a44\5\u00bc_\2\u0a43\u0a41"+
		"\3\2\2\2\u0a44\u0a47\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46"+
		"\u0a49\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a48\u0a40\3\2\2\2\u0a48\u0a49\3\2"+
		"\2\2\u0a49\u0a4a\3\2\2\2\u0a4a\u0ad9\7\5\2\2\u0a4b\u0a4c\7c\2\2\u0a4c"+
		"\u0a4d\7\4\2\2\u0a4d\u0a50\5\u00c8e\2\u0a4e\u0a4f\7t\2\2\u0a4f\u0a51\7"+
		"\u00a1\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51\u0a52\3\2\2\2"+
		"\u0a52\u0a53\7\5\2\2\u0a53\u0ad9\3\2\2\2\u0a54\u0a55\7\u0084\2\2\u0a55"+
		"\u0a56\7\4\2\2\u0a56\u0a59\5\u00c8e\2\u0a57\u0a58\7t\2\2\u0a58\u0a5a\7"+
		"\u00a1\2\2\u0a59\u0a57\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5b\3\2\2\2"+
		"\u0a5b\u0a5c\7\5\2\2\u0a5c\u0ad9\3\2\2\2\u0a5d\u0a5e\7\u00b6\2\2\u0a5e"+
		"\u0a5f\7\4\2\2\u0a5f\u0a60\5\u00d0i\2\u0a60\u0a61\7v\2\2\u0a61\u0a62\5"+
		"\u00d0i\2\u0a62\u0a63\7\5\2\2\u0a63\u0ad9\3\2\2\2\u0a64\u0ad9\5\u00d4"+
		"k\2\u0a65\u0ad9\7\u011e\2\2\u0a66\u0a67\5\u010a\u0086\2\u0a67\u0a68\7"+
		"\7\2\2\u0a68\u0a69\7\u011e\2\2\u0a69\u0ad9\3\2\2\2\u0a6a\u0a6b\7\4\2\2"+
		"\u0a6b\u0a6e\5\u00bc_\2\u0a6c\u0a6d\7\6\2\2\u0a6d\u0a6f\5\u00bc_\2\u0a6e"+
		"\u0a6c\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70\u0a6e\3\2\2\2\u0a70\u0a71\3\2"+
		"\2\2\u0a71\u0a72\3\2\2\2\u0a72\u0a73\7\5\2\2\u0a73\u0ad9\3\2\2\2\u0a74"+
		"\u0a75\7\4\2\2\u0a75\u0a76\5$\23\2\u0a76\u0a77\7\5\2\2\u0a77\u0ad9\3\2"+
		"\2\2\u0a78\u0a79\5\u0108\u0085\2\u0a79\u0a85\7\4\2\2\u0a7a\u0a7c\5\u0090"+
		"I\2\u0a7b\u0a7a\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d"+
		"\u0a82\5\u00c8e\2\u0a7e\u0a7f\7\6\2\2\u0a7f\u0a81\5\u00c8e\2\u0a80\u0a7e"+
		"\3\2\2\2\u0a81\u0a84\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83"+
		"\u0a86\3\2\2\2\u0a84\u0a82\3\2\2\2\u0a85\u0a7b\3\2\2\2\u0a85\u0a86\3\2"+
		"\2\2\u0a86\u0a87\3\2\2\2\u0a87\u0a8e\7\5\2\2\u0a88\u0a89\7a\2\2\u0a89"+
		"\u0a8a\7\4\2\2\u0a8a\u0a8b\7\u010e\2\2\u0a8b\u0a8c\5\u00ccg\2\u0a8c\u0a8d"+
		"\7\5\2\2\u0a8d\u0a8f\3\2\2\2\u0a8e\u0a88\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f"+
		"\u0a92\3\2\2\2\u0a90\u0a91\t \2\2\u0a91\u0a93\7\u00a1\2\2\u0a92\u0a90"+
		"\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u0a96\3\2\2\2\u0a94\u0a95\7\u00ac\2"+
		"\2\u0a95\u0a97\5\u0100\u0081\2\u0a96\u0a94\3\2\2\2\u0a96\u0a97\3\2\2\2"+
		"\u0a97\u0ad9\3\2\2\2\u0a98\u0a99\5\u0110\u0089\2\u0a99\u0a9a\7\n\2\2\u0a9a"+
		"\u0a9b\5\u00c8e\2\u0a9b\u0ad9\3\2\2\2\u0a9c\u0a9d\7\4\2\2\u0a9d\u0aa0"+
		"\5\u0110\u0089\2\u0a9e\u0a9f\7\6\2\2\u0a9f\u0aa1\5\u0110\u0089\2\u0aa0"+
		"\u0a9e\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2\u0aa0\3\2\2\2\u0aa2\u0aa3\3\2"+
		"\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa5\7\5\2\2\u0aa5\u0aa6\7\n\2\2\u0aa6"+
		"\u0aa7\5\u00c8e\2\u0aa7\u0ad9\3\2\2\2\u0aa8\u0ad9\5\u0110\u0089\2\u0aa9"+
		"\u0aaa\7\4\2\2\u0aaa\u0aab\5\u00c8e\2\u0aab\u0aac\7\5\2\2\u0aac\u0ad9"+
		"\3\2\2\2\u0aad\u0aae\7]\2\2\u0aae\u0aaf\7\4\2\2\u0aaf\u0ab0\5\u0110\u0089"+
		"\2\u0ab0\u0ab1\7i\2\2\u0ab1\u0ab2\5\u00d0i\2\u0ab2\u0ab3\7\5\2\2\u0ab3"+
		"\u0ad9\3\2\2\2\u0ab4\u0ab5\t!\2\2\u0ab5\u0ab6\7\4\2\2\u0ab6\u0ab7\5\u00d0"+
		"i\2\u0ab7\u0ab8\t\"\2\2\u0ab8\u0abb\5\u00d0i\2\u0ab9\u0aba\t#\2\2\u0aba"+
		"\u0abc\5\u00d0i\2\u0abb\u0ab9\3\2\2\2\u0abb\u0abc\3\2\2\2\u0abc\u0abd"+
		"\3\2\2\2\u0abd\u0abe\7\5\2\2\u0abe\u0ad9\3\2\2\2\u0abf\u0ac0\7\u00f9\2"+
		"\2\u0ac0\u0ac2\7\4\2\2\u0ac1\u0ac3\t$\2\2\u0ac2\u0ac1\3\2\2\2\u0ac2\u0ac3"+
		"\3\2\2\2\u0ac3\u0ac5\3\2\2\2\u0ac4\u0ac6\5\u00d0i\2\u0ac5\u0ac4\3\2\2"+
		"\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7\u0ac8\7i\2\2\u0ac8\u0ac9"+
		"\5\u00d0i\2\u0ac9\u0aca\7\5\2\2\u0aca\u0ad9\3\2\2\2\u0acb\u0acc\7\u00ae"+
		"\2\2\u0acc\u0acd\7\4\2\2\u0acd\u0ace\5\u00d0i\2\u0ace\u0acf\7\u00b5\2"+
		"\2\u0acf\u0ad0\5\u00d0i\2\u0ad0\u0ad1\7i\2\2\u0ad1\u0ad4\5\u00d0i\2\u0ad2"+
		"\u0ad3\7e\2\2\u0ad3\u0ad5\5\u00d0i\2\u0ad4\u0ad2\3\2\2\2\u0ad4\u0ad5\3"+
		"\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u0ad7\7\5\2\2\u0ad7\u0ad9\3\2\2\2\u0ad8"+
		"\u0a1c\3\2\2\2\u0ad8\u0a1e\3\2\2\2\u0ad8\u0a2a\3\2\2\2\u0ad8\u0a37\3\2"+
		"\2\2\u0ad8\u0a3e\3\2\2\2\u0ad8\u0a4b\3\2\2\2\u0ad8\u0a54\3\2\2\2\u0ad8"+
		"\u0a5d\3\2\2\2\u0ad8\u0a64\3\2\2\2\u0ad8\u0a65\3\2\2\2\u0ad8\u0a66\3\2"+
		"\2\2\u0ad8\u0a6a\3\2\2\2\u0ad8\u0a74\3\2\2\2\u0ad8\u0a78\3\2\2\2\u0ad8"+
		"\u0a98\3\2\2\2\u0ad8\u0a9c\3\2\2\2\u0ad8\u0aa8\3\2\2\2\u0ad8\u0aa9\3\2"+
		"\2\2\u0ad8\u0aad\3\2\2\2\u0ad8\u0ab4\3\2\2\2\u0ad8\u0abf\3\2\2\2\u0ad8"+
		"\u0acb\3\2\2\2\u0ad9\u0ae4\3\2\2\2\u0ada\u0adb\f\n\2\2\u0adb\u0adc\7\13"+
		"\2\2\u0adc\u0add\5\u00d0i\2\u0add\u0ade\7\f\2\2\u0ade\u0ae3\3\2\2\2\u0adf"+
		"\u0ae0\f\b\2\2\u0ae0\u0ae1\7\7\2\2\u0ae1\u0ae3\5\u0110\u0089\2\u0ae2\u0ada"+
		"\3\2\2\2\u0ae2\u0adf\3\2\2\2\u0ae3\u0ae6\3\2\2\2\u0ae4\u0ae2\3\2\2\2\u0ae4"+
		"\u0ae5\3\2\2\2\u0ae5\u00d3\3\2\2\2\u0ae6\u0ae4\3\2\2\2\u0ae7\u0af4\7\u00a0"+
		"\2\2\u0ae8\u0af4\5\u00dep\2\u0ae9\u0aea\5\u0110\u0089\2\u0aea\u0aeb\7"+
		"\u0126\2\2\u0aeb\u0af4\3\2\2\2\u0aec\u0af4\5\u0116\u008c\2\u0aed\u0af4"+
		"\5\u00dco\2\u0aee\u0af0\7\u0126\2\2\u0aef\u0aee\3\2\2\2\u0af0\u0af1\3"+
		"\2\2\2\u0af1\u0aef\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0af4\3\2\2\2\u0af3"+
		"\u0ae7\3\2\2\2\u0af3\u0ae8\3\2\2\2\u0af3\u0ae9\3\2\2\2\u0af3\u0aec\3\2"+
		"\2\2\u0af3\u0aed\3\2\2\2\u0af3\u0aef\3\2\2\2\u0af4\u00d5\3\2\2\2\u0af5"+
		"\u0af6\t%\2\2\u0af6\u00d7\3\2\2\2\u0af7\u0af8\t&\2\2\u0af8\u00d9\3\2\2"+
		"\2\u0af9\u0afa\t\'\2\2\u0afa\u00db\3\2\2\2\u0afb\u0afc\t(\2\2\u0afc\u00dd"+
		"\3\2\2\2\u0afd\u0b00\7~\2\2\u0afe\u0b01\5\u00e0q\2\u0aff\u0b01\5\u00e4"+
		"s\2\u0b00\u0afe\3\2\2\2\u0b00\u0aff\3\2\2\2\u0b00\u0b01\3\2\2\2\u0b01"+
		"\u00df\3\2\2\2\u0b02\u0b04\5\u00e2r\2\u0b03\u0b05\5\u00e6t\2\u0b04\u0b03"+
		"\3\2\2\2\u0b04\u0b05\3\2\2\2\u0b05\u00e1\3\2\2\2\u0b06\u0b07\5\u00e8u"+
		"\2\u0b07\u0b08\5\u0110\u0089\2\u0b08\u0b0a\3\2\2\2\u0b09\u0b06\3\2\2\2"+
		"\u0b0a\u0b0b\3\2\2\2\u0b0b\u0b09\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u00e3"+
		"\3\2\2\2\u0b0d\u0b10\5\u00e6t\2\u0b0e\u0b11\5\u00e2r\2\u0b0f\u0b11\5\u00e6"+
		"t\2\u0b10\u0b0e\3\2\2\2\u0b10\u0b0f\3\2\2\2\u0b10\u0b11\3\2\2\2\u0b11"+
		"\u00e5\3\2\2\2\u0b12\u0b13\5\u00e8u\2\u0b13\u0b14\5\u0110\u0089\2\u0b14"+
		"\u0b15\7\u00f3\2\2\u0b15\u0b16\5\u0110\u0089\2\u0b16\u00e7\3\2\2\2\u0b17"+
		"\u0b19\t)\2\2\u0b18\u0b17\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b1a\3\2"+
		"\2\2\u0b1a\u0b1b\t*\2\2\u0b1b\u00e9\3\2\2\2\u0b1c\u0b20\7c\2\2\u0b1d\u0b1e"+
		"\7\17\2\2\u0b1e\u0b20\5\u010c\u0087\2\u0b1f\u0b1c\3\2\2\2\u0b1f\u0b1d"+
		"\3\2\2\2\u0b20\u00eb\3\2\2\2\u0b21\u0b22\7\27\2\2\u0b22\u0b23\7\u0118"+
		"\2\2\u0b23\u0b24\5\u00ecw\2\u0b24\u0b25\7\u011a\2\2\u0b25\u0b50\3\2\2"+
		"\2\u0b26\u0b27\7\u0095\2\2\u0b27\u0b28\7\u0118\2\2\u0b28\u0b29\5\u00ec"+
		"w\2\u0b29\u0b2a\7\6\2\2\u0b2a\u0b2b\5\u00ecw\2\u0b2b\u0b2c\7\u011a\2\2"+
		"\u0b2c\u0b50\3\2\2\2\u0b2d\u0b34\7\u00e7\2\2\u0b2e\u0b30\7\u0118\2\2\u0b2f"+
		"\u0b31\5\u00f6|\2\u0b30\u0b2f\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31\u0b32"+
		"\3\2\2\2\u0b32\u0b35\7\u011a\2\2\u0b33\u0b35\7\u0116\2\2\u0b34\u0b2e\3"+
		"\2\2\2\u0b34\u0b33\3\2\2\2\u0b35\u0b50\3\2\2\2\u0b36\u0b37\7~\2\2\u0b37"+
		"\u0b3a\t+\2\2\u0b38\u0b39\7\u00f3\2\2\u0b39\u0b3b\7\u0099\2\2\u0b3a\u0b38"+
		"\3\2\2\2\u0b3a\u0b3b\3\2\2\2\u0b3b\u0b50\3\2\2\2\u0b3c\u0b3d\7~\2\2\u0b3d"+
		"\u0b40\t,\2\2\u0b3e\u0b3f\7\u00f3\2\2\u0b3f\u0b41\t-\2\2\u0b40\u0b3e\3"+
		"\2\2\2\u0b40\u0b41\3\2\2\2\u0b41\u0b50\3\2\2\2\u0b42\u0b4d\5\u0110\u0089"+
		"\2\u0b43\u0b44\7\4\2\2\u0b44\u0b49\7\u012a\2\2\u0b45\u0b46\7\6\2\2\u0b46"+
		"\u0b48\7\u012a\2\2\u0b47\u0b45\3\2\2\2\u0b48\u0b4b\3\2\2\2\u0b49\u0b47"+
		"\3\2\2\2\u0b49\u0b4a\3\2\2\2\u0b4a\u0b4c\3\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4c"+
		"\u0b4e\7\5\2\2\u0b4d\u0b43\3\2\2\2\u0b4d\u0b4e\3\2\2\2\u0b4e\u0b50\3\2"+
		"\2\2\u0b4f\u0b21\3\2\2\2\u0b4f\u0b26\3\2\2\2\u0b4f\u0b2d\3\2\2\2\u0b4f"+
		"\u0b36\3\2\2\2\u0b4f\u0b3c\3\2\2\2\u0b4f\u0b42\3\2\2\2\u0b50\u00ed\3\2"+
		"\2\2\u0b51\u0b56\5\u00f0y\2\u0b52\u0b53\7\6\2\2\u0b53\u0b55\5\u00f0y\2"+
		"\u0b54\u0b52\3\2\2\2\u0b55\u0b58\3\2\2\2\u0b56\u0b54\3\2\2\2\u0b56\u0b57"+
		"\3\2\2\2\u0b57\u00ef\3\2\2\2\u0b58\u0b56\3\2\2\2\u0b59\u0b5a\5\u00b6\\"+
		"\2\u0b5a\u0b5d\5\u00ecw\2\u0b5b\u0b5c\7\u009f\2\2\u0b5c\u0b5e\7\u00a0"+
		"\2\2\u0b5d\u0b5b\3\2\2\2\u0b5d\u0b5e\3\2\2\2\u0b5e\u0b60\3\2\2\2\u0b5f"+
		"\u0b61\5\"\22\2\u0b60\u0b5f\3\2\2\2\u0b60\u0b61\3\2\2\2\u0b61\u0b63\3"+
		"\2\2\2\u0b62\u0b64\5\u00eav\2\u0b63\u0b62\3\2\2\2\u0b63\u0b64\3\2\2\2"+
		"\u0b64\u00f1\3\2\2\2\u0b65\u0b6a\5\u00f4{\2\u0b66\u0b67\7\6\2\2\u0b67"+
		"\u0b69\5\u00f4{\2\u0b68\u0b66\3\2\2\2\u0b69\u0b6c\3\2\2\2\u0b6a\u0b68"+
		"\3\2\2\2\u0b6a\u0b6b\3\2\2\2\u0b6b\u00f3\3\2\2\2\u0b6c\u0b6a\3\2\2\2\u0b6d"+
		"\u0b6e\5\u010c\u0087\2\u0b6e\u0b71\5\u00ecw\2\u0b6f\u0b70\7\u009f\2\2"+
		"\u0b70\u0b72\7\u00a0\2\2\u0b71\u0b6f\3\2\2\2\u0b71\u0b72\3\2\2\2\u0b72"+
		"\u0b74\3\2\2\2\u0b73\u0b75\5\"\22\2\u0b74\u0b73\3\2\2\2\u0b74\u0b75\3"+
		"\2\2\2\u0b75\u00f5\3\2\2\2\u0b76\u0b7b\5\u00f8}\2\u0b77\u0b78\7\6\2\2"+
		"\u0b78\u0b7a\5\u00f8}\2\u0b79\u0b77\3\2\2\2\u0b7a\u0b7d\3\2\2\2\u0b7b"+
		"\u0b79\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c\u00f7\3\2\2\2\u0b7d\u0b7b\3\2"+
		"\2\2\u0b7e\u0b80\5\u0110\u0089\2\u0b7f\u0b81\7\r\2\2\u0b80\u0b7f\3\2\2"+
		"\2\u0b80\u0b81\3\2\2\2\u0b81\u0b82\3\2\2\2\u0b82\u0b85\5\u00ecw\2\u0b83"+
		"\u0b84\7\u009f\2\2\u0b84\u0b86\7\u00a0\2\2\u0b85\u0b83\3\2\2\2\u0b85\u0b86"+
		"\3\2\2\2\u0b86\u0b88\3\2\2\2\u0b87\u0b89\5\"\22\2\u0b88\u0b87\3\2\2\2"+
		"\u0b88\u0b89\3\2\2\2\u0b89\u00f9\3\2\2\2\u0b8a\u0b8b\7\u010d\2\2\u0b8b"+
		"\u0b8c\5\u00c8e\2\u0b8c\u0b8d\7\u00f1\2\2\u0b8d\u0b8e\5\u00c8e\2\u0b8e"+
		"\u00fb\3\2\2\2\u0b8f\u0b90\7\u010f\2\2\u0b90\u0b95\5\u00fe\u0080\2\u0b91"+
		"\u0b92\7\6\2\2\u0b92\u0b94\5\u00fe\u0080\2\u0b93\u0b91\3\2\2\2\u0b94\u0b97"+
		"\3\2\2\2\u0b95\u0b93\3\2\2\2\u0b95\u0b96\3\2\2\2\u0b96\u00fd\3\2\2\2\u0b97"+
		"\u0b95\3\2\2\2\u0b98\u0b99\5\u010c\u0087\2\u0b99\u0b9a\7\30\2\2\u0b9a"+
		"\u0b9b\5\u0100\u0081\2\u0b9b\u00ff\3\2\2\2\u0b9c\u0bcb\5\u010c\u0087\2"+
		"\u0b9d\u0b9e\7\4\2\2\u0b9e\u0b9f\5\u010c\u0087\2\u0b9f\u0ba0\7\5\2\2\u0ba0"+
		"\u0bcb\3\2\2\2\u0ba1\u0bc4\7\4\2\2\u0ba2\u0ba3\7*\2\2\u0ba3\u0ba4\7 \2"+
		"\2\u0ba4\u0ba9\5\u00c8e\2\u0ba5\u0ba6\7\6\2\2\u0ba6\u0ba8\5\u00c8e\2\u0ba7"+
		"\u0ba5\3\2\2\2\u0ba8\u0bab\3\2\2\2\u0ba9\u0ba7\3\2\2\2\u0ba9\u0baa\3\2"+
		"\2\2\u0baa\u0bc5\3\2\2\2\u0bab\u0ba9\3\2\2\2\u0bac\u0bad\t.\2\2\u0bad"+
		"\u0bae\7 \2\2\u0bae\u0bb3\5\u00c8e\2\u0baf\u0bb0\7\6\2\2\u0bb0\u0bb2\5"+
		"\u00c8e\2\u0bb1\u0baf\3\2\2\2\u0bb2\u0bb5\3\2\2\2\u0bb3\u0bb1\3\2\2\2"+
		"\u0bb3\u0bb4\3\2\2\2\u0bb4\u0bb7\3\2\2\2\u0bb5\u0bb3\3\2\2\2\u0bb6\u0bac"+
		"\3\2\2\2\u0bb6\u0bb7\3\2\2\2\u0bb7\u0bc2\3\2\2\2\u0bb8\u0bb9\t/\2\2\u0bb9"+
		"\u0bba\7 \2\2\u0bba\u0bbf\5Z.\2\u0bbb\u0bbc\7\6\2\2\u0bbc\u0bbe\5Z.\2"+
		"\u0bbd\u0bbb\3\2\2\2\u0bbe\u0bc1\3\2\2\2\u0bbf\u0bbd\3\2\2\2\u0bbf\u0bc0"+
		"\3\2\2\2\u0bc0\u0bc3\3\2\2\2\u0bc1\u0bbf\3\2\2\2\u0bc2\u0bb8\3\2\2\2\u0bc2"+
		"\u0bc3\3\2\2\2\u0bc3\u0bc5\3\2\2\2\u0bc4\u0ba2\3\2\2\2\u0bc4\u0bb6\3\2"+
		"\2\2\u0bc5\u0bc7\3\2\2\2\u0bc6\u0bc8\5\u0102\u0082\2\u0bc7\u0bc6\3\2\2"+
		"\2\u0bc7\u0bc8\3\2\2\2\u0bc8\u0bc9\3\2\2\2\u0bc9\u0bcb\7\5\2\2\u0bca\u0b9c"+
		"\3\2\2\2\u0bca\u0b9d\3\2\2\2\u0bca\u0ba1\3\2\2\2\u0bcb\u0101\3\2\2\2\u0bcc"+
		"\u0bcd\7\u00bd\2\2\u0bcd\u0bdd\5\u0104\u0083\2\u0bce\u0bcf\7\u00d2\2\2"+
		"\u0bcf\u0bdd\5\u0104\u0083\2\u0bd0\u0bd1\7\u00bd\2\2\u0bd1\u0bd2\7\34"+
		"\2\2\u0bd2\u0bd3\5\u0104\u0083\2\u0bd3\u0bd4\7\23\2\2\u0bd4\u0bd5\5\u0104"+
		"\u0083\2\u0bd5\u0bdd\3\2\2\2\u0bd6\u0bd7\7\u00d2\2\2\u0bd7\u0bd8\7\34"+
		"\2\2\u0bd8\u0bd9\5\u0104\u0083\2\u0bd9\u0bda\7\23\2\2\u0bda\u0bdb\5\u0104"+
		"\u0083\2\u0bdb\u0bdd\3\2\2\2\u0bdc\u0bcc\3\2\2\2\u0bdc\u0bce\3\2\2\2\u0bdc"+
		"\u0bd0\3\2\2\2\u0bdc\u0bd6\3\2\2\2\u0bdd\u0103\3\2\2\2\u0bde\u0bdf\7\u00ff"+
		"\2\2\u0bdf\u0be6\t\60\2\2\u0be0\u0be1\7<\2\2\u0be1\u0be6\7\u00d1\2\2\u0be2"+
		"\u0be3\5\u00c8e\2\u0be3\u0be4\t\60\2\2\u0be4\u0be6\3\2\2\2\u0be5\u0bde"+
		"\3\2\2\2\u0be5\u0be0\3\2\2\2\u0be5\u0be2\3\2\2\2\u0be6\u0105\3\2\2\2\u0be7"+
		"\u0bec\5\u010a\u0086\2\u0be8\u0be9\7\6\2\2\u0be9\u0beb\5\u010a\u0086\2"+
		"\u0bea\u0be8\3\2\2\2\u0beb\u0bee\3\2\2\2\u0bec\u0bea\3\2\2\2\u0bec\u0bed"+
		"\3\2\2\2\u0bed\u0107\3\2\2\2\u0bee\u0bec\3\2\2\2\u0bef\u0bf4\5\u010a\u0086"+
		"\2\u0bf0\u0bf4\7a\2\2\u0bf1\u0bf4\7\u0088\2\2\u0bf2\u0bf4\7\u00cb\2\2"+
		"\u0bf3\u0bef\3\2\2\2\u0bf3\u0bf0\3\2\2\2\u0bf3\u0bf1\3\2\2\2\u0bf3\u0bf2"+
		"\3\2\2\2\u0bf4\u0109\3\2\2\2\u0bf5\u0bfa\5\u0110\u0089\2\u0bf6\u0bf7\7"+
		"\7\2\2\u0bf7\u0bf9\5\u0110\u0089\2\u0bf8\u0bf6\3\2\2\2\u0bf9\u0bfc\3\2"+
		"\2\2\u0bfa\u0bf8\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u010b\3\2\2\2\u0bfc"+
		"\u0bfa\3\2\2\2\u0bfd\u0bfe\5\u0110\u0089\2\u0bfe\u0bff\5\u010e\u0088\2"+
		"\u0bff\u010d\3\2\2\2\u0c00\u0c01\7\u011d\2\2\u0c01\u0c03\5\u0110\u0089"+
		"\2\u0c02\u0c00\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04\u0c02\3\2\2\2\u0c04\u0c05"+
		"\3\2\2\2\u0c05\u0c08\3\2\2\2\u0c06\u0c08\3\2\2\2\u0c07\u0c02\3\2\2\2\u0c07"+
		"\u0c06\3\2\2\2\u0c08\u010f\3\2\2\2\u0c09\u0c0d\5\u0112\u008a\2\u0c0a\u0c0b"+
		"\6\u0089\22\2\u0c0b\u0c0d\5\u011c\u008f\2\u0c0c\u0c09\3\2\2\2\u0c0c\u0c0a"+
		"\3\2\2\2\u0c0d\u0111\3\2\2\2\u0c0e\u0c15\7\u0130\2\2\u0c0f\u0c15\5\u0114"+
		"\u008b\2\u0c10\u0c11\6\u008a\23\2\u0c11\u0c15\5\u011a\u008e\2\u0c12\u0c13"+
		"\6\u008a\24\2\u0c13\u0c15\5\u011e\u0090\2\u0c14\u0c0e\3\2\2\2\u0c14\u0c0f"+
		"\3\2\2\2\u0c14\u0c10\3\2\2\2\u0c14\u0c12\3\2\2\2\u0c15\u0113\3\2\2\2\u0c16"+
		"\u0c17\7\u0131\2\2\u0c17\u0115\3\2\2\2\u0c18\u0c1a\6\u008c\25\2\u0c19"+
		"\u0c1b\7\u011d\2\2\u0c1a\u0c19\3\2\2\2\u0c1a\u0c1b\3\2\2\2\u0c1b\u0c1c"+
		"\3\2\2\2\u0c1c\u0c44\7\u012b\2\2\u0c1d\u0c1f\6\u008c\26\2\u0c1e\u0c20"+
		"\7\u011d\2\2\u0c1f\u0c1e\3\2\2\2\u0c1f\u0c20\3\2\2\2\u0c20\u0c21\3\2\2"+
		"\2\u0c21\u0c44\7\u012c\2\2\u0c22\u0c24\6\u008c\27\2\u0c23\u0c25\7\u011d"+
		"\2\2\u0c24\u0c23\3\2\2\2\u0c24\u0c25\3\2\2\2\u0c25\u0c26\3\2\2\2\u0c26"+
		"\u0c44\t\61\2\2\u0c27\u0c29\7\u011d\2\2\u0c28\u0c27\3\2\2\2\u0c28\u0c29"+
		"\3\2\2\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0c44\7\u012a\2\2\u0c2b\u0c2d\7\u011d"+
		"\2\2\u0c2c\u0c2b\3\2\2\2\u0c2c\u0c2d\3\2\2\2\u0c2d\u0c2e\3\2\2\2\u0c2e"+
		"\u0c44\7\u0127\2\2\u0c2f\u0c31\7\u011d\2\2\u0c30\u0c2f\3\2\2\2\u0c30\u0c31"+
		"\3\2\2\2\u0c31\u0c32\3\2\2\2\u0c32\u0c44\7\u0128\2\2\u0c33\u0c35\7\u011d"+
		"\2\2\u0c34\u0c33\3\2\2\2\u0c34\u0c35\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36"+
		"\u0c44\7\u0129\2\2\u0c37\u0c39\7\u011d\2\2\u0c38\u0c37\3\2\2\2\u0c38\u0c39"+
		"\3\2\2\2\u0c39\u0c3a\3\2\2\2\u0c3a\u0c44\7\u012e\2\2\u0c3b\u0c3d\7\u011d"+
		"\2\2\u0c3c\u0c3b\3\2\2\2\u0c3c\u0c3d\3\2\2\2\u0c3d\u0c3e\3\2\2\2\u0c3e"+
		"\u0c44\7\u012d\2\2\u0c3f\u0c41\7\u011d\2\2\u0c40\u0c3f\3\2\2\2\u0c40\u0c41"+
		"\3\2\2\2\u0c41\u0c42\3\2\2\2\u0c42\u0c44\7\u012f\2\2\u0c43\u0c18\3\2\2"+
		"\2\u0c43\u0c1d\3\2\2\2\u0c43\u0c22\3\2\2\2\u0c43\u0c28\3\2\2\2\u0c43\u0c2c"+
		"\3\2\2\2\u0c43\u0c30\3\2\2\2\u0c43\u0c34\3\2\2\2\u0c43\u0c38\3\2\2\2\u0c43"+
		"\u0c3c\3\2\2\2\u0c43\u0c40\3\2\2\2\u0c44\u0117\3\2\2\2\u0c45\u0c46\7\u00fd"+
		"\2\2\u0c46\u0c4d\5\u00ecw\2\u0c47\u0c4d\5\"\22\2\u0c48\u0c4d\5\u00eav"+
		"\2\u0c49\u0c4a\t\62\2\2\u0c4a\u0c4b\7\u009f\2\2\u0c4b\u0c4d\7\u00a0\2"+
		"\2\u0c4c\u0c45\3\2\2\2\u0c4c\u0c47\3\2\2\2\u0c4c\u0c48\3\2\2\2\u0c4c\u0c49"+
		"\3\2\2\2\u0c4d\u0119\3\2\2\2\u0c4e\u0c4f\t\63\2\2\u0c4f\u011b\3\2\2\2"+
		"\u0c50\u0c51\t\64\2\2\u0c51\u011d\3\2\2\2\u0c52\u0c53\t\65\2\2\u0c53\u011f"+
		"\3\2\2\2\u01a3\u0124\u013d\u0149\u0150\u0158\u015a\u016e\u0172\u0178\u017b"+
		"\u017e\u0185\u0188\u018c\u018f\u0196\u01a1\u01a3\u01ab\u01ae\u01b2\u01b5"+
		"\u01bb\u01c6\u01cc\u01d1\u0211\u021a\u021e\u0224\u0228\u022d\u0233\u023f"+
		"\u0247\u024d\u025a\u025f\u026f\u0276\u027a\u0280\u028f\u0293\u0299\u029f"+
		"\u02a2\u02a5\u02ab\u02af\u02b7\u02b9\u02c2\u02c5\u02ce\u02d3\u02d9\u02e0"+
		"\u02e3\u02e9\u02f4\u02f7\u02fb\u0300\u0305\u030c\u030f\u0312\u0319\u031e"+
		"\u0327\u032f\u0335\u0338\u033b\u0341\u0345\u0349\u034d\u034f\u0357\u035f"+
		"\u0362\u0367\u036d\u0373\u0376\u037a\u037d\u0381\u039d\u03a0\u03a4\u03aa"+
		"\u03ad\u03b0\u03b6\u03be\u03c3\u03c9\u03cf\u03d7\u03de\u03e6\u03f7\u0405"+
		"\u0408\u040e\u0417\u0420\u0427\u042a\u0436\u043a\u0441\u04b5\u04bd\u04c5"+
		"\u04ce\u04d8\u04dc\u04df\u04e5\u04eb\u04f7\u0503\u0508\u0511\u0519\u0520"+
		"\u0522\u0525\u052a\u052e\u0533\u0536\u053b\u0540\u0543\u0548\u054c\u0551"+
		"\u0553\u0557\u0560\u0568\u0571\u0578\u0581\u0586\u0589\u059f\u05a1\u05aa"+
		"\u05b1\u05b4\u05bb\u05bf\u05c5\u05cd\u05d8\u05e3\u05ea\u05f0\u05fc\u0603"+
		"\u060a\u0616\u061e\u0624\u0627\u0630\u0633\u063c\u063f\u0648\u064b\u0654"+
		"\u0657\u065a\u065f\u0661\u066d\u0674\u067b\u067e\u0680\u068c\u0690\u0694"+
		"\u069a\u069e\u06a6\u06aa\u06ad\u06b0\u06b3\u06b7\u06bb\u06c0\u06c4\u06c7"+
		"\u06ca\u06cd\u06d1\u06d6\u06da\u06dd\u06e0\u06e3\u06e5\u06eb\u06f2\u06f7"+
		"\u06fa\u06fd\u0701\u070b\u070f\u0711\u0714\u0718\u071e\u0722\u072d\u0737"+
		"\u0743\u0752\u0757\u075e\u076e\u0773\u0780\u0785\u078d\u0793\u0797\u07a0"+
		"\u07aa\u07b9\u07be\u07c0\u07c4\u07cd\u07da\u07df\u07e3\u07eb\u07ee\u07f2"+
		"\u0800\u080d\u0812\u0816\u0819\u081e\u0827\u082a\u082f\u0836\u0839\u083e"+
		"\u0844\u084a\u084e\u0854\u0858\u085b\u0860\u0863\u0868\u086c\u086f\u0872"+
		"\u0878\u087d\u0882\u0894\u0896\u0899\u08a4\u08ad\u08b4\u08bc\u08c3\u08c7"+
		"\u08cf\u08d7\u08dd\u08e5\u08f1\u08f4\u08fa\u08fe\u0900\u0909\u0915\u0917"+
		"\u091e\u0925\u092b\u0931\u0933\u093a\u0942\u0948\u094f\u0955\u0959\u095b"+
		"\u0962\u096b\u0972\u097c\u0981\u0985\u098e\u099b\u099d\u09a5\u09a7\u09ab"+
		"\u09b3\u09bc\u09c2\u09ca\u09cf\u09db\u09e0\u09e3\u09e9\u09ed\u09f2\u09f7"+
		"\u09fc\u0a02\u0a17\u0a19\u0a22\u0a26\u0a2f\u0a33\u0a45\u0a48\u0a50\u0a59"+
		"\u0a70\u0a7b\u0a82\u0a85\u0a8e\u0a92\u0a96\u0aa2\u0abb\u0ac2\u0ac5\u0ad4"+
		"\u0ad8\u0ae2\u0ae4\u0af1\u0af3\u0b00\u0b04\u0b0b\u0b10\u0b18\u0b1f\u0b30"+
		"\u0b34\u0b3a\u0b40\u0b49\u0b4d\u0b4f\u0b56\u0b5d\u0b60\u0b63\u0b6a\u0b71"+
		"\u0b74\u0b7b\u0b80\u0b85\u0b88\u0b95\u0ba9\u0bb3\u0bb6\u0bbf\u0bc2\u0bc4"+
		"\u0bc7\u0bca\u0bdc\u0be5\u0bec\u0bf3\u0bfa\u0c04\u0c07\u0c0c\u0c14\u0c1a"+
		"\u0c1f\u0c24\u0c28\u0c2c\u0c30\u0c34\u0c38\u0c3c\u0c40\u0c43\u0c4c";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
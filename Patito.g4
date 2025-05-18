lexer grammar Patito;

// ====== TOKENS ======
// Palabras clave
PROGRAM     : 'program';
MAIN        : 'main';
END         : 'end';
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
DO          : 'do';
PRINT       : 'print';
VAR         : 'var';
VOID        : 'void';
INT         : 'int';
FLOAT       : 'float';

// Identificadores y constantes
ID          : [a-zA-Z_][a-zA-Z_0-9]*;
CTE_INT     : [0-9]+;
CTE_FLOAT   : [0-9]+ '.' [0-9]+;
CTE_STRING  : '"' (~["\r\n])* '"';

// Operadores
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
EQUAL       : '=';
NEQ         : '!=';
GT          : '>';
LT          : '<';

// Símbolos
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';
LBRACK      : '[';
RBRACK      : ']';
COLON       : ':';
SEMICOLON   : ';';
COMMA       : ',';

// Ignorados
WS          : [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

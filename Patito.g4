grammar Patito;

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

// ====== PARSER ======
programa : PROGRAM ID SEMICOLON vars? funcs? MAIN bloque END ;

vars : (VAR varsDecl)+ ;
varsDecl : ID (COMMA ID)* COLON tipo SEMICOLON ;

tipo : INT | FLOAT ;

funcs : funcion+ ;
funcion : VOID ID LPAREN parametros? RPAREN COLON vars? bloque ;

parametros : parametro (COMMA parametro)* ;
parametro : ID COLON tipo ;

bloque : LBRACE estatuto* RBRACE ;

estatuto
    : asignacion
    | condicion
    | ciclo
    | escritura
    | llamadaFunc
    ;

asignacion : ID EQUAL expresion SEMICOLON ;

condicion : IF LPAREN expresion RPAREN bloque (ELSE bloque)? ;

ciclo : WHILE LPAREN expresion RPAREN DO bloque ;

escritura : PRINT LPAREN expresion (COMMA expresion)* RPAREN SEMICOLON ;

llamadaFunc : ID LPAREN argumentos? RPAREN SEMICOLON ;
argumentos : expresion (COMMA expresion)* ;

expresion : exp ( (GT | LT | NEQ) exp )? ;
exp : termino ( (PLUS | MINUS) termino )* ;
termino : factor ( (MULT | DIV) factor )* ;
factor : LPAREN expresion RPAREN | PLUS factor | MINUS factor | CTE_INT | CTE_FLOAT | CTE_STRING | ID ;

// Generated from Patito.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PatitoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, MAIN=2, END=3, IF=4, ELSE=5, WHILE=6, DO=7, PRINT=8, VAR=9, 
		VOID=10, INT=11, FLOAT=12, ID=13, CTE_INT=14, CTE_FLOAT=15, CTE_STRING=16, 
		PLUS=17, MINUS=18, MULT=19, DIV=20, EQUAL=21, NEQ=22, GT=23, LT=24, LPAREN=25, 
		RPAREN=26, LBRACE=27, RBRACE=28, LBRACK=29, RBRACK=30, COLON=31, SEMICOLON=32, 
		COMMA=33, WS=34, LINE_COMMENT=35;
	public static final int
		RULE_programa = 0, RULE_vars = 1, RULE_varsDecl = 2, RULE_tipo = 3, RULE_funcs = 4, 
		RULE_funcion = 5, RULE_parametros = 6, RULE_parametro = 7, RULE_bloque = 8, 
		RULE_estatuto = 9, RULE_asignacion = 10, RULE_condicion = 11, RULE_ciclo = 12, 
		RULE_escritura = 13, RULE_llamadaFunc = 14, RULE_argumentos = 15, RULE_expresion = 16, 
		RULE_exp = 17, RULE_termino = 18, RULE_factor = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "vars", "varsDecl", "tipo", "funcs", "funcion", "parametros", 
			"parametro", "bloque", "estatuto", "asignacion", "condicion", "ciclo", 
			"escritura", "llamadaFunc", "argumentos", "expresion", "exp", "termino", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'main'", "'end'", "'if'", "'else'", "'while'", "'do'", 
			"'print'", "'var'", "'void'", "'int'", "'float'", null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'='", "'!='", "'>'", "'<'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "':'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "MAIN", "END", "IF", "ELSE", "WHILE", "DO", "PRINT", 
			"VAR", "VOID", "INT", "FLOAT", "ID", "CTE_INT", "CTE_FLOAT", "CTE_STRING", 
			"PLUS", "MINUS", "MULT", "DIV", "EQUAL", "NEQ", "GT", "LT", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "COLON", "SEMICOLON", 
			"COMMA", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Patito.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PatitoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PatitoParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(PatitoParser.SEMICOLON, 0); }
		public TerminalNode MAIN() { return getToken(PatitoParser.MAIN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode END() { return getToken(PatitoParser.END, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PROGRAM);
			setState(41);
			match(ID);
			setState(42);
			match(SEMICOLON);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(43);
				vars();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOID) {
				{
				setState(46);
				funcs();
				}
			}

			setState(49);
			match(MAIN);
			setState(50);
			bloque();
			setState(51);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(PatitoParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(PatitoParser.VAR, i);
		}
		public List<VarsDeclContext> varsDecl() {
			return getRuleContexts(VarsDeclContext.class);
		}
		public VarsDeclContext varsDecl(int i) {
			return getRuleContext(VarsDeclContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				match(VAR);
				setState(54);
				varsDecl();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarsDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PatitoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PatitoParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(PatitoParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PatitoParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PatitoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PatitoParser.COMMA, i);
		}
		public VarsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterVarsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitVarsDecl(this);
		}
	}

	public final VarsDeclContext varsDecl() throws RecognitionException {
		VarsDeclContext _localctx = new VarsDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				match(ID);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(COLON);
			setState(68);
			tipo();
			setState(69);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PatitoParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PatitoParser.FLOAT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncsContext extends ParserRuleContext {
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitFuncs(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				funcion();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(PatitoParser.VOID, 0); }
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PatitoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PatitoParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PatitoParser.COLON, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(VOID);
			setState(79);
			match(ID);
			setState(80);
			match(LPAREN);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(81);
				parametros();
				}
			}

			setState(84);
			match(RPAREN);
			setState(85);
			match(COLON);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(86);
				vars();
				}
			}

			setState(89);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PatitoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PatitoParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			parametro();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				parametro();
				}
				}
				setState(98);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PatitoParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(COLON);
			setState(101);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PatitoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PatitoParser.RBRACE, 0); }
		public List<EstatutoContext> estatuto() {
			return getRuleContexts(EstatutoContext.class);
		}
		public EstatutoContext estatuto(int i) {
			return getRuleContext(EstatutoContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LBRACE);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8528L) != 0)) {
				{
				{
				setState(104);
				estatuto();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public LlamadaFuncContext llamadaFunc() {
			return getRuleContext(LlamadaFuncContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterEstatuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitEstatuto(this);
		}
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estatuto);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				ciclo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				escritura();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				llamadaFunc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(PatitoParser.EQUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PatitoParser.SEMICOLON, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(120);
			match(EQUAL);
			setState(121);
			expresion();
			setState(122);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PatitoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PatitoParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PatitoParser.RPAREN, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PatitoParser.ELSE, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(IF);
			setState(125);
			match(LPAREN);
			setState(126);
			expresion();
			setState(127);
			match(RPAREN);
			setState(128);
			bloque();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(129);
				match(ELSE);
				setState(130);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicloContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PatitoParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PatitoParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PatitoParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(PatitoParser.DO, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitCiclo(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WHILE);
			setState(134);
			match(LPAREN);
			setState(135);
			expresion();
			setState(136);
			match(RPAREN);
			setState(137);
			match(DO);
			setState(138);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscrituraContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PatitoParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PatitoParser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PatitoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PatitoParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PatitoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PatitoParser.COMMA, i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitEscritura(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_escritura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PRINT);
			setState(141);
			match(LPAREN);
			setState(142);
			expresion();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143);
				match(COMMA);
				setState(144);
				expresion();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(RPAREN);
			setState(151);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PatitoParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PatitoParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(PatitoParser.SEMICOLON, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterLlamadaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitLlamadaFunc(this);
		}
	}

	public final LlamadaFuncContext llamadaFunc() throws RecognitionException {
		LlamadaFuncContext _localctx = new LlamadaFuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_llamadaFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(LPAREN);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34070528L) != 0)) {
				{
				setState(155);
				argumentos();
				}
			}

			setState(158);
			match(RPAREN);
			setState(159);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PatitoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PatitoParser.COMMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expresion();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				expresion();
				}
				}
				setState(168);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GT() { return getToken(PatitoParser.GT, 0); }
		public TerminalNode LT() { return getToken(PatitoParser.LT, 0); }
		public TerminalNode NEQ() { return getToken(PatitoParser.NEQ, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			exp();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) {
				{
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PatitoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PatitoParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PatitoParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PatitoParser.MINUS, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			termino();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				termino();
				}
				}
				setState(181);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(PatitoParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(PatitoParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(PatitoParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(PatitoParser.DIV, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			factor();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				factor();
				}
				}
				setState(189);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PatitoParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PatitoParser.RPAREN, 0); }
		public TerminalNode PLUS() { return getToken(PatitoParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PatitoParser.MINUS, 0); }
		public TerminalNode CTE_INT() { return getToken(PatitoParser.CTE_INT, 0); }
		public TerminalNode CTE_FLOAT() { return getToken(PatitoParser.CTE_FLOAT, 0); }
		public TerminalNode CTE_STRING() { return getToken(PatitoParser.CTE_STRING, 0); }
		public TerminalNode ID() { return getToken(PatitoParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PatitoListener ) ((PatitoListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(LPAREN);
				setState(191);
				expresion();
				setState(192);
				match(RPAREN);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(PLUS);
				setState(195);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(MINUS);
				setState(197);
				factor();
				}
				break;
			case CTE_INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(CTE_INT);
				}
				break;
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(CTE_FLOAT);
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(CTE_STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001#\u00cd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000-\b\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u00018\b"+
		"\u0001\u000b\u0001\f\u00019\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004K\b"+
		"\u0004\u000b\u0004\f\u0004L\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005X\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006_\b\u0006\n\u0006\f\u0006b\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bj\b\b\n\b\f\bm\t"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tv\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0084"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0092\b\r\n\r\f\r\u0095\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u009d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00a5\b\u000f\n\u000f\f\u000f\u00a8\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ad\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00b2\b\u0011\n\u0011\f\u0011\u00b5\t\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00ba\b\u0012\n\u0012"+
		"\f\u0012\u00bd\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00cb\b\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0004\u0001\u0000\u000b\f\u0001\u0000\u0016"+
		"\u0018\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0014\u00d2\u0000(\u0001"+
		"\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000"+
		"\u0000\u0006G\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nN\u0001"+
		"\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000ec\u0001\u0000\u0000"+
		"\u0000\u0010g\u0001\u0000\u0000\u0000\u0012u\u0001\u0000\u0000\u0000\u0014"+
		"w\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000\u0000\u0018\u0085\u0001"+
		"\u0000\u0000\u0000\u001a\u008c\u0001\u0000\u0000\u0000\u001c\u0099\u0001"+
		"\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000 \u00a9\u0001\u0000"+
		"\u0000\u0000\"\u00ae\u0001\u0000\u0000\u0000$\u00b6\u0001\u0000\u0000"+
		"\u0000&\u00ca\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0005"+
		"\r\u0000\u0000*,\u0005 \u0000\u0000+-\u0003\u0002\u0001\u0000,+\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000"+
		".0\u0003\b\u0004\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u000023\u0003\u0010\b\u0000"+
		"34\u0005\u0003\u0000\u00004\u0001\u0001\u0000\u0000\u000056\u0005\t\u0000"+
		"\u000068\u0003\u0004\u0002\u000075\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0003"+
		"\u0001\u0000\u0000\u0000;@\u0005\r\u0000\u0000<=\u0005!\u0000\u0000=?"+
		"\u0005\r\u0000\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u001f\u0000\u0000DE\u0003\u0006"+
		"\u0003\u0000EF\u0005 \u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0007"+
		"\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IK\u0003\n\u0005\u0000"+
		"JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0005\n"+
		"\u0000\u0000OP\u0005\r\u0000\u0000PR\u0005\u0019\u0000\u0000QS\u0003\f"+
		"\u0006\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0005\u001a\u0000\u0000UW\u0005\u001f\u0000\u0000"+
		"VX\u0003\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0003\u0010\b\u0000Z\u000b\u0001\u0000"+
		"\u0000\u0000[`\u0003\u000e\u0007\u0000\\]\u0005!\u0000\u0000]_\u0003\u000e"+
		"\u0007\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\r\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cd\u0005\r\u0000\u0000de\u0005\u001f\u0000\u0000"+
		"ef\u0003\u0006\u0003\u0000f\u000f\u0001\u0000\u0000\u0000gk\u0005\u001b"+
		"\u0000\u0000hj\u0003\u0012\t\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u001c\u0000\u0000"+
		"o\u0011\u0001\u0000\u0000\u0000pv\u0003\u0014\n\u0000qv\u0003\u0016\u000b"+
		"\u0000rv\u0003\u0018\f\u0000sv\u0003\u001a\r\u0000tv\u0003\u001c\u000e"+
		"\u0000up\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0013"+
		"\u0001\u0000\u0000\u0000wx\u0005\r\u0000\u0000xy\u0005\u0015\u0000\u0000"+
		"yz\u0003 \u0010\u0000z{\u0005 \u0000\u0000{\u0015\u0001\u0000\u0000\u0000"+
		"|}\u0005\u0004\u0000\u0000}~\u0005\u0019\u0000\u0000~\u007f\u0003 \u0010"+
		"\u0000\u007f\u0080\u0005\u001a\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000"+
		"\u0081\u0082\u0005\u0005\u0000\u0000\u0082\u0084\u0003\u0010\b\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0017\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086"+
		"\u0087\u0005\u0019\u0000\u0000\u0087\u0088\u0003 \u0010\u0000\u0088\u0089"+
		"\u0005\u001a\u0000\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008b"+
		"\u0003\u0010\b\u0000\u008b\u0019\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\b\u0000\u0000\u008d\u008e\u0005\u0019\u0000\u0000\u008e\u0093\u0003 "+
		"\u0010\u0000\u008f\u0090\u0005!\u0000\u0000\u0090\u0092\u0003 \u0010\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\u001a\u0000\u0000\u0097\u0098\u0005 \u0000\u0000\u0098"+
		"\u001b\u0001\u0000\u0000\u0000\u0099\u009a\u0005\r\u0000\u0000\u009a\u009c"+
		"\u0005\u0019\u0000\u0000\u009b\u009d\u0003\u001e\u000f\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001a\u0000\u0000\u009f\u00a0"+
		"\u0005 \u0000\u0000\u00a0\u001d\u0001\u0000\u0000\u0000\u00a1\u00a6\u0003"+
		" \u0010\u0000\u00a2\u00a3\u0005!\u0000\u0000\u00a3\u00a5\u0003 \u0010"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u001f\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0003\"\u0011\u0000\u00aa\u00ab\u0007\u0001\u0000\u0000"+
		"\u00ab\u00ad\u0003\"\u0011\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad!\u0001\u0000\u0000\u0000\u00ae\u00b3"+
		"\u0003$\u0012\u0000\u00af\u00b0\u0007\u0002\u0000\u0000\u00b0\u00b2\u0003"+
		"$\u0012\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4#\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bb\u0003&\u0013\u0000\u00b7\u00b8\u0007\u0003\u0000\u0000"+
		"\u00b8\u00ba\u0003&\u0013\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc%\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0019\u0000\u0000\u00bf\u00c0"+
		"\u0003 \u0010\u0000\u00c0\u00c1\u0005\u001a\u0000\u0000\u00c1\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005\u0011\u0000\u0000\u00c3\u00cb\u0003"+
		"&\u0013\u0000\u00c4\u00c5\u0005\u0012\u0000\u0000\u00c5\u00cb\u0003&\u0013"+
		"\u0000\u00c6\u00cb\u0005\u000e\u0000\u0000\u00c7\u00cb\u0005\u000f\u0000"+
		"\u0000\u00c8\u00cb\u0005\u0010\u0000\u0000\u00c9\u00cb\u0005\r\u0000\u0000"+
		"\u00ca\u00be\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\'\u0001\u0000\u0000\u0000\u0012"+
		",/9@LRW`ku\u0083\u0093\u009c\u00a6\u00ac\u00b3\u00bb\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
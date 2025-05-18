// Generated from Patito.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PatitoParser}.
 */
public interface PatitoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PatitoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PatitoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PatitoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(PatitoParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(PatitoParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#varsDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarsDecl(PatitoParser.VarsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#varsDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarsDecl(PatitoParser.VarsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PatitoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PatitoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(PatitoParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(PatitoParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(PatitoParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(PatitoParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(PatitoParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(PatitoParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(PatitoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(PatitoParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(PatitoParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(PatitoParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void enterEstatuto(PatitoParser.EstatutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void exitEstatuto(PatitoParser.EstatutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PatitoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PatitoParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(PatitoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(PatitoParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(PatitoParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(PatitoParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#escritura}.
	 * @param ctx the parse tree
	 */
	void enterEscritura(PatitoParser.EscrituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#escritura}.
	 * @param ctx the parse tree
	 */
	void exitEscritura(PatitoParser.EscrituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#llamadaFunc}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFunc(PatitoParser.LlamadaFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#llamadaFunc}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFunc(PatitoParser.LlamadaFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(PatitoParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(PatitoParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PatitoParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PatitoParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PatitoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PatitoParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(PatitoParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(PatitoParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PatitoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PatitoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PatitoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PatitoParser.FactorContext ctx);
}
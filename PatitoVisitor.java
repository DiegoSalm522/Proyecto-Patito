// Generated from Patito.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PatitoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PatitoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PatitoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PatitoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(PatitoParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#varsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsDecl(PatitoParser.VarsDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PatitoParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#funcs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncs(PatitoParser.FuncsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(PatitoParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(PatitoParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(PatitoParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(PatitoParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#estatuto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstatuto(PatitoParser.EstatutoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PatitoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(PatitoParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(PatitoParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#escritura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscritura(PatitoParser.EscrituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#llamadaFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFunc(PatitoParser.LlamadaFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(PatitoParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(PatitoParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PatitoParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(PatitoParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PatitoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PatitoParser.FactorContext ctx);
}
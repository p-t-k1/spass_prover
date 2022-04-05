// Generated from C:/Users/Patryk/proverspass/src/grammar\Prover9.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Prover9Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Prover9Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#top_level_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level_formula(Prover9Parser.Top_level_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(Prover9Parser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Prover9Parser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(Prover9Parser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#problem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProblem(Prover9Parser.ProblemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#logical_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_part(Prover9Parser.Logical_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Prover9Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#term_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_list(Prover9Parser.Term_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#quant_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant_sym(Prover9Parser.Quant_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(Prover9Parser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#cnf_clause_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnf_clause_body(Prover9Parser.Cnf_clause_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#binary_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operation(Prover9Parser.Binary_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(Prover9Parser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Prover9Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Prover9Parser.IdentifierContext ctx);
}
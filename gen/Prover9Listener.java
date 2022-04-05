// Generated from C:/Users/Patryk/proverspass/src/grammar\Prover9.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Prover9Parser}.
 */
public interface Prover9Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#top_level_formula}.
	 * @param ctx the parse tree
	 */
	void enterTop_level_formula(Prover9Parser.Top_level_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#top_level_formula}.
	 * @param ctx the parse tree
	 */
	void exitTop_level_formula(Prover9Parser.Top_level_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(Prover9Parser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(Prover9Parser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(Prover9Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(Prover9Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(Prover9Parser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(Prover9Parser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#problem}.
	 * @param ctx the parse tree
	 */
	void enterProblem(Prover9Parser.ProblemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#problem}.
	 * @param ctx the parse tree
	 */
	void exitProblem(Prover9Parser.ProblemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#logical_part}.
	 * @param ctx the parse tree
	 */
	void enterLogical_part(Prover9Parser.Logical_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#logical_part}.
	 * @param ctx the parse tree
	 */
	void exitLogical_part(Prover9Parser.Logical_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Prover9Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Prover9Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#term_list}.
	 * @param ctx the parse tree
	 */
	void enterTerm_list(Prover9Parser.Term_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#term_list}.
	 * @param ctx the parse tree
	 */
	void exitTerm_list(Prover9Parser.Term_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#quant_sym}.
	 * @param ctx the parse tree
	 */
	void enterQuant_sym(Prover9Parser.Quant_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#quant_sym}.
	 * @param ctx the parse tree
	 */
	void exitQuant_sym(Prover9Parser.Quant_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(Prover9Parser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(Prover9Parser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#cnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void enterCnf_clause_body(Prover9Parser.Cnf_clause_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#cnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void exitCnf_clause_body(Prover9Parser.Cnf_clause_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operation(Prover9Parser.Binary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operation(Prover9Parser.Binary_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(Prover9Parser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(Prover9Parser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Prover9Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Prover9Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Prover9Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Prover9Parser.IdentifierContext ctx);
}
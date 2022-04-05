// Generated from C:/Users/Patryk/proverspass/src/grammar\Prover9.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Prover9Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OPEN_PAREN=15, CLOSE_PAREN=16, 
		AND=17, OR=18, NOT=19, FORALL=20, RIGHT_IMPLIES=21, LEFT_IMPLIES=22, IFF=23, 
		EQ=24, NOT_EQ=25, EXISTS=26, FALSE=27, TRUE=28, COMMA=29, DOT=30, INTEGER=31, 
		IDENT=32, WS=33, BINARY_TERM_OPERATION=34, Identifier=35;
	public static final int
		RULE_top_level_formula = 0, RULE_integer = 1, RULE_string = 2, RULE_formula = 3, 
		RULE_problem = 4, RULE_logical_part = 5, RULE_term = 6, RULE_term_list = 7, 
		RULE_quant_sym = 8, RULE_symbol = 9, RULE_cnf_clause_body = 10, RULE_binary_operation = 11, 
		RULE_quantifier = 12, RULE_identifier = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"top_level_formula", "integer", "string", "formula", "problem", "logical_part", 
			"term", "term_list", "quant_sym", "symbol", "cnf_clause_body", "binary_operation", 
			"quantifier", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'formulas'", "'end_of_list'", "'['", "']'", "'forall'", "'equal'", 
			"'true'", "'false'", "'or'", "'and'", "'not'", "'implies'", "'implied'", 
			"'equiv'", "'('", "')'", "'&'", "'|'", "'-'", "'all'", "'->'", "'<-'", 
			"'<->'", "'='", "'!='", "'exists'", "'$F'", "'$T'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OPEN_PAREN", "CLOSE_PAREN", "AND", "OR", "NOT", "FORALL", 
			"RIGHT_IMPLIES", "LEFT_IMPLIES", "IFF", "EQ", "NOT_EQ", "EXISTS", "FALSE", 
			"TRUE", "COMMA", "DOT", "INTEGER", "IDENT", "WS", "BINARY_TERM_OPERATION", 
			"Identifier"
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
	public String getGrammarFileName() { return "Prover9.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Prover9Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Top_level_formulaContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Prover9Parser.DOT, 0); }
		public Top_level_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterTop_level_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitTop_level_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitTop_level_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_formulaContext top_level_formula() throws RecognitionException {
		Top_level_formulaContext _localctx = new Top_level_formulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			formula();
			setState(29);
			match(DOT);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Prover9Parser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(INTEGER);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Prover9Parser.IDENT, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(IDENT);
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

	public static class FormulaContext extends ParserRuleContext {
		public List<ProblemContext> problem() {
			return getRuleContexts(ProblemContext.class);
		}
		public ProblemContext problem(int i) {
			return getRuleContext(ProblemContext.class,i);
		}
		public TerminalNode EOF() { return getToken(Prover9Parser.EOF, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			problem();
			setState(36);
			problem();
			setState(37);
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

	public static class ProblemContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(Prover9Parser.OPEN_PAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Prover9Parser.CLOSE_PAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(Prover9Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Prover9Parser.DOT, i);
		}
		public List<Logical_partContext> logical_part() {
			return getRuleContexts(Logical_partContext.class);
		}
		public Logical_partContext logical_part(int i) {
			return getRuleContext(Logical_partContext.class,i);
		}
		public ProblemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterProblem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitProblem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitProblem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProblemContext problem() throws RecognitionException {
		ProblemContext _localctx = new ProblemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_problem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(OPEN_PAREN);
			setState(41);
			string();
			setState(42);
			match(CLOSE_PAREN);
			setState(43);
			match(DOT);
			setState(44);
			logical_part();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(45);
				match(T__1);
				}
			}

			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(48);
				logical_part();
				}
				break;
			}
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(51);
				match(DOT);
				}
				break;
			}
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(54);
				logical_part();
				}
				break;
			}
			setState(57);
			match(DOT);
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

	public static class Logical_partContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(Prover9Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Prover9Parser.DOT, i);
		}
		public List<Binary_operationContext> binary_operation() {
			return getRuleContexts(Binary_operationContext.class);
		}
		public Binary_operationContext binary_operation(int i) {
			return getRuleContext(Binary_operationContext.class,i);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(Prover9Parser.OPEN_PAREN, 0); }
		public List<Cnf_clause_bodyContext> cnf_clause_body() {
			return getRuleContexts(Cnf_clause_bodyContext.class);
		}
		public Cnf_clause_bodyContext cnf_clause_body(int i) {
			return getRuleContext(Cnf_clause_bodyContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Prover9Parser.CLOSE_PAREN, 0); }
		public Logical_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterLogical_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitLogical_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitLogical_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_partContext logical_part() throws RecognitionException {
		Logical_partContext _localctx = new Logical_partContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logical_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << RIGHT_IMPLIES) | (1L << LEFT_IMPLIES) | (1L << IFF))) != 0)) {
				{
				setState(59);
				binary_operation();
				}
			}

			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(62);
				quantifier();
				setState(63);
				term();
				setState(64);
				match(OPEN_PAREN);
				setState(65);
				cnf_clause_body();
				setState(66);
				binary_operation();
				setState(67);
				cnf_clause_body();
				setState(68);
				match(CLOSE_PAREN);
				setState(69);
				match(DOT);
				}
				break;
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << EXISTS) | (1L << IDENT) | (1L << Identifier))) != 0)) {
				{
				setState(73);
				cnf_clause_body();
				}
			}

			setState(76);
			match(DOT);
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

	public static class TermContext extends ParserRuleContext {
		public Quant_symContext quant_sym() {
			return getRuleContext(Quant_symContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(Prover9Parser.OPEN_PAREN, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Prover9Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Prover9Parser.COMMA, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Prover9Parser.CLOSE_PAREN, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				quant_sym();
				setState(79);
				match(OPEN_PAREN);
				setState(80);
				term_list();
				setState(81);
				match(COMMA);
				setState(82);
				term();
				setState(83);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				symbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				symbol();
				setState(87);
				match(OPEN_PAREN);
				setState(88);
				term();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(89);
					match(COMMA);
					setState(90);
					term();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(CLOSE_PAREN);
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

	public static class Term_listContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Prover9Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Prover9Parser.COMMA, i);
		}
		public Term_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterTerm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitTerm_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitTerm_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_listContext term_list() throws RecognitionException {
		Term_listContext _localctx = new Term_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__2);
			setState(101);
			term();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				term();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__3);
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

	public static class Quant_symContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(Prover9Parser.EXISTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Quant_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterQuant_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitQuant_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitQuant_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quant_symContext quant_sym() throws RecognitionException {
		Quant_symContext _localctx = new Quant_symContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quant_sym);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__4);
				}
				break;
			case EXISTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(EXISTS);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				identifier();
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

	public static class SymbolContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_symbol);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				match(T__13);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				identifier();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				string();
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

	public static class Cnf_clause_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(Prover9Parser.OPEN_PAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Prover9Parser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Prover9Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Prover9Parser.COMMA, i);
		}
		public Cnf_clause_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_clause_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterCnf_clause_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitCnf_clause_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitCnf_clause_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cnf_clause_bodyContext cnf_clause_body() throws RecognitionException {
		Cnf_clause_bodyContext _localctx = new Cnf_clause_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cnf_clause_body);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__8);
				setState(130);
				match(OPEN_PAREN);
				setState(131);
				term();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					term();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				term();
				setState(142);
				match(OPEN_PAREN);
				setState(143);
				term();
				setState(144);
				match(CLOSE_PAREN);
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

	public static class Binary_operationContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Prover9Parser.OR, 0); }
		public TerminalNode AND() { return getToken(Prover9Parser.AND, 0); }
		public TerminalNode RIGHT_IMPLIES() { return getToken(Prover9Parser.RIGHT_IMPLIES, 0); }
		public TerminalNode LEFT_IMPLIES() { return getToken(Prover9Parser.LEFT_IMPLIES, 0); }
		public TerminalNode IFF() { return getToken(Prover9Parser.IFF, 0); }
		public Binary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterBinary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitBinary_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitBinary_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operationContext binary_operation() throws RecognitionException {
		Binary_operationContext _localctx = new Binary_operationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binary_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << RIGHT_IMPLIES) | (1L << LEFT_IMPLIES) | (1L << IFF))) != 0)) ) {
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(Prover9Parser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(Prover9Parser.EXISTS, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==FORALL || _la==EXISTS) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Prover9Parser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Prover9Listener ) ((Prover9Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Prover9Visitor ) return ((Prover9Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Identifier);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\61\n\6\3\6\5\6\64\n\6\3"+
		"\6\5\6\67\n\6\3\6\5\6:\n\6\3\6\3\6\3\7\5\7?\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7J\n\7\3\7\5\7M\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\b\3\b\5\be\n\b\3"+
		"\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\n\3\n\3\n\5\nu\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0082\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0095\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\2\4\4\2\23\24\27\31\4\2\26\26\34\34\2"+
		"\u00a7\2\36\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n)\3\2\2\2\f>\3\2"+
		"\2\2\16d\3\2\2\2\20f\3\2\2\2\22t\3\2\2\2\24\u0081\3\2\2\2\26\u0094\3\2"+
		"\2\2\30\u0096\3\2\2\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\37\5\b\5\2"+
		"\37 \7 \2\2 \3\3\2\2\2!\"\7!\2\2\"\5\3\2\2\2#$\7\"\2\2$\7\3\2\2\2%&\5"+
		"\n\6\2&\'\5\n\6\2\'(\7\2\2\3(\t\3\2\2\2)*\7\3\2\2*+\7\21\2\2+,\5\6\4\2"+
		",-\7\22\2\2-.\7 \2\2.\60\5\f\7\2/\61\7\4\2\2\60/\3\2\2\2\60\61\3\2\2\2"+
		"\61\63\3\2\2\2\62\64\5\f\7\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2"+
		"\65\67\7 \2\2\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28:\5\f\7\298\3\2"+
		"\2\29:\3\2\2\2:;\3\2\2\2;<\7 \2\2<\13\3\2\2\2=?\5\30\r\2>=\3\2\2\2>?\3"+
		"\2\2\2?I\3\2\2\2@A\5\32\16\2AB\5\16\b\2BC\7\21\2\2CD\5\26\f\2DE\5\30\r"+
		"\2EF\5\26\f\2FG\7\22\2\2GH\7 \2\2HJ\3\2\2\2I@\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KM\5\26\f\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7 \2\2O\r\3\2\2\2PQ\5"+
		"\22\n\2QR\7\21\2\2RS\5\20\t\2ST\7\37\2\2TU\5\16\b\2UV\7\22\2\2Ve\3\2\2"+
		"\2We\5\24\13\2XY\5\24\13\2YZ\7\21\2\2Z_\5\16\b\2[\\\7\37\2\2\\^\5\16\b"+
		"\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\22"+
		"\2\2ce\3\2\2\2dP\3\2\2\2dW\3\2\2\2dX\3\2\2\2e\17\3\2\2\2fg\7\5\2\2gl\5"+
		"\16\b\2hi\7\37\2\2ik\5\16\b\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2"+
		"mo\3\2\2\2nl\3\2\2\2op\7\6\2\2p\21\3\2\2\2qu\7\7\2\2ru\7\34\2\2su\5\34"+
		"\17\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\23\3\2\2\2v\u0082\7\b\2\2w\u0082"+
		"\7\t\2\2x\u0082\7\n\2\2y\u0082\7\13\2\2z\u0082\7\f\2\2{\u0082\7\r\2\2"+
		"|\u0082\7\16\2\2}\u0082\7\17\2\2~\u0082\7\20\2\2\177\u0082\5\34\17\2\u0080"+
		"\u0082\5\6\4\2\u0081v\3\2\2\2\u0081w\3\2\2\2\u0081x\3\2\2\2\u0081y\3\2"+
		"\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2\u0081}\3\2\2\2\u0081"+
		"~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\25\3\2\2\2\u0083"+
		"\u0084\7\13\2\2\u0084\u0085\7\21\2\2\u0085\u008a\5\16\b\2\u0086\u0087"+
		"\7\37\2\2\u0087\u0089\5\16\b\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u008e\7\22\2\2\u008e\u0095\3\2\2\2\u008f\u0090\5\16\b\2"+
		"\u0090\u0091\7\21\2\2\u0091\u0092\5\16\b\2\u0092\u0093\7\22\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0083\3\2\2\2\u0094\u008f\3\2\2\2\u0095\27\3\2\2"+
		"\2\u0096\u0097\t\2\2\2\u0097\31\3\2\2\2\u0098\u0099\t\3\2\2\u0099\33\3"+
		"\2\2\2\u009a\u009b\7%\2\2\u009b\35\3\2\2\2\20\60\63\669>IL_dlt\u0081\u008a"+
		"\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
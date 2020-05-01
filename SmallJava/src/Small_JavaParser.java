// Generated from C:/Users/hakim/Desktop/M1_SII/SmallJava/src\Small_Java.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Small_JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, INTS=12, FLOATS=13, STRINGS=14, IF=15, THEN=16, ELSE=17, 
		MODIFICATEUR=18, ID=19, INT=20, FLOAT=21, STRING=22, ET=23, OU=24, NEG=25, 
		AFF=26, PLS=27, MNS=28, DIV=29, MUL=30, EGAL=31, DEFF=32, SUP=33, INF=34, 
		SUPEGAL=35, INFEGAL=36, INTVAL=37, FLOATVAL=38, LIB=39, WHITESPACE=40, 
		STRVAL=41;
	public static final int
		RULE_program = 0, RULE_imp = 1, RULE_imports = 2, RULE_declarations = 3, 
		RULE_declaration = 4, RULE_type = 5, RULE_vars = 6, RULE_idf = 7, RULE_value = 8, 
		RULE_instructions = 9, RULE_inst = 10, RULE_affect = 11, RULE_exp = 12, 
		RULE_op2 = 13, RULE_op3 = 14, RULE_op4 = 15, RULE_op5 = 16, RULE_op6 = 17, 
		RULE_op7 = 18, RULE_terme = 19, RULE_read = 20, RULE_write = 21, RULE_signe = 22, 
		RULE_ifinst = 23, RULE_el = 24, RULE_comp = 25, RULE_op = 26, RULE_listID = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "imp", "imports", "declarations", "declaration", "type", "vars", 
			"idf", "value", "instructions", "inst", "affect", "exp", "op2", "op3", 
			"op4", "op5", "op6", "op7", "terme", "read", "write", "signe", "ifinst", 
			"el", "comp", "op", "listID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class_SJ'", "'{'", "'main_SJ'", "'}'", "'import'", "';'", "','", 
			"'('", "')'", "'In_SJ'", "'Out_SJ'", "'\"%d\"'", "'\"%f\"'", "'\"%s\"'", 
			"'Si'", "'Alors'", "'Sinon'", null, null, "'int_SJ'", "'float_SJ'", "'string_SJ'", 
			"'&'", "'|'", "'!'", "':='", "'+'", "'-'", "'/'", "'*'", "'='", "'!='", 
			"'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INTS", "FLOATS", "STRINGS", "IF", "THEN", "ELSE", "MODIFICATEUR", "ID", 
			"INT", "FLOAT", "STRING", "ET", "OU", "NEG", "AFF", "PLS", "MNS", "DIV", 
			"MUL", "EGAL", "DEFF", "SUP", "INF", "SUPEGAL", "INFEGAL", "INTVAL", 
			"FLOATVAL", "LIB", "WHITESPACE", "STRVAL"
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
	public String getGrammarFileName() { return "Small_Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Small_JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MODIFICATEUR() { return getToken(Small_JavaParser.MODIFICATEUR, 0); }
		public TerminalNode ID() { return getToken(Small_JavaParser.ID, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(56);
				imports();
				}
			}

			setState(59);
			match(MODIFICATEUR);
			setState(60);
			match(T__0);
			setState(61);
			match(ID);
			setState(62);
			match(T__1);
			setState(63);
			declarations();
			setState(64);
			match(T__2);
			setState(65);
			match(T__1);
			setState(66);
			instructions();
			setState(67);
			match(T__3);
			setState(68);
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

	public static class ImpContext extends ParserRuleContext {
		public TerminalNode LIB() { return getToken(Small_JavaParser.LIB, 0); }
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__4);
			setState(71);
			match(LIB);
			setState(72);
			match(T__5);
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

	public static class ImportsContext extends ParserRuleContext {
		public ImpContext imp() {
			return getRuleContext(ImpContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				imp();
				setState(75);
				imports();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				imp();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(80);
				declaration();
				setState(81);
				declarations();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				declaration();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			type();
			setState(87);
			vars();
			setState(88);
			match(T__5);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Small_JavaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(Small_JavaParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(Small_JavaParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Small_JavaParser.ID, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(92);
				match(ID);
				setState(93);
				match(T__6);
				setState(94);
				vars();
				}
				}
				break;
			case 2:
				{
				setState(95);
				match(ID);
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

	public static class IdfContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Small_JavaParser.ID, 0); }
		public IdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterIdf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitIdf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitIdf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdfContext idf() throws RecognitionException {
		IdfContext _localctx = new IdfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_idf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTVAL() { return getToken(Small_JavaParser.INTVAL, 0); }
		public TerminalNode FLOATVAL() { return getToken(Small_JavaParser.FLOATVAL, 0); }
		public TerminalNode STRVAL() { return getToken(Small_JavaParser.STRVAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTVAL) | (1L << FLOATVAL) | (1L << STRVAL))) != 0)) ) {
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instructions);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102);
				inst();
				setState(103);
				match(T__5);
				setState(104);
				instructions();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				inst();
				setState(107);
				match(T__5);
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

	public static class InstContext extends ParserRuleContext {
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public IfinstContext ifinst() {
			return getRuleContext(IfinstContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inst);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INTVAL:
			case FLOATVAL:
			case STRVAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				affect();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				ifinst();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				read();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				write();
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

	public static class AffectContext extends ParserRuleContext {
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public TerminalNode AFF() { return getToken(Small_JavaParser.AFF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitAffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitAffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectContext affect() throws RecognitionException {
		AffectContext _localctx = new AffectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_affect);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				idf();
				setState(118);
				match(AFF);
				setState(119);
				exp(0);
				}
				break;
			case INTVAL:
			case FLOATVAL:
			case STRVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				value();
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

	public static class ExpContext extends ParserRuleContext {
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OU() { return getToken(Small_JavaParser.OU, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			op2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(OU);
					setState(129);
					op2(0);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Op2Context extends ParserRuleContext {
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public TerminalNode ET() { return getToken(Small_JavaParser.ET, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		return op2(0);
	}

	private Op2Context op2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op2Context _localctx = new Op2Context(_ctx, _parentState);
		Op2Context _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_op2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			op3();
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op2);
					setState(138);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(139);
					match(ET);
					setState(140);
					op3();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(Small_JavaParser.NEG, 0); }
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_op3);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEG:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(NEG);
				setState(147);
				op4(0);
				}
				break;
			case T__7:
			case ID:
			case INTVAL:
			case FLOATVAL:
			case STRVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				op4(0);
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

	public static class Op4Context extends ParserRuleContext {
		public Op5Context op5() {
			return getRuleContext(Op5Context.class,0);
		}
		public Op4Context op4() {
			return getRuleContext(Op4Context.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public Op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterOp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitOp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitOp4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op4Context op4() throws RecognitionException {
		return op4(0);
	}

	private Op4Context op4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op4Context _localctx = new Op4Context(_ctx, _parentState);
		Op4Context _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_op4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			op5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op4);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					comp();
					setState(156);
					op5(0);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Op5Context extends ParserRuleContext {
		public Op6Context op6() {
			return getRuleContext(Op6Context.class,0);
		}
		public Op5Context op5() {
			return getRuleContext(Op5Context.class,0);
		}
		public TerminalNode PLS() { return getToken(Small_JavaParser.PLS, 0); }
		public TerminalNode MNS() { return getToken(Small_JavaParser.MNS, 0); }
		public Op5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterOp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitOp5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitOp5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op5Context op5() throws RecognitionException {
		return op5(0);
	}

	private Op5Context op5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op5Context _localctx = new Op5Context(_ctx, _parentState);
		Op5Context _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_op5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			op6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Op5Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_op5);
						setState(166);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(167);
						match(PLS);
						setState(168);
						op6(0);
						}
						break;
					case 2:
						{
						_localctx = new Op5Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_op5);
						setState(169);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(170);
						match(MNS);
						setState(171);
						op6(0);
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Op6Context extends ParserRuleContext {
		public Op7Context op7() {
			return getRuleContext(Op7Context.class,0);
		}
		public Op6Context op6() {
			return getRuleContext(Op6Context.class,0);
		}
		public TerminalNode MUL() { return getToken(Small_JavaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Small_JavaParser.DIV, 0); }
		public Op6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterOp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitOp6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitOp6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op6Context op6() throws RecognitionException {
		return op6(0);
	}

	private Op6Context op6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op6Context _localctx = new Op6Context(_ctx, _parentState);
		Op6Context _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_op6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			op7();
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Op6Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_op6);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						match(MUL);
						setState(182);
						op7();
						}
						break;
					case 2:
						{
						_localctx = new Op6Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_op6);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						match(DIV);
						setState(185);
						op7();
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Op7Context extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TermeContext terme() {
			return getRuleContext(TermeContext.class,0);
		}
		public Op7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterOp7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitOp7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitOp7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op7Context op7() throws RecognitionException {
		Op7Context _localctx = new Op7Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_op7);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__7);
				setState(192);
				exp(0);
				setState(193);
				match(T__8);
				}
				break;
			case ID:
			case INTVAL:
			case FLOATVAL:
			case STRVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				terme();
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

	public static class TermeContext extends ParserRuleContext {
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TermeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterTerme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitTerme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitTerme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermeContext terme() throws RecognitionException {
		TermeContext _localctx = new TermeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_terme);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				idf();
				}
				break;
			case INTVAL:
			case FLOATVAL:
			case STRVAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				value();
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

	public static class ReadContext extends ParserRuleContext {
		public SigneContext signe() {
			return getRuleContext(SigneContext.class,0);
		}
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__9);
			setState(203);
			match(T__7);
			setState(204);
			signe();
			setState(205);
			match(T__6);
			setState(206);
			idf();
			setState(207);
			match(T__8);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode STRVAL() { return getToken(Small_JavaParser.STRVAL, 0); }
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__10);
			setState(210);
			match(T__7);
			setState(211);
			match(STRVAL);
			setState(212);
			match(T__6);
			setState(213);
			idf();
			setState(214);
			match(T__8);
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

	public static class SigneContext extends ParserRuleContext {
		public TerminalNode INTS() { return getToken(Small_JavaParser.INTS, 0); }
		public TerminalNode FLOATS() { return getToken(Small_JavaParser.FLOATS, 0); }
		public TerminalNode STRINGS() { return getToken(Small_JavaParser.STRINGS, 0); }
		public SigneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterSigne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitSigne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitSigne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SigneContext signe() throws RecognitionException {
		SigneContext _localctx = new SigneContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_signe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTS) | (1L << FLOATS) | (1L << STRINGS))) != 0)) ) {
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

	public static class IfinstContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Small_JavaParser.IF, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Small_JavaParser.THEN, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public ElContext el() {
			return getRuleContext(ElContext.class,0);
		}
		public IfinstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifinst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterIfinst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitIfinst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitIfinst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfinstContext ifinst() throws RecognitionException {
		IfinstContext _localctx = new IfinstContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifinst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IF);
			setState(219);
			match(T__7);
			setState(220);
			comp();
			setState(221);
			match(T__8);
			setState(222);
			match(THEN);
			setState(223);
			match(T__1);
			setState(224);
			instructions();
			setState(225);
			match(T__3);
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				}
				break;
			case ELSE:
				{
				setState(227);
				el();
				setState(228);
				match(T__1);
				setState(229);
				instructions();
				setState(230);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Small_JavaParser.ELSE, 0); }
		public ElContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_el; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitEl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElContext el() throws RecognitionException {
		ElContext _localctx = new ElContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_el);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ELSE);
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

	public static class CompContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			exp(0);
			setState(237);
			op();
			setState(238);
			exp(0);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode SUP() { return getToken(Small_JavaParser.SUP, 0); }
		public TerminalNode INF() { return getToken(Small_JavaParser.INF, 0); }
		public TerminalNode SUPEGAL() { return getToken(Small_JavaParser.SUPEGAL, 0); }
		public TerminalNode INFEGAL() { return getToken(Small_JavaParser.INFEGAL, 0); }
		public TerminalNode DEFF() { return getToken(Small_JavaParser.DEFF, 0); }
		public TerminalNode EGAL() { return getToken(Small_JavaParser.EGAL, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EGAL) | (1L << DEFF) | (1L << SUP) | (1L << INF) | (1L << SUPEGAL) | (1L << INFEGAL))) != 0)) ) {
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

	public static class ListIDContext extends ParserRuleContext {
		public IdfContext idf() {
			return getRuleContext(IdfContext.class,0);
		}
		public ListIDContext listID() {
			return getRuleContext(ListIDContext.class,0);
		}
		public ListIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).enterListID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Small_JavaListener ) ((Small_JavaListener)listener).exitListID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Small_JavaVisitor ) return ((Small_JavaVisitor<? extends T>)visitor).visitListID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListIDContext listID() throws RecognitionException {
		ListIDContext _localctx = new ListIDContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_listID);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				idf();
				setState(243);
				match(T__6);
				setState(244);
				listID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				idf();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 13:
			return op2_sempred((Op2Context)_localctx, predIndex);
		case 15:
			return op4_sempred((Op4Context)_localctx, predIndex);
		case 16:
			return op5_sempred((Op5Context)_localctx, predIndex);
		case 17:
			return op6_sempred((Op6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op2_sempred(Op2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op4_sempred(Op4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op5_sempred(Op5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op6_sempred(Op6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4Q\n\4"+
		"\3\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b"+
		"c\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3"+
		"\f\3\f\3\f\3\f\5\fv\n\f\3\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u0090\n\17\f\17\16\17\u0093\13\17\3\20\3\20\3\20\5"+
		"\20\u0098\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a1\n\21\f\21"+
		"\16\21\u00a4\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00af"+
		"\n\22\f\22\16\22\u00b2\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\7\23\u00bd\n\23\f\23\16\23\u00c0\13\23\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u00c7\n\24\3\25\3\25\5\25\u00cb\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00eb\n\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u00fa"+
		"\n\35\3\35\2\7\32\34 \"$\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668\2\6\3\2\26\30\4\2\'(++\3\2\16\20\3\2!&\2\u00f4\2;"+
		"\3\2\2\2\4H\3\2\2\2\6P\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\f\\\3\2\2\2\16b\3"+
		"\2\2\2\20d\3\2\2\2\22f\3\2\2\2\24o\3\2\2\2\26u\3\2\2\2\30|\3\2\2\2\32"+
		"~\3\2\2\2\34\u0089\3\2\2\2\36\u0097\3\2\2\2 \u0099\3\2\2\2\"\u00a5\3\2"+
		"\2\2$\u00b3\3\2\2\2&\u00c6\3\2\2\2(\u00ca\3\2\2\2*\u00cc\3\2\2\2,\u00d3"+
		"\3\2\2\2.\u00da\3\2\2\2\60\u00dc\3\2\2\2\62\u00ec\3\2\2\2\64\u00ee\3\2"+
		"\2\2\66\u00f2\3\2\2\28\u00f9\3\2\2\2:<\5\6\4\2;:\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=>\7\24\2\2>?\7\3\2\2?@\7\25\2\2@A\7\4\2\2AB\5\b\5\2BC\7\5\2\2C"+
		"D\7\4\2\2DE\5\24\13\2EF\7\6\2\2FG\7\6\2\2G\3\3\2\2\2HI\7\7\2\2IJ\7)\2"+
		"\2JK\7\b\2\2K\5\3\2\2\2LM\5\4\3\2MN\5\6\4\2NQ\3\2\2\2OQ\5\4\3\2PL\3\2"+
		"\2\2PO\3\2\2\2Q\7\3\2\2\2RS\5\n\6\2ST\5\b\5\2TW\3\2\2\2UW\5\n\6\2VR\3"+
		"\2\2\2VU\3\2\2\2W\t\3\2\2\2XY\5\f\7\2YZ\5\16\b\2Z[\7\b\2\2[\13\3\2\2\2"+
		"\\]\t\2\2\2]\r\3\2\2\2^_\7\25\2\2_`\7\t\2\2`c\5\16\b\2ac\7\25\2\2b^\3"+
		"\2\2\2ba\3\2\2\2c\17\3\2\2\2de\7\25\2\2e\21\3\2\2\2fg\t\3\2\2g\23\3\2"+
		"\2\2hi\5\26\f\2ij\7\b\2\2jk\5\24\13\2kp\3\2\2\2lm\5\26\f\2mn\7\b\2\2n"+
		"p\3\2\2\2oh\3\2\2\2ol\3\2\2\2p\25\3\2\2\2qv\5\30\r\2rv\5\60\31\2sv\5*"+
		"\26\2tv\5,\27\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\27\3\2\2\2wx"+
		"\5\20\t\2xy\7\34\2\2yz\5\32\16\2z}\3\2\2\2{}\5\22\n\2|w\3\2\2\2|{\3\2"+
		"\2\2}\31\3\2\2\2~\177\b\16\1\2\177\u0080\5\34\17\2\u0080\u0086\3\2\2\2"+
		"\u0081\u0082\f\4\2\2\u0082\u0083\7\32\2\2\u0083\u0085\5\34\17\2\u0084"+
		"\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\33\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\b\17\1\2\u008a\u008b"+
		"\5\36\20\2\u008b\u0091\3\2\2\2\u008c\u008d\f\4\2\2\u008d\u008e\7\31\2"+
		"\2\u008e\u0090\5\36\20\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\35\3\2\2\2\u0093\u0091\3\2\2"+
		"\2\u0094\u0095\7\33\2\2\u0095\u0098\5 \21\2\u0096\u0098\5 \21\2\u0097"+
		"\u0094\3\2\2\2\u0097\u0096\3\2\2\2\u0098\37\3\2\2\2\u0099\u009a\b\21\1"+
		"\2\u009a\u009b\5\"\22\2\u009b\u00a2\3\2\2\2\u009c\u009d\f\4\2\2\u009d"+
		"\u009e\5\64\33\2\u009e\u009f\5\"\22\2\u009f\u00a1\3\2\2\2\u00a0\u009c"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"!\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\22\1\2\u00a6\u00a7\5$\23\2"+
		"\u00a7\u00b0\3\2\2\2\u00a8\u00a9\f\5\2\2\u00a9\u00aa\7\35\2\2\u00aa\u00af"+
		"\5$\23\2\u00ab\u00ac\f\4\2\2\u00ac\u00ad\7\36\2\2\u00ad\u00af\5$\23\2"+
		"\u00ae\u00a8\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1#\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\b\23\1\2\u00b4\u00b5\5&\24\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\f"+
		"\5\2\2\u00b7\u00b8\7 \2\2\u00b8\u00bd\5&\24\2\u00b9\u00ba\f\4\2\2\u00ba"+
		"\u00bb\7\37\2\2\u00bb\u00bd\5&\24\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3"+
		"\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"%\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\n\2\2\u00c2\u00c3\5\32\16"+
		"\2\u00c3\u00c4\7\13\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\5(\25\2\u00c6"+
		"\u00c1\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00cb\5\20\t"+
		"\2\u00c9\u00cb\5\22\n\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		")\3\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00cf\5.\30\2"+
		"\u00cf\u00d0\7\t\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00d2\7\13\2\2\u00d2+"+
		"\3\2\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\7+\2\2\u00d6"+
		"\u00d7\7\t\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00d9\7\13\2\2\u00d9-\3\2\2"+
		"\2\u00da\u00db\t\4\2\2\u00db/\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de"+
		"\7\n\2\2\u00de\u00df\5\64\33\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\7\22\2"+
		"\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3\5\24\13\2\u00e3\u00ea\7\6\2\2\u00e4"+
		"\u00eb\3\2\2\2\u00e5\u00e6\5\62\32\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\5"+
		"\24\13\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00eb\61\3\2\2\2\u00ec\u00ed\7\23\2\2\u00ed\63\3\2\2\2"+
		"\u00ee\u00ef\5\32\16\2\u00ef\u00f0\5\66\34\2\u00f0\u00f1\5\32\16\2\u00f1"+
		"\65\3\2\2\2\u00f2\u00f3\t\5\2\2\u00f3\67\3\2\2\2\u00f4\u00f5\5\20\t\2"+
		"\u00f5\u00f6\7\t\2\2\u00f6\u00f7\58\35\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa"+
		"\5\20\t\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa9\3\2\2\2\25;P"+
		"Vbou|\u0086\u0091\u0097\u00a2\u00ae\u00b0\u00bc\u00be\u00c6\u00ca\u00ea"+
		"\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NumbersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		S=1, SALTO=2, OTRO=3, SPACE=4, OTROS=5, USER=6, LINK=7, HASHTAG=8, FINISH=9, 
		ROJO=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"S", "SALTO", "OTRO", "SPACE", "OTROS", "USER", "LINK", "HASHTAG", "FINISH", 
			"ROJO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'#FIN@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "S", "SALTO", "OTRO", "SPACE", "OTROS", "USER", "LINK", "HASHTAG", 
			"FINISH", "ROJO"
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


	public NumbersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Numbers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			SALTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			OTRO_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			OTROS_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			USER_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			LINK_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			HASHTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			FINISH_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ROJO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SALTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    Contador.cont++;
			    System.out.println();
			break;
		}
	}
	private void OTRO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			   Contador.cont+=getText().length();
			   if(Contador.cont <140){
			           System.out.print(getText());
			       }else{//significa que se ha pasado de caracteres
			           Contador.num=Contador.cont-140;
			           Contador.num2=getText().length()-Contador.num;
			           Contador.s1=getText().substring(0,Contador.num2);
			           Contador.s2=getText().substring(Contador.num2);

			           System.out.print(Contador.s1+
			           "<SPAN CLASS=\"sobrante\">"+Contador.s2);

			           Contador.flag=false;



			           //calcuclo de diferencia
			   }



			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			Contador.cont+=getText().length();
			System.out.print(' ');
			break;
		}
	}
	private void OTROS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:


			    Contador.cont+=getText().length();
			    System.out.print(getText());

			break;
		}
	}
	private void USER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    Contador.cont+=getText().length();
			    if(Contador.cont <140){
			        System.out.print("<SPAN CLASS=\"usr\">"+getText()+"</SPAN>");
			    }else{//significa que se ha pasado de caracteres
			        Contador.num=Contador.cont-140;
			        Contador.num2=getText().length()-Contador.num;
			        Contador.s1=getText().substring(0,Contador.num2);
			        Contador.s2=getText().substring(Contador.num2);

			        System.out.print("<SPAN CLASS=\"usr\">"+Contador.s1+"</SPAN>"+
			        "<SPAN CLASS=\"sobrante\">"+Contador.s2);

			        Contador.flag=false;



			        //calcuclo de diferencia
			    }


			break;
		}
	}
	private void LINK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			    Contador.cont+=getText().length();

			    if(Contador.cont <140){
			            System.out.print("<SPAN CLASS=\"link\">"+getText()+"</SPAN>");
			        }else{//significa que se ha pasado de caracteres
			            Contador.num=Contador.cont-140;
			            Contador.num2=getText().length()-Contador.num;
			            Contador.s1=getText().substring(0,Contador.num2);
			            Contador.s2=getText().substring(Contador.num2);
			            System.out.print("<SPAN CLASS=\"link\">"+Contador.s1+"</SPAN>"+
			            "<SPAN CLASS=\"sobrante\">"+Contador.s2);

			            Contador.flag=false;



			            //calcuclo de diferencia
			        }


			break;
		}
	}
	private void HASHTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			    Contador.cont+=getText().length();

			    if(Contador.cont <140){
			        System.out.print("<SPAN CLASS=\"hashtag\">"+getText()+"</SPAN>");
			    }else{//significa que se ha pasado de caracteres
			        Contador.num=Contador.cont-140;
			        Contador.num2=getText().length()-Contador.num;
			        Contador.s1=getText().substring(0,Contador.num2);
			        Contador.s2=getText().substring(Contador.num2);

			        System.out.print("<SPAN CLASS=\"hashtag\">"+Contador.s1+"</SPAN>"+
			        "<SPAN CLASS=\"sobrante\">"+Contador.s2);

			        Contador.flag=false;



			        //calcuclo de diferencia
			    }


			break;
		}
	}
	private void FINISH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.print("\n</p> </body> </html>");
			break;
		}
	}
	private void ROJO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:

			    Contador.extra=getText();
			    System.out.print(Contador.extra + "</SPAN>");

			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return OTRO_sempred((RuleContext)_localctx, predIndex);
		case 3:
			return SPACE_sempred((RuleContext)_localctx, predIndex);
		case 4:
			return OTROS_sempred((RuleContext)_localctx, predIndex);
		case 5:
			return USER_sempred((RuleContext)_localctx, predIndex);
		case 6:
			return LINK_sempred((RuleContext)_localctx, predIndex);
		case 7:
			return HASHTAG_sempred((RuleContext)_localctx, predIndex);
		case 9:
			return ROJO_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean OTRO_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Contador.flag;
		}
		return true;
	}
	private boolean SPACE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return Contador.flag;
		}
		return true;
	}
	private boolean OTROS_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Contador.flag;
		}
		return true;
	}
	private boolean USER_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return Contador.flag;
		}
		return true;
	}
	private boolean LINK_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return Contador.flag;
		}
		return true;
	}
	private boolean HASHTAG_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return Contador.flag;
		}
		return true;
	}
	private boolean ROJO_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return !Contador.flag;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000\nj\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002 \u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u00050\b\u0005\u000b\u0005\f\u00051\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006D\b\u0006\u000b\u0006\f\u0006E\u0001\u0006\u0001"+
		"\u0006\u0004\u0006J\b\u0006\u000b\u0006\f\u0006K\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007S\b\u0007\u000b\u0007"+
		"\f\u0007T\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\tc\b\t\u000b\t\f\td\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0001\u0000\u0006\u0002\u0000\t\t\r\r\u0002\u0000\n\n\r\r\u0002\u0000"+
		"AZaz\u0002\u0000,,..\u0003\u000009AZaz\u0001\u0000azo\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000\u0000"+
		"\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001c\u0001\u0000\u0000"+
		"\u0000\u0007$\u0001\u0000\u0000\u0000\t(\u0001\u0000\u0000\u0000\u000b"+
		",\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000fO\u0001\u0000"+
		"\u0000\u0000\u0011X\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0007\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0006\u0000\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0007\u0001\u0000\u0000\u001a\u001b\u0006\u0001\u0001\u0000"+
		"\u001b\u0004\u0001\u0000\u0000\u0000\u001c\u001e\u0004\u0002\u0000\u0000"+
		"\u001d\u001f\u0007\u0002\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0006\u0002\u0002\u0000"+
		"#\u0006\u0001\u0000\u0000\u0000$%\u0004\u0003\u0001\u0000%&\u0005 \u0000"+
		"\u0000&\'\u0006\u0003\u0003\u0000\'\b\u0001\u0000\u0000\u0000()\u0004"+
		"\u0004\u0002\u0000)*\u0007\u0003\u0000\u0000*+\u0006\u0004\u0004\u0000"+
		"+\n\u0001\u0000\u0000\u0000,-\u0004\u0005\u0003\u0000-/\u0005@\u0000\u0000"+
		".0\u0007\u0004\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000034\u0006\u0005\u0005\u00004\f\u0001\u0000\u0000\u000056\u0004"+
		"\u0006\u0004\u000067\u0005h\u0000\u000078\u0005t\u0000\u000089\u0005t"+
		"\u0000\u00009:\u0005p\u0000\u0000:;\u0005:\u0000\u0000;<\u0005/\u0000"+
		"\u0000<=\u0005/\u0000\u0000=>\u0005w\u0000\u0000>?\u0005w\u0000\u0000"+
		"?@\u0005w\u0000\u0000@A\u0005.\u0000\u0000AC\u0001\u0000\u0000\u0000B"+
		"D\u0007\u0004\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GI\u0005.\u0000\u0000HJ\u0007\u0005\u0000\u0000IH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0006\u0006\u0006\u0000"+
		"N\u000e\u0001\u0000\u0000\u0000OP\u0004\u0007\u0005\u0000PR\u0005#\u0000"+
		"\u0000QS\u0007\u0004\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VW\u0006\u0007\u0007\u0000W\u0010\u0001\u0000\u0000"+
		"\u0000XY\u0005#\u0000\u0000YZ\u0005F\u0000\u0000Z[\u0005I\u0000\u0000"+
		"[\\\u0005N\u0000\u0000\\]\u0005@\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0006\b\b\u0000_\u0012\u0001\u0000\u0000\u0000`b\u0004\t\u0006\u0000"+
		"ac\t\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0007\u0001\u0000\u0000gh\u0007\u0001\u0000\u0000hi\u0006\t\t"+
		"\u0000i\u0014\u0001\u0000\u0000\u0000\u0007\u0000 1EKTd\n\u0006\u0000"+
		"\u0000\u0001\u0001\u0000\u0001\u0002\u0001\u0001\u0003\u0002\u0001\u0004"+
		"\u0003\u0001\u0005\u0004\u0001\u0006\u0005\u0001\u0007\u0006\u0001\b\u0007"+
		"\u0001\t\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
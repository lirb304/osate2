
/*
* generated by Xtext
*/
lexer grammar InternalReqSpecLexer;


@header {
package org.osate.reqspec.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




Description : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('R'|'r')('I'|'i')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Requirement : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

Stakeholder : ('S'|'s')('T'|'t')('A'|'a')('K'|'k')('E'|'e')('H'|'h')('O'|'o')('L'|'l')('D'|'d')('E'|'e')('R'|'r');

Decomposes : ('D'|'d')('E'|'e')('C'|'c')('O'|'o')('M'|'m')('P'|'p')('O'|'o')('S'|'s')('E'|'e')('S'|'s');

Assertion : ('A'|'a')('S'|'s')('S'|'s')('E'|'e')('R'|'r')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Conflicts : ('C'|'c')('O'|'o')('N'|'n')('F'|'f')('L'|'l')('I'|'i')('C'|'c')('T'|'t')('S'|'s');

Container : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('E'|'e')('R'|'r');

Mitigated : ('M'|'m')('I'|'i')('T'|'t')('I'|'i')('G'|'g')('A'|'a')('T'|'t')('E'|'e')('D'|'d');

Rationale : ('R'|'r')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l')('E'|'e');

Category : ('C'|'c')('A'|'a')('T'|'t')('E'|'e')('G'|'g')('O'|'o')('R'|'r')('Y'|'y');

Document : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

Evolves : ('E'|'e')('V'|'v')('O'|'o')('L'|'l')('V'|'v')('E'|'e')('S'|'s');

Package : ('P'|'p')('A'|'a')('C'|'c')('K'|'k')('A'|'a')('G'|'g')('E'|'e');

Refines : ('R'|'r')('E'|'e')('F'|'f')('I'|'i')('N'|'n')('E'|'e')('S'|'s');

Hazard : ('H'|'h')('A'|'a')('Z'|'z')('A'|'a')('R'|'r')('D'|'d');

Import : ('I'|'i')('M'|'m')('P'|'p')('O'|'o')('R'|'r')('T'|'t');

Issues : ('I'|'i')('S'|'s')('S'|'s')('U'|'u')('E'|'e')('S'|'s');

Title : ('T'|'t')('I'|'i')('T'|'t')('L'|'l')('E'|'e');

Goal : ('G'|'g')('O'|'o')('A'|'a')('L'|'l');

For : ('F'|'f')('O'|'o')('R'|'r');

See : ('S'|'s')('E'|'e')('E'|'e');

Val : ('V'|'v')('A'|'a')('L'|'l');

FullStopAsterisk : '.''*';

ColonColon : ':'':';

By : ('B'|'b')('Y'|'y');

NumberSign : '#';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

FullStop : '.';

Solidus : '/';

Colon : ':';

EqualsSign : '=';

CommercialAt : '@';

LeftSquareBracket : '[';

RightSquareBracket : ']';



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



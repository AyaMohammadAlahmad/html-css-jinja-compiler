parser grammar htmlParser;

options { tokenVocab=htmlLexer; }

template
    : content* EOF
    ;

content
    : doctype
    | html_element
    | style_element
    | jinja_statement
    | jinja_expression
    | TEXT
    ;


html_element
    : html_open_tag content* html_close_tag
    | html_self_closing_tag
    | html_void_element
    ;

html_open_tag
    : LT IDENTIFIER attribute_list? GT
    ;

html_close_tag
    : LT SLASH IDENTIFIER GT
    ;

html_self_closing_tag
    : LT IDENTIFIER attribute_list? SLASH GT
    ;


attribute_list
    : attribute+
    ;

attribute
    : IDENTIFIER EQ attribute_value
    ;

attribute_value
    : STRING
    | jinja_expression
    ;



jinja_statement
    : JINJA_STMT_OPEN jinja_stmt_body JINJA_STMT_CLOSE
    ;

jinja_stmt_body
    : extends_stmt
    | block_stmt
    | endblock_stmt
    | for_stmt
    | endfor_stmt
    ;

extends_stmt
    : EXTENDS STRING_J
    ;

block_stmt
    : BLOCK IDENTIFIER_J
    ;

endblock_stmt
    : ENDBLOCK
    ;

for_stmt
    : FOR IDENTIFIER_J IN IDENTIFIER_J
    ;

endfor_stmt
    : ENDFOR
    ;



jinja_expression
    : JINJA_EXPR_OPEN expression JINJA_EXPR_CLOSE
    ;

expression
    : function_call
    | variable
    ;

function_call
    : IDENTIFIER_E LPAREN argument_list? RPAREN
    ;

argument_list
    : argument (COMMA argument)*
    ;

argument
    : STRING_E
    | IDENTIFIER_E EQ_J expression
    ;

variable
    : IDENTIFIER_E (DOT IDENTIFIER_E)*
    ;
style_element
    : STYLE_OPEN CSS_TEXT* STYLE_CLOSE
    ;
html_void_element
    : LT VOID_TAG attribute_list? GT
    ;
doctype
    : DOCTYPE
    ;

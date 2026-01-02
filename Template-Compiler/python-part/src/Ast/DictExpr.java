package Ast;


import java.util.List;

    public class DictExpr extends Expression {

        private List<DictItemExpr> items;

        public DictExpr(List<DictItemExpr> items, int lineNumber) {
            super("DictExpr", lineNumber);
            this.items = items;
        }

        public List<DictItemExpr> getItems() {
            return items;
        }

        @Override
        public void print(int indent) {
            printIndent(indent);
            System.out.println(nodeName + " (line " + lineNumber + ")");
            for (DictItemExpr item : items) {
                item.print(indent + 1);
            }
        }
    }


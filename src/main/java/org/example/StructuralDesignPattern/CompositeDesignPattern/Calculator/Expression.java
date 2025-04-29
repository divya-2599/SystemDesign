package org.example.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression {

    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;
    private Character operation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression, Character operation) {
        this.leftExpression=leftExpression;
        this.rightExpression=rightExpression;
        this.operation=operation;
    }

    @Override
    public int evaluate() {
        switch (operation) {
            case '+':
                return leftExpression.evaluate() + rightExpression.evaluate();
            case '-':
                return leftExpression.evaluate() - rightExpression.evaluate();
            case '*':
                return leftExpression.evaluate() * rightExpression.evaluate();
            case '/':
                return leftExpression.evaluate() / rightExpression.evaluate();
        }
        return 0;
    }
}

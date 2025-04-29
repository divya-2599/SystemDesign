package org.example.BehaviouralDesignPattern.InterpreterDesignPattern;

public class MultiplyTerminalExpression implements AbstractExpression{

    AbstractExpression rightExpressionTerminal;
    AbstractExpression leftExpressionTerminal;

    public MultiplyTerminalExpression(AbstractExpression leftExpressionTerminal, AbstractExpression rightExpressionTerminal) {
        this.leftExpressionTerminal = leftExpressionTerminal;
        this.rightExpressionTerminal = rightExpressionTerminal;
    }

    @Override
    public int interpret(Context context) {
        return leftExpressionTerminal.interpret(context) * rightExpressionTerminal.interpret(context);
    }
}

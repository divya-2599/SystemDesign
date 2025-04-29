package org.example.BehaviouralDesignPattern.InterpreterDesignPattern;

public class NumberTerminalExpression implements AbstractExpression{

    String stringval;

    public NumberTerminalExpression( String stringval) {
        this.stringval = stringval;
    }

    @Override
    public int interpret(Context context) {
        return context.get(stringval);
    }
}

package org.example.BehaviouralDesignPattern.InterpreterDesignPattern;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 4);
        context.put("b", 2);
        AbstractExpression expression = new MultiplyTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
        int value= expression.interpret(context);
        System.out.println(value);
    }
}

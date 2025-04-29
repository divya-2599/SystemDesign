package org.example.StructuralDesignPattern.CompositeDesignPattern.Calculator;

public class Number implements ArithmeticExpression {

    private int number;

    public Number(int number){
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Number is : " + number);
        return number;
    }
}

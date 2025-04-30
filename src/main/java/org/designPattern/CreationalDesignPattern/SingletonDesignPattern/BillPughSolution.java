package org.designPattern.CreationalDesignPattern.SingletonDesignPattern;

public class BillPughSolution {

    private BillPughSolution(){}

    private static class BillPughSolutionHelper {
        private static BillPughSolution billPughSolution = new BillPughSolution();
    }

    public BillPughSolution getInstance() {
        return BillPughSolutionHelper.billPughSolution;
    }
}

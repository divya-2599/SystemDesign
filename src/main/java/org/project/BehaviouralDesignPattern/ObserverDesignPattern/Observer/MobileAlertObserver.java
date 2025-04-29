package org.project.BehaviouralDesignPattern.ObserverDesignPattern.Observer;

import org.project.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationObserver {

    private String mobileNo;
    private StocksObservable stocksObservable;

    public MobileAlertObserver(String mobileNo, StocksObservable stocksObservable) {
        this.mobileNo = mobileNo;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("Alert sent to observer with mobile no : "+ mobileNo+" and stocks count is : " + stocksObservable.getStocksCount());
    }
}

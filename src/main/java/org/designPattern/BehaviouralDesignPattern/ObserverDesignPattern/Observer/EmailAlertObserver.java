package org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer;

import org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationObserver {

    private String email;
    private StocksObservable stocksObservable;

    public EmailAlertObserver(String email, StocksObservable stocksObservable) {
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("Email sent to observer with mail id : " + email + " and stocks count is : " + stocksObservable.getStocksCount());
    }
}

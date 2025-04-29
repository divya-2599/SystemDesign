package org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observer;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    StockObservable stockObservable;

    String mailId;

    public EmailAlertObserverImpl(String mailId, StockObservable stockObservable){
        this.stockObservable=stockObservable;
        this.mailId=mailId;
    }

    @Override
    public void update() {
        System.out.println("Email sent to: " + mailId + " and stock count is: " + stockObservable.getData());
    }
}

package org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observer;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    StockObservable stockObservable;

    String contactNo;

    public MobileAlertObserverImpl(String contactNo, StockObservable stockObservable){
        this.contactNo=contactNo;
        this.stockObservable=stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Msg sent to contact number: " + contactNo + " and stock count is: " + stockObservable.getData());
    }
}

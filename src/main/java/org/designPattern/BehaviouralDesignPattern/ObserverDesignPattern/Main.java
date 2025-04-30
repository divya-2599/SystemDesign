package org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern;

import org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable.IphoneObservableImpl;
import org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StocksObservable;
import org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.EmailAlertObserver;
import org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.MobileAlertObserver;
import org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IphoneObservableImpl();
        NotificationObserver notificationObserver = new EmailAlertObserver("rani.divya", stocksObservable);
        NotificationObserver notificationObserver1 = new MobileAlertObserver("7073268482", stocksObservable);
        stocksObservable.add(notificationObserver);
        stocksObservable.add(notificationObserver1);
        stocksObservable.setStocksCount(10);
    }
}

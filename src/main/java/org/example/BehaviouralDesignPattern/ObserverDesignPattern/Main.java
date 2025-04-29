package org.example.BehaviouralDesignPattern.ObserverDesignPattern;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observable.IPhoneObservableImpl;
import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observable.StockObservable;
import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) {
        StockObservable stockObservable = new IPhoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", stockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("7896543210", stockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("def@gmail.com", stockObservable);
        stockObservable.add(observer1);
        stockObservable.add(observer2);
        stockObservable.add(observer3);
        stockObservable.setData(10);
    }
}

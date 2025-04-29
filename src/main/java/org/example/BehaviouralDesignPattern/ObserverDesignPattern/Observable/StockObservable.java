package org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observable;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void notifyObservable();
    void setData(int data);
    int getData();
}

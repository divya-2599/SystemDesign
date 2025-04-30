package org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observable;

import org.designPattern.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationObserver;

public interface StocksObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifyy();
    void setStocksCount(int count);
    int getStocksCount();
}

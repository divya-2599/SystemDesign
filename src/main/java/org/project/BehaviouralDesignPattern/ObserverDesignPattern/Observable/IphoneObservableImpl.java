package org.project.BehaviouralDesignPattern.ObserverDesignPattern.Observable;

import org.project.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    List<NotificationObserver> notificationObserverList = new ArrayList<>();

    int stocksCount = 0;

    @Override
    public void add(NotificationObserver notificationObserver) {
       notificationObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifyy() {
        for(NotificationObserver observer : notificationObserverList) {
            observer.update();
        }
    }

    @Override
    public void setStocksCount(int count) {
        if(stocksCount==0){
            stocksCount += count;
            notifyy();
        }
    }

    @Override
    public int getStocksCount() {
        return stocksCount;
    }
}

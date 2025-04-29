package org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observable;

import org.example.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{

    List<NotificationAlertObserver> list = new ArrayList<>();

    int stockCount=0;

    @Override
    public void add(NotificationAlertObserver obj) {
        list.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
         list.remove(obj);
    }

    @Override
    public void notifyObservable() {
          for(NotificationAlertObserver obj : list){
              obj.update();
          }
    }

    @Override
    public void setData(int data) {
        if(stockCount==0){
            notifyObservable();
        }
        stockCount+=data;
    }

    @Override
    public int getData() {
        return stockCount;
    }
}

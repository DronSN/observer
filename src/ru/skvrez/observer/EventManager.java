package ru.skvrez.observer;

import java.util.LinkedList;
import java.util.List;

public class EventManager {

    private List<Subscriber> subscribers = new LinkedList<>();

    public void notify(String text) {
        subscribers.forEach(subscriber -> subscriber.update(text));
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}

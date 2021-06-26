package ru.skvrez.observer;

public class EmailNotifySubscriber implements Subscriber {
    @Override
    public void update(String context) {
        System.out.println("Send email for new value: " + context);
    }
}

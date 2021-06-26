package ru.skvrez.observer;

public class Main {

    public static void main(String[] args) {

        EventManager eventManager = new EventManager();
        Editor editor = new Editor("123", eventManager);
        editor.setText("456");
        System.out.println("Editor text changed");
        eventManager.subscribe(new BackupSubscriber());
        EmailNotifySubscriber emailNotifySubscriber = new EmailNotifySubscriber();
        eventManager.subscribe(emailNotifySubscriber);
        editor.setText("789");
        System.out.println("Editor text changed");
        eventManager.unsubscribe(emailNotifySubscriber);
        editor.setText("000");
        System.out.println("Editor text changed");

    }
}

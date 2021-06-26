package ru.skvrez.observer;

public class BackupSubscriber implements Subscriber {
    @Override
    public void update(String context) {
        System.out.println("Backup started for new value:" + context);
    }
}

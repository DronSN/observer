package ru.skvrez.observer;

public class Editor {
    private String text;
    private EventManager eventManager;

    public Editor(String text, EventManager eventManager) {
        this.text = text;
        this.eventManager = eventManager;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        if (eventManager != null) {
            eventManager.notify(text);
        }
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                '}';
    }
}

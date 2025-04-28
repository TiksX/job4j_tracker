package ru.job4j.tracker;

public class SingleTracker {

    private static Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (tracker == null) {
            tracker = new Tracker();
        }
        return new SingleTracker();
    }

    public Item createItem(Item item) {
        return tracker.createItem(item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replaceItem(int id, Item item) {
        return tracker.replaceItem(id, item);
    }

    public void deleteItem(int id) {
        tracker.deleteItem(id);
    }
}

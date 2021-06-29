package com.company;

public class Manager {
    private boolean available;

    public Manager() {
        this.available = true;
    }

    public void addHelperToEvent(Helper helper, Event event) {
        if (event.getHelpersList().size() != 10) {
            event.addHelper(helper);
        }

    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Manager";
    }
}

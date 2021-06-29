package com.company;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private List<Helper> helpersList;
    private List<Manager> managersList;
    private EventType eventType;
    private EventCompany eventCompany;

    public Event(EventType eventType, EventCompany eventCompany) {
        this.eventType = eventType;
        this.eventCompany = eventCompany;
        this.helpersList = new ArrayList<>();
        this.managersList = new ArrayList<>();

        int count = 0;
        while (count < this.eventCompany.getListOfManagers().size()) {
            for (Manager manager : this.eventCompany.getListOfManagers()) {
                if (managersList.size() < 3) {
                    if (manager.isAvailable()) {
                        managersList.add(manager);
                        manager.setAvailable(false);
                        System.out.println(manager + " hired for the " + getEventType() + " event.");
                    }
                }
                count++;
            }
            if (managersList.size() < 3) {
                System.out.println("We didn't find enough managers for the event.");
            }
        }
    }

    public List<Helper> getHelpersList() {
        return helpersList;
    }

    public List<Manager> getManagersList() {
        return managersList;
    }

    public void addHelper(Helper helper) {
        helpersList.add(helper);
    }

    public boolean helperAction() {
        if (helpersList.size() != 10) {
            System.out.println("Managers need too add more helpers to the party");
            return false;
        }
        for (Helper helper : helpersList) {
            helper.action(eventType);
        }
        return true;
    }

    public EventType getEventType() {
        return eventType;
    }
}

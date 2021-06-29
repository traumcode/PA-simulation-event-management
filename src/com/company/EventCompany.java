package com.company;

import java.util.ArrayList;
import java.util.List;

public class EventCompany {
    private final List<Helper> listOfHelpers;
    private final List<Manager> listOfManagers;


    public EventCompany() {
        this.listOfHelpers = new ArrayList<>();
        this.listOfManagers = new ArrayList<>();
    }

    public List<Helper> getListOfHelpers() {
        return listOfHelpers;
    }

    public List<Manager> getListOfManagers() {
        return listOfManagers;
    }

    public void hireHelper(Helper helper) {
        boolean isInTheList = false;

        for (Helper helper1 : listOfHelpers) {
            if (helper == helper1) {
                isInTheList = true;
                System.out.println("You cannot hire the same helper");

                break;
            }
        }
        if (!isInTheList) {
            listOfHelpers.add(helper);
            System.out.println(helper + " hired.");
        }
    }

    public void hireManager(Manager manager) {
        boolean isInTheList = false;

        for (Manager manager1 : listOfManagers) {
            if (manager == manager1) {
                isInTheList = true;
                System.out.println("You cannot hire the same manager");
                break;
            }
        }
        if (!isInTheList) {
            listOfManagers.add(manager);
            System.out.println(manager + " hired.");
        }
    }
}

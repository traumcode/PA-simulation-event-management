package com.company;

public class Main {

    public static void main(String[] args) {

        Helper helper1 = new Helper(HelperType.SMOKER);
        Helper helper2 = new Helper(HelperType.COFFEEDRINKER);
        Helper helper3 = new Helper(HelperType.COFFEEDRINKER);
        Helper helper4 = new Helper(HelperType.SMOKER);
        Helper helper5 = new Helper(HelperType.SMOKER);
        Helper helper6 = new Helper(HelperType.COFFEEDRINKER);
        Helper helper7 = new Helper(HelperType.SMOKER);
        Helper helper8 = new Helper(HelperType.SMOKER);
        Helper helper9 = new Helper(HelperType.COFFEEDRINKER);
        Helper helper10 = new Helper(HelperType.COFFEEDRINKER);
        Helper helper11 = new Helper(HelperType.SMOKER);
        Helper helper12 = new Helper(HelperType.COFFEEDRINKER);
        Helper helper13 = new Helper(HelperType.COFFEEDRINKER);
        Helper helper14 = new Helper(HelperType.SMOKER);

        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        Manager manager3 = new Manager();
        Manager manager4 = new Manager();
        Manager manager5 = new Manager();
        Manager manager6 = new Manager();
        Manager manager7 = new Manager();


        EventCompany silviuEvents = new EventCompany();

        silviuEvents.hireHelper(helper1);
        silviuEvents.hireHelper(helper2);
        silviuEvents.hireHelper(helper3);
        silviuEvents.hireHelper(helper4);
        silviuEvents.hireHelper(helper5);
        silviuEvents.hireHelper(helper6);
        silviuEvents.hireHelper(helper7);
        silviuEvents.hireHelper(helper8);
        silviuEvents.hireHelper(helper9);
        silviuEvents.hireHelper(helper10);
        silviuEvents.hireHelper(helper11);
        silviuEvents.hireHelper(helper12);
        silviuEvents.hireHelper(helper13);
        silviuEvents.hireHelper(helper14);

        silviuEvents.hireManager(manager1);
        silviuEvents.hireManager(manager1);
        silviuEvents.hireManager(manager2);
        silviuEvents.hireManager(manager3);
        silviuEvents.hireManager(manager4);
        silviuEvents.hireManager(manager5);
        silviuEvents.hireManager(manager6);
        silviuEvents.hireManager(manager7);


        Event petrecere1 = new Event(EventType.COCKTAILPARTY, silviuEvents);

        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper1, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper2, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper3, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper4, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper5, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper6, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper7, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper8, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper9, petrecere1);
        silviuEvents.getListOfManagers().get(0).addHelperToEvent(helper10, petrecere1);

        System.out.println(petrecere1.getHelpersList().size());

        petrecere1.helperAction();

    }


}

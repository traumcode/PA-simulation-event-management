package com.company;

public class Helper {
    private final HelperType type;

    public Helper(HelperType type) {
        this.type = type;
    }

    public void getType() {
        if(this.type.equals(HelperType.SMOKER)) {
            System.out.println("I go smoke");
        } else {
            System.out.println("I go drink some coffee");
        }
    }

    public void action(EventType eventType) {
        int count = 0;
        if (eventType.equals(EventType.COCKTAILPARTY)) {
            for (int i = 0; i < (EventType.COCKTAILPARTY.getHoursLong() * 60); i += 5) {
                if (i >= 5) {
                    System.out.println("Excuse moi, do you want another cocktail");
                    count += 5;
                    if (takeABreak(count)) count = 0;
                }
            }
        } else if (eventType.equals(EventType.WEDDING)) {
            for (int i = 0; i < (EventType.WEDDING.getHoursLong() * 60); i += 10) {
                if (i >= 10) {
                    System.out.println("Excuse moi, do you want another cake");
                    count += 10;
                    if (takeABreak(count)) count = 0;
                }
            }
        } else {
            System.out.println("You can find the snaks at the bar");
        }
    }

    public boolean takeABreak(int count) {
        if (count == 120) {
            System.out.println("I take a break..");
            getType();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Helper";
    }
}

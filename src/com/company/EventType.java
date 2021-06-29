package com.company;

public enum EventType {
    COCKTAILPARTY(5) {
        @Override
        public int getHoursLong() {
            return hoursLong;
        }
    },
    WEDDING(8) {
        @Override
        public int getHoursLong() {
            return hoursLong;
        }
    },
    CONFERENCE(10) {
        @Override
        public int getHoursLong() {
            return hoursLong;
        }
    };

    public int hoursLong;

    EventType(int hoursLong) {
        this.hoursLong = hoursLong;
    }

    public abstract int getHoursLong();
}

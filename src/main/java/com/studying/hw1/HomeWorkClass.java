package com.studying.hw1;

public class HomeWorkClass {
    public int getPrimitiveFive() {
        int five = 5;
        return five;
    }

    public Integer getMinInteger() {
        return Integer.MIN_VALUE;
    }

    public Integer getMaxInteger() {
        return Integer.MAX_VALUE;
    }

    public Long getMinLong() {
        return Long.MIN_VALUE;
    }

    public Long getMaxLong() {
        return Long.MAX_VALUE;
    }
    public String writeToString() {
        StringBuilder word = new StringBuilder();
        for(int i = 1; i<= 10; i++){
            word.append(i);
        }
       return word.toString();
    }

    public boolean checkForNegativeValue(int number) {
        return number < 0;

    }

    public int getWeekday(Weekdays weekday) {
        if (weekday == null) {
            return -1;
        }
        switch (weekday){
            case MONDAY:
                return 1;
            case TUESDAY:
                return 2;
            case WEDNESDAY:
                return 3;
            case THURSDAY:
                return 4;
            case FRIDAY:
                return 5;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 7;

        }
        return -1;
    }

    public int getFactorial(int val) {
        if (val < 0) {
            return -1;
        } else if (val == 0) {
            return 1;
        } else {
            int result = 1;
            while (val != 0) {
                result *= val;
                val -= 1;
            }
            return result;
        }
    }

    public int findMaxValue(int a, int b) {
        return Integer.max(a,b);
    }
}

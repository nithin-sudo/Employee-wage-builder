package com.bridgelab;

public class EmployeeWage {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_PRESENT=2;
    static int WAGE_PER_HOUR=20;
    static int FULL_WORK_HOUR=8;
    static int PART_WORK_HOUR=4;
    public static void main(String[] args){
        int dailyWage;
        double empCheck=Math.floor(Math.random()*10)%3;
        switch ((int)empCheck) {
            case IS_FULL_TIME:
                System.out.println("employee is present");
                dailyWage=(WAGE_PER_HOUR*FULL_WORK_HOUR);
                System.out.println("salary is:"+dailyWage);
                break;
            case IS_PART_PRESENT:
                dailyWage=(WAGE_PER_HOUR*PART_WORK_HOUR);
                System.out.println("salary is :"+dailyWage);
                System.out.println("employee is part time present");
                break;
            default:
                System.out.println("when employee is absent for the day his salary is zero");
        }
    }
}

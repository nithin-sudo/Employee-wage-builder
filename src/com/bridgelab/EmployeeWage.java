package com.bridgelab;

public class EmployeeWage {
    public static void main(String[] args){
        int IS_FULL_TIME=1;
        int WAGE_PER_HOUR=20;
        int FULL_WORK_HOUR=8;
        int dailyWage;
        double random=Math.floor(Math.random()*10)%2;
        if (random==IS_FULL_TIME)
        {
            System.out.println("Employee is present");
            dailyWage=(WAGE_PER_HOUR*FULL_WORK_HOUR);
            System.out.println("Daily wage of an employee is:"+dailyWage);
        }
        else
        {
            System.out.println("Employee is absent for the day his salary is zero");
        }
    }
}

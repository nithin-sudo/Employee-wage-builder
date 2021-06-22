package com.bridgelab;

public class EmployeeWage {
    public static void main(String[] args){
        int IS_FULL_TIME=1;
        int IS_PART_PRESENT=2;
        int WAGE_PER_HOUR=20;
        int FULL_WORK_HOUR=8;
        int PART_WORK_HOUR=4;
        int dailyWage;
        double empCheck=Math.floor(Math.random()*10)%3;
        if (empCheck==IS_FULL_TIME)
        {
            System.out.println("Employee is full time present");
            dailyWage=(WAGE_PER_HOUR*FULL_WORK_HOUR);
            System.out.println("Daily wage of an employee is:"+dailyWage);
        }
        else if (empCheck==IS_PART_PRESENT)
        {
            System.out.println("employee is part time present");
            dailyWage=(WAGE_PER_HOUR*PART_WORK_HOUR);
            System.out.println("Daily wage of an employee is: :"+dailyWage);
        }
        else
        {
            System.out.println("Employee is absent for the day his salary is zero");
        }
    }
}

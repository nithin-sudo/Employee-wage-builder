package com.bridgelab;

public class EmployeeWage {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_PRESENT=2;
    static int WAGE_PER_HOUR=20;
    static int FULL_WORK_HOUR=8;
    static int PART_WORK_HOUR=4;
    static int WORKING_DAYS=20;
    public static void main(String[] args){
        int empHrs=0;
        int dailyWage;
        int totalWage = 0;
        for (int i=1;i<WORKING_DAYS;i++){
            double empCheck=Math.floor(Math.random()*10)%3;
            switch ((int)empCheck) {
                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                case IS_PART_PRESENT:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
            }
            dailyWage=(WAGE_PER_HOUR*empHrs);
            totalWage+=dailyWage;
        }
        System.out.println("Salary per month is:"+totalWage);
    }
}

package com.bridgelab;
public class EmployeeWage {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_PRESENT=2;
    /**
     * accepting three arguments and calculating employee wage for company.
     * @param company
     * @param wagePerHour
     * @param workingDays
     */
    public void employeeTotalWage(String company,int wagePerHour,int workingDays){
        int empHrs=0;
        int dailyWage;
        int totalWage = 0;
        int totalWorkingHrs = 0;
        for (int i=1;i<workingDays;i++){
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
            dailyWage=(wagePerHour*empHrs);
            totalWage+=dailyWage;
            totalWorkingHrs+=empHrs;
        }
        System.out.println("Salary per month of an employee for company: " +company+" is:"+totalWage+ " for total working hours: "+totalWorkingHrs );
    }
    /**
     * calling employeeTotalWage method by passing arguments.
     * @param args
     */
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.employeeTotalWage("jio",20,20);
        employeeWage.employeeTotalWage("Adani power",25,18);
    }
}

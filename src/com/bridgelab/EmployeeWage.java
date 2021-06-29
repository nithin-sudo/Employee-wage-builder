package com.bridgelab;
public class EmployeeWage {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_PRESENT=2;
    public CompanyEmployeeWage[] companyEmployeeWageArray;
    private int numOfCompanies = 0;
    public EmployeeWage()
    {
        super();
        this.companyEmployeeWageArray = new CompanyEmployeeWage[5];
    }
    /**
     * storing the values to the array.
     * @param wagePerHour
     * @param maxHours
     * @param daysInMonth
     * @param companyName
     */
    public void addCompanyEmployeeWage(int wagePerHour,int maxHours,int daysInMonth,String companyName)
    {
        companyEmployeeWageArray[numOfCompanies] = new CompanyEmployeeWage(wagePerHour, maxHours, daysInMonth, companyName);
        numOfCompanies++;
    }
    public void computeEmployeeWage(){
        for(int index = 0;index < companyEmployeeWageArray.length;index++)
        {
                CompanyEmployeeWage companyEmployeeWage = companyEmployeeWageArray[index];
                if(companyEmployeeWage != null) {
                    int monthlyEmployeeWage = this.employeeTotalWage(companyEmployeeWage);
                    companyEmployeeWage.setTotalEmployeeWage(monthlyEmployeeWage);
                    companyEmployeeWageArray[index] = companyEmployeeWage;
                    System.out.println(companyEmployeeWageArray[index]);
                }
        }
    }
    /**
     * calculating monthly employee wage and returning it.
     * @param companyEmployeeWage
     * @return
     */
    public int employeeTotalWage(CompanyEmployeeWage companyEmployeeWage){
        int monthlyEmpWage = 0;
        int totalWorkingDays = 0;
        int totalEmployeeHours = 0;
        while(totalEmployeeHours < companyEmployeeWage.maxHours && totalWorkingDays < companyEmployeeWage.daysInMonth)
        {
            int dailyEmpWage = 0;
            totalWorkingDays++;
            int empHrs=0;
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
            dailyEmpWage = companyEmployeeWage.wagePerHour * empHrs;
            totalEmployeeHours = totalEmployeeHours + empHrs;
            monthlyEmpWage += dailyEmpWage;
        }
        return monthlyEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmployeeWage(100,10,20,"Dmart");
        employeeWage.addCompanyEmployeeWage(200,14,25,"bridgeLabz");
        employeeWage.computeEmployeeWage();
    }
}

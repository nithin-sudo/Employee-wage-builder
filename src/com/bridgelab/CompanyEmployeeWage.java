package com.bridgelab;

public class CompanyEmployeeWage {
    public int wagePerHour;
    public int maxHours;
    public int daysInMonth;
    public String companyName;
    public int totalEmployeeWage;

    public CompanyEmployeeWage(int wagePerHour, int maxHours, int daysInMonth, String companyName) {
        this.wagePerHour = wagePerHour;
        this.maxHours = maxHours;
        this.daysInMonth = daysInMonth;
        this.companyName = companyName;
    }
    @Override
    public String toString()
    {
        return "CompanyEmployeeWage [wagePerHour="+wagePerHour+",maxHours="+maxHours+
                ", daysInMonth="+daysInMonth+", companyName="+companyName+", totalEmployeewage="+totalEmployeeWage+ "]";
    }
   public void setTotalEmployeeWage(int totalEmployeeWage){
        this.totalEmployeeWage = totalEmployeeWage;
    }
}

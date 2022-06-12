package com.bridgelabz;

public interface IComputeEmpWage {

        public void addCompanyEmpWage(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth);
        public void computeEmpWage();
        public int getTotalWage(String companyName);

}

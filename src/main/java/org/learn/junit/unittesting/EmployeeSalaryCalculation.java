package org.learn.junit.unittesting;

public class EmployeeSalaryCalculation {
	public double yearlySalary(Employee emp)
	{
		double yearlySalary=0;
		yearlySalary = emp.getSalary()*12;
		return yearlySalary;
	}
	
	public double yearlyAppraisal(Employee emp)
	{
		double appraisal=0;
		
		if(emp.getSalary() < 10000)
		{
			appraisal = 500;
		}
		else
		{
			appraisal=1000;
		}
		return appraisal;
	}
}

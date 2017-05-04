package org.learn.junit.unittesting;

import org.junit.Test;

import static junit.framework.Assert.*;

public class EmployeeTest {

		Employee emp = new Employee();
		EmployeeSalaryCalculation empSal = new EmployeeSalaryCalculation();
		
		@Test
		public void testCalculateAppraisal()
		{
			emp.setAge(25);;
			emp.setName("RakeshB");
			emp.setSalary(8000);
			
			double appraisal = empSal.yearlyAppraisal(emp);
			assertEquals(500.0, appraisal);
		}
		
		@Test
		public void testCalculateYearlySalary()
		{
			emp.setAge(30);
			emp.setName("Venu");
			emp.setSalary(15000);
			
			double yearlySal = empSal.yearlySalary(emp);
			assertEquals(180000.0, yearlySal);
		}
	}

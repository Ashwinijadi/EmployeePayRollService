package com.capgemini.employeeroll;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import static com.capgemini.employeeroll.EmployeePayRollService.IOService.FILE_IO;

public class EmployeePayRollServiceTest {

	@Test
	public void givenThreeEmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
		EmployeePayRollData[] Employees = { new EmployeePayRollData(1, "aish", 100000.0),
				new EmployeePayRollData(2, "sweety", 200000.0), new EmployeePayRollData(3, "smiley", 300000.0) };
		EmployeePayRollService employeePayRollService;
		employeePayRollService = new EmployeePayRollService(Arrays.asList(Employees));
		employeePayRollService.writeEmployeePayrollData(FILE_IO);
		employeePayRollService.printData(FILE_IO);
		long entries = employeePayRollService.countEntries(FILE_IO);
		Assert.assertEquals(3, entries);
	}

	@Test
	public void writePayrollOnFile() {
		EmployeePayRollData[] Employees = { new EmployeePayRollData(1, "ashu", 100000.0),
				new EmployeePayRollData(2, "shiny", 200000.0), new EmployeePayRollData(3, "joy", 300000.0) };
		EmployeePayRollService employeePayRollService1;
		employeePayRollService1 =new EmployeePayRollService(Arrays.asList(Employees));
		employeePayRollService1.writeEmployeePayrollData(FILE_IO);
		employeePayRollService1.printData(FILE_IO);
		long entries = employeePayRollService1.countEntries(FILE_IO);
		Assert.assertEquals(3, entries);
	}

	@Test
	public void countEntries() {
		EmployeePayRollData[] Employee = { new EmployeePayRollData(1, "ash", 100000.0),
				new EmployeePayRollData(2, "sweet", 200000.0), new EmployeePayRollData(3, "smile", 300000.0) };
		EmployeePayRollService employeePayRollService;
		 employeePayRollService= new EmployeePayRollService(Arrays.asList(Employee));
		employeePayRollService.writeEmployeePayrollData(FILE_IO);
		employeePayRollService.printData(FILE_IO);
		long entries = employeePayRollService.countEntries(FILE_IO);
		System.out.println("number of entries : "+entries);
		Assert.assertEquals(3, entries);
	}
}

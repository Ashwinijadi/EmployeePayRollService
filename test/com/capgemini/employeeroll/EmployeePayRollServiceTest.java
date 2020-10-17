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

	
	
}

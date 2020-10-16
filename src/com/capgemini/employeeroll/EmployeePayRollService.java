package com.capgemini.employeeroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
	private List<EmployeePayRollData> employeePayrollList;

	public EmployeePayRollService() {
	}

	public EmployeePayRollService(List<EmployeePayRollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayRollData> employeePayrollList = new ArrayList<>();
		EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);
		employeePayrollService.writeEmployeePayrollData();
	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter the employee ID : ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter the employee name : ");
		String name = consoleInputReader.next();
		System.out.println("Enter the employee's salary : ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayRollData(id, name, salary));
	}

	public void writeEmployeePayrollData() {
		System.out.println("data on cosole:" + employeePayrollList);
	}
}

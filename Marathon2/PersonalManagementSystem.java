package Marathon2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PersonalManagementSystem {

	static Scanner scanner = new Scanner(System.in);
	List<Employee> employeesList = new ArrayList<>();

	public void menu() {
		baseEmployeeList();
		while (true) {
			System.out.println("---Personal Management System---");
			System.out.println("---------------------------------");
			System.out.println("1-Create Employee \n2-Show Employee List\n3-Montly Salary Payment List \n4-Exit");
			System.out.println("What you want to do?");
			int selection = scanner.nextInt();
			if (selection == 4) {
				System.out.println("Are you sure? (Y/N)");
				String sure = scanner.next();
				if (sure.equalsIgnoreCase("y")) {
					System.out.println("Bye..");
					break;
				}
			}
			switch (selection) {
			case 1:
				createNewEmployee();
				break;
			case 2:
				showEmployeeList();
				break;
			case 3:
				showPaymentList();
				break;
			}
		}
	}

	private void showEmployeeList() {
		System.out.println("1-List Employees \n2-List Employees By Name \n3-List Employees By Date Of Employment");
		System.out.println("Which list do you want to see?");
		int listTypeSelection = scanner.nextInt();
		switch (listTypeSelection) {
		case 1:
			ListEmployeesByRegistirationId();
			break;
		case 2:
			ListEmployeesByName();
			break;
		case 3:
			ListEmployeesByDateOfStartJob();
			break;
		}
	}

	private void baseEmployeeList() {
		employeesList.add(new HourlyEmployee("Hilal", "Er", LocalDate.of(2018, 4, 06), LocalDate.of(2020, 04, 12), 100));
		employeesList
				.add(new HourlyEmployee("Deniz", "Kuscu", LocalDate.of(2018, 5, 10), LocalDate.of(2022, 06, 22), 90));
		employeesList
				.add(new HourlyEmployee("Alper", "ikinci", LocalDate.of(2015, 11, 10), LocalDate.of(2019, 06, 22), 70));
		employeesList
				.add(new HourlyEmployee("Aysel", "Celik", LocalDate.of(2020, 05, 13), LocalDate.now(), 80));
		employeesList
				.add(new MonthlyEmployee("Cagri", "Turkmen", LocalDate.of(2021, 2, 9), LocalDate.of(2023, 3, 8), 5000));
		employeesList
				.add(new MonthlyEmployee("Babur", "Somer", LocalDate.of(2015, 5, 9), LocalDate.of(2022, 5, 8), 8000));
		employeesList.add(
				new MonthlyEmployee("Babur", "Turkmen", LocalDate.of(2019, 9, 15), LocalDate.now(), 10000));
		employeesList.add(
				new MonthlyEmployee("Seyda", "Mersin", LocalDate.of(2019, 1, 9), LocalDate.of(2020, 5, 18), 15000));
	}

	private void createNewEmployee() {

		System.out.println("1-Hourly \n2-Monthly");
		int employeeTypeSelection = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Surname: ");
		String surname = scanner.nextLine();
		System.out.print("Date of start: (yyyy-MM-dd): ");
		String dateOfStart = scanner.next();
		System.out.print("Date of quit: (yyyy-MM-dd): ");
		String dateOfQuit = scanner.next();

		switch (employeeTypeSelection) {
		case 1:
			System.out.print("Hourly payment:");
			double hourlyPayment = scanner.nextDouble();
			HourlyEmployee hourlyEmployee = new HourlyEmployee(name, surname, formatDate(dateOfStart),
					formatDate(dateOfQuit), hourlyPayment);
			employeesList.add(hourlyEmployee);
			employeesList.stream().forEach(e -> System.out.println(e));
			break;
		case 2:
			System.out.print("Salary: ");
			double salary = scanner.nextDouble();
			MonthlyEmployee monthlyEmployee = new MonthlyEmployee(name, surname, formatDate(dateOfStart),
					formatDate(dateOfQuit), salary);
			employeesList.add(monthlyEmployee);
			employeesList.stream().forEach(e -> System.out.println(e));
			break;
		}
	}

	private LocalDate formatDate(String date) {
		LocalDate d1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		return d1;
	}

	private void ListEmployeesByName() {

		Collections.sort(employeesList, new NameComparator());
		System.out
				.println("..........................................................................................");
		employeesList
				.forEach(e -> System.out.println(e.getRegistirationId() + " " + e.getName() + " " + e.getSurname()));
		System.out
				.println("..........................................................................................");
	}

	private void ListEmployeesByDateOfStartJob() {
		Collections.sort(employeesList, new DateComparator());
		System.out
				.println("..........................................................................................");
		employeesList.forEach(e -> System.out.println(
				e.getJobStartDate() + " " + e.getRegistirationId() + " " + e.getName() + " " + e.getSurname()));
		System.out
				.println("..........................................................................................");
	}

	private void ListEmployeesByRegistirationId() {
		System.out
				.println("..........................................................................................");
		employeesList.stream()
				.forEach(e -> System.out.println(e.getRegistirationId() + " " + e.getName() + " " + e.getSurname()));
		System.out
				.println("..........................................................................................");
	}

	private void showPaymentList() {

		System.out.println("In which date you want to see payroll? (yyyy-MM-dd)");
		String dateOfPayrollString = scanner.next();
		LocalDate dateOfPayroll = formatDate(dateOfPayrollString);
		System.out
				.println("..........................................................................................");
		employeesList.stream().filter(e -> ChronoUnit.DAYS.between(e.getJobStartDate(), dateOfPayroll) > 0)
				.filter(e -> ChronoUnit.DAYS.between(e.getJobQuitDate(), dateOfPayroll) < 0)
				.forEach(e -> System.out.println(e.getName() + " " + e.getSurname() + " " + e.getJobStartDate() + " "
						+ String.format("%.2f", e.getSalary())));
		System.out
				.println("..........................................................................................");

	}

}

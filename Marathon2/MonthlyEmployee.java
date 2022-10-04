package Marathon2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MonthlyEmployee extends Employee {

	private double salary;

	public MonthlyEmployee() {

	}

	public MonthlyEmployee(String name, String surname, LocalDate jobStartDate, LocalDate jobQuitDate, double salary) {
		super(name, surname, jobStartDate, jobQuitDate);
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculateMontlyEmployeeSalary(double salary) {
		return salaryCalculation(getJobStartDate(), salary)* 1.25;
	}

	@Override // 
	public double salaryCalculation(LocalDate date, double netSalary) {
		int monthsBetween = (int) ChronoUnit.MONTHS.between(date, LocalDate.now()) / 6;
		double currentSalary = salary;
		for (int i = 0; i < monthsBetween; i++) {
			currentSalary = (1.2) * currentSalary;
		}
		return currentSalary;
	}
	@Override
	public String toString() {
		return "MonthlyEmployee[ RegistirationId= " + getRegistirationId() + " Name= " + getName() + " Surname= "
				+ getSurname() + " Salary= " + String.format("%.2f", calculateMontlyEmployeeSalary(salary)) + " Job Start Date= " + getJobStartDate() + " ]";
	}

}

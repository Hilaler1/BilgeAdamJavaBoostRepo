package Marathon2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class HourlyEmployee extends Employee implements ISalaryCalculatable {

	private double hourlyPayment;
	private int hour = workedHours();
	private double salary;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String name, String surname, LocalDate jobStartDate, LocalDate jobQuitDate,
			double hourlyPayment) {
		super(name, surname, jobStartDate, jobQuitDate);
		this.hourlyPayment = hourlyPayment;
		this.salary = calculateHourlyEmployeeSalary(hour, hourlyPayment);
	}

	@Override
	public double calculateHourlyEmployeeSalary(int hour, double hourlyPayment) {

		double netSalary = (hour * hourlyPayment) * 1.08;
		return salaryCalculation(getJobStartDate(), netSalary);
	}
	public double salaryCalculation(LocalDate date, double salary) {
		int monthsBetween = (int) ChronoUnit.MONTHS.between(date, LocalDate.now()) / 6;
		double currentSalary = salary;
		for (int i = 0; i < monthsBetween; i++) {
			currentSalary = (1.1) * currentSalary;
		}
		return currentSalary;
	}
	private int workedHours() {
		Random random = new Random();
		int low = 100;
		int high = 200;
		int hour = random.nextInt(low, high);
		return hour;
	}

	public double getHourlyPayment() {
		return hourlyPayment;
	}

	public void setHourlyPayment(double hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "HourlyEmployee [ RegistirationId= " + getRegistirationId() + " Name= " + getName() + " Surname= "
				+ getSurname() + " Salary= " + String.format("%.2f", salary)+ " Job Start Date= " + getJobStartDate()  + " ]";
	}

}

package Marathon2;

import java.time.LocalDate;


public abstract class Employee {
	public static int count=1;
	private String registirationId;
	private String name;
	private String surname;
	private LocalDate jobStartDate;
	private LocalDate jobQuitDate;
	protected double salary;

	public Employee() {
		super();
	}

	public Employee(String name, String surname, LocalDate jobStartDate, LocalDate jobQuitDate) {
		super();
		this.name = name;
		this.surname = surname;
		this.jobStartDate = jobStartDate;
		this.jobQuitDate = jobQuitDate;
		this.registirationId= this.getJobStartDate().getYear()+"/"+ generateRegistrationNumber();

	}
	String generateRegistrationNumber() {
		if (count == 9999) {
			count = 0;
		}

		String tempId = String.format("%04d", count++);
		return tempId;
	}
	public abstract double salaryCalculation(LocalDate date, double salary); 
	
	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRegistirationId() {
		return registirationId;
	}


	public LocalDate getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(LocalDate jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public LocalDate getJobQuitDate() {
		return jobQuitDate;
	}

	public void setJobQuitDate(LocalDate jobQuitDate) {
		this.jobQuitDate = jobQuitDate;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

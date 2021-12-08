package entities;

public class Employee {
	private String name;
	private Integer hours;
	private double valuePerHour;

	public Employee() {
		super();
	}

	public Employee(String name, Integer hours, double valluePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valluePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValluePerHour() {
		return valuePerHour;
	}

	public void setValluePerHour(double valluePerHour) {
		this.valuePerHour = valluePerHour;
	}

	public double payment() {
		return hours * valuePerHour;
	}

	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();		
		sbd.append(getName() + " - $ ");
		sbd.append(String.format("%.2f", payment()));

		return sbd.toString();
	}

}

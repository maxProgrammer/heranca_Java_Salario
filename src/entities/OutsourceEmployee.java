package entities;

public class OutsourceEmployee extends Employee {
	private Double additionalCharge;

	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, double valluePerHour, Double additionalCharge) {
		super(name, hours, valluePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public final double payment() {

		return super.payment() + additionalCharge * 1.1;
	}

}

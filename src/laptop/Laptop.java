package laptop;

public class Laptop {
	private double voltage;
	private double amperage;
	private String plugType;
	
	public Laptop(double voltage, double amperage, String plugType) {
		this.voltage = voltage;
		this.amperage = amperage;
		this.plugType = plugType;
	}
	
	public Laptop() {}
	
	public double getVoltage() {
		return voltage;
	}
	
	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}
	
	public double getAmperage() {
		return amperage;
	}
	
	public void setAmperage(double amperage) {
		this.amperage = amperage;
	}
	
	public String getPlugType() {
		return plugType;
	}
	
	public void setPlugType(String plugType) {
		this.plugType = plugType;
	}
	
	public void charge() {
		System.out.println("Charging Laptop");
	}
}

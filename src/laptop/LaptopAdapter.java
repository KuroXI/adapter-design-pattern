package laptop;

import target.PowerOutlet;
import utils.Utils;

public class LaptopAdapter implements PowerOutlet {
	private final Laptop laptop;
	
	public LaptopAdapter(Laptop laptop) {
		this.laptop = laptop;
	}
	
	@Override
	public void plugin() {
		double deviceWattage = this.laptop.getVoltage() * this.laptop.getAmperage();
		double outletMaxWattage = OUTLET_VOLTAGE * OUTLET_MAX_CURRENT;
		
		if (Utils.isCompatible(deviceWattage, outletMaxWattage, this.laptop.getPlugType(), OUTLET_ACCEPTABLE_PLUG_TYPES)) {
			this.laptop.charge();
		} else {
			System.out.println("Warning: The device requires more power than the outlet can provide!");
		}
	}
}

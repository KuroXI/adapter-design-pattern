package refrigerator;

import target.PowerOutlet;
import utils.Utils;

public class RefrigeratorAdapter implements PowerOutlet {
	private final Refrigerator refrigerator;
	
	public RefrigeratorAdapter(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}
	
	@Override
	public void plugin() {
		double deviceWattage = this.refrigerator.getVoltage() * this.refrigerator.getAmperage();
		double outletMaxWattage = OUTLET_VOLTAGE * OUTLET_MAX_CURRENT;
		
		if (Utils.isCompatible(deviceWattage, outletMaxWattage, this.refrigerator.getPlugType(), OUTLET_ACCEPTABLE_PLUG_TYPES)) {
			this.refrigerator.startCooling();
		} else {
			System.out.println("Warning: The device requires more power than the outlet can provide!");
		}
	}
}

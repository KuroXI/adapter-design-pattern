package smartphoneCharger;

import target.PowerOutlet;
import utils.Utils;

public class SmartphoneChargerAdapter implements PowerOutlet {
	private final SmartphoneCharger smartphoneCharger;
	
	public SmartphoneChargerAdapter(SmartphoneCharger smartphoneCharger) {
		this.smartphoneCharger = smartphoneCharger;
	}
	
	@Override
	public void plugin() {
		double deviceWattage = this.smartphoneCharger.getVoltage() * this.smartphoneCharger.getAmperage();
		double outletMaxWattage = OUTLET_VOLTAGE * OUTLET_MAX_CURRENT;
		
		if (Utils.isCompatible(deviceWattage, outletMaxWattage, this.smartphoneCharger.getPlugType(), OUTLET_ACCEPTABLE_PLUG_TYPES)) {
			this.smartphoneCharger.chargePhone();
		} else {
			System.out.println("Warning: The device requires more power than the outlet can provide!");
		}
	}
}

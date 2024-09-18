package utils;

import java.util.List;

public class Utils {
	public static boolean isCompatible(double deviceWattage, double outletMaxWattage, String plugType, List<String> plugTypes) {
		return deviceWattage < outletMaxWattage && plugTypes.contains(plugType);
	}
}

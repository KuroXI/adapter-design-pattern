package target;

import java.util.List;

public interface PowerOutlet {
	double OUTLET_VOLTAGE = 120.0;
	double OUTLET_MAX_CURRENT = 15.0;
	List<String> OUTLET_ACCEPTABLE_PLUG_TYPES = List.of("USB-C", "TYPE-G", "TYPE-C");
	
	void plugin();
}

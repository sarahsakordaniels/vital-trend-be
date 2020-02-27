package vitaltrend.vitaltrendbackend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VitalSetHardcodedService {
	
	private static List<VitalSet> vitalsets = new ArrayList();
	private static int idCounter = 0;
	
	static {
		vitalsets.add(new VitalSet(++idCounter, "Sarah", "Bob", 140, 90, 75,
				16, 95, 37.1, new Date()));
		vitalsets.add(new VitalSet(++idCounter, "Sarah", "Bob", 155, 93, 77,
				17, 92, 37.5, new Date()));
		vitalsets.add(new VitalSet(++idCounter, "Sarah", "Bob", 133, 88, 56,
				12, 99, 36.9, new Date()));
	}
	
	public List<VitalSet> findAll() {
		return vitalsets;
	}

}

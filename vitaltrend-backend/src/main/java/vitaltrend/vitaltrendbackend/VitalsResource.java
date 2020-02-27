package vitaltrend.vitaltrendbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VitalsResource {
	@Autowired
	private VitalSetHardcodedService  vitalService; 
	
	
	@GetMapping("/users/{username}/vitalsets")
	public List<VitalSet> getAllVitalSets(@PathVariable String username){
		return vitalService.findAll();
	}

}

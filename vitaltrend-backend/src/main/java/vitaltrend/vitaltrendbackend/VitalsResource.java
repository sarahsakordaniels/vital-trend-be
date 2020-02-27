package vitaltrend.vitaltrendbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class VitalsResource {
	@Autowired
	private VitalSetHardcodedService  vitalService; 
	
	
	@GetMapping("/users/{username}/vitalsets")
	public List<VitalSet> getAllVitalSets(@PathVariable String username){
		return vitalService.findAll();
	}

	@DeleteMapping("/users/{username}/vitalsets/{id}")
	public ResponseEntity<Void> deleteVitalSet(@PathVariable String username, @PathVariable long id){
		VitalSet vitalset = vitalService.deleteById(id);
		if(vitalset != null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}

}

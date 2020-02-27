package vitaltrend.vitaltrendbackend;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class VitalsResource {
	@Autowired
	private VitalSetHardcodedService  vitalService; 
	
	
	@GetMapping("/users/{username}/vitalsets")
	public List<VitalSet> getAllVitalSets(@PathVariable String username){
		return vitalService.findAll();
	}
	
	@GetMapping("/users/{username}/vitalsets/{id}")
	public VitalSet getAllVitalSets(@PathVariable String username, @PathVariable long id){
		return vitalService.findById(id);
	}
	
	@PutMapping("/users/{username}/vitalsets/{id}")
	public ResponseEntity<VitalSet> updateVitalSet(@PathVariable String username, @PathVariable long id, @RequestBody VitalSet vitalset){
		VitalSet vitalSetUpdated = vitalService.save(vitalset);
		return new ResponseEntity<VitalSet>(vitalset, HttpStatus.OK);
	}
	
	@PostMapping("/users/{username}/vitalsets")
	public ResponseEntity<VitalSet> updateVitalSet(@PathVariable String username, @RequestBody VitalSet vitalset){
		VitalSet createdVitalSet = vitalService.save(vitalset);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdVitalSet.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
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

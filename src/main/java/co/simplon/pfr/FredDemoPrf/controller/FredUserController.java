package co.simplon.pfr.FredDemoPrf.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.pfr.FredDemoPrf.model.FredUser;
import co.simplon.pfr.FredDemoPrf.repository.FredUserRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class FredUserController {
	
	@Autowired
	FredUserRepository fredUserRepository;
	
	@GetMapping("/user")
	List<FredUser> getAllFredUser(){
		return fredUserRepository.findAll();
	}
	
    @GetMapping("/user/{id}")
    public ResponseEntity<FredUser> getFredUserById(@PathVariable(value = "id") Long fredUserId) {
        FredUser fredUser = fredUserRepository.findOne (fredUserId);
        if(fredUser == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(fredUser);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<FredUser> updateFredUser(@PathVariable(value = "id") Long fredUserId,
                                                  @Valid @RequestBody FredUser fredUserValue) {
        FredUser fredUser = fredUserRepository.findOne(fredUserId);
        if(fredUser == null) {
            return ResponseEntity.notFound().build();
        }
        fredUser.setUsername (fredUserValue.getUsername());
        fredUser.setPassword (fredUserValue.getPassword());
        fredUser.setEmail (fredUserValue.getEmail());

        FredUser updatedFredUser = fredUserRepository.save(fredUser);
        return ResponseEntity.ok(updatedFredUser);
    }
}

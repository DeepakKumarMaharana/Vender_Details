package com.vender_details.vender_details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vender_details.vender_details.entity.Vender;
import com.vender_details.vender_details.service.VenderService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/vender")
public class VenderController {
	@Autowired
	private VenderService venderService;
	
	@GetMapping
	public List<Vender>getAllVenders(){
		return venderService.getAllVenders();
	}
	@PostMapping
	public Vender createVender(Vender vender) {
		return venderService.createVender(vender);
	}
	@PutMapping("/{id}")
	public Vender updateVenderById(@PathVariable Long id, @RequestBody Vender updatedVender) {
		
		return venderService.updateVenderById(id, updatedVender);
	}
	@GetMapping("/home")
	public String home() {
		
		return "Hi deepak";
	}
	
	
}

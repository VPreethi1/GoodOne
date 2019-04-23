package com.example.Adress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Adress.model.Adress;
import com.example.Adress.repository.AdressRepository;

@RestController
@RequestMapping("/address")
public class AdressController {
	@Autowired
	AdressRepository adressrepository;
	//@GetMapping("/save")
	@PostMapping("/save")
	public Adress saveDeatils(@RequestBody Adress adress){
		/*Adress a = new Adress();
		a.setAddressLane(2);
		a.setRoadName("muthappa block");*/
		return adressrepository.save(adress);
	}
	@GetMapping("/alldetails")
	public List<Adress> getall(){
		return adressrepository.findAll();
	}
	
}

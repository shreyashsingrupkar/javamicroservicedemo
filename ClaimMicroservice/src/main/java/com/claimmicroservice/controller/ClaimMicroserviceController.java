package com.claimmicroservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.claimmicroservice.entity.PensionDetail;
import com.claimmicroservice.serviceimpl.ClaimServiceImpl;
@RestController
public class ClaimMicroserviceController {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	ClaimServiceImpl claimServiceImpl;
	
	 @GetMapping(value="/processpension/{aadharno}")
	 public String processPension(@PathVariable long aadharno) {
		 String p=claimServiceImpl.processPension(aadharno,restTemplate);
		 return ""+p;
	 }
	

}

package com.claimmicroservice.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.claimmicroservice.entity.PensionDetail;
import com.claimmicroservice.entity.PensionerDetails;
import com.claimmicroservice.service.ClaimService;


@RestController
public class ClaimMicroserviceController {
	private static final Logger log = LoggerFactory.getLogger(ClaimMicroserviceController.class);
	
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	ClaimService claimService;
	
	 @GetMapping(value="/processpension/{aadharno}")
	 public PensionDetail processPension(@PathVariable long aadharno) {
		// PensionerDetails p= restTemplate.getForObject("http://172.22.192.1:9002/getpensioner/"+aadharno,PensionerDetails.class);
			
		 PensionerDetails p= restTemplate.getForObject("http://localhost:9002/getpensioner/"+aadharno,PensionerDetails.class);
		 log.info("pensioner details", p);
	     
		 PensionDetail pd=claimService.processPension(aadharno, p);
		 return pd;
	 }
	

}

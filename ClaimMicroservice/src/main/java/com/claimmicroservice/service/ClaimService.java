package com.claimmicroservice.service;

import org.springframework.web.client.RestTemplate;

import com.claimmicroservice.entity.PensionDetail;

public interface ClaimService {

	public String processPension(long aadharno,RestTemplate restTemplate);
}

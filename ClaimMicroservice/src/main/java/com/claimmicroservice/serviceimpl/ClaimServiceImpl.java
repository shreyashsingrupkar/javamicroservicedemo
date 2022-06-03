package com.claimmicroservice.serviceimpl;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.claimmicroservice.entity.PensionAmount;
import com.claimmicroservice.entity.PensionDetail;
import com.claimmicroservice.entity.PensionerDetails;
import com.claimmicroservice.service.ClaimService;
@Service
public class ClaimServiceImpl implements ClaimService {

	@Override
	public String processPension(long aadharno,RestTemplate restTemplate) {
			
		
		//PensionDetail pd=new PensionDetail();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <PensionerDetails> entity = new HttpEntity<PensionerDetails>(headers);
      
     String p= restTemplate.exchange("http://localhost:9002/pensionerdetailbyaadhaar/"+aadharno, HttpMethod.GET, entity, String.class).getBody();
     
     /*double selfpension=(80/100)*(p.getSalaryearned()+p.getAllowances());
     double familypension=(50/100)*(p.getSalaryearned()+p.getAllowances());
     
     
     PensionAmount pa=new PensionAmount();
     pa.setFamilypension(familypension);
     pa.setSelfpension(selfpension);
    
     
     
     if(p.getBank().getBanktype()=="public") {
    	 pd.setBankservicecharge(500.0);
     }else {
    	 pd.setBankservicecharge(550.0);
     }
     
		*/
		return p ;
	}

}

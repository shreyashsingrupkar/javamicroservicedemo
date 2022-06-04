package com.claimmicroservice.serviceimpl;

import java.util.Arrays;
import java.util.Optional;

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
	public PensionDetail processPension(long aadharno,PensionerDetails p) {
			
		
		PensionDetail pd=new PensionDetail();
		/*HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <PensionerDetails> entity = new HttpEntity<PensionerDetails>(headers);*/
      
		//PensionerDetails    p= restTemplate.getForObject("http://172.22.192.1:9002/getpensioner/"+aadharno,PensionerDetails.class);
     
     double selfpension=(80/100)*(p.getSalaryearned()+p.getAllowances());
     double familypension=(50/100)*(p.getSalaryearned()+p.getAllowances());
     
     
  //   PensionAmount pa=new PensionAmount();
  //   pa.setFamilypension(familypension);
   //  pa.setSelfpension(selfpension);
    
     pd.setPensionamount(selfpension);
     
     if(p.getBanktype()=="public") {
    	 pd.setBankservicecharge(500.0);
     }else {
    	 pd.setBankservicecharge(550.0);
     }
     
		
		return pd ;
	}

}

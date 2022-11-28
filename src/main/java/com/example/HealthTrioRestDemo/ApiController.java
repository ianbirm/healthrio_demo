package com.example.HealthTrioRestDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import com.example.HealthTrioRestDemo.model.IncentiveResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ApiController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static String url ="https://www.healthit.gov/data/open-api?source=Meaningful-Use-Acceleration-Scorecard.csv";
		
	@GetMapping("/incentives")
	public void getIncentives() throws JsonParseException, JsonMappingException, IOException{
	
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<IncentiveResponse[]> response = restTemplate.exchange(url,HttpMethod.GET,entity, IncentiveResponse[].class);
		int counter = 0;
		List<IncentiveResponse> unsortedListOfIncentives = new ArrayList();
		if(response.getStatusCode()==HttpStatus.OK) {
			System.out.println("List of hospitals that have demonstrated Meaningful Use of CEHRT in the year 2014");
			for(IncentiveResponse incentiveResponse : response.getBody()) { 
				//print out by state and in descending order, 
				//the percentage of eligible and critical access hospitals that have demonstrated Meaningful Use of CEHRT in the year 2014.
				
				if(incentiveResponse.getPeriod() == 2014) {
					counter++;	
					unsortedListOfIncentives.add(incentiveResponse);
				}
			}
			Collections.reverse(unsortedListOfIncentives);
			System.out.println("List of Incentives size:  " + unsortedListOfIncentives.size());
			System.out.println("Contents of List of Incentives Descending Order:  " + unsortedListOfIncentives.toString());
			
		}
	}
}

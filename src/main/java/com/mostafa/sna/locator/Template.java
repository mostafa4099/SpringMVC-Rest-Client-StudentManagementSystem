package com.mostafa.sna.locator;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.mostafa.sna.entity.Student;

public class Template {
    RestTemplate restTemplate = new RestTemplate();
    final String url = "http://localhost:8080/spring-mvc-rest-srm-demo/api/students";

    public String registration(Student student){
    	
    	HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        
        map.add("firstName", student.getFirstName());
        map.add("lastName", student.getLastName());
        map.add("email", student.getEmail());
        
        System.out.println(student.getFirstName());
        
        final HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        
        ResponseEntity<String> responseEntity  =   restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        String response = responseEntity.getBody();
        System.out.println("response:   "+response);
        return response;
    }
}

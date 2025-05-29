package com.Test;


public class ApiConfig {
	
	
	public String callExtApi(String name) {
		
		String url = "https://api.name.?id="+id;
		
		return restTemplate.getForObject(url,String.class);
		
	}
	
}

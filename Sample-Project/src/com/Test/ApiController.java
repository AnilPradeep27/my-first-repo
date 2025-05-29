package com.Test;

@RestController
public class ApiController {
    @Autowired
	public ApiService apiService;
    
    @GetMapping("/getId")
    public String getId(@RequestParam String name) {
    	
    	return 
    }
	
	
	
}

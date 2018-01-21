package com.apta.home;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apta.dto.HealthCheckResponse;

@RestController
@RequestMapping(path="/status")
public class HelathCheckService {

	//@Autowired
	@RequestMapping(method=RequestMethod.GET)
	public HealthCheckResponse doHealthCheck() {
		HealthCheckResponse response = new HealthCheckResponse();
		response.setMessage("Running");
		return response;
	}
}

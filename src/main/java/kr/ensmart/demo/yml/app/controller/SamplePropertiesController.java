package kr.ensmart.demo.yml.app.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ensmart.demo.yml.app.dto.SampleProperties;
import kr.ensmart.demo.yml.app.dto.SamplePropertiesResponse;

@RestController
@RequestMapping("/sampleProperties")
public class SamplePropertiesController {
	@Autowired
	private SampleProperties sampleProperties;
	
	
	@GetMapping("")
	public SamplePropertiesResponse getSampleProperties() {
		SamplePropertiesResponse response = new SamplePropertiesResponse();
		BeanUtils.copyProperties(sampleProperties, response);
		return response;
	}
	
}

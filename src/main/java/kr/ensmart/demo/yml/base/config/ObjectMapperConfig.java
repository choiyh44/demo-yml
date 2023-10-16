package kr.ensmart.demo.yml.base.config;

import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;

//@Configuration
public class ObjectMapperConfig {
	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//		objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		return objectMapper;
	}
}

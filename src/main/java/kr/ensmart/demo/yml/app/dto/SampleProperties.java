package kr.ensmart.demo.yml.app.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix="sample-properties")
public class SampleProperties {
	private String testKeyCommon;
	private String testKeyPerProfile;
}

package com.demo.spring.boot.actuator.authentication;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("FileSystemHealth")
public class FileSystemHealth implements HealthIndicator{

	@Override
	public Health health() {
	    File uploadedFiles = new File("D:\\UploadedFiles");
	    Map<String, String> details = new LinkedHashMap<String, String>();
	    details.put("Upload Directory Exists", String.valueOf(uploadedFiles.exists()));
	    details.put("Writable", String.valueOf(uploadedFiles.canWrite()));
	    details.put("Total", String.valueOf(uploadedFiles.list().length));		
	    return Health.up().withDetails(details).build();
	}

}

package com.exampleClientCloud.clientcloud;

import java.util.stream.Stream;

import com.exampleClientCloud.clientcloud.DAO.CompanyRep;
import com.exampleClientCloud.clientcloud.Entities.Company;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientCloudApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(ClientCloudApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompanyRep compRep)
	{
		return args->
		{
			Stream.of("A","B","C","D").forEach(item->
			{
				compRep.save(new Company(null,item,100+Math.random()*900));
			});
		};
	}
	
}

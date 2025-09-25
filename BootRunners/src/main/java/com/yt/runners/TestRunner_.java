package com.yt.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class TestRunner_ implements ApplicationRunner 
{

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		
		
		System.out.println("Option argument name and values: ");
		for(String name:args.getOptionNames())
		{
			System.out.println("Name: "+args.getOptionValues(name));
		}
	}

}

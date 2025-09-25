package com.yt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner  implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("TestRunner.run()");
		System.out.println("Runner To Test: "+Arrays.toString(args));
		
	}
	

}

package com.luv2code.SpringDemoAnnotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private Random myrandom;
	private List<String> fortuneList;
	private String fileName = "E:\\eclipse_workspace\\SpringDemoAnnotations\\src\\fortunesList.txt";
	
	public RandomFortuneService() throws FileNotFoundException {
		File thefile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + thefile);
		System.out.println("File exists: " + thefile.exists());
				
		try(BufferedReader br = new BufferedReader(new FileReader(thefile))) {
			String tempLine;
			fortuneList.add(tempLine = br.readLine());
			while(!((tempLine = br.readLine()) == null)) {
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Your fortune service should read the fortunes from a file.
		// TODO The fortune service should load the fortunes into an array
		// TODO return a random fortune from the array.
		
		int index = myrandom.nextInt(fortuneList.size());
		
		return "lucky day" + fortuneList.get(index);
	}

}

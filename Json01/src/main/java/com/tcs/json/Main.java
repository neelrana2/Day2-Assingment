package com.tcs.json;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	
	public static void main(String[] args) {
		
		InputStream input = null;
		
		try {
			input = new FileInputStream("ABC.json");
			ObjectMapper mapper = new ObjectMapper();
			User user = mapper.readValue(input, User.class);
			
			System.out.println(user);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
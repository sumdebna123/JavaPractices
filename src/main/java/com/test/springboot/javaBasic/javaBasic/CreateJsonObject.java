package com.test.springboot.javaBasic.javaBasic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

public class CreateJsonObject {
	public static void main(String[] args) throws JsonProcessingException {
		JsonObject obj = createJSONObj();
		
		ObjectMapper objMapper = new ObjectMapper();
		
		String preetyPrint = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(preetyPrint);
		
		
	}
	
	public static  JsonObject createJSONObj() {
		JsonObject jObj = new JsonObject();
		jObj.addProperty("firstName", "Sergey");
		jObj.addProperty("lastName", "Kargopolov");
		return jObj;

	}

}

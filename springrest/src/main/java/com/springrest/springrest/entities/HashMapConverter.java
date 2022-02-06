package com.springrest.springrest.entities;

import java.io.IOException;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HashMapConverter implements AttributeConverter<Abc, String> {
	
	private final ObjectMapper objectMapper = new ObjectMapper();
	
   // @Override
    public String convertToDatabaseColumn(Abc customerInfo) {

        String customerInfoJson = null;
        try {
            customerInfoJson = objectMapper.writeValueAsString(customerInfo);
        } catch (final JsonProcessingException e) {
            //logger.error("JSON writing error", e);
        }

        return customerInfoJson;
    }

    //@Override
    public Abc convertToEntityAttribute(String customerInfoJSON) {

    	System.out.println("1");
       Abc customerInfo = null;
        try {
            customerInfo = objectMapper.readValue(customerInfoJSON, Abc.class);
        } catch (final IOException e) {
        	System.out.println("JSON reading error"+ e);
        }

        return customerInfo;
    }


}



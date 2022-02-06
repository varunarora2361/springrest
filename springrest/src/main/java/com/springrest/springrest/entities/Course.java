package com.springrest.springrest.entities;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@Table(name="Course")
public class Course {
	@Id @GeneratedValue
	@Column(name = "id")
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	
	@Column(name = "customerAttributes")
	@Convert(converter = HashMapConverter.class)
    private Abc customerAttributes;
	String customerAttributeJSON;
//	@Column(name = "answers")
//    @Convert(converter = JSONArrayConverter.class)
//    private JSONArray answers;
//	String customerrAttributeJSON;
	
	public Course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
public Abc getCustomerAttributes() {
		return customerAttributes;
	}
	public void setCustomerAttributes(Abc customerAttributes) {
		this.customerAttributes = customerAttributes;
	}
	//	public Abc getCustomerAttributes() {
//		return customerAttributes;
//	}
//	public void setCustomerAttributes(Abc customerAttributes) {
//		this.customerAttributes = customerAttributes;
//	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", customerAttributes="
				+ customerAttributes + "]";
	}
	
	 private static final ObjectMapper objectMapper = new ObjectMapper();

	 public void serializeCustomerAttributes() throws JsonProcessingException {
		 this.customerAttributeJSON = objectMapper.writeValueAsString(customerAttributes);
	 }
	 
	 public void deserializeCustomerAttributes() throws IOException {
		 this.customerAttributes = (Abc) objectMapper.readValue(customerAttributeJSON,Abc.class);
	 }
	
//	 private static final ObjectMapper objectmapper = new ObjectMapper();
//	 public void serializeeCustomerAttributes() throws JsonProcessingException {
//		 this.customerrAttributeJSON = objectmapper.writeValueAsString(answers);
//	 }
//	 
//	 public void deserializeeCustomerAttributes() throws IOException {
//		 this.answers = objectmapper.readValue(customerrAttributeJSON,JSONArray.class);
//	 }


}

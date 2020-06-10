package com.qa.test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class Examples {

	//@Test
	public void test_Get(){
		baseURI="http://localhost:3000/";
		given().
		param("name", "Automation").
		get("/subjects").
		then().
		statusCode(200).
		log().all();
	}
	
	//@Test
	public void test_Post(){
		JSONObject request=new JSONObject();
		request.put("firstName","Tommy");
		request.put("lastName","Babu");
		request.put("subjectId", 1);
		baseURI="http://localhost:3000";
		given().
		contentType(ContentType.JSON).accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).when().
		post("/users").
		then().
		statusCode(201).
		log().all();
	}
	//@Test
	public void test_Patch(){
		JSONObject request=new JSONObject();
		
		request.put("lastName","Mera Babu");
		
		baseURI="http://localhost:3000";
		given().
		contentType(ContentType.JSON).accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).when().
		patch("/users/4").
		then().
		statusCode(200).
		log().all();
	}
	//@Test
	public void test_Put(){
		JSONObject request=new JSONObject();
		request.put("firstName","Ticky");
		request.put("lastName","Babu");
		request.put("subjectId", 1);
		baseURI="http://localhost:3000";
		given().
		contentType(ContentType.JSON).accept(ContentType.JSON).
		header("Content-Type","application/json").
		body(request.toJSONString()).when().
		put("/users/4").
		then().
		statusCode(200).
		log().all();
	}
	@Test
	public void test_Delete(){
		baseURI="http://localhost:3000";
		when().
		delete("/users/1").
		then().
		statusCode(200);
	}
}

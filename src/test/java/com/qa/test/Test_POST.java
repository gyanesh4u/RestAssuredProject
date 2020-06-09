package com.qa.test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test_POST {

	//@Test
	public void test_1_post(){
//		Map<String,Object> map=new HashMap<String,Object>();
//		map.put("name","Gyanesh");
//		map.put("job","Qa Engg.");
//		System.out.println(map);
		JSONObject req=new JSONObject();
		req.put("name","Gyanesh");
		req.put("job","Qa Engg.");
		System.out.println(req);
		given().
		header("content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(req.toJSONString()).
		when().post("https://reqres.in/api/users").
		then().
		statusCode(201);
	
		}
	//@Test
		public void test_1_put(){
			JSONObject req=new JSONObject();
			req.put("name","Gyanesh");
			req.put("job","Qa Engg.");
			System.out.println(req);
			given().
			header("content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(req.toJSONString()).
			when().patch("https://reqres.in/api/users/2").
			then().
			statusCode(200).log().all();
		
			}
	//@Test
	public void test_1_patch(){
		JSONObject req=new JSONObject();
		req.put("name","Gyanesh");
		req.put("job","Qa Engg.");
		System.out.println(req);
		given().
		header("content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(req.toJSONString()).
		when().put("https://reqres.in/api/users/2").
		then().
		statusCode(200).log().all();
	
		}
	@Test
	public void test_1_delete(){
		
		when().delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).log().all();
	
		}
}

package api.endPoints;

import static io.restassured.RestAssured.*;

import java.util.ResourceBundle;

import api.payLoad.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class UserEndPoints2 {
	
	//created for getting urls from property file
	static ResourceBundle getURL(){
		ResourceBundle routes = ResourceBundle.getBundle("routes");
		return routes;
	}

	
public static Response createUser(User payLoad) {
		String postURL = getURL().getString("post_url");
		Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payLoad)
			
		.when()
			.post(postURL);
		
		return response;
	}

	
	public static Response readUser(String userName) {
		
		String getURL = getURL().getString("get_url");
		Response response = given()
							.pathParam("username", userName)
							
		.when()
			.get(getURL);
		
		return response;
	}
	
	public static Response updateUser(String userName, User payLoad) {
		String updateURL = getURL().getString("put_url");
		Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
			.body(payLoad)
		
		.when()
			.put(updateURL);
		
		return response;
	}
	
public static Response deleteUser(String userName) {
		String deleteURL = getURL().getString("delete_url");
		Response response = given()
							.pathParam("username", userName)
							
		.when()
			.delete(deleteURL);
		
		return response;
	}
}

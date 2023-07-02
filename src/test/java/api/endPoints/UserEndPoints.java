package api.endPoints;
import static io.restassured.RestAssured.given;

import api.payLoad.User;
import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//create this class for CRUD operations
//CRUD stands for create, retrieve, update and delete

public class UserEndPoints {
	
	public static Response createUser(User payLoad) {
		
		Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payLoad)
		.when()
			.post(Routes.postURL);
		
		return response;
	}

	
	public static Response readUser(String userName) {
		
		Response response = given()
							.pathParam("username", userName)
		.when()
			.get(Routes.getURL);
		
		return response;
	}
	
	public static Response updateUser(String userName, User payLoad) {
		
		Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
			.body(payLoad)
		.when()
			.put(Routes.updateURL);
		
		return response;
	}
	
public static Response deleteUser(String userName) {
		
		Response response = given()
							.pathParam("username", userName)
		.when()
			.delete(Routes.deleteURL);
		
		return response;
	}
}

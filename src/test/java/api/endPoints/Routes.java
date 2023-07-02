package api.endPoints;

//Swagger URI : https://petstore.swagger.io/
//Create user - POST - https://petstore.swagger.io/v2/user
//Get user - GET - https://petstore.swagger.io/v2/{username}
//Update user - PUT - https://petstore.swagger.io/v2/{username}
//Delete user - DELETE - https://petstore.swagger.io/v2/{username}


public class Routes {
	
	//user module
	public static String baseURL= "https://petstore.swagger.io/v2";
	
	public static String postURL = baseURL+"/user";
	public static String getURL = baseURL+"/user/{username}";
	public static String updateURL = baseURL+"/user/{username}";
	public static String deleteURL = baseURL+"/user/{username}";

}

package restAssuredService;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {
	@Test
	public void GetWeatherDetails()
	{   
		// Specify the base URL to the RESTful web service
		// RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RestAssured.baseURI = "http://savemyloc.herokuapp.com";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
	//	Response response = httpRequest.request(Method.GET, "/Hyderabad");
		//Response response = httpRequest.get("/Hyderabad");
		//Response response = httpRequest.get();
		Response response = RestAssured.given().header("Content-Type", "application/x-www-form-urlencoded").formParam("user", "uName").formParam("lat", "33.42194352").formParam("lng", "33.42194352").formParam("time", "232323").request(Method.POST);
		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/);

		

	}

}

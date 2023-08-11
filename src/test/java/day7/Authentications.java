package day7;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Authentications {
	
	@Test(priority=1)
	void testBasicAuthentication() {
		given()
			.auth().basic("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();
	}
	
	@Test(priority=2)
	void testDigestAuthentication() {
		given()
			.auth().digest("postman", "password")
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();
	}
	
	@Test
	void testBearertoken() {
		String BToken ="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";
		given()
			.headers("Authorization", "Bearer "+BToken)
	    .when()
		    .get("https://api.github.com/user/repos")
	     .then()
		    .statusCode(200)
		    .log().all();
	}
	
	@Test
	void testAPIKeyAuthentication() {
		
		given()
			.queryParam("ap","f0cc7b9ca703be325f26dfa481b7bde2")
			
	    .when()
		    .get("https://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&units=metric&cnt=7")
	     .then()
		    //.statusCode(200)
		    .log().all();
	}

	
	
}

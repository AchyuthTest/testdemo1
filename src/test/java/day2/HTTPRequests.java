package day2;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class HTTPRequests {
	
	@Test(priority=1)
	void getUser2() {
		given()
		.when()
		 .get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.log().all()
			.body("page",equalTo(2));
	}
	
	@Test
	void getUser3() {
		given()
		.when()
		 .get("https://reqres.in/api/users?page=3")
		.then()
			.statusCode(200)
			.log().all()
			.body("page",equalTo(3));
	}
}

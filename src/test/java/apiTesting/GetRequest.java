package apiTesting;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetRequest {
	
	@Test
	public void getCall() {
		
		given().
		
		when().
		get("https://reqres.in/api/users.json").
		
		then().
		assertThat().
		statusCode(200).
		and().
		header("server", "cloudflare").
		and().
		body("total", equalTo(12));
		
	}
	
	
	

}

package GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class nonbddstyle {
    public static void main(String[] args) {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/560037");
        Response res = r.when().get();

        // 3. Validate + log response
        res.then().log().all().statusCode(200);
    }
}

package GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class non_bdd_style {
    static RequestSpecification r = RestAssured.given();

    public static void main(String[] args) {
        r.baseUri("https://api.zippopotam.us");
        test_1();
        test_2();
    }
    private static void test_1(){
        r.basePath("/IN/560037");

        Response res = r.when().get();
        res.then().log().all().statusCode(200);
    }
    private static void test_2() {
        r.basePath("/IN/841436");
        Response res = r.when().get();

        res.then().log().all().statusCode(404);
    }
}



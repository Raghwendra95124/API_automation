package GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class non_bddstyle1 {
    static RequestSpecification r = RestAssured.given();

    public static void main(String[] args) {
        r.baseUri("");
        test12();
        test13();
    }
    private static void test12(){
        r.basePath("");
        Response res = r.when().get();
        res.then().log().all().statusCode(200);

    }
    private static  void test13(){
        r.basePath("");
                Response res = r.get();
                res.then().log().all().statusCode(200);
    }
}

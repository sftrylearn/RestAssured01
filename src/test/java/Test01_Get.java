import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01_Get {

    @Test
    void test01(){
        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println(response.getBody().asString());
        System.out.println("Status Code : "+response.getStatusCode());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    void test02(){
        given().
                get("https://reqres.in/api/users?page=2").
        then().
                statusCode(200).
                log().all();

    }

    @Test
    void test03() {
        given().
                get("https://reqres.in/api/users?page=2").
        then().
                body("data.id[1]",equalTo(8));
    }
}


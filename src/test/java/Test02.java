

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;

public class Test02 {

    //@Test
    public void test_get(){
        baseURI = "http://localhost:3000/";
        given().
            get("/users").
        then().
            statusCode(200).log().all();
    }

    //@Test
    public void test_POST(){
        JSONObject request = new JSONObject();

        request.put("firstName","Ffive");
        request.put("lastName","Lfive");
        request.put("subjectId",3);


        baseURI = "http://localhost:3000/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").body(request.toJSONString()).
        when().
                post("/users").
        then().
                statusCode(201).
                log().all();
    }

    //@Test
    public void test_PUT(){
        JSONObject request = new JSONObject();

        request.put("firstName","Ffive");
        request.put("lastName","Lfive");
        request.put("subjectId",3);


        baseURI = "http://localhost:3000/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").body(request.toJSONString()).
                when().
                put("/users/5").
                then().
                statusCode(200).
                log().all();
    }

    //@Test
    public void test_PATCH(){
        JSONObject request = new JSONObject();

        request.put("firstName","Fthree");
        request.put("lastName","Lthree");



        baseURI = "http://localhost:3000/";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").body(request.toJSONString()).
                when().
                patch("/users/3").
                then().
                statusCode(200).
                log().all();
    }

    //@Test
    public void test_DELETE(){
        baseURI = "http://localhost:3000/";

        when().
                delete("/users/5").
        then().
                statusCode(200).
                log().all();
    }
}

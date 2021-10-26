
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;


public class dataDrivenTest extends dataForDriven {


        //@Test(dataProvider = "DataMultipleInput")
        public void test_POST (String firstName, String lastName, Integer subjectId){

            JSONObject request = new JSONObject();

            request.put("firstName", firstName);
            request.put("lastName", lastName);
            request.put("subjectId", subjectId);


            baseURI = "http://localhost:3000/";

            given().
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    header("Content-Type", "application/json").body(request.toJSONString()).
            when().
                    post("/users").
            then().
                    statusCode(201).
                    log().all();
        }

    @Test(dataProvider = "DataToDelete")
    public void test_delete(int userId){
        baseURI = "http://localhost:3000";

        when().
                delete("/users/"+userId).
        then().
                statusCode(200);

    }
    }
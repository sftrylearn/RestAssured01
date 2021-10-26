import org.testng.annotations.*;

import static io.restassured.RestAssured.*;

public class dataDrivenDelete {



    @Test(dataProvider = "DataToDelete")
    public void test_delete(int userId){
        baseURI = "http://localhost:3000";

        when().
                delete("/users/"+userId).
        then().
                statusCode(200);

    }
}

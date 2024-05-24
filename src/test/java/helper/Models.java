package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class Models {

    public static RequestSpecification request;


    public static void setUpHeader(){
        request = RestAssured.given()
                .header("key", "f83c1f3927080bc3f5a5482c4af0f421")
                .header("Content-Type", "application/json");
    }
    public static Response getProvince(String endpoint){
        setUpHeader();
        return request.when().get(endpoint);
    }

    public static Response getCity(String endpoint){
        setUpHeader();
        return request.when().get(endpoint);
    }

    public static Response postCost(String endpoint){
        String origin ="5";
        String destination = "55";
        String weight = "5000";
        String courier = "jne";
        JSONObject payload = new JSONObject();
        payload.put("origin", origin);
        payload.put("destination", destination);
        payload.put("weight", weight);
        payload.put("courier", courier);

        setUpHeader();
        return request.when().body(payload.toString()).post(endpoint);

    }
}

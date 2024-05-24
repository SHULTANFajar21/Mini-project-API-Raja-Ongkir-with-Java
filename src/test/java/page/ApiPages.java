package page;

import helper.EndPoint;
import helper.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPages {

    String set_URL;
    Response res;

    public void prepareUrlFor(String url){
        switch (url){
            case "PROVINCE":
                set_URL = EndPoint.PROVINCE;
                break;
            case "CITY":
                set_URL = EndPoint.CITY;
                break;
            case "COST":
                set_URL = EndPoint.COST;
                break;
            default:
                System.out.println("input right url");
        }
    }

    public void hitApiProvince(){
        res = getProvince(set_URL);
    }

    public void validationStatusCodeIsEquals(int status_code){
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetListProvince(){

        JsonPath jsonPath = res.jsonPath();
        String description = jsonPath.get("rajaongkir.status.description");
        List<Object> result = jsonPath.getList("rajaongkir.results");

        assertThat(description).isEqualTo("OK");
        assertThat(result).isNotNull();
    }

    public void validationResponseJsonWithJsonSchema(String filename){
        File JSONFile = Utility.getJsonFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void hitApiCity(){
        res = getCity(set_URL);
    }

    public void validationResponseBodyGetListCity(){

        JsonPath jsonPath = res.jsonPath();
        String description = jsonPath.get("rajaongkir.status.description");
        List<Object> result = jsonPath.getList("rajaongkir.results");

        assertThat(description).isEqualTo("OK");
        assertThat(result).isNotNull();
    }

    public void hitApiCost(){
        res = postCost(set_URL);
        System.out.println(res.getBody().asString());
    }

    public void validationResponseBodyPostCost(){
        JsonPath jsonPath = res.jsonPath();
        String description = jsonPath.get("rajaongkir.status.description");
        List<Object> result = jsonPath.getList("rajaongkir.results");

        assertThat(description).isEqualTo("OK");
        assertThat(result).isNotNull();
    }
}

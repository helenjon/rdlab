package Lesson11;


import io.restassured.RestAssured;
import io.restassured.response.Response;


import org.json.JSONObject;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

import io.restassured.module.jsv.JsonSchemaValidator;
import jdk.nashorn.internal.parser.JSONParser;

public class apitesting {



        //http://restcountries.eu/



        @Test //(enabled = false)
        public void checkResponceKeyAvailableWrongParamOrder(){

           JSONParser parser = new JSONParser();

           RestAssured.baseURI = "https://developers.ria.com/auto/new/marks?api_key=xmu8sNMjwhO29eIrRpTQMOG5KbFg6domccVFwzIZ&category_id=2" ;//"https://developers.ria.com/auto/info?api_key=xmu8sNMjwhO29eIrRpTQMOG5KbFg6domccVFwzIZ&auto_id=19050985";
            System.out.println(RestAssured.sessionId);

//                given().get(baseURI)
//                    .then().assertThat().statusCode(200);
//
//              given().get(baseURI).then().assertThat()
//                   .body(matchesJsonSchemaInClasspath("event_0.json"));
          String test = given().get(baseURI).getBody().asString();
            String test1 =   test.substring(1, test.length()-1);
           System.out.println("123232!! " + test.substring(1, test.length()-1));
            RestAssured.baseURI = ("https://developers.ria.com/auto/");

            given()
                    .param("category_id", "2")
                    .param("api_key","xmu8sNMjwhO29eIrRpTQMOG5KbFg6domccVFwzIZ")
                    .when()
                    .get("new/marks")
                    .then()
                    .body("name", hasItem("Acxa"));
           //         .body("marka_id", hasItem("2282"));

       //       given().baseUri("https://developers.ria.com/auto/models").pathParam("marka_id", "")

//            given().
//                    get(baseURI).
//                    then().
//                    assertThat().
//                    body("name",hasSize(numberOfRaces));


            //            given().
//                    when().
//                    get(baseURI).
//                    then().
//                    assertThat().
//                    statusCode(200).
//                    and().
//                    contentType(ContentType.JSON);

        }





}




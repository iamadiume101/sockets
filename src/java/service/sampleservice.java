/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.io.StringReader;
import static javafx.scene.input.KeyCode.J;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author c0641055
 */
@Path("/sample")
public class sampleservice {
    @GET
    @Produces("application/json")
    public String get(){
        JsonObject json = Json.createObjectBuilder()
                .add("name", "ama harper")
                .add ("id", 041055)
                .build();
       return json.toString(); 
    }
    
    @POST
    @Consumes("application/json")
    public void post (String str){
        JsonObject json = Json.createReader(new StringReader (str)).readObject();
        System.out.println(json.getString("name") + ": " + json.getInt("id"));
    }
        
//        while (json.hasNext()){
//            switch (json.next()){
//            case KEY_NAME:
//            System.out.println(json.getString());
//            break;
//            case VALUE_STRING:
//            System.out.println("=" + json.getString());
//            break;
//            
//        }
//        }
//    }
    
}

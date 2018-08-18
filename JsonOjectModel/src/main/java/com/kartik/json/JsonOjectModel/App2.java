package com.kartik.json.JsonOjectModel;
import javax.json.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class App2 {
	private String jsonFileArray = Utils.ROOT + System.getProperty("file.separator") + "jsondata-array.json";
    private String jsonFileObject = Utils.ROOT + System.getProperty("file.separator") + "jsondata-object.json";

    /**
     * Builds a JsonObject from a flat-file source containing Json data.
     *
     * @return a JsonObject built from the flat-file
     * @throws FileNotFoundException
     */
    public JsonObject loadJsonObject() throws FileNotFoundException {

        JsonReader reader = Json.createReader(new FileReader(jsonFileObject));
        JsonObject jsonObject = reader.readObject();

        return jsonObject;

    }

    /**
     * Builds a JsonStructute from a flat-file source containing Json Array data.
     *
     * @return a JsonStructure built from the flat-file
     * @throws FileNotFoundException
     */
    public JsonStructure loadJsonStructure() throws FileNotFoundException {

        JsonReader reader = Json.createReader(new FileReader(jsonFileArray));
        JsonStructure jsonStructure = reader.read();

        return jsonStructure;
    }
}

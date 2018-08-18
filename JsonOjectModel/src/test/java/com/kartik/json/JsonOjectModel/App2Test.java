package com.kartik.json.JsonOjectModel;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import javax.json.*;

public class App2Test {
	@Test
    public void givenJsonDateInFlatFile_readsDataIntoJsonObject() throws Exception {

        // Arrange
        App2 objectExample2 = new App2();

        // Act
        JsonObject jsonObject = objectExample2.loadJsonObject();

        // Assert
        assertThat(jsonObject.getValueType()).isEqualTo(JsonValue.ValueType.OBJECT);
    }
  @Test
    public void givenJsonArrayDataInFlatFile_readsDataIntoJsonStructure() throws Exception {

        // Arrange
        App2 objectExample2 = new App2();

        // Act
        JsonStructure jsonStructure = objectExample2.loadJsonStructure();

        // Assert
        assertThat(jsonStructure.getValueType()).isEqualTo(JsonValue.ValueType.ARRAY);
    }
}

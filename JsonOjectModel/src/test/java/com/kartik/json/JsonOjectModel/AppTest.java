package com.kartik.json.JsonOjectModel;

import javax.json.JsonObject;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	  @Test
	    public void givenJsonDataInString_readsDataIntoJsonObject() throws Exception {

	        // Arrange
	        App objectExample1 = new App();

	        // Act
	        JsonObject jsonObject = objectExample1.loadJsonString();

	        // Assert
	        assertThat(jsonObject.getString("title")).isEqualTo("JSON-Processing With Java EE");
	        assertThat(jsonObject.getJsonArray("chapters").size()).isEqualTo(6);
	        assertThat(jsonObject.getBoolean("released")).isTrue();
	        assertThat(jsonObject.getInt("length")).isEqualTo(90);
	        assertThat(jsonObject.getJsonObject("sourceCode").getString("repositoryName")).isEqualTo("JSON-Processing-with-Java-EE");
	        assertThat(jsonObject.getJsonObject("sourceCode").getString("url")).isEqualTo("github.com/readlearncode");
	        assertThat(jsonObject.getJsonArray("complementaryCourse").getJsonObject(0).getString("title")).isEqualTo("RESTful Service with JAX-RS 2.0");
	        assertThat(jsonObject.getJsonArray("complementaryCourse").getJsonObject(1).getInt("length")).isEqualTo(130);
	        assertThat(jsonObject.isNull("notes")).isTrue();

	    }
}

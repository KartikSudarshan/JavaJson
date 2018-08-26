# JAVA EE JSON Object Model
Created Saturday 16 June 2018

### Introduction to the Object Model
JSON P Model is a memory based model which loads the entire JSON Document in Memory
As it is loaded it is parsed into a JSON Object structure with JSON Value class at the top

JsonBuilder
JsonReader
JsonWriter

JSONObject -> JSON  object 	( Map )
JsonArray -> JSON Array		( List )
JsonValue -> String & Number

The JSON type are immutable i.e. you cannot call any method that might that may cause any change to the internal state of the JSON model else it will give
UnsupportedOperationException

**Self Describing Value Types:**
ARRAY, OBJECT, STRING, NUMBER TRUE, FALSE, NULL

### Create a Model from code
Static builder methods in javax.json.Json
Two types - JsonObjectBuilder and JsonArrayBuilder
Add properties and values to builder
Nested Values using Builder instances

| JSON                                                                    | Java Code                                                                                                              |
|:------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------|
| {<br>	"name":"Alex",<br>	"likes":[<br>		"Pizza",<br>		"Beer"<br>	]<br>} | Json.createObjectBuilder().add("name","Alex").add("Likes", JsonCreateArrayBuilder().add("Pizza").add("Beer")).build(); |


### Traverse the model
All Types extend form JsonValue

2 ways to traverse a JSON  model

* Selection is based on ValueType
* Selection is based on polymorphic type


#### Selection is based on ValueType
ValueType enum values are ARRAY, OBJECT, STRING, NUMBER TRUE, FALSE, NULL

String can be accessed directly
Object and arrayType must be iterated


#### Output the Model to a Data Stream
javax.json.JsonWriter
Output to either writer or OutputStream


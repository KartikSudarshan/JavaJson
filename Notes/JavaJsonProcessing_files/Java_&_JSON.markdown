# Java & JSON
Created Saturday 16 June 2018

| JSON                                                                                                                                                                                                                                                                                                                                                                             | Java Code                                                                                                                                                   |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------|
| {<br>"title":"JSON Processing with Java EE",<br>"chapters":[<br>	"Introduction",<br>	"1. JSON and Java",<br>	"2. JSON processing API Features",<br>	"3. The JAVA EE JSON object Model",<br>	"4. The Java EE JSON Streaming Model",<br>	"Conclusion"<br>	],<br>"sourceCode":{<br>	"repositoryName":"JSON-Proessing-with-Java-EE",<br>	"url":"githib.com/readlearncode"<br>	}<br>} | class Course{<br>	String title;<br>	List Chapter;<br>	SourceCode sourceCode;<br>}<br><br>class SourceCode {<br>	String repositoryName;<br>	String url;<br>} |



JSON -> JavaScript -> Java

### JSON & Java in harmony

1 most common usage of Java in JSON is the interchange of data between client and restful API
A RESTful API implements the REST architectural pattern (**Re**presentional **S**tate **T**ransfer)
Serialization of a **P**lain **O**ld **J**ava **O**bject (POJO) to a JSON
use of JSON predominate


Connected to the rest paradime is the use of **J**SON **W**eb **T**okens (JWT) to implement security concersns
JWT is an opensource specifcation that can be used accross REST-compliant systems and is not just restricted to use in Java applications
but any application that undersands JSON
A JSON Web Token us used to create access token to assert the claim usually in relation to authorization, but often used to pass the identity of the authenticated users between systems (see jwt.io)
Next Gen Dbs are known as NoSQL / document stores. They store data in unnormalized manner in documents structured as JSON strings with different shapes

### Have  a look at:
hadoop.apache.org
cassandra.apache.org
monetdb.org
couchdb.apache.org



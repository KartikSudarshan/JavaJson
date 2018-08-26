# JSON-P API
Created Saturday 16 June 2018

Introduction
------------

**JSR 353:** JSON API for JSON Processing is a low level light weight JSON passer ad generator which provides for the manipulation of JSON data at the property value level
All specifications for the JAVA EE API are hosted on the JAVA community Process site jcp.org

JSON Data can be processed with 2 models

* Object Model
* Streaming Model


**Reference implementation of JSON-P**: jsonp.java.net

A feature that the specification does not specify is that an implementation should support JSON binding
JSON binding is the mapping of JSON data to a POJO and is specified in the JSR designed for this purpose


JSR 367: JSON binding contains necessary API to bind JSON directly to classes.
**Reference implementation of JSON-B: **json-b.net

Both models can geneate JSON data and output it to  a stream such as FLAT filefor offline processing and storage
Both Models can read data efficiently, but streaming model is more efficient for processing high Volumes of JSON data
Allows importing data from external sources (different from JSON with padding)

Highlights
----------

### Features

* Generating, Parsing, quering and transforming JSON data
* **2 models used**: Object Model and Streaming Model
* API consists of 3 packages: javax.json, javax.json.streaming, javax.json.spi


The object model represents the elements that for the JSON data structure as objects
JSON array -> javax.json.JsonArray -> java.util.List
JSON object -> javax.json.JsonObject -> java.util.Map

JSON factories -> javax.json.Json.class
JSON builder -> to  read and write JSON

Streaming Model -> javax.json.streaming
It has at the heart 2 factories : parser and generator
Writing JSON Data: Generator -> javax.json.stream.JsonGenerator
Read JSON data: Parse -> javax.json.stream.JsonParser (Most efficient Model)



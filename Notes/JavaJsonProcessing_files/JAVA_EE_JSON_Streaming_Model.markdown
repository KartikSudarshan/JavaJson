# JAVA EE JSON Streaming Model
Created Saturday 30 June 2018

The streaming model allows to read json data from a file 1 element at a time and fires events
start/end of an object
start/end of an array
a key name
String number boolean and Null
Very useful for large JSON data

API consists of 2 principle inerfaces json. (javax.json.stream)
**JsonParser**: Provides only read-only Access to json data and parses it, traverses in forward direction only
**JsonGenerator**: Provides a collection of methods that write JSON to a stream written as a JSON array and number value pairs in JSON objects



# Demo using `Optional` in Spring response DTO and domain classes

It is accompanying a blog post at 

## Running

```$xslt
mvn clean install
mvn spring-boot:run
```


## Usage
```$xslt
curl -X POST -H 'Content-Type:application/json' -d '{"name": "marcin"}' http://localhost:8080/users
curl -H 'content-type:application/json' http://localhost:8080/users

[{"name":"marcin","secondName":null}]

curl -X POST -H 'Content-Type:application/json' -d '{"name": "John", "secondName": "Jacob"}' http://localhost:8080/users
curl -H 'content-type:application/json' http://localhost:8080/users

[{"name":"marcin","secondName":null},{"name":"John","secondName":"Jacob"}]

```
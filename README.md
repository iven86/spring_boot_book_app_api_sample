# Spring Boot Book APP

## Spring Boot Starter Parent
```
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.4.3</version>
		<relativePath />
	</parent>
```
## Java version
- jdk11

## Dependencies
```
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
			<version>4.5.5</version>
		</dependency>
		
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
	</dependencies>

```

## API Requests
### GET Request
```
curl --location --request GET 'http://localhost:8080/api/book'
```
![GET Request](./imgs/get.png)


### POST Request
```
curl --location --request POST 'http://localhost:8080/api/book' \
--header 'Content-Type: application/json' \
--data-raw '{
"bookName": "ggg",
"bookCategory": "ggg",
"bookPrice": "20",
"bookDetials": {
            "isbn": "22445588",
            "description": "The ggg"
        }
}'
```
![POST Request](./imgs/post.png)

### DELETE Request
```
curl --location --request DELETE 'http://localhost:8080/api/book/1' \
--data-raw ''
```
![POST Request](./imgs/delete.png)
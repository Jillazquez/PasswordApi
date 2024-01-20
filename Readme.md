# Password Check API


> [!NOTE]
> This API is built using Spring Boot with Java and Maven. It provides a service to check if a given password exists in a database.

## Functionality

The API receives a password as input and checks against a large database of passwords. If the password exists in the database, it returns a response accordingly.

Please note that due to size constraints, the password database file is not included in this repository.

## How to Use

1. **Send a Request:**
   To use this API, send a POST request with the password you want to check in the request body.

   ```bash
   curl -X POST http://localhost:8080/api/check-password -H "Content-Type: application/json" -d '{"password": "your-password"}'
   ```

2. **Recive a Response**
    The API will return a response indicating whether the password exists in the database.
    ```json
    {
    "message": "Password exists in the database."
    }
   ```

## Dependencies

- [Java](https://www.java.com/en/download/)
- [Maven](https://maven.apache.org/download.cgi)
- [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)

Please ensure you have these installed before running the API.

## Running the API

To run the API, use the following command in your terminal:

```bash
mvn spring-boot:run
```
This will start the server, and you can begin sending requests to the API.

> [!IMPORTANT]
> Before running the API, make sure to configure the database connection details in the `application.properties` file.

## Contributing

Contributions are welcome! Please read the [contributing guidelines](CONTRIBUTING.md) before making any changes.

## License

This project is licensed under the terms of the [MIT license](LICENSE).

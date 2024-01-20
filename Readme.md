# Password Check API

> .[!NOTE].
> This API is built using Spring Boot with Java and Maven. It provides a service to check if a given password exists in a database.

## Functionality
The API receives a password as input and checks against a large database of passwords. If the password exists in the database, it returns a response accordingly.

Please note that due to size constraints, the password database file is not included in this repository.

## How to Use
1. **Send a request:** To use this API, send a POST request with the password you want to check in the request body.
2. **Receive a response:** The API will return a response indicating whether the password exists in the database.

## Dependencies
- Java
- Maven
- Spring Boot

Please ensure you have these installed before running the API.

## Running the API
To run the API, use the following command in your terminal:

```bash
mvn spring-boot:run
```

This will start the server, and you can begin sending requests to the API.

## Contributing
Contributions are welcome! Please read the contributing guidelines before making any changes.

## License
This project is licensed under the terms of the MIT license.

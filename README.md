# Web API Boilerplate

This is a boilerplate for building a web API using Clojure. It provides a foundation for creating RESTful APIs with clean architecture and efficient handling of HTTP requests.

## Dependencies

- **org.clojure/clojure "1.10.3"**: The core Clojure library.
- **compojure "1.6.1"**: A concise routing library for Ring/Clojure.
- **http-kit "2.3.0"**: An efficient, low-latency HTTP server/client library for Clojure.
- **com.stuartsierra/dependency "1.0.0"** and **com.stuartsierra/component "1.1.0"**: Libraries for managing dependencies and building component-based systems, respectively.
- **ring/ring-defaults "0.3.2"**: Ring middleware defaults for common settings.
- **prismatic/schema "1.4.1"**: A library for defining data schemas and validating data.
- **clj-http "3.12.3"**: A simple HTTP client for Clojure.

## Features

- **Routing with Compojure**: Define routes using Compojure's concise syntax.
- **Component-Based Architecture**: Organize your application into modular components for better maintainability and testability.
- **Schema Validation**: Use Prismatic Schema to define data schemas and validate incoming requests and outgoing responses.
- **HTTP Server**: Run your API using the efficient HTTP server provided by http-kit.
- **Middleware**: Leverage Ring middleware for handling common tasks such as JSON parsing, exception handling, and CORS.
- **HTTP Client**: Interact with external APIs using the clj-http library.

## Getting Started

1. Clone this repository to your local machine:

   ```
   git clone git@github.com:mguardarini/boilerplate-clojure-service.git
   ```
2. Run the tests
   ```
   lein test
   ```
3. Install Leiningen if you haven't already:

   ```
   # For macOS/Linux
   brew install leiningen
   
   # For Windows
   scoop install leiningen
   ```

4. Navigate to the project directory:

   ```
   cd boilerplate-clojure-service
   ```

5. Start the development server:

   ```
   lein run
   ```

6. Access your API at `http://localhost:3004`.

## Project Structure

```
your-api/
├── src/
│   └── your_api/
│       ├── controllers/     ; Contains functions to handle incoming requests
│       ├── adapters/        ; Contains functions to adapt and process request data
│       ├── logic/           ; Contains functions defining the business logic and API routes
├── test/
│   ├── integration/
│   │   └── integration_test.clj; Integration tests
│   ├── unit/
│   │   └── unit_test.clj   ; Unit tests
├── resources/
│   └── config.edn           ; Configuration file
├── project.clj              ; Leiningen project file
└── README.md                ; Project documentation
```

## License

This project is licensed under the [MIT License](LICENSE).

## Contributions

Contributions are welcome! Feel free to open issues or submit pull requests to improve this boilerplate.

---

Happy coding! 🚀
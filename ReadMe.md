# Wishlist Management Backend

## Setup Instructions

1. Clone the repository.
2. Make sure you have JDK 8+ and Maven installed.
3. Configure the database connection in `src/main/resources/application.properties`.
4. Run `mvn spring-boot:run` to start the application.

## Running Unit Tests

1. Run `mvn test` to execute all unit tests.
2. Test reports can be found in the `target/surefire-reports` directory.

## API Endpoints

- `GET /api/wishlists`: Retrieve user's wishlist.
- `POST /api/wishlists`: Create a new wishlist item.
- `DELETE /api/wishlists/{id}`: Remove a wishlist item by ID.

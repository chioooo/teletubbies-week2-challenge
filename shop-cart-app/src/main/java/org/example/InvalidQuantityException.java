package org.example;

/**
 * Thrown when a {@link Cart} is asked to add a non-positive quantity of a
 * {@link Product}.
 *
 * TODO: agrega constructor(es) con un mensaje útil.
 */
public class InvalidQuantityException extends RuntimeException {

    // TODO: implementar

    public InvalidQuantityException(String message) {
        super(message);
    }
}

package org.example;

/**
 * Thrown when a {@link Cart} is asked to add more units of a {@link Product} than
 * are currently available in stock.
 *
 * TODO: agrega constructor(es) con un mensaje útil (qué producto, cuántos se pidieron,
 * cuántos hay disponibles).
 */
public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(String product, int requested, int available) {
        super("Stock insuficiente para el producto '" + product + ".Se solicitaron " + requested + "unidades, pero solo hay " + available+ " disponibles.");
    }



    // TODO: implementar
}

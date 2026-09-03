package org.example;

/**
 * Holds products and their quantities. Adding the same product twice must increase
 * its quantity — not create a second, separate entry.
 *
 * TODO: elige el almacenamiento interno (pista: un Map con Product como llave — esto solo
 * funciona si Product.equals/hashCode están implementados correctamente por SKU. Con
 * containsKey/get/put alcanza, no hace falta nada más avanzado del Map).
 *
 * TODO: addProduct(Product product, int quantity)
 *   - lanza InvalidQuantityException si quantity <= 0
 *   - lanza InsufficientStockException si quantity supera el stock disponible
 *     (considerando todo lo que ya haya en el carrito de ese producto)
 *
 * TODO: total() -> double
 *   - suma, por cada línea de producto: (precio unitario * cantidad) + impuesto + envío
 *   - el impuesto y el envío deben salir de los métodos propios de cada Product
 *     (polimorfismo) — nada de instanceof / type checks en Cart
 */
public class Cart {

    // TODO: implementar
}

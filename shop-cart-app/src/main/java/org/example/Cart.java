package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
    private final Map<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) throws InvalidQuantityException, InsufficientStockException {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Quantity must be greater than zero");
        }
        int currentQuantity = items.getOrDefault(product, 0);
        if (currentQuantity + quantity > product.getStock()) {
            throw new InsufficientStockException("Not enough stock available");
        }
        items.put(product, currentQuantity + quantity);
    }

    public double total() {
        return items .entrySet().stream()
                .mapToDouble(entry -> {
                    Product product = entry.getKey();
                    int quantity = entry.getValue();
                    double subtotal = product.getUnitprice() * quantity;
                    double tax = subtotal * product.taxRate();
                    double shipping = product.shippingCost(quantity);
                    return subtotal + tax + shipping;
                })
                .sum();
    }

    public Map<Product, Integer> getItems() {
        return Collections.unmodifiableMap(items);
    }
}

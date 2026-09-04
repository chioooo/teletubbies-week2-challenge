package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void addingSameProductTwiceAccumulatesQuantityInsteadOfDuplicating() {
        // TODO (Arrange): crea un Cart y un Product
        // TODO (Act): agrega el mismo producto dos veces (cantidades distintas cada vez)
        // TODO (Assert): el carrito debe tener UNA sola línea para ese producto con la
        //                cantidad combinada — aquí es donde importa equals/hashCode en Product.




    }

    @Test
    void addingMoreThanAvailableStockThrowsInsufficientStockException() {
        // TODO: assertThrows(InsufficientStockException.class, () -> ...)
        Cart cart = new Cart();
        Product product = new PhysicalProduct("SKU123", "Physical Product", 100.0, 5);
        cart.addProduct(product, 5);
        assertThrows(InsufficientStockException.class, () -> {
            cart.addProduct(product, 1);
        });
    }

    @Test
    void addingZeroOrNegativeQuantityThrowsInvalidQuantityException() {
        // TODO: assertThrows(InvalidQuantityException.class, () -> ...)
        Cart cart = new Cart();
        Product product = new PhysicalProduct("SKU123", "Physical Product", 100.0, 10);
        assertThrows(InvalidQuantityException.class, () -> {
            cart.addProduct(product, 0);
        });
    }

    @Test
    void totalAppliesTaxAndShippingDifferentlyPerProductType() {
        // TODO: compara Cart.total() para un PhysicalProduct y un DigitalProduct con el
        //       mismo precio/cantidad — el resultado debe ser distinto.

        Cart cart = new Cart();
        Product physicalProduct = new PhysicalProduct("SKU123", "Physical Product", 100.0, 10);
        Product digitalProduct = new DigitalProduct("SKU456", "Digital Product", 100.0, 10);
        cart.addProduct(physicalProduct, 1);
        cart.addProduct(digitalProduct, 1);
        double physicalTotal = cart.total();
        double digitalTotal = cart.total();
        assertNotEquals(physicalTotal, digitalTotal);
    }
}

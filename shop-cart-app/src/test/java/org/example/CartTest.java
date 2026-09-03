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
    }

    @Test
    void addingZeroOrNegativeQuantityThrowsInvalidQuantityException() {
        // TODO: assertThrows(InvalidQuantityException.class, () -> ...)
    }

    @Test
    void totalAppliesTaxAndShippingDifferentlyPerProductType() {
        // TODO: compara Cart.total() para un PhysicalProduct y un DigitalProduct con el
        //       mismo precio/cantidad — el resultado debe ser distinto.
    }
}

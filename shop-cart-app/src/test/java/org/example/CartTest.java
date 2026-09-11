package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CartTest {

    @Test
    void addingSameProductTwiceAccumulatesQuantityInsteadOfDuplicating() {
        final Cart cart = new Cart();
        final Product product = new PhysicalProduct("SKU-001", "Laptop", 1000.0, 10);

        cart.addProduct(product, 2);
        cart.addProduct(product, 3);

        assertThat(cart.getProducts().size()).isEqualTo(1);
        assertThat(cart.getProducts().get(product)).isEqualTo(5);
        // TODO (Arrange): crea un Cart y un Product
        // TODO (Act): agrega el mismo producto dos veces (cantidades distintas cada vez)
        // TODO (Assert): el carrito debe tener UNA sola línea para ese producto con la
        //                cantidad combinada — aquí es donde importa equals/hashCode en Product.
    }

    @Test
    void addingMoreThanAvailableStockThrowsInsufficientStockException() {
        final Cart cart = new Cart();
        final Product product = new PhysicalProduct("SKU-001", "Laptop", 1000.0, 5);

        assertThatThrownBy(() -> cart.addProduct(product, 6))
                .isInstanceOf(InsufficientStockException.class)
                .hasMessageContaining("Laptop")
                .hasMessageContaining("6")
                .hasMessageContaining("5");

        // TODO: assertThrows(InsufficientStockException.class, () -> ...)
    }

    @Test
    void addingZeroOrNegativeQuantityThrowsInvalidQuantityException() {
        final Cart cart = new Cart();
        final Product product = new PhysicalProduct("SKU-001", "Laptop", 1000.0, 5);

        assertThatThrownBy(() -> cart.addProduct(product, 0))
                .isInstanceOf(InvalidQuantityException.class)
                .hasMessageContaining("cantidad")
                .hasMessageContaining("mayor a cero");


        // TODO: assertThrows(InvalidQuantityException.class, () -> ...)

    }

    @Test
    void totalAppliesTaxAndShippingDifferentlyPerProductType() {
        final Cart physicalCart = new Cart();
        final Cart digitalCart = new Cart();

        final Product physicalProduct = new PhysicalProduct("SKU-001", "Laptop", 1000.0, 10);
        final Product digitalProduct = new DigitalProduct("SKU-002", "Ebook", 1000.0, 10);

        physicalCart.addProduct(physicalProduct, 1);
        digitalCart.addProduct(digitalProduct, 1);

        assertThat(physicalCart.total()).isNotEqualTo(digitalCart.total());



        // TODO: compara Cart.total() para un PhysicalProduct y un DigitalProduct con el
        //       mismo precio/cantidad — el resultado debe ser distinto.
    }
}

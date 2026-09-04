package org.example;

/** Manual smoke test: build a couple of products, add them to a Cart, print the total. */
public class Main {
    public static void main(String[] args) {
        // TODO: prueba tu Cart aquí una vez que Product/Cart estén implementados.
        Product physicalProduct = new PhysicalProduct("SKU123", "Physical Product", 100.0, 10);
        Product digitalProduct = new DigitalProduct("SKU456", "Digital Product", 100.0, 5);

        Cart cart = new Cart();
        System.out.println("Total: " + cart.total());
        System.out.println("Items in cart: " + cart.getItems());

        try {
            cart.addProduct(physicalProduct, 2);
            cart.addProduct(digitalProduct, 1);
        } catch (InvalidQuantityException | InsufficientStockException e) {
            System.err.println("Error adding product to cart: " + e.getMessage());
        }
        System.out.println("Total after adding products: " + cart.total());
        System.out.println("Items in cart after adding products: " + cart.getItems());
    }
}


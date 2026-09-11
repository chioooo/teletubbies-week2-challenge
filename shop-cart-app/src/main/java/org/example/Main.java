package org.example;

/** Manual smoke test: build a couple of products, add them to a Cart, print the total. */
public class Main {
    public static void main(String[] args) {

        PhysicalProduct product = new PhysicalProduct(
                "SKU-001",
                "Laptop",
                1000.0,
                10);

        Cart cart = new Cart();
        cart.addProduct(product, 2);
        System.out.println("Total del carrito: " + cart.total());


        // TODO: prueba tu Cart aquí una vez que Product/Cart estén implementados.
    }
}

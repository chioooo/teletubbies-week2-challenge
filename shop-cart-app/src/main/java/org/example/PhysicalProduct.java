package org.example;

/**
 * A product that ships physically (has a shipping cost, standard tax rate).
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class PhysicalProduct extends Product {

    // TODO: implementar
    private static final double TAX_RATE = 0.16;
    private static final double SHIPPING_PER_UNIT = 2.50;

    public PhysicalProduct(String sku, String name, double price, int stock) {
        super(sku, name, price, stock);
    }

    @Override
    public double taxRate() {
        return TAX_RATE;
    }

    @Override
    public double shippingCost(int quantity) {
        return SHIPPING_PER_UNIT * quantity;
    }

}

package org.example;

/**
 * A product delivered digitally: no shipping cost, different tax rate than
 * {@link PhysicalProduct}.
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class DigitalProduct extends Product {

    // TODO: implementar
    private static final double TAX_RATE = 0.10;

    public DigitalProduct(String sku, String name, double unitprice, int stock) {
        super(sku, name, unitprice, stock);
    }

    @Override
    public double taxRate() {
        return TAX_RATE;
    }

    @Override
    public double shippingCost(int quantity) {
        return 0.0;
    }

}
package org.example;

/**
 * A product delivered digitally: no shipping cost, different tax rate than
 * {@link PhysicalProduct}.
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class DigitalProduct extends Product {
    private static final double TAX_RATE = 0.16;
    public DigitalProduct(String sku,String name, double unitPrice,int stock) {
        super(sku, name, unitPrice, stock);
    }
    @Override
    public double shippingCost(int quantity) {
        return 0;
    }

    @Override
    public double taxRate() {
        return TAX_RATE;
    }


    // TODO: implementar
}

package org.example;

/**
 * A product that ships physically (has a shipping cost, standard tax rate).
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class PhysicalProduct extends Product {

    private static final double SHIPPING_COST_PER_UNIT = 100.0;
    private static final double TAX_RATE = 0.16;

    public PhysicalProduct(String sku, String name, double unitPrice, int stock) {

        super(sku, name, unitPrice, stock);
    }

    @Override
    public double shippingCost(int quantity) {
        // TODO: implementar costo de envío
        return SHIPPING_COST_PER_UNIT * quantity;
    }
    @Override
    public double taxRate() {
        // TODO: implementar tasa de impuesto
        return TAX_RATE;
    }
}

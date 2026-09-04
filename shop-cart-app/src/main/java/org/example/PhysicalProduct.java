package org.example;

/**
 * A product that ships physically (has a shipping cost, standard tax rate).
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class PhysicalProduct extends Product {
    public PhysicalProduct(String sku, String name, double unitPrice, int stock) {
        super(sku, name, unitPrice, stock);
    }

    @Override
    public double shippingCost(int quantity) {
        // TODO: implementar costo de envío
        return 100;
    }
    @Override
    public double taxRate() {
        // TODO: implementar tasa de impuesto
        return 0.16;
    }
}

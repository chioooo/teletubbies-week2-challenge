package org.example;

/**
 * A product delivered digitally: no shipping cost, different tax rate than
 * {@link PhysicalProduct}.
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class DigitalProduct extends Product {

    public DigitalProduct(String sku,String name, double unitPrice,int stock) {
        super(sku, name, unitPrice, stock);
    }
    @Override
    public double shippingCost(int quantity) {
        return 0;
    }

    @Override
    public double taxRate() {
        return 0.16;
    }


    // TODO: implementar
}

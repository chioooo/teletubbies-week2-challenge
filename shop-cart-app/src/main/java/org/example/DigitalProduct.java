package org.example;

/**
 * A product delivered digitally: no shipping cost, different tax rate than
 * {@link PhysicalProduct}.
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class DigitalProduct extends Product {
    private final double impuesto;

    public DigitalProduct(final String sku, final String nombre, final int stockDisponible, final double precioUnitario, final double impuesto ) {
        super(sku, nombre, stockDisponible, precioUnitario);
        this.impuesto = impuesto;
    }
    @Override
    public double public abstract double shippingCost(int quantity) {
        return getprecioUnitario
    }

    // TODO: implementar
}

package org.example;

/**
 * A product that ships physically (has a shipping cost, standard tax rate).
 *
 * TODO: implementa el constructor y los dos métodos abstractos de {@link Product}.
 */
public class PhysicalProduct extends Product {
    public int costoEnvio;

    public PhysicalProduct(final String sku, final String nombre, final int stockDisponible, final double precioUnitario, final double costoEnvio ){
        super(sku, nombre, stockDisponible, precioUnitario);
        this.costoEnvio = costoEnvio;
    }



    // TODO: implementar
}

package org.example;

/**
 * Base type for anything that can be added to a {@link Cart}.
 *
 * TODO: agrega los campos y el constructor que necesita un producto. Como mínimo: un SKU
 * (identificador único), un nombre, un precio unitario y el stock disponible. Valida los
 * argumentos en el constructor — sin precio negativo, sin nombre nulo, etc.
 *
 * TODO: implementa equals/hashCode. Dos instancias de Product representan el mismo
 * producto si (y solo si) tienen el mismo SKU. Si esto queda mal, el Map de Cart no va a
 * acumular las cantidades correctamente para el mismo producto.
 */
public abstract class Product {
    private String sku;
    private  String name;
    private  double unitPrice;
    private  int stock;

    public Product(String sku, String name, double unitPrice, int stock) {
        this.sku = sku;
        this.name = name;
        this.unitPrice = unitPrice;
        this.stock = stock;


        if (sku == null || sku.isBlank()) {
            throw new IllegalArgumentException("SKU no puede ser nulo o vacío");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        if (unitPrice < 0) {
            throw new IllegalArgumentException("El precio unitario no puede ser negativo");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }

    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getStock() {
        return stock;
    }
    /**
     * Shipping cost for buying {@code quantity} units of this product.
     * Implement per subclass — no instanceof/type checks here or at call sites.
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return sku.equals(product.sku);
    }

    @Override
    public int hashCode() {
        return sku.hashCode();
    }

    public abstract double shippingCost(int quantity);

    /**
     * Tax rate applied to this product's price (e.g. 0.16 for 16%).
     */
    public abstract double taxRate();
}

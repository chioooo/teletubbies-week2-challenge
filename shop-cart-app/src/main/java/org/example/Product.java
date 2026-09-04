package org.example;

import java.util.Objects;

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

    /**
     * Shipping cost for buying {@code quantity} units of this product.
     * Implement per subclass — no instanceof/type checks here or at call sites.
     */
    private final String sku;
    private final String name;
    private final double unitprice;
    private final int stock;


    protected Product(String sku, String name, double unitprice, int stock) {
        if (sku == null || sku.isEmpty()) {
            throw new IllegalArgumentException("SKU cannot be null or empty");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (unitprice < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.sku = sku;
        this.name = name;
        this.unitprice = unitprice;
        this.stock = stock;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public int getStock() {
        return stock;
    }



    /**
     * Tax rate applied to this product's price (e.g. 0.16 for 16%).
     */
    public abstract double taxRate();
    public abstract double shippingCost(int quantity);

    public double subtotal(int quantity) {

        return unitprice * quantity;
    }

    public double taxAmount(int quantity) {
        return subtotal(quantity) * taxRate();
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", unitprice=" + unitprice +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product other = (Product) o;
        return Objects.equals(sku, other.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }


}

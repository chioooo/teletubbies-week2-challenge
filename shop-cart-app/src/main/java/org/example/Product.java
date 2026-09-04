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
    private final String sku;
    private final String nombre;
    private final double precioUnitario;
    private final int stockDisponible;

    public Product(final String sku, final String nombre, final int stock_disponible, final double precio_unitario) {
        this.sku = sku;
        this.nombre = nombre;
        this.stockDisponible = stockDisponible;
        this.precioUnitario = precioUnitario;
    }

    public Product(final String nombre) {
        if (nombre == null || nombre.trim().length() == 0) {
            this.nombre = "";
        } else {
            this.nombre = nombre.trim();
        }
    }

    public Product(final double precioUnitario){
        if(precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        }else{
            System.out.println("Solo precio positivo");
        }
    }

    public String getSku() {
        return sku;
    }
    public String getNombre() {
        return nombre;
    }
    public int getStockDisponible() {
        return stock_disponible;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Shipping cost for buying {@code quantity} units of this product.
     * Implement per subclass — no instanceof/type checks here or at call sites.
     */
    public abstract double shippingCost(int quantity);

    /**
     * Tax rate applied to this product's price (e.g. 0.16 for 16%).
     */
    public abstract double taxRate();
}

package org.example;

import java.math.BigDecimal;

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
    public abstract BigDecimal shippingCost(int quantity);

    /**
     * Tax rate applied to this product's price (e.g. 0.16 for 16%).
     */
    public abstract BigDecimal taxRate();
}

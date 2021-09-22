package kitchenpos.products.tobe.domain;

import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class Price {
    private BigDecimal price;

    protected Price() {

    }

    public Price(BigDecimal price) {
        if (price == null || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        }

        this.price = price;
    }

    public void changePrice(BigDecimal price) {
        if (price == null || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        }

        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Price)) return false;
        Price price1 = (Price) o;
        return price.equals(price1.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

}

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
        if (Objects.isNull(price) || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("상품의 가격이 올바르지 않으면 등록할 수 없습니다.");
        }

        this.price = price;
    }

    public Price changePrice(BigDecimal price) {
        if (Objects.isNull(price) || price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("상품의 가격이 올바르지 않으면 변경할 수 없습니다.");
        }

        return new Price(price);
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

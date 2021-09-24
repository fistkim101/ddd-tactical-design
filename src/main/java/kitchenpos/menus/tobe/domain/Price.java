package kitchenpos.menus.tobe.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class Price {

    private BigDecimal value;

    protected Price() {

    }

    public Price(BigDecimal value) {
        if (Objects.isNull(value) || value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("올바르지 않은 가격으로 등록할 수 없습니다.");
        }

        this.value = value;
    }

    public Price changePrice(BigDecimal value) {
        if (Objects.isNull(value) || value.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("올바르지 않은 가격으로 변경할 수 없습니다.");
        }

        return new Price(value);
    }

    public BigDecimal getPrice() {
        return this.value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Price)) return false;
        Price price = (Price) o;
        return value.equals(price.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}

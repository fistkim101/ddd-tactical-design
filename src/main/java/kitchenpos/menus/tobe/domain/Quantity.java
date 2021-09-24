package kitchenpos.menus.tobe.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Quantity {
    private final BigDecimal quantity;

    public Quantity(BigDecimal quantity) {
        if (Objects.isNull(quantity) || quantity.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("올바르지 않은 수량으로 등록할 수 없습니다.");
        }
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

}
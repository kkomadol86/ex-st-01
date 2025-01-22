package st.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import st.domain.*;
import st.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StockDecrease extends AbstractEvent {

    private Long id;

    public StockDecrease(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecrease() {
        super();
    }
}
//>>> DDD / Domain Event

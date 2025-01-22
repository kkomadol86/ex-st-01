package st.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import st.domain.*;
import st.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Long productid;
    private Integer qty;

    public OrderPlaced(Ordermgmt aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event

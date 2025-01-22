package st.domain;

import java.util.*;
import lombok.*;
import st.domain.*;
import st.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String productname;
    private Long productid;
    private Integer qty;
}

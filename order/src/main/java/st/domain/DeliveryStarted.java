package st.domain;

import java.util.*;
import lombok.*;
import st.domain.*;
import st.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String productname;
    private String userid;
    private String address;
    private String stat;
}

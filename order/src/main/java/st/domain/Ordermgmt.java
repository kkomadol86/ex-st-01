package st.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import st.OrderApplication;
import st.domain.OrderModified;
import st.domain.OrderPlaced;

@Entity
@Table(name = "Ordermgmt_table")
@Data
//<<< DDD / Aggregate Root
public class Ordermgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String productName;

    private Long productId;

    private Integer qty;

    private String stat;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        OrderModified orderModified = new OrderModified(this);
        orderModified.publishAfterCommit();
    }

    public static OrdermgmtRepository repository() {
        OrdermgmtRepository ordermgmtRepository = OrderApplication.applicationContext.getBean(
            OrdermgmtRepository.class
        );
        return ordermgmtRepository;
    }

    //<<< Clean Arch / Port Method
    public static void updateStat(DeliveryStarted deliveryStarted) {
        //implement business logic here:

        /** Example 1:  new item 
        Ordermgmt ordermgmt = new Ordermgmt();
        repository().save(ordermgmt);

        */

        /** Example 2:  finding and process
        
        // if deliveryStarted.cjLogisId exists, use it
        
        // ObjectMapper mapper = new ObjectMapper();
        // Map<, Object> deliveryMap = mapper.convertValue(deliveryStarted.getCjLogisId(), Map.class);

        repository().findById(deliveryStarted.get???()).ifPresent(ordermgmt->{
            
            ordermgmt // do something
            repository().save(ordermgmt);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

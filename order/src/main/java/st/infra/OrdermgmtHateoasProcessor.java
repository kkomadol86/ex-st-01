package st.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import st.domain.*;

@Component
public class OrdermgmtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Ordermgmt>> {

    @Override
    public EntityModel<Ordermgmt> process(EntityModel<Ordermgmt> model) {
        return model;
    }
}

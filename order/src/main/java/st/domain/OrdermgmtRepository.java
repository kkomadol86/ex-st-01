package st.domain;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import st.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "ordermgmts",
    path = "ordermgmts"
)
public interface OrdermgmtRepository
    extends PagingAndSortingRepository<Ordermgmt, Long> {}

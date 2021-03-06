package com.gussalves.mvc.mudi.repository;

import com.gussalves.mvc.mudi.model.ProductOrder;
import com.gussalves.mvc.mudi.model.ProductStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends CrudRepository<ProductOrder, Long> {
    Iterable<ProductOrder> findByStatus(ProductStatus pending);
}

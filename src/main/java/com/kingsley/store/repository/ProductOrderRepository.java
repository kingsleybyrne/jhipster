package com.kingsley.store.repository;

import com.kingsley.store.domain.ProductOrder;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/**
 * Spring Data  repository for the ProductOrder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    Page<ProductOrder> findAllByCustomerUserLogin(String login, Pageable
        pageable);
    ProductOrder findOneByIdAndCustomerUserLogin(Long id, String login);

    @Override
    Optional<ProductOrder> findById(Long aLong);
}

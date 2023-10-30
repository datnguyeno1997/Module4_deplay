package com.cg.repository;

import com.cg.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByTitle(String title);

    List<Product> findAllByTitleOrPriceLessThan(String title, BigDecimal price);

//    Page<Product> findAllWithPagination(Pageable pageable, Sort sort);
}

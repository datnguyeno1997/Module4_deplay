package com.cg.service.product;

import com.cg.model.Product;
import com.cg.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductService extends IGeneralService<Product, Long> {

    List<Product> search(String name);
    List<Product> findAllByTitleOrPriceLessThan(String title, BigDecimal price);

    Page<Product> findAllWithPagination(Pageable pageable);

}

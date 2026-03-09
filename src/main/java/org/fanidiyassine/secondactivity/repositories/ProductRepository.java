package org.fanidiyassine.secondactivity.repositories;

import org.fanidiyassine.secondactivity.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page <Product> findByNameContainsIgnoreCase(String keyword, Pageable pageable);
}

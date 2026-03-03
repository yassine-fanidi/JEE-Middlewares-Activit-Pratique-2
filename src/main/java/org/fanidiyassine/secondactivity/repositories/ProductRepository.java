package org.fanidiyassine.secondactivity.repositories;

import org.fanidiyassine.secondactivity.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

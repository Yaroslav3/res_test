package com.example.restoran.repository;

import com.example.restoran.model.unitsEnum.CountProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountProductRepository extends JpaRepository<CountProduct, Long> {
}

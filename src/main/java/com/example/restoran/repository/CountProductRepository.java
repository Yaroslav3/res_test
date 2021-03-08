package com.example.restoran.repository;

import com.example.restoran.model.unitsEnum.CountProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.LinkedList;


@Repository
public interface CountProductRepository extends JpaRepository<CountProduct, Long> {

    @Query(value = "SELECT * FROM count_product WHERE were_house_id IN (:id);", nativeQuery = true)
    LinkedList<CountProduct> getListProduct(@Param("id") String[] listID);

}
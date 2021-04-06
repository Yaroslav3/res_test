package com.example.restoran.repository;
import com.example.restoran.model.kitchen.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface KitchenRepository extends JpaRepository<Kitchen, Long> {

    @Modifying
    @Query(value = "UPDATE restoran_db.kitchen SET count_products = count_products+200 WHERE id=2;", nativeQuery = true)
    Kitchen updateKitchenProducts(int countProduct , Long id);
}

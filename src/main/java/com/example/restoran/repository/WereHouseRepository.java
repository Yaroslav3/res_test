package com.example.restoran.repository;

import com.example.restoran.model.wareHouse.WereHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WereHouseRepository extends JpaRepository<WereHouse, Long> {
}

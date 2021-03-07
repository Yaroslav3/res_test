package com.example.restoran.service;

import com.example.restoran.model.unitsEnum.CountProduct;

import java.util.List;
import java.util.Optional;

public interface CountProductService {
    List<CountProduct> getCountProduct(Long id);
}

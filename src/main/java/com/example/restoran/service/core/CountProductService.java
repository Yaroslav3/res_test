package com.example.restoran.service.core;

import com.example.restoran.model.unitsEnum.CountProduct;
import com.example.restoran.model.util.http.PickUp;

import java.util.LinkedList;
import java.util.List;

public interface CountProductService {
    List<CountProduct> getCountProduct(Long id);

    LinkedList<CountProduct> getProductsPickUp(LinkedList<PickUp> pickUp);
}

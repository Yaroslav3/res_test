package com.example.restoran.service.impl;

import com.example.restoran.model.unitsEnum.CountProduct;
import com.example.restoran.repository.CountProductRepository;
import com.example.restoran.service.CountProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountProductServiceImpl implements CountProductService {


    private final CountProductRepository wereHouseRepository;

    public CountProductServiceImpl(CountProductRepository wereHouseRepository) {
        this.wereHouseRepository = wereHouseRepository;
    }


    @Override
    public List<CountProduct> getCountProduct(Long id) {
        return wereHouseRepository.findAll();
    }
}

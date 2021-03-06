package com.example.restoran.service.core.impl;

import com.example.restoran.model.wareHouse.WereHouse;
import com.example.restoran.repository.WereHouseRepository;
import com.example.restoran.service.core.WereHouseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WereHouseServiceImpl implements WereHouseService {

    private final WereHouseRepository wereHouseRepository;

    public WereHouseServiceImpl(WereHouseRepository wereHouseRepository) {
        this.wereHouseRepository = wereHouseRepository;
    }


    @Override
    public List<WereHouse> getAllProducts() {
        return  wereHouseRepository.findAll();
    }
}

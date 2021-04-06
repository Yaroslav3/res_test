package com.example.restoran.service.core.impl;

import com.example.restoran.service.core.KitchenService;
import org.springframework.stereotype.Service;

@Service
public class KitchenServiceImpl implements KitchenService {


    @Override
    public boolean isUpdateKitchenProduct() {
        return false;
    }
}

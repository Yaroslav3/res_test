package com.example.restoran.service.core.impl;

import com.example.restoran.model.unitsEnum.CountProduct;
import com.example.restoran.model.util.http.PickUp;
import com.example.restoran.repository.CountProductRepository;
import com.example.restoran.repository.KitchenRepository;
import com.example.restoran.service.common.impl.KitchenHelperServiceImpl;
import com.example.restoran.service.core.CountProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class CountProductServiceImpl implements CountProductService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final CountProductRepository countProductRepository;
    private final KitchenRepository kitchenRepository;
    private final KitchenHelperServiceImpl kitchenHelperService;

    public CountProductServiceImpl(CountProductRepository wereHouseRepository,
                                   KitchenRepository kitchenRepository,
                                   KitchenHelperServiceImpl kitchenHelperService) {
        this.countProductRepository = wereHouseRepository;
        this.kitchenRepository = kitchenRepository;
        this.kitchenHelperService = kitchenHelperService;
    }


    @Override
    public List<CountProduct> getCountProduct(Long id) {
        return countProductRepository.findAll();
    }

    @Override
    @Transactional
    public LinkedList<CountProduct> getProductsPickUp(LinkedList<PickUp> pickUpList) {
        LinkedList<CountProduct> listProduct =
                countProductRepository.getListProduct(kitchenHelperService.findIDProducts(pickUpList));
        if (kitchenHelperService.checkCount(listProduct, pickUpList)) {
            for (int i = 0; i < listProduct.size(); i++) {
                kitchenRepository.updateKitchenProducts(listProduct.get(i).getCount(),
                        listProduct.get(i).getWereHouse().getId());
            }
            logger.info("update");
        } else {
            logger.info("no update");
        }
        return listProduct;
    }


}

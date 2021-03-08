package com.example.restoran.service.common.impl;
import com.example.restoran.model.unitsEnum.CountProduct;
import com.example.restoran.model.util.http.PickUp;
import com.example.restoran.service.common.KitchenHelperService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;

@Service
public class KitchenHelperServiceImpl implements KitchenHelperService {


    @Override
    public String[] findIDProducts(LinkedList<PickUp> pickUpList) {
        String[] idProducts = new String[pickUpList.size()];
        for (int i = 0; i < pickUpList.size(); i++) {
            idProducts[i] = String.valueOf(pickUpList.get(i).getId());
        }
        return idProducts;
    }

    @Override
    public Boolean checkCount(LinkedList<CountProduct> list, LinkedList<PickUp> pickUpList) {
        for (int i = 0; i < list.size(); i++) {
            return list.get(i).getCount() >= pickUpList.get(i).getCount();
        }
        return false;
    }
}

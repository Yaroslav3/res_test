package com.example.restoran.service.common;

import com.example.restoran.model.unitsEnum.CountProduct;
import com.example.restoran.model.util.http.PickUp;

import java.util.LinkedList;

public interface KitchenHelperService {

    String[] findIDProducts(LinkedList<PickUp> pickUpList);

    Boolean checkCount(LinkedList<CountProduct> list, LinkedList<PickUp> pickUpList);
}

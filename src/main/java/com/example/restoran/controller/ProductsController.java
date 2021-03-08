package com.example.restoran.controller;

import com.example.restoran.model.unitsEnum.CountProduct;
import com.example.restoran.model.util.SimpleMessage;
import com.example.restoran.model.util.http.PickUp;
import com.example.restoran.model.wareHouse.WereHouse;
import com.example.restoran.service.core.impl.CountProductServiceImpl;
import com.example.restoran.service.core.impl.WereHouseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("api/v1/products")
public class ProductsController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final WereHouseServiceImpl wereHouseService;
    private final CountProductServiceImpl countProductService;

    public ProductsController(WereHouseServiceImpl wereHouseService, CountProductServiceImpl countProductService) {
        this.wereHouseService = wereHouseService;
        this.countProductService = countProductService;
    }

    @GetMapping("all-products")
    public ResponseEntity<Object> getAllProducts() {
        List<WereHouse> allProducts = wereHouseService.getAllProducts();
        if (allProducts.isEmpty()) {
            return new ResponseEntity<>(new SimpleMessage("Product not found", "NOT_FOUND"), HttpStatus.OK);
        }
        return new ResponseEntity<>(allProducts, HttpStatus.OK);
    }

    @PostMapping("pick-up-products")
    public ResponseEntity<Object> pickUpProductsForKitchen(@RequestBody LinkedList<PickUp> pickUp) {
        LinkedList<CountProduct> productsPickUp = countProductService.getProductsPickUp(pickUp);
        return new ResponseEntity<>(productsPickUp, HttpStatus.OK);

    }

}





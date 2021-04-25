package com.example.brewerysystem.services;

import com.example.brewerysystem.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Rice Beer")
                .beerStyle("Pale Ale")
                .build();
    }
}

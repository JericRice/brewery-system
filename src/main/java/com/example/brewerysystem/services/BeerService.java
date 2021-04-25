package com.example.brewerysystem.services;

import com.example.brewerysystem.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}

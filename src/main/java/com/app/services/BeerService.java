package com.app.services;

import com.app.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto createBeer(BeerDto beerDto);

    BeerDto updateBeer(BeerDto beerDto);

    void deleteById(UUID beerId);
}

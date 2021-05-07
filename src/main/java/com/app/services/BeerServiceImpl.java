package com.app.services;

import com.app.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().uuid(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale").build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .uuid(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDto updateBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .uuid(UUID.randomUUID())
                .beerName("Updated Beer")
                .build();
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer");
    }
}

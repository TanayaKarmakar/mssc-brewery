package com.app.services.v2;

import com.app.web.model.v2.BeerDtoV2;
import com.app.common.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().uuid(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE).build();
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .uuid(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDtoV2 updateBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .uuid(UUID.randomUUID())
                .beerName("Updated Beer")
                .build();
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer");
    }
}
